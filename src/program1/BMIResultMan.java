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

    Man men = new Man(height, weight);
    

    @Override
    public void start(Stage primaryStage) throws Exception {
        men.BMIProduct();

        primaryStage.setTitle("Wynik BMI");
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Scene first = new Scene(grid, 300, 250);

        primaryStage.setScene(first);
        primaryStage.show();

        Label bmiLabel = new Label("Twoje BMI wynosi: ");
        grid.add(bmiLabel, 0, 1);
        Text bmiField = new Text(Double.toString(bmi));
        grid.add(bmiField, 1, 1);
        Text result = new Text(wynik);
        grid.add(result, 0, 2);
    }


 
}