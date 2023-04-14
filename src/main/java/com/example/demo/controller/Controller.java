package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Atividade;
import com.example.demo.repository.AttRepository;

@RestController
@RequestMapping("/atividades")
public class Controller {

    @Autowired
    private AttRepository repository;
    
    @GetMapping("/ola") 
    public String ola() {
        return "hello";
    }

    @GetMapping
    public List<Atividade> getTodasAtividades() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Atividade> getByIdAtividade(@PathVariable Integer id) {
        return repository.findById(id);
    }

    @GetMapping("/att/{type}")
    public List<Atividade> pegarPorTipo(@PathVariable String type) {
        return repository.findByTypeAtividades(type);
    }

    @PostMapping
    public void adicionarAtividade(@RequestBody Atividade atividade) {
        repository.save(atividade);
    }

    @DeleteMapping("/{id}")
    public void deletarAtividade(@PathVariable Integer id){
        repository.deleteById(id);
    }

    @PutMapping("/{id}")
        public void editarAtividade(@PathVariable Integer id, @RequestBody Atividade atividade) {
            Optional<Atividade> attAntiga = repository.findById(id);
            attAntiga.get().setName(atividade.getName());
            attAntiga.get().setTipo(atividade.getTipo());
            repository.save(attAntiga.get());
        }
}
