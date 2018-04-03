/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulations.sockets_UDP;

import java.awt.event.ActionEvent;
import java.io.BufferedWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXHamburger;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author praveen
 */
public class UdpController implements Initializable {


    /**
     * Initializes the controller class.
     */
    @FXML
    private BorderPane scenePane;

    @FXML
    private JFXHamburger hamburger;

    @FXML
    private VBox vbox;

    @FXML
    private JFXButton StartUdp;

    @FXML
    private JFXButton AboutUdp;



    public void initialize(URL url, ResourceBundle rb)
    {

    }

    @FXML
    void buttonEventHandler(ActionEvent event) throws IOException {
        if (event.getSource()== StartUdp){
            Stage window = (Stage) scenePane.getScene().getWindow();
            Parent root = FXMLLoader.load(getClass().getResource("/simulations/sockets_TCP/start.fxml"));
            window.setScene(new Scene(root));
            window.show();
        }

        else if (event.getSource()== AboutUdp){
            Stage window = (Stage) scenePane.getScene().getWindow();
            Parent root = FXMLLoader.load(getClass().getResource("/simulations/sockets_TCP/about.fxml"));
            window.setScene(new Scene(root));
            window.show();
        }
    }
}
