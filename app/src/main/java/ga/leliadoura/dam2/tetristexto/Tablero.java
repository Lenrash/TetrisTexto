package ga.leliadoura.dam2.tetristexto;


import android.widget.EditText;

public class Tablero {

    private char[][] tablero_a;
    private char[][] tablero_b;
    private char[][] tablero_c;
    public static final int BORDE_DERECHO = 10;
    public static final int BORDE_IZQUIERDO = 0;

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
                    tablero_c[f][c] = '0';
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
        char[][] pieza = oPieza.getPieza();

        for (int f = oPieza.getFila(); f < oPieza.getFila() + 4; f++) {
            for (int c = oPieza.getColumna(); c < oPieza.getColumna() + 4; c++) {
                if (pieza[i][j] != '0' && (tablero_a[f][c] != '0')) {
                    System.out.println("No se puede colocar pieza");
                    comprobarFilas();
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
     * Inserta la pieza pasada por parametro en el tablero.
     *
     * @param oPieza
     */
    public void insertarPieza(Pieza oPieza) {
        int i = 0;
        int j = 0;
        char[][] pieza = oPieza.getPieza();

        for (int f = oPieza.getFila(); f < oPieza.getFila() +4; f++) {
            for (int c = oPieza.getColumna(); c < oPieza.getColumna() +4; c++) {
                if (pieza[i][j] != '0')
                    tablero_b[f][c] = pieza[i][j];
                j++;
            }
            j = 0;
            i++;
        }
        guardarTableroAenB(tablero_b, tablero_c);

    }

    /**
     * Para generarPieza una copia del estado actual del tablero
     */
    public void guardarTableroAenB(char[][] copiarA, char[][] enB) {
        for (int f = 0; f < copiarA.length; f++)
            for (int c = 0; c < copiarA[f].length; c++) {
                    enB[f][c] = copiarA[f][c];
                }

    }

    public void comprobarFilas(){
        int cont;
        for(int f = 0; f < tablero_c.length-1; f++){ //-1 porque la ultima fila es ---------
            cont = 0;
            if(tablero_c[f][0] != '0')
                for(int c = 0; c < tablero_c[f].length; c++)
                    if (tablero_c[f][c] != '0') {
                        cont++;
                        if (cont == tablero_c[f].length)
                            eliminarLinea(tablero_c, f);

                    }


        }
    }

    private void eliminarLinea(char[][] tablero, int fila){
        for(int f = fila; f > 0; f--)
            tablero[f] = tablero[f-1];

    }

     /**
     * Imprime por consola el estado del tablero
     *
     * @return null
     */
    @Override
    public String toString() {

        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < tablero_c.length; i++){
            for(int j = 0; j < tablero_c[i].length; j++){
                if(tablero_c[i][j] == '0')
                    builder.append('_');
                else
                    builder.append(tablero_c[i][j]);
            }
            builder.append("\n");
        }
        guardarTableroAenB(tablero_a, tablero_b);

        return builder.toString();
    }

    public boolean fin(){
        for(int c = 0; c < tablero_c[0].length; c++)
            if (tablero_c[0][c] != '0')
                return true;
        return false;
    }

}