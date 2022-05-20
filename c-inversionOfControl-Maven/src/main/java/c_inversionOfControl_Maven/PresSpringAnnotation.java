package c_inversionOfControl_Maven;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import c_inversionOfControl_Maven.metier.Imetier;

public class PresSpringAnnotation {

	public static void main(String[] args) {

		//Scanner les package metier et dao
		ApplicationContext context = new AnnotationConfigApplicationContext("c_inversionOfControl_Maven.dao",
																			"c_inversionOfControl_Maven.metier",
																			"c_inversionOfControl_Maven.extension");

		Imetier metier = (Imetier) context.getBean(Imetier.class);

		System.out.println("Resultats = " + metier.calc());
	}

}
