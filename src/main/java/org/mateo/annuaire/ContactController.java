package org.mateo.annuaire;

import java.util.List;

import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class ContactController {
    public ListView<Contact> contactListView = new ListView<>();
    public TextField prenomField = new TextField();
    public TextField nomField = new TextField();
    public TextField numeroTelephoneField = new TextField();

    public void addContact() {
        String prenom = prenomField.getText();
        String nom = nomField.getText();
        String numeroTelephone = numeroTelephoneField.getText();
        Contact contact = new Contact(prenom, nom, numeroTelephone);
        ContactRepo.addContact(contact);
        refreshContactList();
    }

    public void deleteContact() {
        Contact contact = contactListView.getSelectionModel().getSelectedItem();
        if (contact != null) {
            ContactRepo.removeContact(contact);
            refreshContactList();
        }
        refreshContactList();
    }

    public void refreshContactList() {
        List<Contact> contacts = ContactRepo.getContacts();
        contactListView.getItems().clear();
        contactListView.getItems().addAll(contacts);
    }
}
