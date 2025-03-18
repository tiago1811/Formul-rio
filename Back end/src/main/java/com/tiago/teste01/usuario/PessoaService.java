package com.tiago.teste01.usuario;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;

    // Método para listar todas as pessoas
    public List<Pessoa> listar() {
        return pessoaRepository.findAll();
    }

    // Método para adicionar uma pessoa
    public Pessoa adicionar(Pessoa pessoa) {
        return pessoaRepository.save(pessoa);
    }

    // Método para buscar uma pessoa por ID
    public Optional<Pessoa> buscarPorId(Long id) {
        return pessoaRepository.findById(id);
    }

    // Método para atualizar uma pessoa
    public Pessoa atualizar(Long id, Pessoa pessoa) {
        pessoa.setId(id); // Garante que o ID seja o mesmo
        return pessoaRepository.save(pessoa);
    }

    // Método para deletar uma pessoa
    public void deletar(Long id) {
        pessoaRepository.deleteById(id);
    }
}
