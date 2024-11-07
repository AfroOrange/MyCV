package my.cv.model.main.classes;

import javafx.beans.property.ListProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import my.cv.model.attributes.Email;
import my.cv.model.attributes.Telephone;
import my.cv.model.attributes.Websites;

public class Contact {

    private final ListProperty<Telephone> telephones = new SimpleListProperty<>(FXCollections.observableArrayList());
    private final ListProperty<Email> emails = new SimpleListProperty<>(FXCollections.observableArrayList());
    private final ListProperty<Websites> websites = new SimpleListProperty<>(FXCollections.observableArrayList());

    public ObservableList<Telephone> getTelephones() {
        return telephones.get();
    }

    public ListProperty<Telephone> telephonesProperty() {
        return telephones;
    }

    public ObservableList<Email> getEmails() {
        return emails.get();
    }

    public ListProperty<Email> emailsProperty() {
        return emails;
    }

    public ObservableList<Websites> getWebsites() {
        return websites.get();
    }

    public ListProperty<Websites> websitesProperty() {
        return websites;
    }
}