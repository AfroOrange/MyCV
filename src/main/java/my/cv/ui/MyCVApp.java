package my.cv.ui;

import javafx.application.Application;
import javafx.stage.Stage;
import my.cv.components.EmailDialog;
import my.cv.components.PhoneDialog;
import my.cv.components.WebDialog;
import my.cv.model.attributes.Email;
import my.cv.model.attributes.Telephone;

import java.util.Optional;

public class MyCVApp extends Application {

    //private RootController rootController = new RootController();

    @Override
    public void start(Stage primaryStage) throws Exception {

//        PhoneDialog phoneDialog = new PhoneDialog();
//        Optional<Telephone> result = phoneDialog.showAndWait();
//        if (result.isPresent()) {
//            Telephone telephone = result.get();
//            System.out.println("Phone number: " + telephone.getNumber() + " Phone type: " + telephone.getType());
//        }

//        EmailDialog emailDialog = new EmailDialog();
//        emailDialog.showAndWait().ifPresent(email -> {
//            System.out.println("Email: " + email.getEmail());
//        });

        WebDialog webDialog = new WebDialog();
        webDialog.showAndWait().ifPresent(web -> {
            System.out.println("Web: " + web.getWebsite());
        });
    }
}
