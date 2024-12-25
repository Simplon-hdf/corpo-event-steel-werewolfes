package model;

import jakarta.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "locations")
public class Location {
    @Id
    @GeneratedValue
    private UUID locationId;

    @Column(name = "location_name", nullable = false)
    private String locationName;

}

