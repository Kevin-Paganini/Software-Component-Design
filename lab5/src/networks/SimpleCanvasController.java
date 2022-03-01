/*
 * Course:     SE 2811
 * Term:       Winter 2020-21
 * Assignment: Lab 5: Decorators
 * Author: Dr. Yoder and _______
 * Date:
 */
package networks;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;

import java.util.HashMap;
import java.util.Map;

/**
 * The controller for the main window.
 * Draws all the different networks and reacts to button touches
 * Also manages the networks.
 */
public class SimpleCanvasController {

    @FXML
    private Canvas canvas;



    /**
     * As client code, use the decorator classes to construct the inception-like network,
     * as described in the lab.
     *
     * @return network The network created.
     */
    @FXML
    public void showInceptionNetwork(ActionEvent actionEvent) {
        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
        createInception();
    }

    public void createInception(){
        IdentityLayer identityLayer = new IdentityLayer(3, 1, 4);
        identityLayer.drawNetwork(canvas);
        Convolutional convolutionalLayer1 = new Convolutional(identityLayer, 3, 2, 4);
        convolutionalLayer1.drawNetwork(canvas);
        Convolutional convolutionalLayer2 = new Convolutional(convolutionalLayer1, 3, 3, 4);
        convolutionalLayer2.drawNetwork(canvas);
        Convolutional convolutionalLayer3 = new Convolutional(convolutionalLayer2, 3, 4, 4);
        convolutionalLayer3.drawNetwork(canvas);
    }


    /**
     * As client code, use the decorator classes to construct the AlexNet-like network,
     * as described in the lab.
     *
     * @return network The network created.
     */
    public void showAlexNetwork(ActionEvent actionEvent) {
        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
        createAlexNet();

    }
    public void createAlexNet(){
        IdentityLayer identityLayer = new IdentityLayer(4, 1, 5);
        identityLayer.drawNetwork(canvas);
        Convolutional convolutionalLayer = new Convolutional(identityLayer, 4, 2, 5);
        convolutionalLayer.drawNetwork(canvas);
        Convolutional convolutionalLayer2 = new Convolutional(convolutionalLayer, 4, 3, 5);
        convolutionalLayer2.drawNetwork(canvas);
        FullyConnected fullyConnectedLayer = new FullyConnected(convolutionalLayer2, 4, 4, 5);
        fullyConnectedLayer.drawNetwork(canvas);
        FullyConnected fullyConnectedLayer2 = new FullyConnected(fullyConnectedLayer, 3, 5, 5);
        fullyConnectedLayer2.drawNetwork(canvas);

    }

    /**
     * As client code, use the decorator classes to construct the KevinNet-like network,
     * as described in the lab.
     *
     * @return network The network created.
     */

    public void showKevinNetwork(ActionEvent actionevent){
        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
        createKevinNet();
    }

    public void createKevinNet(){
        IdentityLayer identityLayer = new IdentityLayer(5, 1, 6);
        identityLayer.drawNetwork(canvas);
        FullyConnected fc1 = new FullyConnected(identityLayer, 2, 2, 6);
        fc1.drawNetwork(canvas);
        Convolutional cl1 = new Convolutional(fc1, 2, 3, 6);
        cl1.drawNetwork(canvas);
        FullyConnected fc2 = new FullyConnected(cl1, 4, 4, 6);
        fc2.drawNetwork(canvas);
        Convolutional cl2 = new Convolutional(fc2, 4, 5, 6);
        cl2.drawNetwork(canvas);
        FullyConnected fc3 = new FullyConnected(cl2, 1, 6, 6);
        fc3.drawNetwork(canvas);
    }




}
