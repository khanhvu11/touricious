package de.hdm_stuttgart.mi.GUI;

import de.hdm_stuttgart.mi.Factory.UserFactory;
import de.hdm_stuttgart.mi.Manager.UserManager;
import de.hdm_stuttgart.mi.Model.Human.User;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class UserController implements Initializable {

        @FXML
        private ResourceBundle resources;

        @FXML
        private URL location;

        @FXML
        private TextField tf_userName;

        @FXML
        private TextField tf_Email;

        @FXML
        private TextField tf_City;

        @FXML
        private TextField tf_Name;

        @FXML
        private TextField tf_Age;

        @FXML
        private Button bt_Local;

        @FXML
        private TextField tf_Address;

        @FXML
        private Button bt_Tourist;
        @FXML
        private Button bt_save;

       private static User user = new User() ;
       UserFactory userFactory = new UserFactory();

       UserManager userManager = new UserManager();

       public static void setUser(User user) {
        UserController.user = user;
       }

       public static User getUser() {
           /*user.setName(tf_Name.getText());
           user.setAge(Integer.parseInt(tf_Age.getText()));
           user.setAddress(tf_Address.getText());
           user.setCity(tf_City.getText());
           user.setEmail(tf_Email.getText());*/
           return user; }

           @FXML
           void save(ActionEvent event){
               user.setUserName(tf_userName.getText());
               user.setName(tf_Name.getText());
               user.setAge(Integer.parseInt(tf_Age.getText()));
               user.setAddress(tf_Address.getText());
               user.setCity(tf_City.getText());
               user.setEmail(tf_Email.getText());
               userManager.save(user);
        }


          @Override
           public void initialize(URL location, ResourceBundle resources) {
          }


        @FXML
        void chooseTourist(ActionEvent event) throws IOException {
            user = userFactory.createUser("Tourist");
            UserController.setUser(user);

            Parent Tourist_parent = FXMLLoader.load(getClass().getResource("/Tourist.fxml"));
            Scene tourist_scene = new Scene(Tourist_parent);

            Stage app_stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            app_stage.setScene(tourist_scene);
            app_stage.show();

        }

        @FXML
        void chooseLocal(ActionEvent event) throws IOException {
            user = userFactory.createUser("Local");
            UserController.setUser(user);

            Parent root = FXMLLoader.load(getClass().getResource("/Local.fxml"));
            Scene scene = new Scene(root);

            Stage primaryStage = (Stage)((Node)event.getSource()).getScene().getWindow();
            primaryStage.setScene(scene);

        }

        @FXML
        void initialize() {
            assert tf_Email != null : "fx:id=\"tf_Email\" was not injected: check your FXML file 'UserController.fxml'.";
            assert tf_City != null : "fx:id=\"tf_City\" was not injected: check your FXML file 'UserController.fxml'.";
            assert tf_Name != null : "fx:id=\"tf_Name\" was not injected: check your FXML file 'UserController.fxml'.";
            assert tf_Age != null : "fx:id=\"tf_Age\" was not injected: check your FXML file 'UserController.fxml'.";
            assert bt_Local != null : "fx:id=\"bt_Local\" was not injected: check your FXML file 'UserController.fxml'.";
            assert tf_Address != null : "fx:id=\"tf_Address\" was not injected: check your FXML file 'UserController.fxml'.";
            assert bt_Tourist != null : "fx:id=\"bt_Tourist\" was not injected: check your FXML file 'UserController.fxml'.";

        }

}
