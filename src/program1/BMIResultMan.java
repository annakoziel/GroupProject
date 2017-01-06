/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program1;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Anna
 */
public class BMIResultMan extends Application {

    public double height;
    public double weight;
    public double bmi;
    public String wynik;

    public BMIResultMan(double height, double weight) {
        this.height = height;
        this.weight = weight;
        Man man = new Man(height, weight);
        bmi = man.calculateBMI();
        wynik = man.BMIProduct();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
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
    }

}
