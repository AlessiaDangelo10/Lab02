package it.polito.tdp.alien.model;

import  java.util.ArrayList ;
import  java.util.List ;

public class AlienDictionary {
	
	List <Word> dizionario =  new  ArrayList <> ();

	public  AlienDictionary () {
		super ();
		// TODO Stub costruttore generato automaticamente
	}

	public  String  aggiungitraduci ( String  testoInput ) {
		// TODO Stub del metodo generato automaticamente
		
		testoInput.toLowerCase ();
		
		for ( Character c : testoInput.toCharArray ()) {
			
			if ( !Character . isAlphabetic (c) && c!=' ' ) {
				
				return  " Inserisci solo caratteri alfabetici \n " ;
			}
		}
		
		if (testoInput.contains( "  " )) {
			
			aggiungiVoce (testoInput);
			
			return  " aggiunto in modo corretto \n " ;			
		}
		else {
			
			return traduciParola (testoInput);
		}
	}

	private  String  traduciParola ( String  testoInput ) {
		// TODO Stub del metodo generato automaticamente
		
		int indice = dizionario . indexOf ( new Word (testoInput, null ));
		
		if (indice !=-1) {
			
			return dizionario.get(indice).toString();
		}
		else {
			
			return " la parole non esiste \n " ;
		}
	}

	private  void  aggiungiVoce ( String  testoInput ) {
		// TODO Stub del metodo generato automaticamente
		String alienWord = testoInput.substring( 0 , testoInput . indexOf ( "  " ));
		String italianWord = testoInput.substring(testoInput . indexOf ( "  " ) + 1 );
		
		Word nuovaVoce =  new Word(alienWord, italianWord);
		
		dizionario.add(nuovaVoce);
	}

	public  void  reset () {
		// TODO Stub del metodo generato automaticamente
		
		dizionario . clear();
	}

	
	
	
	

}