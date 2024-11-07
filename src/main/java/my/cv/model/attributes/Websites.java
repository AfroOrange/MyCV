package my.cv.model.attributes;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Websites {

    private final StringProperty website = new SimpleStringProperty();

    public Websites() {
    }

    public String getWebsite() {
        return website.get();
    }

    public StringProperty websiteProperty() {
        return website;
    }

    public void setWebsite(String website) {
        this.website.set(website);
    }
}
