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
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;
import javafx.geometry.Insets;
import javafx.scene.layout.HBox;
/**
 *
 * @author Magdalena
 */
public class Program1 extends Application {
    
    @Override
    public void start(final Stage primaryStage) {
        //rozmieszczenie 
          VBox siatkaPionowaVBox = new VBox(100);
          siatkaPionowaVBox.setPadding(new Insets(65));       
        Button btn = new Button();
        btn.setText("Diagnoza Dietetyczna");
        btn.setPrefSize(200,200);
        Button btn2=new Button();
        btn2.setText("Aqua Diagnoza");
        btn2.setPrefSize(200,200);
        Button btn3=new Button();
        btn3.setText("Kalkulator Kalorii");
        btn3.setPrefSize(200,200);
        Button btn4=new Button();
        btn4.setText("BMI");
        btn4.setPrefSize(200,200);
        //siatkaPionowaVBox.getChildren().add(btn);
         //siatkaPionowaVBox.getChildren().add(btn2);
          //siatkaPionowaVBox.getChildren().add(btn3);
          // siatkaPionowaVBox.getChildren().add(btn4);
        //odstepy miedzy elemenatmi
        HBox szukanaHBox = new HBox(85);
        szukanaHBox.getChildren().add(btn3);
        szukanaHBox.getChildren().add(btn4);
        HBox szukanaHBox2 = new HBox(85);
        szukanaHBox2.getChildren().add(btn);
        szukanaHBox2.getChildren().add(btn2);
       siatkaPionowaVBox.getChildren().add(szukanaHBox);
       siatkaPionowaVBox.getChildren().add(szukanaHBox2);
       
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                                Formularz formularz=new Formularz();
                    try {
                        formularz.start(primaryStage);
                    } catch (Exception ex) {
                        Logger.getLogger(Program1.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }           
        });
        
        
        btn4.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                                BMIPage bmi=new BMIPage();
                    try {
                        bmi.start(primaryStage);
                    } catch (Exception ex) {
                        Logger.getLogger(Program1.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }           
        });
        
        StackPane root = new StackPane();
        
        //root.getChildren().add(btn);
        
        Scene scene = new Scene(siatkaPionowaVBox, 600, 500);
        
        primaryStage.setTitle("DON'T BE CHUBBY");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
