package com.medyassin.Utilities.CustomAlert;

import com.medyassin.Models.Customer;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class CustomerAlert {
    public static void display(String type, String message) throws IOException {
        Stage window = new Stage();
        window.initStyle(StageStyle.TRANSPARENT);
        window.initModality(Modality.APPLICATION_MODAL);

        AnchorPane pane = FXMLLoader.load(CustomerAlert.class.getResource("./CustomAlert.fxml"));
        Pane pane1 = (Pane) pane.getChildren().get(0);
        Label msgLabel = (Label) pane1.getChildren().get(0);

        if(type.equals("error")) {
            // do nothing
        } else {
            // Retrieve the imageview
            ImageView img = (ImageView) pane1.getChildren().get(2);
            // change source image to success icon
            img.setImage(new Image(CustomerAlert.class.getResourceAsStream("./icons/success.png")));
        }

        msgLabel.setText(message);
        Scene scene = new Scene(pane);
        scene.setFill(Color.TRANSPARENT);
        window.setScene(scene);
        window.showAndWait();
    }
}
