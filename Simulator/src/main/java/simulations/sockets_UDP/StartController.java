package simulations.sockets_UDP;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.awt.event.ActionEvent;

public class StartController extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/simulations/sockets_UDP/start.fxml"));
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }


    public void socketEventHandler(javafx.event.ActionEvent event) {
        popup.display("socket", "creates a new communication point for both client and server");
    }

    public void bindEventHandler(javafx.event.ActionEvent event) {
        popup.display("bind", "attaches a local address to a socket for client");
    }

    public void sendEventHandler(javafx.event.ActionEvent event) {
        popup.display("send", "can send data from both client and server over this connection established");
    }

    public void closeEventHandler(javafx.event.ActionEvent event) {
        popup.display("close", "link between client and server over this connection which was established is released");
    }

    public void recieveEventHandler(javafx.event.ActionEvent event) {
        popup.display("recieve", "can recieve data from both client and server over this connection established");
    }
}



