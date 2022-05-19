package a_inversionOfControl_Statique.Dao;

public class DaoImpl implements IDao {

	@Override
	public double getData() {

		// Se connecter à la BDD pour récupérer la data temp
		System.out.println("Version Base de donn�e ....");
		double temp = Math.random() * 40;
		return temp;
	}

}
