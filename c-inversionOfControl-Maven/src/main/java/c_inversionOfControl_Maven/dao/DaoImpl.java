package c_inversionOfControl_Maven.dao;

import org.springframework.stereotype.Component;

@Component("dao")
public class DaoImpl implements IDao {

	@Override
	public double getData() {

		// Se connecter � la BDD pour r�cup�rer la data temp
		System.out.println("Version Base de donn�e ....");
		double temp = Math.random() * 40;
		return temp;
	}

}
