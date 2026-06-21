package com.maria.todo_api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Tarefa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
//LEMBRANDO: os atributos de uma classe devem ser private sempre
    private String titulo;
    private String descricao;
    private boolean concluida;

    public Long getId(){
        return id;
    }
//Setters(acessar e alterar): o método publico para conversar com outras classes
    //void para não retornar nada, apenas alterar, parametro que serve para ser a nova alteração
    public void setId(Long id){
        this.id = id;
    }

    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getDescricao(){
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isConcluida(){
        return concluida;
    }

    public void setConcluida(boolean concluida){
        this.concluida = concluida;
    }
}
