package networks;

import javafx.scene.canvas.Canvas;

import java.util.ArrayList;


public interface Network {

    public double RADIUS = 40;


    void drawEdge(Canvas destination, Node node1, Node node2);

    void drawNode(Canvas destination);

    void drawNetwork(Canvas destination);

    ArrayList<Node> getNodes();





}
