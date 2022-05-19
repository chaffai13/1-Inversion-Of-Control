package a_inversionOfControl_Statique.metier;

import a_inversionOfControl_Statique.Dao.IDao;

public class MetierImpl implements Imetier {

	// Couplage Faible (dépend de l'interface)
	private IDao dao;

	public MetierImpl() {
	}

	public MetierImpl(IDao dao) {
		this.dao = dao;
	}

	@Override
	public double calc() {
		double tmp = dao.getData();
		double res = tmp * 223 * Math.cos(tmp);
		return res;
	}

	// Pour Injecter dans la variable dao une objet d'une class qui implémente
	// l'interface IDao
	public void setDao(IDao dao) {
		this.dao = dao;
	}

}
