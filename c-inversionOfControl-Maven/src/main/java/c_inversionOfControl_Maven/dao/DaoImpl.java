package c_inversionOfControl_Maven.dao;

import org.springframework.stereotype.Component;

@Component("dao")
public class DaoImpl implements IDao {

	@Override
	public double getData() {

		// Se connecter à  la BDD pour récupérer la data temp
		System.out.println("Version Base de donnée ....");
		double temp = Math.random() * 40;
		return temp;
	}

}
