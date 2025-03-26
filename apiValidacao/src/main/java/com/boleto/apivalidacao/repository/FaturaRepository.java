package com.boleto.apivalidacao.repository;

import com.boleto.apivalidacao.model.Fatura;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FaturaRepository extends JpaRepository<Fatura, Long> {
    Long id(Long id);
}
