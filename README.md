

Plan détaillé



Main



Package : com.benja2.entites




Société
Variables d’instance : int  Identifiant 

1) l’identifiant commencera par 1 et 
2) est différent pour chaque classe fille, 
3) chacune commence donc à 1.  => Client/ Prospect
4) Il ne pourra pas être modifié par l’utilisateur, 
5) il sera visible en cas d’Affichage, de création , de modification ou de suppression (CRUD) 


String RaisonSociale
Elle doit : 
1) être saisie (Une invite de commande demandera de saisir la raison sociale) 
2) être unique (il ne se peut pas qu’il y ait 2 sociétés avec le même nom), que ce soit pour le client ou pour le prospect. 




 Adresse adresse
Tous les champs devront être renseignés, 
le code postal devra être renseigné et vérifié par un Regex, qui devra comporter 5 chiffres. 

String telephone
Le téléphone devra être renseigné et vérifié par un Regex. 




String email



L’email devra être renseigné et vérifié par un Regex. 




String commentaires 
Les commentaires ne sont pas obligatoires. 



Adresse
Variables d’instance : 
String NumeroRue 
String NomRue
String CodePostal
String Ville


 Adresse adresse
Tous les champs devront être renseignés, 
le code postal devra être renseigné et vérifié par un Regex, qui devra comporter 5 chiffres. 

String telephone
Le téléphone devra être renseigné et vérifié par un Regex. 





2)

Client
Classe Client héritant de la classe société avec comme variables d’instance supplémentaires : 
Long Chiffres d’Affaires : forcément supérieur à 2
Int : nombre d’employés : entier strictement supérieur à 0 



3) 
Prospect
Classe Prospect héritant de la classe société avec comme variables d’instance supplémentaires : 
la date de prospection au format LocalDate  au format jj/mm/aaaa, utiliser un pattern. 
(+ création de fichiers patterns et regex) 

String Prospect Intéressé : 
Créer une énumération et une liste déroulante dans le formulaire de saisie/modification
⇒  (CRUD) + Combobox


  « enum ImmuInteresse »





enum 

3 enum : 

ImmuComm  // Client/Prospect
ImmuCrud
ImmuInteresse 









4) Les collections d’objets seront gérées dans deux classes à part, mais il n’y aura qu’une seule liste déroulante dans la page d’accueil : la liste déroulante de la page d’accueil n’affichera que les clients ou prospects suivant le choix de l’utilisateur. 
Nb : les collections peuvent être initialisées avec quelques objets au démarrage de l’application pou faciliter les tests. 

ArrayClient 
ArrayProspect

Nom : ArrayListClient
	ArrayListProspect





5) l’application aura 3 interfaces utilisateur : 
3 vues. 

1 vue pour la page d’accueil. 
1 vue pour le CRUD  ⇒ Création, modification, suppression des clients et prospects. Cette vue s’adaptera donc au choix des utilisateurs. 
1 vue  pour afficher la liste de clients ou la liste des prospects, cette vue s’adaptera aussi au choix des utilisateurs. 


Le développement se fera en Java, avec la bibliothèque graphique Swing
L’affichage de la liste des clients ou des prospects de fera avec une Jtable
Une javadoc sera fournie dans un dossier dédié
La gestion des données se fera à l’aide de collections Java de type ArrayList 
Un fichier Log Sera fourni dans un dossier dédié. 




Indications personnelles : 
1) le main reste succin, les vues du package vue s’occupant de toute la partie visuelle utilisateur. 
2) les try catch seront des plus simples, avec un try regroupant 4 catchs, des exceptions simple et légères (pas d’exceptions fortes ou sévères). 
3) la dernière exception est une exception générale qui permet d’attraper toutes les exceptions.  Le finally permet de nettoyer à la fin. 
4) ne pas oublier les RegEx et les patterns à faire pour les 3 éléments. 
5) ne pas oublier les logs, et les tests unitaires, qui ne s’effectuent pas sur les fichiers vue ou la partie Swing. 
6) Faire la partie Swing à partir de la classe Accueil, et Accueil Form, avec Swing. 






