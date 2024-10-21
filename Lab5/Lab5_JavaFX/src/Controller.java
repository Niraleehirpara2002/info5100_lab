

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextField;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Nirav
 */
public class Controller {
    
    @FXML
    TextField nameTextField, ageTextField, emailTextField;
    
   
    

     public void submit(ActionEvent event) {
        // Get the text from all fields
        String name = nameTextField.getText();
        String age = ageTextField.getText();
        String email = emailTextField.getText();

        // Check if all fields are filled
        if (name.isEmpty() || age.isEmpty() || email.isEmpty()) {
            showAlert("Incomplete Form", "Please fill out all fields.");
            return; // Stop the submission if any field is empty
        }

        // Validate email
        if (!isValidEmail(email)) {
            showAlert("Invalid Email", "Please enter a valid email address.");
            return; // Stop the submission
        }

        // Validate age
        if (!isValidAge(age)) {
            showAlert("Invalid Age", "Please enter a valid age (0-120).");
            return; // Stop the submission
        }

        // If everything is valisd, proceed with submission
        System.out.println("Submitted");

        // Create a popup alert
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Submitted");
        alert.setHeaderText("Thank You");
        alert.setContentText("Submitted Details: Name - " + name + ", Age - " + age + ", Email - " + email);
        alert.showAndWait();
    }

    private boolean isValidEmail(String email) {
        // Basic email regex pattern
        String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        return email.matches(emailRegex);
    }

    private boolean isValidAge(String age) {
        try {
            int ageValue = Integer.parseInt(age);
            return ageValue >= 0 && ageValue <= 120; // Valid age range
        } catch (NumberFormatException e) {
            return false; // Age is not a valid integer
        }
    }

    private void showAlert(String title, String message) {
        Alert alert = new Alert(AlertType.ERROR);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
