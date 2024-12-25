package model;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "event")
public class Event {
    @Id
    @GeneratedValue
    private UUID eventId;

    @Column(name = "event_name", nullable = false)
    private String eventName;

    @Column(name = "event_description")
    private String eventDescription;

    @Column(name = "starts_at", nullable = false)
    private LocalDateTime startsAt;

    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;

    @Column(name = "finish_at", nullable = false)
    private LocalDateTime finishAt;

    @ManyToOne
    @JoinColumn(name = "location_id", nullable = false)
    private Location location;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

}
