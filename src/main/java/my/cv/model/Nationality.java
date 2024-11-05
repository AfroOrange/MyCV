package my.cv.model;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Nationality {

    private final StringProperty denomination = new SimpleStringProperty();


    public String getDenomination() {
        return denomination.get();
    }

    public StringProperty denominationProperty() {
        return denomination;
    }

    public void setDenomination(String denomination) {
        this.denomination.set(denomination);
    }
}
