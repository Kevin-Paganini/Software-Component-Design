package networks;

import javafx.geometry.Point2D;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import java.util.ArrayList;

/**
 * Convolutional is responsible for instantiating a base layer
 * for the neural network
 */

public class IdentityLayer implements Network {
    private ArrayList<Node> nodes = new ArrayList<>();
    private int numNodes;
    private int numLayer;
    private int totalLayers;
    public IdentityLayer(int numNodes, int numLayer, int totalLayers) {

        this.numNodes = numNodes;
        this.numLayer = numLayer;
        this.totalLayers = totalLayers;
    }

    public void getCoordinates(Canvas destination){
        double height = destination.getHeight();
        double ySeparation = height / (numNodes + 1); // So last circle isnt half of the screen
        double width = destination.getWidth();
        double xSeparation = (width / (totalLayers + 1));
        Point2D circlePoint = new Point2D(xSeparation, ySeparation);
        ArrayList<Node> layer = new ArrayList<>();
        for(int i = 0; i < numNodes; i++){
            Point2D actual = circlePoint.add(0, ySeparation * i);
            layer.add(new Node(actual.getX(), actual.getY()));

        }
        this.nodes = layer;

    }

    @Override
    public void drawEdge(Canvas canvas, Node node1, Node node2) {

        double x1 = node1.getX();
        double y1 = node1.getY();
        double x2 = node2.getX();
        double y2 = node2.getY();
        GraphicsContext context = canvas.getGraphicsContext2D();
        Point2D p1 = new Point2D(x1, y1);
        Point2D p2 = new Point2D(x2, y2);
        Point2D direction = p2.subtract(p1).normalize();
        Point2D radius = direction.multiply(RADIUS);
        Point2D start = p1.add(radius);
        Point2D end = p2.subtract(radius);
        context.strokeLine(start.getX(), start.getY(), end.getX(), end.getY());

    }

    @Override
    public void drawNode(Canvas destination) {
        for(int i = 0; i < nodes.size(); i++){
            Node node = nodes.get(i);
            double x = node.getX();
            double y = node.getY();
            destination.getGraphicsContext2D().strokeOval(x-RADIUS,y-RADIUS,2*RADIUS,2*RADIUS);
        }

    }

    @Override
    public void drawNetwork(Canvas destination) {
        this.getCoordinates(destination);
        this.drawNode(destination);

    }

    @Override
    public ArrayList<Node> getNodes() {
        return nodes;
    }
}
