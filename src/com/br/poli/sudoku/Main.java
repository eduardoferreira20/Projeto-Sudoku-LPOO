package com.br.poli.sudoku;

public class Main {

    public static void main(String[] args) {
        /*
        Dupla: Eduardo José Ferreira de Souza
               Mateus Albuquerque Castôr de Lira Brito
        */
        
        
        Cell c1 = new Cell(7);
        
        Sudoku s = new Sudoku();
        
        s.checkValidation(c1,0,0);
        
        s.desenharTabuleiro();

    }
}
