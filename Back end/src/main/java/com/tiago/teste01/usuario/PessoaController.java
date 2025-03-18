package com.tiago.teste01.usuario;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pessoas")
public class PessoaController {
    @Autowired
    private PessoaService pessoaService;

    // Listar todas as pessoas
    @GetMapping
    public List<Pessoa> listar() {
        return pessoaService.listar();
    }

    // Adicionar uma pessoa
    @PostMapping
    public Pessoa adicionar(@RequestBody Pessoa pessoa) {
        return pessoaService.adicionar(pessoa);
    }

    // Buscar uma pessoa por ID
    @GetMapping("/{id}")
    public Optional<Pessoa> buscarPorId(@PathVariable Long id) {
        return pessoaService.buscarPorId(id);
    }

    // Atualizar uma pessoa
    @PutMapping("/{id}")
    public Pessoa atualizar(@PathVariable Long id, @RequestBody Pessoa pessoa) {
        return pessoaService.atualizar(id, pessoa);
    }

    // Deletar uma pessoa
    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        pessoaService.deletar(id);
    }
}
