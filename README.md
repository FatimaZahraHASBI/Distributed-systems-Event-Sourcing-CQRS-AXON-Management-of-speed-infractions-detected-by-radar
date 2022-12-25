## 🔹 Fatima Zahra HASBI
<p align="justify">
Système distribué basé sur les micro-services en utilisant une architecture pilotée par les événements respectant les deux patterns Event Sourcing et CQRS. Cette application permet de gérer les infractions concernant des véhicules suites à des dépassement de vitesses détectés par des radars automatiques.
</p>

<p align="center">
<img src="https://readme-typing-svg.herokuapp.com/?font=Kaushan+Script&size=35&duration=3500&color=447FF7&background=FFFFFF00&center=true&vCenter=true&width=650&height=55&lines=Système-distribués;Gestion-des-excès-de-vitesse-sur-la-route+💻;" alt="Fatima Zahra HASBI" width="660" height="55"/>

<p align="center">
<img src="https://user-images.githubusercontent.com/63150702/209436684-37dc0579-4664-4744-b747-0e833e8ca38a.png" width="50%">
</p>


<div style=" font-size: medium; color: #447ff7" align=center>
<img src="https://user-images.githubusercontent.com/73097560/115834477-dbab4500-a447-11eb-908a-139a6edaec5c.gif">  
</div>
<br>

## 🔹 1- L’architecture technique du projet
<p align="justify">
L’architecture technique pour ce projet se basent principalement sur l’utilisation des éléments suivants :</p><br>
<p align="justify"><B>•	Micro-services</B></p>

<p align="justify"><B>•	Architecture pilotée par les événements</B></p>

<p align="justify"><B>•	Les patterns Event Sourcing et CQRS</B></p>

<p align="justify"><B>•	Le framework Spring Cloud</B></p>

<p align="justify"><B>•	Le framework AXON</B></p>

<p align="justify"><B>•	Un module "common-api"</B></p><br>


Voici comment cela pourrait se traduire visuellement :<br>
 
<p align="center">
<img src="https://user-images.githubusercontent.com/63150702/209451155-7e661cc3-ab2d-4be6-b246-6245f6633ce6.png" >
</p>

<br> 
<p align="justify">Cette architecture permettra de mettre en place un système distribué basé sur les micro-services qui respecte les patterns Event Sourcing et CQRS, et qui permet de gérer les infractions liées aux dépassements de vitesses détectés par des radars automatiques</p>

<br> 

<div style=" font-size: medium; color: #447ff7" align=center>
<img src="https://user-images.githubusercontent.com/73097560/115834477-dbab4500-a447-11eb-908a-139a6edaec5c.gif">  
</div>
<br>

## 🔹 2- Diagramme de classe 
<p align="center">
<img src="https://user-images.githubusercontent.com/63150702/209452869-1fcc1ee2-f224-47ee-97e1-9c283e760e9a.png">
</p>

### Diagramme pour les micro-services
<p align="center">
<img src="https://user-images.githubusercontent.com/63150702/209411911-3b24e2e3-0d21-4063-9625-9aa356f3f07b.png" width="60%">
</p>
<br>

<p align="justify">Dans ce diagramme, on peut voir que chaque micro-service utilise un repository pour accéder à sa propre base de données et implémente un "Command Handler" pour séparer la logique de traitement des commandes de la logique de persistance des données, ce qui facilite la maintenance et l'évolution du système. Elle permet également de mettre en place l'Event Sourcing, c'est-à-dire de stocker l'historique complet des changements d'état du système sous forme d'événements, ce qui peut être utile pour la rejouabilité et la reconstruction de l'état du système.</p><br>

<div style=" font-size: medium; color: #447ff7" align=center>
<img src="https://user-images.githubusercontent.com/73097560/115834477-dbab4500-a447-11eb-908a-139a6edaec5c.gif">  
</div>
<br>

## 🔹 3- Micro-service Radar
<p align="justify">Le micro-service "Radar" permet de gérer les radars automatiques installés sur les routes. Il permet de créer, de mettre à jour et de consulter les informations sur les radars, comme leur localisation, leur vitesse maximale autorisée, etc.</p><br>

![image](https://user-images.githubusercontent.com/63150702/209471041-65b37f46-1fd7-45ac-8db4-aad3e3d7387f.png)<br><br>
![image](https://user-images.githubusercontent.com/63150702/209471048-cb2a571b-ad7e-47f6-a903-4b73071ca9f8.png)<br><br>
![image](https://user-images.githubusercontent.com/63150702/209471051-30b412eb-82d1-4b8d-a3ef-e3037ef94073.png)<br><br>
![image](https://user-images.githubusercontent.com/63150702/209471053-75ad0a96-9d65-41cd-ade8-9f9fb2104123.png)<br><br>

<p align="center">
<img src="https://user-images.githubusercontent.com/63150702/209473164-792731d5-d2c2-4f59-8735-d923de95ec0d.png" >
</p>

![image](https://user-images.githubusercontent.com/63150702/209471057-781590b7-8df4-4190-800e-51df0b83705b.png)<br>
![image](https://user-images.githubusercontent.com/63150702/209471060-068c0e13-3f11-45ac-810a-674efd23846c.png)<br>


## 🔹 4- Micro-service Immatriculation
<p align="justify">Le micro-service "Immatriculation" permet de gérer les véhicules et leurs propriétaires. Il permet de créer, de mettre à jour et de consulter les informations sur les véhicules, comme leur marque, leur modèle, leur puissance fiscale, etc. Il permet également de gérer les informations sur les propriétaires, comme leur nom, leur date de naissance, leur email, etc.</p><br>

## 🔹 5- Micro-service Infraction
<p align="justify">Le micro-service "Infraction" permet de gérer les infractions enregistrées par le système. Il permet de créer de nouvelles infractions lorsqu'un radar détecte un dépassement de vitesse, et de consulter les infractions enregistrées pour un propriétaire donné. Chaque infraction est enregistrée avec des informations comme la date de l'infraction, le radar qui l'a détectée, le véhicule impliqué, la vitesse du véhicule, etc.</p><br>

