package com.dongmo.OldFashionPound;

public class MainOldFashionPound {
	public static void main(String[] args) {
		
		IntOldFashionPoundImplement fashionPoundImplement = new IntOldFashionPoundImplement();
		
		// Somma tra due prezzi
		
		String Somma = fashionPoundImplement.somma(5, 17, 8, 3, 4, 10);
		System.out.println("La somme dei prezzi entrati è: " + Somma);
		
		// sostrazione tra due prezzi
		
		String substraction = fashionPoundImplement.sottrazione(5, 17, 8, 3, 4, 10);
		System.out.println("La differenza dei prezzi entrati è: " + substraction);
		
		// prodotto 
		
		String moltiplication = fashionPoundImplement.moltiplicazione(5, 17, 8, 2);
		System.out.println("La moltiplicazione è: " + moltiplication);
		
		// Divisione
		
		String divisione = fashionPoundImplement.divisione(5, 17, 8, 3);
		System.out.println("La divisione è: " + divisione);
		
	}

}
