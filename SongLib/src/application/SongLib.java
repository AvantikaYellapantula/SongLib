package application;
	

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SongLib extends Application {

	Stage window;
	Parent root;
	Parent root_alert;
	
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        window=primaryStage;
    	root = FXMLLoader.load(getClass().getResource("songLib_layout.fxml"));
       
        window.setTitle("Song Library");
        
    
    
        window.setScene(new Scene(root, 685, 688));
        window.show();
    
    }//start method done
    
    
   


}
