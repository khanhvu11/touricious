package de.hdm_stuttgart.mi.GUI;

import de.hdm_stuttgart.mi.Exception.NoCityFoundException;
import de.hdm_stuttgart.mi.Exception.WrongNumberException;
import de.hdm_stuttgart.mi.Manager.LocalOfferManager;
import de.hdm_stuttgart.mi.Manager.PlanManager;
import de.hdm_stuttgart.mi.Model.Human.Local;
import de.hdm_stuttgart.mi.Model.Human.User;
import de.hdm_stuttgart.mi.Model.Things.LocalOffer;
import de.hdm_stuttgart.mi.Model.Things.Plan;
import de.hdm_stuttgart.mi.Threads.UpdateThread;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.ResourceBundle;

import static java.lang.System.*;

public class TouristController implements Initializable{

        @FXML
        private Button bt_addtoplan ;

        @FXML
        private Button bt_search;

        @FXML
        private TextArea tf_todo;

        @FXML
        private TextField tf_City;

        @FXML
        private TextField tf_Day;

        @FXML
        private TextField tf_time;

        @FXML
        private TextField tf_offernumber;

        @FXML
        private TextField tf_number;

        @FXML
        private ListView<Plan> lv_yourplan;

        @FXML
        private Button bt_back;

        @FXML
        private Button bt_savePlan;

        @FXML
        private ListView<LocalOffer> lv_listofOffers;

        @FXML
        private TextField tf_where;

        UserController userController = new UserController();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        User user = userController.getUser();



        @FXML
        void bt_showplan(ActionEvent event) {
             //ObservableList<Plan> items = FXCollections.observableArrayList();
             //items = (ObservableList<Plan>) user.getPlans();
             lv_yourplan.getItems().addAll(user.getPlans());
        }

        @FXML
        void deletePlan(ActionEvent event) {
                user.deletePlan(Integer.parseInt(tf_number.getText()));
                lv_yourplan.getItems().removeAll(user.getPlans());

        }

        @FXML
        void addtoPlan(ActionEvent event) throws ParseException {
                Plan plan = new Plan();
                plan.setCity(tf_where.getText());
                plan.setDate(formatter.parse(tf_Day.getText()));
                plan.setTodo(tf_todo.getText());
                plan.setTime(tf_time.getText());
                user.writePlan(plan);
                lv_yourplan.getItems().removeAll(user.getPlans());
        }


        @FXML
        void bt_chooseoffer(ActionEvent event) throws WrongNumberException, NoCityFoundException {
                try {
                        user.chooseOffer(Integer.parseInt(tf_offernumber.getText()));
                        lv_listofOffers.getItems().removeAll(user.findingOffer(tf_City.getText()));
                }catch (WrongNumberException e){
                        out.println(e);
                }

        }


        @FXML
        void addOffer(ActionEvent event) {
                user.addOffertoPlan();
                lv_yourplan.getItems().removeAll(user.getPlans());

        }

        @FXML
        void bt_savePlan(ActionEvent event){
                PlanManager planManager = new PlanManager();
                planManager.save(user);
        }

        @FXML
        void bt_search(ActionEvent event) throws NoCityFoundException {

                //UpdateThread update = new UpdateThread();
                    try {
                        //update.run();
                            //LocalOfferManager localOfferManager = new LocalOfferManager();
                            //localOfferManager.removeExpiredOffer();
                        lv_listofOffers.getItems().addAll(user.findingOffer(tf_City.getText()));

                    } catch (NoCityFoundException e) {
                        out.println(e);
                    }
        }


        public void initialize(URL location, ResourceBundle resources) {
            //out.println(user);
        }


        @FXML
        void Back(ActionEvent event) throws IOException {

                Parent back_parent = FXMLLoader.load(getClass().getResource("/User.fxml"));
                Scene back_scene = new Scene(back_parent);

                Stage app_stage = (Stage)((Node)event.getSource()).getScene().getWindow();
                app_stage.setScene(back_scene);
                app_stage.show();
        }
}

