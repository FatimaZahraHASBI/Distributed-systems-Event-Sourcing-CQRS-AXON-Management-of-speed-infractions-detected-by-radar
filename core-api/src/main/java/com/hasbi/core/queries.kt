package com.hasbi.core

class GetAllRadarsQuery();

data class GetRadarById(
    val radarId:String,
);

class GetOverSpeedsQuery();

class SubscribeToEventsQuery();

class GetAllOverSpeedsQuery();

class GetAllOverSpeedsByRegistrationNumberQuery(
    val registrationNumber : String,
);

//======= IMatriculation =====//

class GetAllVehiclesQuery();
class GetAllOwners();
class GetVehicleByRegistrationNumber(
    val registrationNumber : String,
);
class GetAllInfractions();
class GetInfractionsByNationalCardNumber(
    val nationalCardNumber : String
);

