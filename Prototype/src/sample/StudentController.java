package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;

public class StudentController {

    @FXML
    private ChoiceBox<?> careerSearch;

    @FXML
    private Button fairSearch;

    @FXML
    private ChoiceBox<?> onSearch;

    @FXML
    private Button campusSearch;

    @FXML
    private ChoiceBox<?> offSearch;

    @FXML
    private ChoiceBox<?> internSearch;

    @FXML
    private Button eventSearch;

    @FXML
    private Button internshipSearch;

    public void initialize(){
        populateChoice();
    }

    @FXML
    void careeButton(ActionEvent event) {

    }

    @FXML
    void internButton(ActionEvent event) {

    }

    @FXML
    void offCampusButton(ActionEvent event) {

    }

    @FXML
    void onCampusButton(ActionEvent event) {

    }

    void populateChoice(){
        ObservableList<String> data = (ObservableList<String>) careerSearch.getItems();
        ObservableList<String> data1 = (ObservableList<String>) onSearch.getItems();
        ObservableList<String> data2 = (ObservableList<String>) offSearch.getItems();
        ObservableList<String> data3 = (ObservableList<String>) internSearch.getItems();
        data.add("Search by name");
        data.add("Search by Location");
        data.add("Search by Date");
        data.add("search by Company");

        data1.add("Search by name");
        data1.add("Search by Location");
        data1.add("Search by Date");
        data1.add("search by Company");

        data2.add("Search by name");
        data2.add("Search by Location");
        data2.add("Search by Date");
        data2.add("search by Company");

        data3.add("Search by name");
        data3.add("Search by Location");
        data3.add("Search by Date");
        data3.add("search by Company");

}

}
