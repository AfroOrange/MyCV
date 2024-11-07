package my.cv.components;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Dialog;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import my.cv.model.attributes.Email;
import my.cv.model.attributes.Telephone;

import java.net.URL;
import java.util.ResourceBundle;

public class EmailDialog extends Dialog<Email> implements Initializable {

    private final StringProperty emailAdress = new SimpleStringProperty();

    //view
    @FXML
    private TextField emailTextField;

    @FXML
    private GridPane root;

    public EmailDialog() {
        super();

        try {
            //loader
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/EmailDialogView.fxml"));
            loader.setController(this);
            getDialogPane().setContent(loader.load());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        setTitle("New Email");
        setHeaderText("Introduce the new email number");
        getDialogPane().setContent(root);
        getDialogPane().getButtonTypes().setAll(
                new ButtonType("Add", ButtonBar.ButtonData.OK_DONE),
                ButtonType.CANCEL
        );

        setResultConverter(this::onResult);

        emailAdress.bind(emailTextField.textProperty());
    }

    private Email onResult(ButtonType buttonType) {
        if (buttonType.getButtonData() == ButtonBar.ButtonData.OK_DONE) {
            Email email = new Email();
            email.setEmail(emailTextField.getText());
            return email;
        }
        return null;
    }

    //getters
    public TextField getEmailTextField() {
        return emailTextField;
    }

    public GridPane getRoot() {
        return root;
    }
}
