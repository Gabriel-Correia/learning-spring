package com.gabriel.correia.learningspring.data.repository;

import com.gabriel.correia.learningspring.data.entity.Reservation;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationRepository extends CrudRepository<Reservation, Long> {
    
}
