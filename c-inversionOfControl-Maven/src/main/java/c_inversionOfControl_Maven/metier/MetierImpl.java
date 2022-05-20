package c_inversionOfControl_Maven.metier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import c_inversionOfControl_Maven.dao.IDao;

@Component("metier")
public class MetierImpl implements Imetier {

	// Couplage Faible (dépend de l'interface)
	@Autowired
	//Pour spécifier quelle version d'instance il faut injecter
	@Qualifier("dao")
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
