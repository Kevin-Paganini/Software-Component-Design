package networks;

import javafx.geometry.Point2D;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;

import java.util.ArrayList;

/**
 * Convolutional is responsible for instantiating a decorated layer
 * that follows the convolutional design
 */
public class Convolutional extends NetworkDecorator {


    public Convolutional(Network wrappedNetwork, int numNodes, int numLayer, int totalLayers) {
        super(wrappedNetwork, numNodes, numLayer, totalLayers);
    }

    /**
     * Connects to previous layer with convolutional design: one to one
     * @param destination
     */
    @Override
    public void connectWithPreviousLayer(Canvas destination){
        ArrayList<Node> previousLayerNodes = this.network.getNodes();

        for(int i = 0; i < previousLayerNodes.size(); i++){
            drawEdge(destination, previousLayerNodes.get(i), this.nodes.get(i));

        }
    }
}
