package com.example.demo.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="minha_tabela")
public class Atividade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "atividade_id")
    public Integer id;
    @Column(length = 100, nullable = false)
    public String name;
    @Column(length = 50, nullable = false)
    public String type;
    @Column()
    public Date dataCriacao;

    public Atividade() {
        this.dataCriacao = new Date();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTipo() {
        return type;
    }

    public void setTipo(String type) {
        this.type = type;
    }

    public String toString() {
        return "Atividade{" +
        id + ", " +
        name + ", " + this.type + ", " + dataCriacao +
        "}";
    }

    public Date getData() {
        return dataCriacao;
    }

    // public void setTipo() {
    //     this.dataCriacao = new Date();
    // }

}
