package my.cv.model.attributes;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import my.cv.model.enums.Level;

public class Knowledge {

    private final StringProperty denomination = new SimpleStringProperty();
    private final ObjectProperty<Level> level = new SimpleObjectProperty<>();

    public String getDenomination() {
        return denomination.get();
    }

    public StringProperty denominationProperty() {
        return denomination;
    }

    public void setDenomination(String denomination) {
        this.denomination.set(denomination);
    }

    public Level getLevel() {
        return level.get();
    }

    public ObjectProperty<Level> levelProperty() {
        return level;
    }

    public void setLevel(Level level) {
        this.level.set(level);
    }
}
