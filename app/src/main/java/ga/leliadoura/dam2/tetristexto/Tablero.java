package ga.leliadoura.dam2.tetristexto;


public class Tablero {

    public char[][] tablero_a;
    public char[][] tablero_b;
    public char[][] tablero_c;
    private boolean cargar_tablero;
    //boolean introducir_pieza;

    /**
     * Genenra un tablero y llama al metodo llenarTablero() para poner
     */
    public Tablero() {
        tablero_a = new char[21][10];
        tablero_b = new char[21][10];
        tablero_c = new char[21][10];
        for (int f = 0; f < tablero_a.length; f++)
            for (int c = 0; c < tablero_a[f].length; c++) {
                if (f >= 20) {
                    tablero_a[f][c] = '-';
                    tablero_b[f][c] = '-';
                    tablero_c[f][c] = '-';
                }else {
                    tablero_a[f][c] = '0';
                    tablero_b[f][c] = '0';
                    tablero_c[f][c] = '-';
                }
            }
    }

    /**
     * Comprueba si la pieza se puede introducir en el tablero.
     *
     * @param oPieza objeto pieza que se comprueba con el tablero.
     * @return <b>true</b> si se puede colocar. <b>false</b> si una de las posiciones esta ocupada.
     */
    public boolean comprobarEspacio(Pieza oPieza) {
        int i = 0;
        int j = 0;

        for (int f = oPieza.getFila(); f < oPieza.getFila() + 4; f++) {
            for (int c = oPieza.getColumna(); c < oPieza.getColumna() + 4; c++) {
                if (oPieza.pieza[i][j] != '0' && (tablero_a[f][c] != '0')) {
                    System.out.println("No se puede colocar pieza");
                    guardarTableroAenB(tablero_c, tablero_a);
                    return false;
                }
                j++;
            }
            j = 0;
            i++;
        }
        return true;
    }


    /**
     * Rellena tablero con ceros cuando se inicia el juego o carga el estado del tablero guardado.
     */





    /**
     * Inserta la pieza pasada por parametro en el tablero.
     *
     * @param oPieza
     */
    public void insertarPieza(Pieza oPieza) {

        int i = 0;
        int j = 0;

        for (int f = oPieza.getFila(); f < oPieza.getFila() +4; f++) {
            for (int c = oPieza.getColumna(); c < oPieza.getColumna() +4; c++) {
                if (oPieza.pieza[i][j] != '0')
                    tablero_b[f][c] = oPieza.pieza[i][j];
                j++;
            }
            j = 0;
            i++;
        }
        guardarTableroAenB(tablero_b, tablero_c);

    }

    /**
     * Genera una copia del estado actual del tablero
     * y pone la variable cargar_tablero a true indicando que se deber cargar
     * el tablero cuando se llame al metodo
     */
    public void guardarTableroAenB(char[][] copiarA, char[][] enB) {
        for (int f = 0; f < copiarA.length; f++)
            for (int c = 0; c < copiarA[f].length; c++) {
                    enB[f][c] = copiarA[f][c];
                }

    }

     /**
     * Imprime por consola el estado del tablero
     *
     * @return null
     */
    @Override
    public String toString() {
        for (int f = 0; f < tablero_b.length; f++) {
            for (int c = 0; c < tablero_b[f].length; c++)
                System.out.print(tablero_b[f][c]);
            System.out.print("\n");
        }
        guardarTableroAenB(tablero_a,tablero_b);
        return null;
    }

}