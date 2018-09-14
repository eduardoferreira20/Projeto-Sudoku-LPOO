package com.br.poli.sudoku;

public class Sudoku {

    private final int n = 3;
    private Player player;
    private Cell[][] gridPlayer;

    public Sudoku() {

        this.gridPlayer = new Cell[n * n][n * n];

        for (int i = 0; i < 9; i++) {

            for (int j = 0; j < 9; j++) {

                this.gridPlayer[i][j] = new Cell(0);
            }
        }
    }
    
    //Metodo que checa se o valor na coluna é valido
    public boolean checkColuna(Cell cell, int x, int y) {
        for (int coluna = 0; coluna < this.gridPlayer.length; coluna++) {
            if (this.gridPlayer[x][coluna] == cell) {
                return true;
            }
        }
       return false;
    }
    //Metodo que checa se o valor escrito pelo usuario é valido na linha
    public boolean checkLinha(Cell cell, int x, int y) {

        for (int linha = 0; linha < this.gridPlayer.length; linha++) {
            if (this.gridPlayer[linha][y] == cell) {
                return true;
            }
        }
        return false;
    }
    //O método verifica se o valor de cada grade interna é válido
    public boolean checkValidation(Cell cell, int x, int y) {

        checkLinha(cell,x,y);
        checkColuna(cell,x,y);
        
        if (x < 3) {
            if (y < 3) {
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        if (this.gridPlayer[i][j] == cell) {
                            return false;
                        }
                    }
                }
                return cell.isValid();
            } else if (y > 2 && y < 6) {
                for (int i = 0; i < 3; i++) {
                    for (int j = 3; j < 6; j++) {
                        if (this.gridPlayer[i][j] == cell) {
                            return false;
                        }
                    }
                }
                return cell.isValid();
            } else {
                for (int i = 0; i < 3; i++) {
                    for (int j = 6; j < 9; j++) {
                        if (this.gridPlayer[i][j] == cell) {
                            return false;
                        }
                    }
                }
                return cell.isValid();
            }
        } else if (x > 2 && x < 6) {
            if (y < 3) {
                for (int i = 3; i < 6; i++) {
                    for (int j = 0; j < 3; j++) {
                        if (this.gridPlayer[i][j] == cell) {
                            return false;
                        }
                    }
                }
                return cell.isValid();
            } else if (y > 2 && y < 6) {
                for (int i = 3; i < 6; i++) {
                    for (int j = 3; j < 6; j++) {
                        if (this.gridPlayer[i][j] == cell) {
                            return false;
                        }
                    }
                }
                return cell.isValid();
            } else {
                for (int i = 3; i < 6; i++) {
                    for (int j = 6; j < 9; j++) {
                        if (this.gridPlayer[i][j] == cell) {
                            return false;
                        }
                    }
                }
                return cell.isValid();
            }
        } else {
            if (y < 3) {
                for (int i = 6; i < 9; i++) {
                    for (int j = 0; j < 3; j++) {
                        if (this.gridPlayer[i][j] == cell) {
                            return false;
                        }
                    }
                }
                return cell.isValid();
            } else if (y > 2 && y < 6) {
                for (int i = 6; i < 9; i++) {
                    for (int j = 3; j < 6; j++) {
                        if (this.gridPlayer[i][j] == cell) {
                            return false;
                        }
                    }
                }
                return cell.isValid();
            } else {
                for (int i = 6; i < 9; i++) {
                    for (int j = 6; j < 9; j++) {
                        if (this.gridPlayer[i][j] == cell) {
                            return false;
                        }
                    }
                }
                return cell.isValid();
            }
        }
    }
    
    //Atribui os valores definnidos no tabuleiro e printa o mesmo
    public void desenharTabuleiro() {

        this.gridPlayer[0][1].setValue(2);
        this.gridPlayer[1][1].setValue(8);
        this.gridPlayer[2][0].setValue(6);
        this.gridPlayer[2][1].setValue(1);

        this.gridPlayer[3][0].setValue(7);
        this.gridPlayer[3][1].setValue(4);
        this.gridPlayer[4][0].setValue(1);
        this.gridPlayer[5][2].setValue(6);

        this.gridPlayer[6][2].setValue(6);
        this.gridPlayer[7][0].setValue(4);
        this.gridPlayer[8][0].setValue(9);
        this.gridPlayer[7][2].setValue(7);

        this.gridPlayer[0][4].setValue(5);
        this.gridPlayer[1][3].setValue(9);
        this.gridPlayer[2][4].setValue(4);
        this.gridPlayer[2][5].setValue(2);

        this.gridPlayer[3][3].setValue(2);
        this.gridPlayer[4][3].setValue(8);
        this.gridPlayer[4][5].setValue(6);
        this.gridPlayer[5][4].setValue(3);

        this.gridPlayer[6][3].setValue(5);
        this.gridPlayer[6][4].setValue(9);
        this.gridPlayer[7][5].setValue(1);
        this.gridPlayer[8][4].setValue(8);

        this.gridPlayer[0][6].setValue(7);
        this.gridPlayer[0][8].setValue(6);
        this.gridPlayer[1][8].setValue(2);
        this.gridPlayer[2][6].setValue(3);

        this.gridPlayer[3][6].setValue(9);
        this.gridPlayer[4][8].setValue(3);
        this.gridPlayer[5][7].setValue(2);
        this.gridPlayer[5][8].setValue(7);

        this.gridPlayer[6][7].setValue(3);
        this.gridPlayer[6][8].setValue(1);
        this.gridPlayer[7][7].setValue(7);
        this.gridPlayer[8][7].setValue(5);

        for (int i = 0; i < 9; i++) {

            if (i % 3 == 0) {

                System.out.println(" -------------------");
            }

            for (int j = 0; j < 9; j++) {

                if (j % 3 == 0) {

                    System.out.print("|");
                }

                System.out.print(this.gridPlayer[i][j].getValue() + " ");

            }
            System.out.println();
        }
        System.out.print("|");
        System.out.println(" ------------------");
    }

    public Player getPlayer() {
        return player;
    }

    public Cell[][] getGridPlayer() {
        return gridPlayer;
    }

    public void setValue(int x, int y, int value) {
        this.gridPlayer[x][y].setValue(value);
    }

}
