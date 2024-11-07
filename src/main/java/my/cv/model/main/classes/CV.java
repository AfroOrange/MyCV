package my.cv.model.main.classes;

import javafx.beans.property.*;
import javafx.collections.ObservableList;
import my.cv.model.attributes.Knowledge;

public class CV {

    private final ObjectProperty<Contact> contacts = new SimpleObjectProperty<>();
    private final ObjectProperty<PersonalInfo> personalInfo = new SimpleObjectProperty<>();
    private final ListProperty<Experience> experiences = new SimpleListProperty<>();
    private final ListProperty<Knowledge> knowledge = new SimpleListProperty<>();
    private final ListProperty<Title> titles = new SimpleListProperty<>();

    public CV() {
    }

    public Contact getContacts() {
        return contacts.get();
    }

    public ObjectProperty<Contact> contactsProperty() {
        return contacts;
    }

    public void setContacts(Contact contacts) {
        this.contacts.set(contacts);
    }

    public PersonalInfo getPersonalInfo() {
        return personalInfo.get();
    }

    public ObjectProperty<PersonalInfo> personalInfoProperty() {
        return personalInfo;
    }

    public void setPersonalInfo(PersonalInfo personalInfo) {
        this.personalInfo.set(personalInfo);
    }

    public ObservableList<Experience> getExperiences() {
        return experiences.get();
    }

    public ListProperty<Experience> experiencesProperty() {
        return experiences;
    }

    public void setExperiences(ObservableList<Experience> experiences) {
        this.experiences.set(experiences);
    }

    public ObservableList<Knowledge> getKnowledges() {
        return knowledge.get();
    }

    public ListProperty<Knowledge> knowledgesProperty() {
        return knowledge;
    }

    public void setKnowledges(ObservableList<Knowledge> knowledges) {
        this.knowledge.set(knowledges);
    }
}
