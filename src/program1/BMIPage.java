/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program1;

import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Anna
 */
public class BMIPage extends Application {

    private Scene scene;
    private GridPane grid;
    private double height;
    private double weight;
    private String wynik;
    private double bmi;

    @Override
    public void start(final Stage primaryStage) throws Exception {
        primaryStage.setTitle("Body Mass Index");

        grid = new GridPane();
        grid.setAlignment(Pos.CENTER); //ustawianie komponentów do środka
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25)); //ustawienie wewnętrznych marginesów

        Scene pierwsza = new Scene(grid, 300, 250);

        primaryStage.setScene(pierwsza);
        primaryStage.show();

        Text pageTitle = new Text("Oblicz swoje BMI");
        grid.add(pageTitle, 0, 0, 2, 1);

        Label sexLabel = new Label("Płeć:");
        grid.add(sexLabel, 0, 1);

        final ChoiceBox choiceSexBox = new ChoiceBox<>(FXCollections.observableArrayList("Kobieta", "Mężczyzna"));
        choiceSexBox.setValue("Kobieta");
        grid.add(choiceSexBox, 1, 1);

        Label wzrostLabel = new Label("Wzrost:");
        grid.add(wzrostLabel, 0, 2);

        final TextField wzrostField = new TextField();
        grid.add(wzrostField, 1, 2);//(dziecko, kolumna, wiersz)

        Label cmLabel = new Label("cm");
        grid.add(cmLabel, 2, 2);

        final Label wagaLabel = new Label("Waga:");
        grid.add(wagaLabel, 0, 3);

        final TextField wagaField = new TextField();
        grid.add(wagaField, 1, 3);//(dziecko, kolumna, wiersz)

        Label kgLabel = new Label("kg");
        grid.add(kgLabel, 2, 3);

        Button btn = new Button("Oblicz BMI");
        HBox hBoxPane = new HBox(10);
        hBoxPane.setAlignment(Pos.BOTTOM_CENTER);
        hBoxPane.getChildren().add(btn);
        grid.add(hBoxPane, 1, 4);

        btn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                try {
                    height = Double.parseDouble(wzrostField.getText());
                } catch (Exception NullPointerException) {
                }
                try {
                    weight = Double.parseDouble(wagaField.getText());
                } catch (Exception NullPointerException) {
                }
                if (choiceSexBox.getValue().equals("Kobieta")) {

                    BMIResultWoman bmiResult = new BMIResultWoman(height, weight);
                    try {
                        bmiResult.start(primaryStage);
                    } catch (Exception ex) {
                        Logger.getLogger(Program1.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else {
                    BMIResultMan bmiResult = new BMIResultMan(height,weight);
                    try {
                        bmiResult.start(primaryStage);
                    } catch (Exception ex) {
                        Logger.getLogger(Program1.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }

            }
        });

        /*StackPane root = new StackPane();
         root.getChildren().add(btn);*/
    }

}
