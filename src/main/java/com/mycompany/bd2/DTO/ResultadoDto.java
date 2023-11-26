package com.mycompany.bd2.DTO;

public class ResultadoDto {
    private int id;
    private String nome;
    private String resultado;

    public ResultadoDto(int id, String nome, String resultado) {
        setId(id);
        setNome(nome);
        setResultado(resultado);
    }

    public ResultadoDto(String nome, String resultado) {
        setNome(nome);
        setResultado(resultado);
    }

    public ResultadoDto() {
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

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }
}
