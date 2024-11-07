package my.cv.ui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import my.cv.components.EmailDialog;
import my.cv.components.PhoneDialog;
import my.cv.components.WebDialog;
import my.cv.controllers.RootController;
import my.cv.model.attributes.Email;
import my.cv.model.attributes.Telephone;

import java.util.Optional;

public class MyCVApp extends Application {

    private final RootController rootController = new RootController();

    @Override
    public void start(Stage primaryStage) throws Exception {

        Scene scene = new Scene(rootController.getRoot());

        Stage myCvStage = new Stage();
        myCvStage.setScene(scene);
        myCvStage.setTitle("My CV");
        myCvStage.show();
    }
}
