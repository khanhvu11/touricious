package de.hdm_stuttgart.mi.GUI;

import de.hdm_stuttgart.mi.Exception.NoCityFoundException;
import de.hdm_stuttgart.mi.Exception.WrongNumberException;
import de.hdm_stuttgart.mi.Manager.LocalOfferManager;
import de.hdm_stuttgart.mi.Manager.PlanManager;
import de.hdm_stuttgart.mi.Model.Human.User;
import de.hdm_stuttgart.mi.Model.Things.LocalOffer;
import de.hdm_stuttgart.mi.Model.Things.Plan;
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
import java.util.ResourceBundle;

import static java.lang.System.*;

public class LocalController {

        @FXML
        private Button bt_upload;

        @FXML
        private TextField tf_date;

        @FXML
        private TextField tf_city;

        @FXML
        private TextArea tf_descr;

        @FXML
        private TextField tf_numofpeople;

        @FXML
        private TextField tf_name;

        @FXML
        private TextField tf_equip;

        @FXML
        private TextField tf_time;

        @FXML
        private Button bt_back;

        @FXML
        private Button bt_save;

        @FXML
        private Button bt_show;

        @FXML
        private ListView<LocalOffer> lv_listofoffers;

        UserController userController = new UserController();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        User user = userController.getUser();
        LocalOfferManager localOfferManager = new LocalOfferManager();


        @FXML
        void bt_back(ActionEvent event) throws IOException {

            Parent back_parent1 = FXMLLoader.load(getClass().getResource("/User.fxml"));
            Scene back_scene1 = new Scene(back_parent1);

            Stage app_stage1;
            app_stage1 = (Stage)((Node)event.getSource()).getScene().getWindow();
            app_stage1.setScene(back_scene1);
            app_stage1.show();
        }

        @FXML
        void bt_upload(ActionEvent event) throws ParseException {

            LocalOffer localOffer = new LocalOffer();

            localOffer.setName(tf_name.getText());
            localOffer.setCity(tf_city.getText());
            localOffer.setDate(formatter.parse(tf_date.getText()));
            localOffer.setDescription(tf_descr.getText());
            localOffer.setTime(tf_time.getText());
            localOffer.setEquipment(tf_equip.getText());
            localOffer.setNumberofpeople(Integer.parseInt(tf_numofpeople.getText()));
            user.addToOfferList(localOffer);
        }

        @FXML
        void bt_save(ActionEvent event) {
            localOfferManager.save(user);
        }

        @FXML
        void bt_show(ActionEvent event) {
            lv_listofoffers.getItems().addAll(localOfferManager.callLocalOffer(user.getUserName()));
        }


}

