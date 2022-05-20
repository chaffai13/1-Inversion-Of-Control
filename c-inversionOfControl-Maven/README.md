1) Créer Un Projet Maven(c-inversionOfControl-Maven)

	a) mvn compile (demander a maven de compiler le projet)
	b) mvn test (demander a maven de compiler et executer tous les tests unitaires)
	c) mvn package (compiler + executer tests + générer package "JAR = java archive" ou "WAR = web archive" )
	d) mvn install (compiler + executer tests + générer package + installer le package dans le répository locale ".m2")
	e) mvn deploy 
	e) mvn site (générer un fichier html qui constitue la doc du projet) 

2) Créer une interface IDao dans le package a_inversionOfControl.Dao
	Déclarer la méthode getData() qui retourne un double dans l'interface IDao
	
3) Créer une class DaoImpl qui implémente l'interface IDao puis redéfinir la méthode getData()

4) Créer une interface IMetier dans le package a_inversionOfControl.Metier
   Déclarer la méthode calc() qui retourne un double dans l'interface IMetier
   
5) Créer une class MetierImpl qui implémente l'interface IMetier puis redéfinir la méthode calc()

6) Pour pouvoir récupérer la valeur data il faut déclarer une variable de type IDao dans MetierImpl
   (Couplage Faible)
   
	==> IDao n'est pas initialiser donc sa valeur est null
	==> Ajouter un setter Pour Injecter dans la variable dao une objet d'une class qui implémente l'interface IDao   

7)Créer un fichier config.txt dans src et ajouter ces deux chemins:

	==>c_inversionOfControl_Maven.dao.DaoImpl
	==>c_inversionOfControl_Maven.metier.MetierImpl

8)Pour faire l'injection de dépendence via Spring il faut rajouter les dépendences suivantes:

    ==> Spring Core
    ==> Spring Context
    ==> Spring Beans

//-----------------------Version XML----------------------------------------------//

9) Créer le fichier ApplicationContext.xml et ajouter vos bean
 
10) Créer une class PresSpringXml avec un "main" puis 

    ==> Créer un objet ApplicationContext de type ClassPathXmlApplicationContext
    ==> Cette Class utilise l'instanciation Dynamique(elle est fermée à la modification ouverte à l'extension)

12) Pour utiliser la nouvelle extension il suffit de lui indiquer le chemin de la nouvelle extension dans
   le fichier ApplicationContext.xml:
   
    ==> c_inversionOfControl_Maven.extension.DaoImplV2 


//-----------------------Version Annotation----------------------------------------------//

9) Ajouter l'annotation @Component("dao") à DaoImlp ==> dir à spring à chaque fois ou tu trouve
   cette annotation il faut instancier cette class et donne lui le nom "dao"

10) Ajouter l'annotation @Component("metier") à metierImlp 

11) Pour faire l'injection de dépendence Ajouter l'annotation @Autowired à private IDao dao

12) Créer une class PresSpringAnnotation avec un "main" puis 

    ==> Créer un objet ApplicationContext de type AnnotationConfigApplicationContext
    ==> Cette Class utilise l'instanciation Dynamique(elle est fermée à la modification ouverte à l'extension)