package simulations.sockets_TCP;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;


public class DemoTcpController extends Application{
    @FXML
    private TextArea text_area_server;
    @FXML
    private TextArea text_area_client;
    @FXML
    private TextField text_field_server;
    @FXML
    private TextField text_field_client;

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("/simulations/sockets_TCP/demotcp.fxml"));
        primaryStage.setScene(new Scene(root));
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }

    public void server_send(ActionEvent event){
        String servertext= text_field_client.getText();
        text_field_server.setText("");
        text_field_server.setPromptText("Type a message");
        text_area_server.appendText("SERVER : "+servertext+"\n");
        text_area_client.appendText("SERVER : "+servertext+"\n");
    }
    public void client_send(ActionEvent event){
        String clienttext= text_field_client.getText();
        text_field_client.setText("");
        text_field_client.setPromptText("Type a message");
        text_area_client.appendText("CLIENT : "+clienttext+"\n");
        text_area_server.appendText("CLIENT : "+clienttext+"\n");
    }


}
