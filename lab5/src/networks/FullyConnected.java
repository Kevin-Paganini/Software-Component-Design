package networks;

import javafx.scene.canvas.Canvas;

import java.util.ArrayList;

public class FullyConnected extends NetworkDecorator {


    public FullyConnected(Network wrappedNetwork, int numNodes, int numLayer, int totalLayers) {
        super(wrappedNetwork, numNodes, numLayer, totalLayers);
    }

    @Override
    public void connectWithPreviousLayer(Canvas destination) {
        ArrayList<Node> previousLayerNodes = this.network.getNodes();

        for(int i = 0; i < previousLayerNodes.size(); i++){
            for(int j = 0; j < this.nodes.size(); j++){
                drawEdge(destination, previousLayerNodes.get(i),this.nodes.get(j));
            }
        }
    }


}
