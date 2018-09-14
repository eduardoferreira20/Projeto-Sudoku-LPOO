package com.br.poli.sudoku;

public class Player {

    private String nome;

    public Player(String nome) {
        this.nome = nome;
    }

    public Player() {

    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }
}
