package sample;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.File;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;


public class RegisterController implements Initializable {
    @FXML
    private Button Register;
    @FXML
    private Button CLOSE;

    @FXML
    private void cancelButtonOnAction2(Event event){
        Stage s = (Stage) ((Node) event.getSource()).getScene().getWindow();
        s.close();
    }

   // public void closeButton(ActionEvent event){
     //   Stage stage=(Stage) closeButton().getScene().getWindow();
       // stage.close();
    //}
//why?
    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }


}
