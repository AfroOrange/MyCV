package my.cv.model;

import javafx.beans.property.ListProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Contact {

    private final ListProperty<String> telephones = new SimpleListProperty<>(FXCollections.observableArrayList());
    private final ListProperty<String> emails = new SimpleListProperty<>(FXCollections.observableArrayList());
    private final ListProperty<String> websites = new SimpleListProperty<>(FXCollections.observableArrayList());


    public ObservableList<String> getWebsites() {
        return websites.get();
    }

    public ListProperty<String> websitesProperty() {
        return websites;
    }

    public void setWebsites(ObservableList<String> websites) {
        this.websites.set(websites);
    }

    public ObservableList<String> getEmails() {
        return emails.get();
    }

    public ListProperty<String> emailsProperty() {
        return emails;
    }

    public void setEmails(ObservableList<String> emails) {
        this.emails.set(emails);
    }

    public ObservableList<String> getTelephones() {
        return telephones.get();
    }

    public ListProperty<String> telephonesProperty() {
        return telephones;
    }

    public void setTelephones(ObservableList<String> telephones) {
        this.telephones.set(telephones);
    }
}
