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


public class LogginController implements Initializable {
    @FXML
    private Button next;
    @FXML
    private Label question;
    @FXML
    private ImageView brandingImView;
    @FXML
    private TextField reponse;
    @FXML
    private Label invalid;
    // @FXML
    // void messInvalid(MouseEvent event){
    // if(!(reponse.getText().equalsIgnoreCase("foreign") || reponse.getText().equalsIgnoreCase("native"))) {
    //   invalid.setText("Invalid,please try again.");
    //  }
    // }


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        File brandingFile = new File("image_trip/photo_app.jpg");
        Image brandingImage = new Image(brandingFile.toURI().toString());
        brandingImView.setImage(brandingImage);
    }


    public void loginButton(ActionEvent event) {
      if  (reponse.getText().equalsIgnoreCase("foreign") || reponse.getText().equalsIgnoreCase("native")) {
    creatAccount();
    } else {
      invalid.setText("please answer correctly");
     }
     }
    @FXML
    private void cancelButtonOnAction1(Event event) {
        Stage s = (Stage) ((Node) event.getSource()).getScene().getWindow();
        s.close();
    }

    //public void validateLogin(){
    //DataBase connectNow=new DataBase();
    //Connection connectDB=connectNow.getconnection();
    //String verifyLogin="SELECT count(1) FROM trip.customer WHERE email='"+reponse.getText()+"'";
    // try {
    // Statement statement=connectDB.createStatement();
    // ResultSet queryResult=statement.executeQuery(verifyLogin);
    // while (queryResult.next()){
    //if (queryResult.getString(8).equalsIgnoreCase("foreign") ||
    //    queryResult.getString(8).equalsIgnoreCase("native")){
    //creatAccount();
    //  }else {
    // invalid.setText("try again");
    // }
    // }
    // }catch (Exception e){
    //   e.printStackTrace();
    // e.getCause();
    // }
    // }
    public void creatAccount() {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("data.fxml"));
            Stage registerstage = new Stage();
            registerstage.initStyle(StageStyle.UNDECORATED);
            registerstage.setScene(new Scene(root, 600, 600));
            registerstage.show();
        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }
    }

    //public void connectButton(ActionEvent event) {
        //DataBase connectNow = new DataBase();
        //Connection connectDB = connectNow.getconnection();
        //String connectQuery = "SELECT state FROM trip.customer;";
       // try {
           // Statement statement = connectDB.createStatement();
           // ResultSet queryOutput = statement.executeQuery(connectQuery);
           // while (queryOutput.next()) {
              //  if (queryOutput.getString(8).equalsIgnoreCase("foreign") ||
                      //  queryOutput.getString(8).equalsIgnoreCase("native")) {
                   // creatAccount();
              //  }
               // else {
                     //invalid.setText("try again");}
           // }
       // } catch (Exception e) {
         //   e.printStackTrace();
      //  }


   // }
}




