package com.boleto.apivalidacao.controller;

import com.boleto.apivalidacao.model.Fatura;
import com.boleto.apivalidacao.service.FaturaService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/faturas")
public class FaturaController {
    private final FaturaService faturaService;
    public FaturaController(FaturaService faturaService){this.faturaService=faturaService;}

    @GetMapping
    public List<Fatura> listar(){return faturaService.listar();}

    @PostMapping
    public ResponseEntity<Fatura> cadastrar(@Valid @RequestBody Fatura fatura){
        Fatura novaFatura = faturaService.save(fatura);
        return ResponseEntity.ok(novaFatura);
    }
}

