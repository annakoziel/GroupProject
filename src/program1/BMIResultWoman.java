/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program1;

import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Anna
 */
public class BMIResultWoman extends Application {

    public double height;
    public double weight;
    public double bmi;
    public String wynik;

    /* public void giveResult(double height, double weight) {*/
    public BMIResultWoman(double height, double weight) {
        this.height = height;
        this.weight = weight;
        Woman kobieta = new Woman(height, weight);
        bmi = kobieta.calculateBMI();
        wynik = kobieta.BMIProduct();
    }

    //}
    @Override
    public void start(final Stage primaryStage) throws Exception {
        VBox siatkaPionowaVBox = new VBox(100);
        siatkaPionowaVBox.setPadding(new Insets(65));
        Scene scene = new Scene(siatkaPionowaVBox, 600, 500);

        primaryStage.setTitle("Wynik BMI");
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Scene first = new Scene(grid, 600, 400);

        primaryStage.setScene(first);
        primaryStage.show();

        Label bmiLabel = new Label("Twoje BMI wynosi: ");
        grid.add(bmiLabel, 0, 1);
        Text bmiField = new Text(Double.toString(bmi));
        grid.add(bmiField, 1, 1);
        Label result = new Label(wynik);
        result.setWrapText(true);
        grid.add(result, 0, 2);

        Button calculateAgain = new Button("Oblicz ponownie");
        HBox hBoxPane = new HBox(10);
        hBoxPane.setAlignment(Pos.CENTER);
        hBoxPane.getChildren().add(calculateAgain);
        grid.add(hBoxPane, 0, 3);

        calculateAgain.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                BMIPage bmi = new BMIPage();
                try {
                    bmi.start(primaryStage);
                } catch (Exception ex) {
                    Logger.getLogger(Program1.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

    }

}
