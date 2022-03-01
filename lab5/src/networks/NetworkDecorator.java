package networks;


import javafx.geometry.Point2D;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import java.util.ArrayList;


/**
 * Abstract class for all decorating classes
 */
public abstract class NetworkDecorator implements Network{
    protected Network network;
    protected ArrayList<Node> nodes;

    protected int numNodes;
    protected int numLayer;
    protected int totalLayers;
    private int HALF_CIRCLE = 180;


    public NetworkDecorator(Network wrappedNetwork, int numNodes, int numLayer, int totalLayers){
        this.network = wrappedNetwork;
        this.numNodes = numNodes;
        this.numLayer = numLayer;
        this.totalLayers = totalLayers;
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
        this.connectWithPreviousLayer(destination);
        this.network.drawNetwork(destination);
    }

    public void getCoordinates(Canvas destination){
        double height = destination.getHeight();
        double ySeparation = height / (numNodes + 1); // So last circle isnt half of the screen
        double width = destination.getWidth();
        double xSeparation = (width / (totalLayers + 1)) * numLayer; // same here
        Point2D circlePoint = new Point2D(xSeparation, ySeparation);
        ArrayList<Node> layer = new ArrayList<>();
        for(int i = 0; i < numNodes; i++){
            Point2D actual = circlePoint.add(0, ySeparation * i);
            layer.add(new Node(actual.getX(), actual.getY()));

        }
        this.nodes = layer;


    }

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

        //Math to get arrowheads somewhat working
        double angle = Math.atan((y2 - y1) / (x2 - x1));
        angle = angle + 45;

        double angle_rad = angle * Math.PI / HALF_CIRCLE;
        double arrowX = Math.cos(angle_rad) * 10;
        double arrowY = Math.sin(angle_rad) * 10;
        Point2D topArrow = new Point2D(end.getX() - arrowX, end.getY() - arrowY);
        context.strokeLine(end.getX(), end.getY(), topArrow.getX(), topArrow.getY());
        Point2D bottomArrow = new Point2D(end.getX() - arrowX, end.getY() + arrowY);
        context.strokeLine(end.getX(), end.getY(), bottomArrow.getX(), bottomArrow.getY());




    }

    @Override
    public ArrayList<Node> getNodes() {
        return nodes;
    }


    public abstract void connectWithPreviousLayer(Canvas destination);

}
