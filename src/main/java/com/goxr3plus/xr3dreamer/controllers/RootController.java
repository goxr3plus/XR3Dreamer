package main.java.com.goxr3plus.xr3dreamer.controllers;

import java.io.IOException;

import com.jfoenix.controls.JFXButton;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.util.Duration;
import main.java.com.goxr3plus.xr3dreamer.tools.fx.JavaFXTools;
import main.java.com.goxr3plus.xr3dreamer.tools.fx.NotificationType;
import main.java.com.goxr3plus.xr3dreamer.tools.storage.RunTimeVars;

public class RootController extends StackPane {
	
	//--------------------------------------------------------------
	
	@FXML
	private BorderPane borderPane;
	
	@FXML
	private TextArea textArea;
	
	@FXML
	private JFXButton playVideo;
	
	// -------------------------------------------------------------
	
	/**
	 * Constructor.
	 */
	public RootController() {
		
		// ------------------------------------FXMLLOADER ----------------------------------------
		FXMLLoader loader = new FXMLLoader(getClass().getResource(RunTimeVars.FXMLS + "RootController.fxml"));
		loader.setController(this);
		loader.setRoot(this);
		
		try {
			loader.load();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		
	}
	
	/**
	 * Called as soon as fxml is initialized
	 */
	@FXML
	private void initialize() {
		
		// playVideo
		playVideo.setOnAction(a -> JavaFXTools.showNotification("Notification", "Sorry not implemented yet :)", Duration.seconds(2), NotificationType.INFORMATION));
	}
	
	public BorderPane getBorderPane() {
		return borderPane;
	}
	
}
