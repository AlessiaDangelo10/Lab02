package it.polito.tdp.alien;

import java.net.URL;
import java.util.ResourceBundle;

import it.polito.tdp.alien.model.AlienDictionary;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {
	AlienDictionary dizionario;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnReset;

    @FXML
    private TextField txtInsert;

    @FXML
    private Button btnTranslate;

    @FXML
    private TextArea txtResult;

    @FXML
    void  doTranslate (  ActionEvent event ) {
    	String testoInput = txtInsert.getText ();
    	txtInsert.clear();
    	String testoOutput = dizionario.aggiungitraduci(testoInput);
    	txtResult.appendText (testoOutput);
    }
    
    
    @FXML
    void  doReset (  ActionEvent event  ) {
    	dizionario.reset();
        txtResult.clear();
    	
    }
    
    
    @FXML
    void  initialize () {	
    	
    	  assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Scene.fxml'.";
          assert txtInsert != null : "fx:id=\"txtInsert\" was not injected: check your FXML file 'Scene.fxml'.";
          assert btnTranslate != null : "fx:id=\"btnTranslate\" was not injected: check your FXML file 'Scene.fxml'.";
          assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Scene.fxml'.";
          dizionario =  new  AlienDictionary ();
    }
}


