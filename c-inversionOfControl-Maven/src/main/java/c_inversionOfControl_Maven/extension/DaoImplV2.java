package c_inversionOfControl_Maven.extension;

import org.springframework.stereotype.Component;

import c_inversionOfControl_Maven.dao.IDao;

@Component("dao2")
public class DaoImplV2 implements IDao {

	@Override
	public double getData() {
		System.out.println("Version Capteur ...");
		double data = 77;
		return data;
	}

}
