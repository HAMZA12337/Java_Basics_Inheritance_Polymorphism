# Java_Basics_Inheritance_Polymorphism
Java_Basics_Inheritance_Polymorphism
TP 2 : Héritage, Redéfinition, Polymorphisme




-------------------------Programmation Orientée Objet Java 2021-----------------------------------------------
-------------------------Mr. Abdelmajid BOUSSELHAM 2---------------------------------------------------------
-------------------------Exercice 1 :----------------------------------------------------------------------- 



On souhaite créer une application JAVA pour la gestion des livres et des adhèrents d’une 
bibliothèque.
1. Créez une classe Personne avec les attributs privés : nom, prenom, email, tel, et age. 
Ajoutez le constructeur avec paramètres pour initialiser les différents attributs et la méthode 
afficher() pour afficher ces attributs.
2. Créez une deuxième classe Adherent qui hérite de la classe Personne et qui contient 
l’attribut numAdherent et redéfinit la méthode afficher(). 
3. Créez une troisième classe Auteur qui hérite de la classe Personne, qui contient l’attribut 
numAuteur et redéfinit la méthode afficher().
4. Créez la classe Livre qui contient un attribut ISBN (entier) et un auteur. Ajoutez 
également la méthode afficher() qui affiche le ISBN, le titre et les informations de l’auteur. 
5. Créez une application qui contient une méthode main() pour tester les différentes classes, 
dans laquelle : 
 — déclarez et intentiez un adhèrent ;
 — déclarez et instanciez un livre qui est écrit par un auteur ; 
 — affichez les informations de l’adhèrent et du livre.
 
 
-----------------------Exercice 2:--------------------------------------------------------------------------


On souhaite créer une application en java qui permet de gérer les salaires des ingénieurs et 
des managers d’une entreprise de développement informatique.
1. Créez la classe abstraite Employe avec les attributs nom, prenom, email, telephone, et 
salaire. Ajoutez les constructeurs avec et son paramètres, puis la méthode abstraite 
calculerSalire() qui retourne le salaire d’un employé.
2. Créez la classe Ingénieur avec l’attribut spécialité. Redéfinissez la méthode 
calculerSalire() sachant qu’on prévoit une augmentation de 15% par rapport à son salaire 
normal.

3. Créez la classe Manager avec l’attribut service. Redéfinissez la méthode 
calculerSalire() sachant qu’on prévoit une augmentation de 20% par rapport à son salaire 
normal.
4. Créez une application qui contient une méthode main() pour tester les différentes 
classes, dans laquelle :
— déclarez et intentiez un ingénieur ;
— déclarez et intentiez un manager ;
— affichez les informations de l’ingénieur et du manager (nom, prénom, salaire, 
service, et spécialité).
