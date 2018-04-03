package simulations.sockets_TCP;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import simulations.sockets_UDP.popup;

import javafx.event.ActionEvent;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class StartController extends Application implements Initializable {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/simulations/sockets_TCP/start.fxml"));
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    @FXML
    public void socketEventHandler(javafx.event.ActionEvent event) {
        popup.display("socket", "creates a new communication point for both client and server");
    }

    @FXML
    public void bindEventHandler(javafx.event.ActionEvent event) {
        popup.display("bind", "attaches a local address to a socket for client");
    }

    @FXML
    public void listenEventHandler(javafx.event.ActionEvent event) {
        popup.display("listen", "attaches a local address to a socket for client");
    }

    @FXML
    public void acceptEventHandler(javafx.event.ActionEvent event) {
        popup.display("accept", "attaches a local address to a socket for client");
    }

    @FXML
    public void sendEventHandler(javafx.event.ActionEvent event) {
        System.out.println("hello world");
        popup.display("send", "can send data from both client and server over this connection established");
    }

    @FXML
    public void closeEventHandler(javafx.event.ActionEvent event) {
        popup.display("close", "link between client and server over this connection which was established is released");
    }

    @FXML
    public void receiveEventHandler(javafx.event.ActionEvent event) {
        popup.display("recieve", "can recieve data from both client and server over this connection established");
    }



    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    @FXML
    public void startEventHandler(javafx.event.ActionEvent event)throws IOException {
        System.out.println("hello world");
        Parent root = FXMLLoader.load(getClass().getResource("/simulations/sockets_TCP/demotcp.fxml"));
        Scene about_scene = new Scene(root);
        Stage app_stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        app_stage.setScene(about_scene);
        app_stage.show();
    }
}