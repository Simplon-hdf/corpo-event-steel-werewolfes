package com.yferdin.corpo_event;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Entity
@Getter
@Setter
@Table(name = "locations")
public class Location {
    @Id
    @GeneratedValue
    private UUID locationId;

    @Column(name = "location_name", nullable = false)
    private String locationName;

	public UUID getLocationId() {
		return locationId;
	}

	public void setLocationId(UUID locationId) {
		this.locationId = locationId;
	}

	public String getLocationName() {
		return locationName;
	}

	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

}

