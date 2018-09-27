package Controller;
import Model.DBConnect;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class MobilePhoneCreaterViewController implements Initializable {

    @FXML
    private ImageView imageView;

    @FXML
    private ChoiceBox<String> makeChoiceBox;

    @FXML
    private TextField modelTextField;

    @FXML
    private ChoiceBox<String> OSChoiceBox;

    @FXML
    private TextField screenSizeTextFeild;

    @FXML
    private Slider momorySlider;

    @FXML
    private Label memoryLable;

    @FXML
    private TextField frontCameraTextField;

    @FXML
    private TextField rearCameraTextField;

    @FXML
    private TextField priceTextField;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //pre load the choicebox with valid manufatureres.
        try {
            makeChoiceBox.getItems().addAll(DBConnect.getPhoneManufacturers());
        } catch (SQLException e) {
            e.printStackTrace();
        }

        makeChoiceBox.getSelectionModel().selectedItemProperty().addListener(
                (observable,oldValue, newValue)-> {
                    try {
                        OSChoiceBox.setValue(DBConnect.getOSForManufacturer(newValue));
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
        );
    }
}
