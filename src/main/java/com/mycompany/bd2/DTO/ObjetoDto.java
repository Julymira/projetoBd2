/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bd2.DTO;

/**
 * @author Julyana Mira
 */
public class ObjetoDto {

    private int id;
    private String nome;
    private String descricao;

    public ObjetoDto(String nome, String descricao) {
        setNome(nome);
        setDescricao(descricao);
    }

    public ObjetoDto(int id, String nome, String descricao) {
        setId(id);
        setNome(nome);
        setDescricao(descricao);
    }

    public ObjetoDto() {

    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }


}
