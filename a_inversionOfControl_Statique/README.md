1) Créer Un Projet Java (a_inversionOfControl)

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
    
7) Créer une class Presentation1 avec un "main" puis instancier MetierImpl pour utiliser la méthde calc()
    Si on Fait le calcule on va avoir une exception "NullPointerException" car on appelle une méthode
    d'un objet qui n'est pas encore créé

    ==> Pour régler ce problème instancier DaoImpl puis utiliser le setter de MetierImpl 
	    Pour lui Injecter la variable dao
    ==> Cette Class utilise l'instanciation Statique (elle est ouverte à la modification)


 