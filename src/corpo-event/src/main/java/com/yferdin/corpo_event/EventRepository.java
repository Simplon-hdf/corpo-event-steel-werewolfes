package com.yferdin.corpo_event;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, UUID>{

}
