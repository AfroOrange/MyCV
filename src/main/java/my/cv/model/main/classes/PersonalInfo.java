package my.cv.model.main.classes;

import javafx.beans.property.*;
import javafx.collections.ObservableList;
import my.cv.model.attributes.Nationality;

import java.time.LocalDate;

public class PersonalInfo {

    private final StringProperty identification = new SimpleStringProperty();
    private final StringProperty name = new SimpleStringProperty();
    private final StringProperty surname = new SimpleStringProperty();
    private final ObjectProperty<LocalDate> birthdate = new SimpleObjectProperty<>();
    private final StringProperty address = new SimpleStringProperty();
    private final StringProperty postalCode = new SimpleStringProperty();
    private final StringProperty city = new SimpleStringProperty();
    private final StringProperty country = new SimpleStringProperty();
    private final ListProperty<Nationality> nationalities = new SimpleListProperty<>();

    public String getIdentification() {
        return identification.get();
    }

    public StringProperty identificationProperty() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification.set(identification);
    }

    public String getName() {
        return name.get();
    }

    public StringProperty nameProperty() {
        return name;
    }

    public void setName(String name) {
        this.name.set(name);
    }

    public String getSurname() {
        return surname.get();
    }

    public StringProperty surnameProperty() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname.set(surname);
    }

    public LocalDate getBirthdate() {
        return birthdate.get();
    }

    public ObjectProperty<LocalDate> birthdateProperty() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate.set(birthdate);
    }

    public String getAddress() {
        return address.get();
    }

    public StringProperty addressProperty() {
        return address;
    }

    public void setAddress(String address) {
        this.address.set(address);
    }

    public String getPostalCode() {
        return postalCode.get();
    }

    public StringProperty postalCodeProperty() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode.set(postalCode);
    }

    public String getCity() {
        return city.get();
    }

    public StringProperty cityProperty() {
        return city;
    }

    public void setCity(String city) {
        this.city.set(city);
    }

    public String getCountry() {
        return country.get();
    }

    public StringProperty countryProperty() {
        return country;
    }

    public void setCountry(String country) {
        this.country.set(country);
    }


    public ObservableList<Nationality> getNationalities() {
        return nationalities.get();
    }

    public ListProperty<Nationality> nationalitiesProperty() {
        return nationalities;
    }

    public void setNationalities(ObservableList<Nationality> nationalities) {
        this.nationalities.set(nationalities);
    }
}
