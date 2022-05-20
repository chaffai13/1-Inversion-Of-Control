package c_inversionOfControl_Maven;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import c_inversionOfControl_Maven.metier.Imetier;

public class PresSpringXml {

	public static void main(String[] args) {

		//ApplicationContext context = new ClassPathXmlApplicationContext("config.txt");
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

		//Imetier metier = (Imetier) context.getBean(Imetier.class);
		Imetier metier = (Imetier) context.getBean("metier");

		System.out.println("Resultats = " + metier.calc());
	}

}
