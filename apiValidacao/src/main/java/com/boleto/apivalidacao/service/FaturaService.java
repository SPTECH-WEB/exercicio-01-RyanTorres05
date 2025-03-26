package com.boleto.apivalidacao.service;

import com.boleto.apivalidacao.model.Fatura;
import com.boleto.apivalidacao.repository.FaturaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FaturaService {
    private final FaturaRepository faturaRepository;
    public FaturaService(FaturaRepository faturaRepository) {this.faturaRepository = faturaRepository;}

    public Fatura save(Fatura fatura) {return faturaRepository.save(fatura);}

    public List<Fatura> listar() {return faturaRepository.findAll();}
}
