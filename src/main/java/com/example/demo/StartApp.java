package com.example.demo;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.model.Atividade;
import com.example.demo.repository.AttRepository;

@Component
public class StartApp implements CommandLineRunner{

    @Autowired
    private AttRepository atividades;

    @Override
    public void run(String... args) throws Exception {
        // Atividade atividade = new Atividade();
        // atividade.setName("jogar");
        // atividade.setTipo("diversão");
        // atividades.save(atividade);
        // System.out.println("salvo com sucesso");

        // System.out.println(atividades.findByNameContaining("jogar"));
        
    }
    
}
