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
import java.sql.*;
import java.util.ResourceBundle;


public class RegisterController implements Initializable {
    @FXML
    private Button Register;
    @FXML
    private Button CLOSE;
    @FXML
    private TextField email;
    @FXML
    private TextField getName;
    @FXML
    private TextField loc;
    @FXML
    private TextField dest;
    @FXML
    private TextField req;
    @FXML
    private TextField passengers;
    @FXML
    private TextField phone;
    @FXML
    private Label labelReg;
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
    private Connection dataBaseLink=null;
    public  Connection getconnection(){
        String driver="com.mysql.jdbc.Driver";
        String databaseName="Trip";
        String databaseUser ="houda";
        String databasePass="ff613658sx16028";
        String url = "jdbc:mysql://localhost/"+databaseName;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            //Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            //Class.forName("postgresql.Driver");
            dataBaseLink= DriverManager.getConnection(url,databaseUser,databasePass);
            //String DBurl = "jdbc:odbc:testDB";
            //con = DriverManager.getConnection(DBurl);

        }catch (Exception e){
            e.printStackTrace();
            e.getCause();
        }
        return dataBaseLink;
    }
    //public void registerButton(Event event){
       // DataBase connectNow = new DataBase();
       // Connection connectDB = connectNow.getconnection();
       // String connectQuery = "INSERT INTO `trip`.`customer` (`email`, `name.surname`, `phone`, `destination`, `passengers`, `Requires`, `current_loc`, `state`) VALUES ('"+email.getText()+"', '"+getName.getText()+"', '"+phone.getText()+"', '+"+dest.getText()+"', '"+passengers.getText()+"', '"+req.getText()+"', '"+loc.getText()+"', 'foreign');";
       // try {
             //Statement statement = connectDB.createStatement();
            // ResultSet queryOutput = statement.executeQuery(connectQuery);

             //while (queryOutput.next()) {

             //}

           //  } catch (Exception e) {
             //  e.printStackTrace();
             // }
    public void registerButton(Event event) throws Exception{

        try {
            Connection conn=getconnection();
            PreparedStatement posted=conn.prepareStatement("INSERT INTO `trip`.`customer` (`email`, `name.surname`, `phone`, `destination`, `passengers`, `Requires`, `current_loc`, `state`) VALUES ('"+email.getText()+"', '"+getName.getText()+"', '"+phone.getText()+"', '+"+dest.getText()+"', '"+passengers.getText()+"', '"+req.getText()+"', '"+loc.getText()+"', 'foreign');");
            posted.executeUpdate();
        }catch (Exception e){
            System.out.println(e);
        }finally {
            labelReg.setText("Register Completed");
        }


        }


}
