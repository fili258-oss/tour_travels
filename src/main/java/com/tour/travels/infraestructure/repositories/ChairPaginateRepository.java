package com.tour.travels.infraestructure.repositories;

import com.tour.travels.infraestructure.entities.Chair;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ChairPaginateRepository extends PagingAndSortingRepository<Chair, Integer> {
    
}
