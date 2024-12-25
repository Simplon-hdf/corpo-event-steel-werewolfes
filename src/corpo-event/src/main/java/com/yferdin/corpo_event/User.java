package com.yferdin.corpo_event;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Entity
@Getter
@Setter
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue
    private UUID userId;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "pass", nullable = false)
    private String password;

    @Column(name = "mail", nullable = false, unique = true)
    private String email;

    @ManyToOne
    @JoinColumn(name = "role_id", nullable = false)
    private Role role;

	public String getPassword() {
		return password;
	}

	public Role getRole() {
		// TODO Auto-generated method stub
		return role;
	}

	public String getEmail() {
		// TODO Auto-generated method stub
		return email;
	}

	

}

