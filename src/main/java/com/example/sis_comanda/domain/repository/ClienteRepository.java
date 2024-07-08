package com.example.sis_comanda.domain.repository;

import com.example.sis_comanda.domain.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    Optional<Cliente> findByTelefoneIgnoreCase(String telefone);

}
