package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.sql.*;

public class AdminController {

    private static Connection conn;
    private Statement stmt;

    @FXML
    private TextField careerName;

    @FXML
    private TextField careerLocation;

    @FXML
    private TextField careerDate;

    @FXML
    private TextField careerCompany;

    @FXML
    private TextField oncampusName;

    @FXML
    private TextField oncampusLocation;

    @FXML
    private TextField oncampusDate;

    @FXML
    private TextField oncampusCompany;

    @FXML
    private TextField offcampusName;

    @FXML
    private TextField offcampusLocation;

    @FXML
    private TextField offcampusDate;

    @FXML
    private TextField offcampusCompany;

    @FXML
    private TextField internshipName;

    @FXML
    private TextField internshipLocation;

    @FXML
    private TextField internshipDate;

    @FXML
    private TextField internshipCompany;

    @FXML
    private Button careerBtn;

    @FXML
    private Button oncampusbtn;

    @FXML
    private Button offcampusBtn;

    @FXML
    private Button internBtn;

    public void initialize(){
        try {
            // JDBC driver name and database URL
            String JDBC_DRIVER = "org.h2.Driver";
            Class.forName(JDBC_DRIVER);
            String DB_URL = "jdbc:h2:C:/Users/doryc/OneDrive/H2/res/H2";
            //  Database credentials
            String USER = "";
            String PASS = "";
            System.out.println("Attempting to connect to database");

            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();
            System.out.println("Successfully connected to database");

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    public void populateField(){
        
        oncampusName.getText();
        oncampusLocation.getText();
        oncampusDate.getText();
        oncampusCompany.getText();
        offcampusName.getText();
        offcampusLocation.getText();
        offcampusDate.getText();
        offcampusCompany.getText();
        internshipName.getText();
        internshipLocation.getText();
        internshipDate.getText();
        internshipCompany.getText();
    }
    @FXML
    void careerButton(ActionEvent event) {
        String name = careerName.getText();
        String location = careerLocation.getText();
        String date = careerDate.getText();
        String company = careerCompany.getText();
        try {
            String adoptionQuery = "INSERT INTO CAREER(NAME, LOCATION, DATE, COMPANY) VALUES (?,?,?,?)";
            PreparedStatement addCareer = AdminController.conn.prepareStatement(adoptionQuery);
            addCareer.setString(1, name);
            addCareer.setString(2, location);
            addCareer.setString(3, date);
            addCareer.setString(4, company);
            addCareer.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void internshipButton(ActionEvent event) {
        String name = internshipName.getText();
        String location = internshipLocation.getText();
        String date = internshipDate.getText();
        String company = internshipCompany.getText();
        try {
            String adoptionQuery = "INSERT INTO INTERNSHIP(NAME, LOCATION, DATE, COMPANY) VALUES (?,?,?,?)";
            PreparedStatement addInternship = AdminController.conn.prepareStatement(adoptionQuery);
            addInternship.setString(1, name);
            addInternship.setString(2, location);
            addInternship.setString(3, date);
            addInternship.setString(4, company);
            addInternship.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void offcampusButton(ActionEvent event) {
        String name = offcampusName.getText();
        String location = offcampusLocation.getText();
        String date = offcampusDate.getText();
        String company = offcampusCompany.getText();
        try {
            String adoptionQuery = "INSERT INTO OFFCAMPUS(NAME, LOCATION, DATE, COMPANY) VALUES (?,?,?,?)";
            PreparedStatement addOffcampus = AdminController.conn.prepareStatement(adoptionQuery);
            addOffcampus.setString(1, name);
            addOffcampus.setString(2, location);
            addOffcampus.setString(3, date);
            addOffcampus.setString(4, company);
            addOffcampus.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void oncampusButton(ActionEvent event) {
        String name = oncampusName.getText();
        String location = oncampusLocation.getText();
        String date = oncampusDate.getText();
        String company = oncampusCompany.getText();
        try {
            String adoptionQuery = "INSERT INTO ONCAMPUS(NAME, LOCATION, DATE, COMPANY) VALUES (?,?,?,?)";
            PreparedStatement addOncampus = AdminController.conn.prepareStatement(adoptionQuery);
            addOncampus.setString(1, name);
            addOncampus.setString(2, location);
            addOncampus.setString(3, date);
            addOncampus.setString(4, company);
            addOncampus.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
