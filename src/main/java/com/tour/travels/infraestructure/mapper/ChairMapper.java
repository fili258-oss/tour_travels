package com.tour.travels.infraestructure.mapper;

import com.tour.travels.domain.dto.ChairDTO;
import com.tour.travels.infraestructure.entities.Chair;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;
import java.util.Optional;


@Mapper(componentModel = "spring")
public interface ChairMapper {
    @Mappings({
            @Mapping(source = "id", target ="chairID"),
            @Mapping(source = "id_flight", target ="flightID"),
            @Mapping(source = "available", target ="isAvailable"),
            @Mapping(source = "type", target ="chairType"),
            @Mapping(source = "price", target ="chairPrice"),
            @Mapping(source = "number", target ="chairNumber"),
            @Mapping(source = "created_at", target ="createdAt"),
            @Mapping(source = "updated_at", target ="updatedAt")
    })
    ChairDTO toChairDTO(Chair chair);

    List<ChairDTO> toChairsDTO(List<Chair> chair);

    default Optional<ChairDTO> toChairDTOOptional(Optional<Chair> chair){
        return chair.map(this::toChairDTO);
    }

    @InheritInverseConfiguration
    Chair toChair(ChairDTO chairDTO);
}
