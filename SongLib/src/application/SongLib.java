package application;
	

import java.util.ArrayList;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SongLib extends Application {
<<<<<<< HEAD:application/SongLib.java
	public ArrayList<SongNode> arrayList;
	private SongLibrary SongList;
=======

	Stage window;
	Parent root;
	Parent root_alert;
>>>>>>> 0a2b1517d4b7ecf9371aa904703969d10c9841d6:SongLib/src/application/SongLib.java
	
    public static void main(String[] args) {
      	SongLibrary library = new SongLibrary();
      	library.parse();
      	library.sortAscending();
      	
      	for (int i = 0; i < library.arrayList.size(); i++) {
             SongNode val =library.arrayList.get(i);
             String value=val.SongName;
             System.out.println("Element: " + value);
         }
      	 
      	
      	 
       // launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
<<<<<<< HEAD:application/SongLib.java
    	//SongLibrary library = new SongLibrary();
  	//library.parse();
    	
    	
    	
//    	  Parent root = FXMLLoader.load(getClass().getResource("songLib_layout.fxml"));
//        primaryStage.setTitle("Song Library");
//        primaryStage.setScene(new Scene(root, 685, 688));
//        primaryStage.show();
//        
        
        
    
=======
        window=primaryStage;
    	root = FXMLLoader.load(getClass().getResource("songLib_layout.fxml"));
       
        window.setTitle("Song Library");
        
    
    
        window.setScene(new Scene(root, 685, 688));
        window.show();
    
>>>>>>> 0a2b1517d4b7ecf9371aa904703969d10c9841d6:SongLib/src/application/SongLib.java
    }//start method done
    
    
   


}
