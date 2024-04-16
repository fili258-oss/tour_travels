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
            @Mapping(source = "id", target ="id"),
            @Mapping(source = "name", target ="name"),
            @Mapping(source = "firstClass", target ="firstClass"),
            @Mapping(source = "available", target ="available"),
            @Mapping(source = "price", target ="price"),
            @Mapping(source = "idPlane", target ="idPlane"),
    })
    ChairDTO toChairDTO(Chair chair);

    List<ChairDTO> toChairsDTO(List<Chair> chair);

    default Optional<ChairDTO> toChairDTOOptional(Optional<Chair> chair){
        return chair.map(this::toChairDTO);
    }

    @InheritInverseConfiguration
    Chair toChair(ChairDTO chairDTO);
}
