package de.hdm_stuttgart.mi;

import de.hdm_stuttgart.mi.Model.Human.Local;
import de.hdm_stuttgart.mi.Model.Things.LocalOffer;
import de.hdm_stuttgart.mi.Threads.UpdateThread;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Touricious extends Application {



    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/User.fxml"));
        Scene scene = new Scene(root);


        stage.setScene(scene);
        stage.setTitle("Touricious");
        stage.setResizable(false);
        stage.show();
        Thread.sleep(500);


    }

    public static void main(String[] args) throws ParseException, InterruptedException {


        SimpleDateFormat format1 = new SimpleDateFormat("dd-MM-yyyy");
        LocalOffer lo = new LocalOffer();
        lo.setCity("Frankfurt");
        lo.setName("Hiking");
        lo.setDescription("Hiking through the rain");
        lo.setDate(format1.parse("21-01-2019"));

        LocalOffer lo2 = new LocalOffer();
        lo2.setCity("Muenchen");
        lo2.setName("Diving");
        lo2.setDescription("Diving with baby shark");
        lo2.setDate(format1.parse("23-01-2019"));

        LocalOffer lo1 = new LocalOffer();
        lo1.setCity("Frankfurt");
        lo1.setName("Dancing");
        lo1.setDescription("Dancing queen");
        lo1.setDate(format1.parse("11-02-2019"));

        Local lm = new Local();
        lm.addToOfferList(lo);
        lm.addToOfferList(lo1);
        lm.addToOfferList(lo2);
        launch(args);

        UpdateThread update = new UpdateThread();
        update.run();

    }



}
