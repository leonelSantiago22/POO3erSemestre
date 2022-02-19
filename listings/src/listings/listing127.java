/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listings;
import javafx.application.Apllication;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
/**
 *
 * @author Leonel
 */
public class listing127  extends Aplication{
    @Override 
    public void start ( Stage primaryStage)
    {
        Button btOk = new Button("ok");
        Scene scene = new Scene(btOk, 200, 250);
        primaryStage.setTitle("MyJavaFx");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        Application.launch(args);
    }
}
