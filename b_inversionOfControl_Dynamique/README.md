1) Créer Un Projet Java (a_inversionOfControl_Dynamique)

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
	==>b_inversionOfControl_Dynamique.dao.daoImpl
	==>b_inversionOfControl_Dynamique.metier.metierImpl

8) Créer une class Presentation2 avec un "main" puis Instancier Scanner pour lire le fichier config.txt
    ==> instancier DaoImpl d'une manière dynamique pour récupérer getData()
    ==> instancier MetierImpl d'une manière dynamique 
    ==> Appeler la méthode setDao() de MetierImpl dynamiquement
    ==> Cette Class utilise l'instanciation Dynamique(elle est fermée à la modification ouverte à l'extension)

9) Pour utiliser la nouvelle extension il suffit de lui indiquer le chemin de la nouvelle extension dans
   le fichier config.txt:
   ==> b_inversionOfControl_Dynamique.extension.DaoImplV2


