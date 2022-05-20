1) Cr�er Un Projet Maven(c-inversionOfControl-Maven)

	a) mvn compile (demander a maven de compiler le projet)
	b) mvn test (demander a maven de compiler et executer tous les tests unitaires)
	c) mvn package (compiler + executer tests + g�n�rer package "JAR = java archive" ou "WAR = web archive" )
	d) mvn install (compiler + executer tests + g�n�rer package + installer le package dans le r�pository locale ".m2")
	e) mvn deploy 
	e) mvn site (g�n�rer un fichier html qui constitue la doc du projet) 

2) Cr�er une interface IDao dans le package a_inversionOfControl.Dao
	D�clarer la m�thode getData() qui retourne un double dans l'interface IDao
	
3) Cr�er une class DaoImpl qui impl�mente l'interface IDao puis red�finir la m�thode getData()

4) Cr�er une interface IMetier dans le package a_inversionOfControl.Metier
   D�clarer la m�thode calc() qui retourne un double dans l'interface IMetier
   
5) Cr�er une class MetierImpl qui impl�mente l'interface IMetier puis red�finir la m�thode calc()

6) Pour pouvoir r�cup�rer la valeur data il faut d�clarer une variable de type IDao dans MetierImpl
   (Couplage Faible)
   
	==> IDao n'est pas initialiser donc sa valeur est null
	==> Ajouter un setter Pour Injecter dans la variable dao une objet d'une class qui impl�mente l'interface IDao   

7)Cr�er un fichier config.txt dans src et ajouter ces deux chemins:

	==>c_inversionOfControl_Maven.dao.DaoImpl
	==>c_inversionOfControl_Maven.metier.MetierImpl

8)Pour faire l'injection de d�pendence via Spring il faut rajouter les d�pendences suivantes:

    ==> Spring Core
    ==> Spring Context
    ==> Spring Beans

//-----------------------Version XML----------------------------------------------//

9) Cr�er le fichier ApplicationContext.xml et ajouter vos bean
 
10) Cr�er une class PresSpringXml avec un "main" puis 

    ==> Cr�er un objet ApplicationContext de type ClassPathXmlApplicationContext
    ==> Cette Class utilise l'instanciation Dynamique(elle est ferm�e � la modification ouverte � l'extension)

12) Pour utiliser la nouvelle extension il suffit de lui indiquer le chemin de la nouvelle extension dans
   le fichier ApplicationContext.xml:
   
    ==> c_inversionOfControl_Maven.extension.DaoImplV2 


//-----------------------Version Annotation----------------------------------------------//

9) Ajouter l'annotation @Component("dao") � DaoImlp ==> dir � spring � chaque fois ou tu trouve
   cette annotation il faut instancier cette class et donne lui le nom "dao"

10) Ajouter l'annotation @Component("metier") � metierImlp 

11) Pour faire l'injection de d�pendence Ajouter l'annotation @Autowired � private IDao dao

12) Cr�er une class PresSpringAnnotation avec un "main" puis 

    ==> Cr�er un objet ApplicationContext de type AnnotationConfigApplicationContext
    ==> Cette Class utilise l'instanciation Dynamique(elle est ferm�e � la modification ouverte � l'extension)