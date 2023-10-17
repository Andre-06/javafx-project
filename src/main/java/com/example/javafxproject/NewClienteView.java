package com.example.javafxproject;

import javafx.event.ActionEvent;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Paint;

public class NewClienteView {
    public CheckBox promoteCheckBox;
    public TextField nameField;
    public TextField emailField;
    public TextField telField;
    public Label alertLabel;

    public void cadastrarAction(ActionEvent actionEvent) {
        if ((nameField.getText().isBlank() || nameField.getText().isEmpty())
            || (emailField.getText().isBlank() || nameField.getText().isEmpty() || !emailField.getText().contains("@"))
            || (telField.getText().isBlank() || telField.getText().isEmpty() || telField.getText().length() < 9)){
            alertLabel.setTextFill(Paint.valueOf("#801512"));
            alertLabel.setText("Preencha todos os campos corretamente");
        } else {
            Client client = new Client(nameField.getText(), emailField.getText(), telField.getText(), promoteCheckBox.isSelected());
            System.out.println(client);
            alertLabel.setTextFill(Paint.valueOf("#328022"));
            alertLabel.setText("Usuário cadastrado com sucesso");
        }
    }
}
