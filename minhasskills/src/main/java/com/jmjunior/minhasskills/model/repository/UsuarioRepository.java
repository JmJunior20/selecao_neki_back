package com.jmjunior.minhasskills.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jmjunior.minhasskills.model.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

	boolean existsByEmail(String email);
}
