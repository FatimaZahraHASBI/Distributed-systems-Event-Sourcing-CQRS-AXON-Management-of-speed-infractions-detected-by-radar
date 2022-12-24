package com.hasbi.core

abstract class BaseEvent<T> (
        open val id: T
);

data class RadarCreatedEvent(
        override val id : String,
        val payload:RadarDTO
):BaseCommand<String>(id);

data class RadarStatusChangedEvent(
        override val id : String,
        val payload : RadarStatus,
) : BaseEvent<String>(id);

data class RadarSpeedLimitChangedEvent(
        override val id : String,
        val payload : Int,
): BaseEvent<String>(id);


data class VehicleOverSpeedDetectedEvent(
        override val id : String,
        val payload : OverSpeedRequestDTO,
        val contraventionld : String,
) : BaseEvent<String>(id);

data class InfractionCreatedEvent(
        override val id : String,
        val payload : InfractionData,
) : BaseEvent<String>(id);


//======== IMatriculation  =====//

data class VehicleCreatedEvent(
        override val id : String,
        val payload:VehicleRequestDTO
):BaseCommand<String>(id);

data class VehicleOwnerUpdatedEvent(
        override val id : String,
        val payload:UpdateVehicleOwnerRequestDTO
):BaseCommand<String>(id);
