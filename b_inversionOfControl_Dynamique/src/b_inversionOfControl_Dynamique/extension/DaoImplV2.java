package b_inversionOfControl_Dynamique.extension;

import b_inversionOfControl_Dynamique.dao.IDao;

public class DaoImplV2 implements IDao {

	@Override
	public double getData() {
		System.out.println("Version Capteur ...");
		double data = 77;
		return data;
	}

}
