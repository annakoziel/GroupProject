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
public class Formularz extends Application{

    @Override
    public void start(final Stage primaryStage) throws Exception {
        
         Button btn = new Button();
        btn.setText("Wyślij formularz");
      
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                       OdpowiedzFormularz odp=new OdpowiedzFormularz();
                    try {
                        odp.start(primaryStage);
                    } catch (Exception ex) {
                        Logger.getLogger(Program1.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }  
            
        });
        
        StackPane root = new StackPane();
        root.getChildren().add(btn);
      
        Scene pierwsza = new Scene(root, 300, 250);
      
        
        primaryStage.setTitle("Formularz");
        primaryStage.setScene(pierwsza);
        primaryStage.show();
    }
    
}
