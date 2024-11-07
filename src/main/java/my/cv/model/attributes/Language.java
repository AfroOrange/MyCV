package my.cv.model.attributes;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Language extends Knowledge {

    private final StringProperty certificate = new SimpleStringProperty();

    public String getCertificate() {
        return certificate.get();
    }

    public StringProperty certificateProperty() {
        return certificate;
    }

    public void setCertificate(String certificate) {
        this.certificate.set(certificate);
    }
}
