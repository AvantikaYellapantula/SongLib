package application;

import javafx.fxml.Initializable;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class Controller{

	//add all the buttons
	
	@FXML Button addButton;
	@FXML Button editButton;
	@FXML Button delButton;

	//add all the fields
	
	@FXML TextField nameField;
	@FXML TextField artistField;
	@FXML TextField albumField;
	@FXML TextField yearField;
	
    
	//addMethod
	public void addClicked() throws IOException {
		//System.out.println("Add Clicked");
		if(nameField.getText().equals("")) {
			Alert name_alert = new Alert(Alert.AlertType.ERROR, "Song Title field is empty.", ButtonType.OK);
			name_alert.showAndWait();
		}
		else if(artistField.getText().equals("")) {
			Alert artist_alert = new Alert(Alert.AlertType.ERROR, "Artist Name field is empty.", ButtonType.OK);
			artist_alert.showAndWait();
		}
		
		else{Alert confirm_add = new Alert(Alert.AlertType.CONFIRMATION, "Are you sure you'd like to add this song?", ButtonType.YES, ButtonType.CANCEL);
		confirm_add.showAndWait();
		}
		
	}
	
	public void editClicked() {
		if(nameField.getText().equals("")) {
			Alert name_alert = new Alert(Alert.AlertType.ERROR, "Song Title field is empty.", ButtonType.OK);
			name_alert.showAndWait();
		}
		else if(artistField.getText().equals("")) {
			Alert artist_alert = new Alert(Alert.AlertType.ERROR, "Artist Name field is empty.", ButtonType.OK);
			artist_alert.showAndWait();
		}
				
		else {Alert confirm_edit = new Alert(Alert.AlertType.CONFIRMATION, "Are you sure you'd like to edit this song?", ButtonType.YES, ButtonType.CANCEL);
		confirm_edit.showAndWait();
		
		}
		
	}
	
	public void delClicked() {
		Alert confirm_del = new Alert(Alert.AlertType.CONFIRMATION, "Are you sure you'd like to delete this song?", ButtonType.YES, ButtonType.CANCEL);
		confirm_del.showAndWait();
		
	}
	
	
	
	
	
	
	
}