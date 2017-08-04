/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secondpro;

/**
 *
 * @author Sebatian
 */
public class PregLogica {
    
    
    String[][] nMatriz = new String [8][5];

    public PregLogica() {
    }

    public String[][] getnMatriz() {
        return nMatriz;
    }

    public void setnMatriz(String[][] nMatriz) {
        this.nMatriz = nMatriz;
    }

    public void matriz() {
        int cont = 0;
        int x =(int) (Math.random() * 8) + 1;
        int y =(int) (Math.random() * 5) + 1;
        String matriz[][] = new String[8][5];
        matriz[x][y]="$";
        for (int i = 0; i < 8; i++) {
            int ob = (int) (Math.random() * 8) + 1;
            for (int j = 0; j < 5; j++) {
                if(!matriz[i][j].equals("$")){
                if (j != 5) {
                    if (cont < 2) {
                        if (ob > i) {
                            matriz[ob][j] = "*";
                            cont++;
                        } else {
                            matriz[i][j] = "_";
                        }
                    } else {
                        matriz[i][j] = "_";
                    }
                } else {
                    cont = 0;
                }
            }}
        }
        setnMatriz(matriz);
        
    }
    
}
