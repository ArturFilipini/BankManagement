package com.banco.BancoManagement.Repository;

import com.banco.BancoManagement.ContaRepository.Conta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContaRepository extends JpaRepository<Conta, Long> {
}
