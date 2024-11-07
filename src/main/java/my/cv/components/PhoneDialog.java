package my.cv.components;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import my.cv.model.enums.PhoneType;
import my.cv.model.attributes.Telephone;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class PhoneDialog extends Dialog<Telephone> implements Initializable {

    // model
    private final StringProperty number = new SimpleStringProperty();
    private final ObjectProperty<PhoneType> type = new SimpleObjectProperty<>();

    // view
    @FXML
    private TextField phoneNumberField;

    @FXML
    private GridPane root;

    @FXML
    private ComboBox<PhoneType> typeCombo;

    public PhoneDialog() {
        super();

        //loader
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/PhoneDialogView.fxml"));
            loader.setController(this);
            getDialogPane().setContent(loader.load());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        setTitle("New Phone");
        setHeaderText("Introduce the new phone number");
        getDialogPane().setContent(root);
        getDialogPane().getButtonTypes().setAll(
                new ButtonType("New", ButtonBar.ButtonData.OK_DONE),
                ButtonType.CANCEL
        );

        setResultConverter(this::onResult);

        //bindings
        number.bind(phoneNumberField.textProperty());
        type.bind(typeCombo.getSelectionModel().selectedItemProperty());

        // populate the combo box
        typeCombo.getItems().setAll(PhoneType.values());
    }

    private Telephone onResult(ButtonType buttonType) {
        if (buttonType.getButtonData() == ButtonBar.ButtonData.OK_DONE) {
            Telephone phone = new Telephone();
            phone.setNumber(number.get());
            phone.setType(type.get());
            return phone;
        }
        return null;
    }

    //getters
    public TextField getPhoneNumberField() {
        return phoneNumberField;
    }

    public GridPane getRoot() {
        return root;
    }

    public ComboBox<?> getTypeCombo() {
        return typeCombo;
    }
}
