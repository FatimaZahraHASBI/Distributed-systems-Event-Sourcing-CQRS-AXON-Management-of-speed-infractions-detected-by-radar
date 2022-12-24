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
<p align="justify"><B>•	Micro-services : </B>chaque fonctionnalité du système sera mise en place dans un micro-service distinct, afin de permettre une maintenance et une évolution indépendantes de chaque composant.</p><br>

<p align="justify"><B>•	L’architecture pilotée par les événements : </B>chaque micro-service enverra des événements lorsque des données seront modifiées, ce qui permettra aux autres micro-services de mettre à jour leurs propres données en conséquence.</p><br>

<p align="justify"><B>•	Les patterns Event Sourcing et CQRS : </B>le pattern Event Sourcing permettra de stocker l'historique de toutes les modifications de données dans le système, tandis que le pattern CQRS permettra de séparer les commandes (qui modifient les données) des requêtes de consultation de données.</p><br>

<p align="justify"><B>•	Le framework Spring Cloud : </B>ce framework permettra de faciliter le développement des micro-services en fournissant un ensemble de bibliothèques et d'outils pour la gestion de la communication entre les micro-services, la configuration distribuée, etc.</p><br>

<p align="justify"><B>•	Le framework AXON : </B>ce framework permettra de mettre en place l'architecture pilotée par les événements en gérant la création et la diffusion des événements, ainsi que la gestion de l'Event Sourcing et du CQRS.</p><br>

<p align="justify"><B>•	Un module "common-api" : </B>ce module permettra de définir les composants communs aux différents projets, tels que les Commandes, les Evénements, les Queries, les DTOs, etc., ce qui permettra de faciliter la communication entre les différents micro-services.</p><br><br>


Voici comment cela pourrait se traduire visuellement :<br>
 
<p align="center">
<img src="https://user-images.githubusercontent.com/63150702/209411774-aa588d9d-5e34-40d9-9840-7f514544a690.png" width="70%">
</p>

<br> 
<p align="justify">Cette architecture permettra de mettre en place un système distribué basé sur les micro-services qui respecte les patterns Event Sourcing et CQRS, et qui permet de gérer les infractions liées aux dépassements de vitesses détectés par des radars automatiques</p>

<br> 

<div style=" font-size: medium; color: #447ff7" align=center>
<img src="https://user-images.githubusercontent.com/73097560/115834477-dbab4500-a447-11eb-908a-139a6edaec5c.gif">  
</div>
<br>

## 🔹 2- Diagramme de classe global de projet

<p align="center">
<img src="https://user-images.githubusercontent.com/63150702/209411911-3b24e2e3-0d21-4063-9625-9aa356f3f07b.png" width="60%">
</p>
<br>
<p align="justify">Dans ce diagramme, on peut voir que chaque micro-service utilise un repository pour accéder à sa propre base de données. Le micro-service "Immatriculation" utilise également les informations stockées dans sa base de données pour envoyer un email au propriétaire concerné lorsqu'une nouvelle infraction est créée.</p><br>

<p align="justify">Le module "CommonApiModule" contient les composants communs aux différents projets, tels que les Commandes, les Evénements, les Queries, les DTOs, etc., qui sont utilisés par les micro-services pour communiquer entre eux et mettre en place l'architecture pilotée par les événements, l'Event Sourcing est utilisé pour stocker l'historique des changements d'état des différents objets du système, tels que les radars, les propriétaires et les véhicules, ainsi que les infractions.</p><br>

<p align="justify">Dans ce diagramme, on peut voir que chaque micro-service utilise un repository pour accéder à sa propre base de données et implémente un "Command Handler" pour séparer la logique de traitement des commandes de la logique de persistance des données, ce qui facilite la maintenance et l'évolution du système. Elle permet également de mettre en place l'Event Sourcing, c'est-à-dire de stocker l'historique complet des changements d'état du système sous forme d'événements, ce qui peut être utile pour la rejouabilité et la reconstruction de l'état du système.</p><br>
