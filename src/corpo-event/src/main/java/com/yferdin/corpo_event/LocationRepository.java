package com.yferdin.corpo_event;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface LocationRepository extends JpaRepository<Location, UUID> {
    Location findByLocationName(String locationName);
}
