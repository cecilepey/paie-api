# paie-api
https://paie-api-cecile.herokuapp.com/


# Ajouter un employé : 


GET / ajouterEmploye

### champ matricule : 

### champ entreprise : 


Content type : application/json

{

"dénomination": "dénomination entreprise"

}

Réponse en cas de succès : 200

Réponses en cas d'erreur : 
404

Content-Type: application/json

{
    "message" : "Il n'y a pas d'entreprise"
}


### champ profil : 


{

"code": "code du profil"

}

Réponse en cas de succès : 200

Réponses en cas d'erreur : 
404

Content-Type: application/json

{
    "message" : "Il n'y a pas de profil"
}


### grade : 

{

"code": "code du grade",
"salaire annuel" : "salaire annuel (nb_heures_base*taux_base*12)"

}

Réponse en cas de succès : 200

Réponses en cas d'erreur : 
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


### bouton ajouter

POST / ajouterCollegue

content type : application/json

{
"matricule" : "matricule saisi", 
"dénomination": : "dénomination entreprise sélectionnée", 
"code" : "code profil sélectionné", 
"code" : "code grade sélectionné"
}

Réponse en cas de succès : 201

Réponses en cas d'erreur : 
404

Content-Type: application/json

{
    "message" : "Un champ n'est pas rempli"
}
