package my.cv.model;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import java.time.LocalDate;
import java.util.List;

public class Experience {

    private final ObjectProperty<LocalDate> startDate = new SimpleObjectProperty<>();
    private final ObjectProperty<LocalDate> endDate = new SimpleObjectProperty<>();
    private final StringProperty denomination = new SimpleStringProperty();
    private final StringProperty company = new SimpleStringProperty();

    public LocalDate getStartDate() {
        return startDate.get();
    }

    public ObjectProperty<LocalDate> startDateProperty() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate.set(startDate);
    }

    public LocalDate getEndDate() {
        return endDate.get();
    }

    public ObjectProperty<LocalDate> endDateProperty() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate.set(endDate);
    }

    public String getDenomination() {
        return denomination.get();
    }

    public StringProperty denominationProperty() {
        return denomination;
    }

    public void setDenomination(String denomination) {
        this.denomination.set(denomination);
    }

    public String getOrganization() {
        return company.get();
    }

    public StringProperty organizationProperty() {
        return company;
    }

    public void setOrganization(String organization) {
        this.company.set(organization);
    }
}
