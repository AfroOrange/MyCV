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
import my.cv.model.attributes.Websites;

import java.net.URL;
import java.util.ResourceBundle;

public class WebDialog extends Dialog<Websites> implements Initializable {

    //model
    private final StringProperty websites = new SimpleStringProperty();

    //view
    @FXML
    private TextField webTextField;

    @FXML
    private GridPane root;

    public WebDialog() {
        super();

        try {
            //loader
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/WebDialogView.fxml"));
            loader.setController(this);
            getDialogPane().setContent(loader.load());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        setTitle("New Website");
        setHeaderText("Introduce the new website");
        getDialogPane().setContent(root);
        getDialogPane().getButtonTypes().setAll(
                new ButtonType("Add", ButtonBar.ButtonData.OK_DONE),
                ButtonType.CANCEL
        );

        setResultConverter(this::onResult);

        websites.bind(webTextField.textProperty());
    }

    private Websites onResult(ButtonType buttonType) {
        if (buttonType.getButtonData() == ButtonBar.ButtonData.OK_DONE) {
            Websites web = new Websites();
            web.setWebsite(webTextField.getText());
            return web;
        }
        return null;
    }

    //getters
    public GridPane getRoot() {
        return root;
    }
}
