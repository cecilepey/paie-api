# paie-api
https://paie-api-cecile.herokuapp.com/


Ajouter un employ� : 


GET / ajouterEmploye

champ matricule : 

champ entreprise : 


Content type : application/json

{

"d�nomination": "d�nomination entreprise"

}

R�ponse en cas de succ�s : 200

R�ponses en cas d'erreur : 
404

Content-Type: application/json

{
    "message" : "Il n'y a pas d'entreprise"
}


champ profil : 


{

"code": "code du profil"

}

R�ponse en cas de succ�s : 200

R�ponses en cas d'erreur : 
404

Content-Type: application/json

{
    "message" : "Il n'y a pas de profil"
}


grade : 

{

"code": "code du grade",
"salaire annuel" : "salaire annuel (nb_heures_base*taux_base*12)"

}

R�ponse en cas de succ�s : 200

R�ponses en cas d'erreur : 
404

Content-Type: application/json

{
    "message" : "Il n'y a pas de grade"
}

ou 

404

Content-Type: application/json

{
    "message" : "Il n'y a pas de salaire annuel"
}


bouton ajouter

POST / ajouterCollegue

content type : application/json

{
"matricule" : "matricule saisi", 
"d�nomination": : "d�nomination entreprise s�lectionn�e", 
"code" : "code profil s�lectionn�", 
"code" : "code grade s�lectionn�"
}

R�ponse en cas de succ�s : 201

R�ponses en cas d'erreur : 
404

Content-Type: application/json

{
    "message" : "Un champ n'est pas rempli"
}
