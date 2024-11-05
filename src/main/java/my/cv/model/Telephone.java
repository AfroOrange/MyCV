package my.cv.model;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Telephone {

    private final StringProperty number = new SimpleStringProperty();
    private final ObjectProperty<PhoneType> type = new SimpleObjectProperty<>();

    public PhoneType getType() {
        return type.get();
    }

    public ObjectProperty<PhoneType> typeProperty() {
        return type;
    }

    public void setType(PhoneType type) {
        this.type.set(type);
    }

    public String getNumber() {
        return number.get();
    }

    public StringProperty numberProperty() {
        return number;
    }

    public void setNumber(String number) {
        this.number.set(number);
    }
}
