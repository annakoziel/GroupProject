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

/**
 *
 * @author Magdalena
 */
public class OdpowiedzFormularz extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        
         Button btn = new Button();
        btn.setText("OPIS");
      
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                  System.out.println("OPIS odpowiedzi na formularz");
                    }
                
            
        });
        
        StackPane root = new StackPane();
        root.getChildren().add(btn);
      
        Scene pierwsza = new Scene(root, 300, 250);
      
        
        primaryStage.setTitle("Wynik");
        primaryStage.setScene(pierwsza);
        primaryStage.show();
    }
    }
    

