package b_inversionOfControl_Dynamique;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

import b_inversionOfControl_Dynamique.dao.IDao;
import b_inversionOfControl_Dynamique.metier.Imetier;


/*Cette Classe s'appelle la fabrique des objets
elle est fermer à la modification et ouverte à l'extension*/
public class Presentation2 {

	public static void main(String[] args) throws FileNotFoundException, 
												  ClassNotFoundException, 
												  InstantiationException, 
												  IllegalAccessException, 
												  NoSuchMethodException, 
												  SecurityException, 
												  IllegalArgumentException, 
												  InvocationTargetException {
		
		Scanner scanner = new Scanner(new File("config.txt"));

//I) Instanciation Dynamique de DaoImpl
		
		//1) Récupérer le nom de la class DaoImpl
		String daoClassName = scanner.nextLine();		
		//2) Charger la class DaoImpl en mémoire dynamiquement
		Class cDao = Class.forName(daoClassName);		
		//3) Créer l'objet de la Class DaoImpl
		// Object dao = cDao.newInstance();
		IDao dao = (IDao) cDao.newInstance();

//II) Instanciation Dynamique de MetierImpl
		
		//1) Récupérer le nom de la class MetierImpl
		String metierClassName = scanner.nextLine();		
		//2) Charger la class MetierImpl en mémoire dynamiquement
		Class cMetier = Class.forName(metierClassName);		
		//3) Créer l'objet de la Class MetierImpl
		// Object metier = cMetier.newInstance();
		Imetier metier = (Imetier) cMetier.newInstance();
		
//III) Appeler la méthode setDao() de MetierImpl dynamiquement
		
		//1)Récupérer la méthode setDao()
		Method method = cMetier.getMethod("setDao", IDao.class);
		//2)Exécuter la méthode setDao() surl'objet metier et lui transmettre dao = metier.setDao(dao)
		//Injection de dépendance par instanciation dynamique
		method.invoke(metier, dao);
		
		System.out.println(metier.calc());
	}

}
