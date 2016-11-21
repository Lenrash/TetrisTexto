package ga.leliadoura.dam2.tetristexto;

/**
 * Created by SnoWSheeP on 11/21/2016.
 */

public class T1 extends Thread {
    private char[][] fondo, pieza;
    private char aux;

    public T1(char[][] fondo_main, char[][] pieza_main) {
        fondo = fondo_main;
        pieza = pieza_main;

        int x, y;
        x = 0;
        y = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 4; j < 8; j++) {
                fondo[i][j] = pieza[x][y];
                y++;
            }
            x++;
            y = 0;
        }
    }

    public char[][] getFondo() {
        return fondo;
    }

    public void run() {
        //int p_inicio = 4;

        for (int i = 4; i > 0; i--) {
            for (int j = 8; j > 4; j--) {
                aux = fondo[i][j];
                fondo[i][j] = ' ';
                fondo[i + 1][j] = aux;

            }
        }
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
