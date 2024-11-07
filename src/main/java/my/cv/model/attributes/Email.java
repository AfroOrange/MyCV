package my.cv.model.attributes;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Email {

    private final StringProperty email = new SimpleStringProperty();

    public Email() {

    }

    public String getEmail() {
        return email.get();
    }

    public StringProperty emailProperty() {
        return email;
    }

    public void setEmail(String email) {
        this.email.set(email);
    }
}
