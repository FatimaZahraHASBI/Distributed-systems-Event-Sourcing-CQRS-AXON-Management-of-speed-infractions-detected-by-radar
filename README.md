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

<p align="center">
<img src="https://user-images.githubusercontent.com/63150702/209475695-4f390922-c6d9-4f0b-9a25-eddcd13ad789.png" width="90%">
</p>

![image](https://user-images.githubusercontent.com/63150702/209471041-65b37f46-1fd7-45ac-8db4-aad3e3d7387f.png)<br><br>
![image](https://user-images.githubusercontent.com/63150702/209471048-cb2a571b-ad7e-47f6-a903-4b73071ca9f8.png)<br><br>
![image](https://user-images.githubusercontent.com/63150702/209471051-30b412eb-82d1-4b8d-a3ef-e3037ef94073.png)<br><br>
![image](https://user-images.githubusercontent.com/63150702/209471053-75ad0a96-9d65-41cd-ade8-9f9fb2104123.png)<br><br>
![image](https://user-images.githubusercontent.com/63150702/209473684-4854d433-e59e-4a96-ac49-203445e6303b.png)<br><br>

<p align="center">
<img src="https://user-images.githubusercontent.com/63150702/209473863-8e97961f-6488-410b-a451-ccd56a0f9199.png" width="90%">
</p>

<p align="center">
<img src="https://user-images.githubusercontent.com/63150702/209473164-792731d5-d2c2-4f59-8735-d923de95ec0d.png" >
</p>


![image](https://user-images.githubusercontent.com/63150702/209471057-781590b7-8df4-4190-800e-51df0b83705b.png)<br>
![image](https://user-images.githubusercontent.com/63150702/209471060-068c0e13-3f11-45ac-810a-674efd23846c.png)<br>


<div style=" font-size: medium; color: #447ff7" align=center>
<img src="https://user-images.githubusercontent.com/73097560/115834477-dbab4500-a447-11eb-908a-139a6edaec5c.gif">  
</div>
<br>

## 🔹 4- Micro-service Immatriculation
<p align="justify">Le micro-service "Immatriculation" permet de gérer les véhicules et leurs propriétaires. Il permet de créer, de mettre à jour et de consulter les informations sur les véhicules, comme leur marque, leur modèle, leur puissance fiscale, etc. Il permet également de gérer les informations sur les propriétaires, comme leur nom, leur date de naissance, leur email, etc.</p><br>
<p align="center">
<img src="https://user-images.githubusercontent.com/63150702/209475789-9ba1dc72-4ae2-4363-b921-d0a121273786.png" >
</p>

<p align="center">
<img src="https://user-images.githubusercontent.com/63150702/209475870-fa79b2f4-eb1a-4ce6-b20f-13ab66a8f381.png" >
</p>

<p align="center">
<img src="https://user-images.githubusercontent.com/63150702/209475903-57205d94-9bff-4b2c-90d9-02425d459c3f.png" >
</p>

<p align="center">
<img src="https://user-images.githubusercontent.com/63150702/209476135-96932346-b05a-49cf-9353-d6131ddc2e1b.png" >
</p>

<p align="center">
<img src="https://user-images.githubusercontent.com/63150702/209476246-dad07c37-690d-4ef4-94ea-825150bd6518.png" >
</p>

<p align="center">
<img src="https://user-images.githubusercontent.com/63150702/209476273-06e8a6af-b57a-4f7d-be3a-fbae706a8dd5.png" >
</p>

<p align="center">
<img src="https://user-images.githubusercontent.com/63150702/209476333-0a1eebc0-7ff8-4165-b675-15a2d6aa085e.png" >
</p>

<p align="center">
<img src="https://user-images.githubusercontent.com/63150702/209476352-2f3d56ca-3739-45bd-8a09-65b21783a403.png" >
</p>

<div style=" font-size: medium; color: #447ff7" align=center>
<img src="https://user-images.githubusercontent.com/73097560/115834477-dbab4500-a447-11eb-908a-139a6edaec5c.gif">  
</div>
<br>

## 🔹 5- Micro-service Infraction
<p align="justify">Le micro-service "Infraction" permet de gérer les infractions enregistrées par le système. Il permet de créer de nouvelles infractions lorsqu'un radar détecte un dépassement de vitesse, et de consulter les infractions enregistrées pour un propriétaire donné. Chaque infraction est enregistrée avec des informations comme la date de l'infraction, le radar qui l'a détectée, le véhicule impliqué, la vitesse du véhicule, etc.</p><br>

<p align="center">
<img src="https://user-images.githubusercontent.com/63150702/209477659-d6691bce-c2dd-4f99-a4d3-8983ad371db8.png" >
</p>

<p align="center">
<img src="https://user-images.githubusercontent.com/63150702/209477734-358e9dd9-53a7-4c87-b642-60d6577a518b.png" >
</p>

<p align="center">
<img src="https://user-images.githubusercontent.com/63150702/209477755-df0775c5-f488-47b5-85c0-d013dfa01c95.png" >
</p>

<p align="center">
<img src="https://user-images.githubusercontent.com/63150702/209477842-5ff52306-accc-419f-ad19-d0082b55437e.png" >
</p>

![image](https://user-images.githubusercontent.com/63150702/209477911-24a85545-0903-4f5d-929f-2e31a6461bbe.png)<br><br>


<div style=" font-size: medium; color: #447ff7" align=center>
<img src="https://user-images.githubusercontent.com/73097560/115834477-dbab4500-a447-11eb-908a-139a6edaec5c.gif">  
</div>
<br>

## 🔹 6- Eureka Discovery Sever
<p align="center">
<img src="https://user-images.githubusercontent.com/63150702/209478191-60c0482b-019b-4c81-88b9-9698b8e01b5a.png" >
</p>

<p align="center">
<img src="https://user-images.githubusercontent.com/63150702/209478221-5da26775-f2a1-46a7-96ee-398813273dbd.png" >
</p>

<p align="center">
<img src="https://user-images.githubusercontent.com/63150702/209478221-5da26775-f2a1-46a7-96ee-398813273dbd.png" >
</p>

<p align="center">
<img src="https://user-images.githubusercontent.com/63150702/209478265-47057957-f324-4924-a797-83e7ee18eec3.png" >
</p>

<div style=" font-size: medium; color: #447ff7" align=center>
<img src="https://user-images.githubusercontent.com/73097560/115834477-dbab4500-a447-11eb-908a-139a6edaec5c.gif">  
</div>
<br>

## 🔹 7- Gateway

<p align="center">
<img src="https://user-images.githubusercontent.com/63150702/209478358-b235ed76-94d3-4357-a038-938cde997c98.png" >
</p>

<p align="center">
<img src="https://user-images.githubusercontent.com/63150702/209478419-d2e5b39c-4f4a-4ec6-a163-79008acfae79.png" >
</p>

<div style=" font-size: medium; color: #447ff7" align=center>
<img src="https://user-images.githubusercontent.com/73097560/115834477-dbab4500-a447-11eb-908a-139a6edaec5c.gif">  
</div>
<br>

## 🔹 8- Projet Angular UI

![image](https://user-images.githubusercontent.com/63150702/209478520-9941ebfc-f6d4-4dbb-a312-c6e875432e74.png)

<div style=" font-size: medium; color: #447ff7" align=center>
<img src="https://user-images.githubusercontent.com/73097560/115834477-dbab4500-a447-11eb-908a-139a6edaec5c.gif">  
</div>
<br>

## Conclusion

<p align="justify">L'utilisation des micro-services et de l'Event Sourcing a permis de construire une application scalable et facile à maintenir, tandis que le CQRS a permis d'optimiser les performances de l'application et de faciliter son évolution.</p>
<p align="justify">Le projet a été mené en utilisant les frameworks Spring Cloud et AXON, et a fait appel à un module "common-api" regroupant les composants communs aux différents projets.</p>
<p align="justify">En conclusion, le projet "Système de gestion des infractions routières" a permis de mettre en place une application robuste et efficace, qui répond parfaitement aux besoins du cahier des charges défini en début de projet.<.p>


