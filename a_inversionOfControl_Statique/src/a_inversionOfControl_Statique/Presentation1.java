package a_inversionOfControl_Statique;

import a_inversionOfControl_Statique.Dao.DaoImpl;
import a_inversionOfControl_Statique.metier.MetierImpl;

/*Cette Classe s'appelle la fabrique des objets
elle ouverte à la modification*/
public class Presentation1 {

	public static void main(String[] args) {
		
		DaoImpl dao = new DaoImpl();
		
		/*Injection dépendance par instanciation statique via le Constructeur 
		 * (liaison avec Agrégation ==> relation forte)
		MetierImpl metier = new MetierImpl(dao);*/
		
		MetierImpl metier = new MetierImpl();
		
		/*Injection de dépendance par instanciation statique via les setter ==> utiliser new
		(liaison avec Association)*/
		metier.setDao(dao);
		
		System.out.println("resultat = " + metier.calc());
	}

}
