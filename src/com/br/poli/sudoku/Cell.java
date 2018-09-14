package com.br.poli.sudoku;

public class Cell {

    private int value;
    private boolean valid;
    private boolean fixed;

    public Cell(int value) {
        this.value = value;

    }

    public Cell() {

    }

    public void setValue(int value) {

        this.value = value;
    }

    public int getValue() {
        return this.value;
    }
    //Verifica se o valor escrito é válido
    public boolean isValid() {

        if (getValue() >= 1 && getValue() <= 9) {

            return this.valid;

        } else{

            System.out.println("Jogada inválida");
            
            return false;
        }

    }

    public boolean isFixed() {
        
        return this.fixed;
    }

}
