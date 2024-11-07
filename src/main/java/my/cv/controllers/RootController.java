package my.cv.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.TabPane;
import javafx.scene.layout.BorderPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class RootController implements Initializable {

    @FXML
    private TabPane optionsTabPane;

    @FXML
    private BorderPane root;

    public RootController() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/RootControllerView.fxml"));
            loader.setController(this);
            loader.load();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        optionsTabPane.getTabs().clear();
    }

    //button actions
    @FXML
    void onCloseAction(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    void onNewAction(ActionEvent event) {

    }

    @FXML
    void onOpenAction(ActionEvent event) {

    }

    @FXML
    void onSaveAction(ActionEvent event) {

    }

    @FXML
    void onSaveAsAction(ActionEvent event) {

    }

    //getter and setters
    public TabPane getOptionsTabPane() {
        return optionsTabPane;
    }

    public void setOptionsTabPane(TabPane optionsTabPane) {
        this.optionsTabPane = optionsTabPane;
    }

    public BorderPane getRoot() {
        return root;
    }

    public void setRoot(BorderPane root) {
        this.root = root;
    }
}
