package com.ironhack.labjavamodelingcomplexrelationships.eventmanagementapplication.repository;

import com.ironhack.labjavamodelingcomplexrelationships.eventmanagementapplication.model.Conference;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConferenceRepository extends JpaRepository<Conference, Integer> {
}
