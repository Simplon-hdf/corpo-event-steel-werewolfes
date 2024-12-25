package model;

import jakarta.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "roles")
public class Role {
    @Id
    @GeneratedValue
    private UUID roleId;

    @Column(name = "role_name", nullable = false)
    private String roleName;

}

