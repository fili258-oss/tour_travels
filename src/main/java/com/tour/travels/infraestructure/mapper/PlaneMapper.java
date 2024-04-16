package com.tour.travels.infraestructure.mapper;

import com.tour.travels.domain.dto.PlaneDTO;
import com.tour.travels.infraestructure.entities.Plane;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;
import java.util.Optional;

@Mapper(componentModel = "spring")
public interface PlaneMapper {

    @Mappings({

        @Mapping(source = "id", target ="id"),
        @Mapping(source = "capacity", target ="capacity"),
        @Mapping(source = "brand", target ="brand"),
        @Mapping(source = "serial", target ="serial")

    })

    PlaneDTO toPlaneDTO(Plane plane);

    List<PlaneDTO> toPlanesDTO(List<Plane> plane);

    default Optional<PlaneDTO> toPlaneDTOOptional(Optional<Plane> plane){
        return plane.map(this::toPlaneDTO);
    }

    @InheritInverseConfiguration
    Plane toPlane(PlaneDTO planeDTO);

}
