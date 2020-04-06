package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {

    @FXML
    private TextField emailField;

    @FXML
    private TextField passwordField;

    @FXML
    private TextField adminEmail;

    @FXML
    private TextField adminPassword;

    @FXML
    private Button studentSignin;

    @FXML
    private Button adminSignin;

    @FXML
    public void adminButton(ActionEvent event) throws IOException {
        System.out.println("Logged in");
        Parent root2 = FXMLLoader.load(getClass().getResource("admin.fxml"));
        Scene customerView = new Scene(root2, 400, 300);
        Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        appStage.setScene(customerView);
        appStage.show();

    }

    @FXML
    public void studentButton(ActionEvent event) throws IOException {
        System.out.println("Student Logged in");
        Parent root2 = FXMLLoader.load(getClass().getResource("student.fxml"));
        Scene customerView = new Scene(root2, 400, 300);
        Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        appStage.setScene(customerView);
        appStage.show();

    }

}
