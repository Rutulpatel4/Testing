package View;

import Model.DBConnect;
import Model.MobilePhone;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.sql.SQLException;

public class Main extends Application {

    public static void main(String[] arg){

      //  MobilePhone newPhone = new MobilePhone("Apple","Jdub special", "ios", 10.1, 512.0, 12.2, 24, 500);
        launch(arg);
/*
        try
        {
            DBConnect.insertPhoneIntoDB(newPhone);
        } catch (SQLException e) {
            e.printStackTrace();
        } */
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("TableOfPhoneView.fxml"));
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Create Mobile Phone");
        primaryStage.show();
    }
}
