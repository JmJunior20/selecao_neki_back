package com.jmjunior.minhasskills.model.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

import lombok.Data;

@Entity
@Table( name = "usuario" , schema = "teste_residencia")
@Data
public class Usuario {

	@Id
	@Column(name = "id")
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "login")
	private String login;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "last_login_date")
	@Convert(converter = Jsr310JpaConverters.LocalDateConverter.class)
	private LocalDate ultimolast_login_dateLogin;
	
}
