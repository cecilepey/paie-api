# paie-api
https://paie-api-cecile.herokuapp.com/


# Ajouter un employé : 



### champ matricule : 

### champ entreprise : 

GET /entreprises
Content type : application/json

{
code + libellé

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

GET /profils_remunerations
{
code + libellé
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

GET /grades

{

"code": "code du grade",
"salaire annuel" : "salaire annuel (nb_heures_base*taux_base*12)" --> C'est plus un format d'affichage que de données, c'est donc plus au front de faire le calcul. 

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
"code entreprise": : "code entreprise sélectionnée", 
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
Vérifier dans collegue API que le matricule existe bien avec RestTemplate.

# Correction : 

# Ecran : ajouter un employé

GET /entreprises
GET /profils_remuneration
GET /grades

------------------------
GET /referentiels

POST /remuneration_employes

# Ecran : liste des employés

GET /remuneration_employes





