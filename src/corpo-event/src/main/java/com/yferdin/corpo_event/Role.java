package com.yferdin.corpo_event;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Entity
@Getter
@Setter
@Table(name = "roles")
public class Role {
    @Id
    @GeneratedValue
    private UUID roleId;

    @Column(name = "role_name", nullable = false)
    private String roleName;

	public String getName() {
		// TODO Auto-generated method stub
		return roleName;
	}

}

