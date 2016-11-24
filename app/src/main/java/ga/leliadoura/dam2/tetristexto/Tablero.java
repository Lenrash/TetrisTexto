package ga.leliadoura.dam2.tetristexto;


public class Tablero {

    public char[][] tablero = new char[22][10];
    public char[][] aux = new char[22][10];
    private boolean cargar_tablero = false;
    boolean introducir_pieza = true;

    public Tablero() {
        llenarTablero();
    }

    //Comprueba si la pieza se puede introducir en el tablero.
    public boolean comprobarEspacio(Pieza oPieza) {
        int i, j;
        i = 0;
        j = 0;
        //llenarTablero();
        for (int x = oPieza.getPos_x(); x < oPieza.getPos_x() + 4; x++) {
            for (int y = oPieza.getPos_y(); y < oPieza.getPos_y() + 4; y++) {
                if (oPieza.pieza[i][j] != '0') {
                    if (tablero[x + 1][y] != '0') {                                                                        //Si el tablero y la pieza tienen la posicion
                        System.out.println("No se puede colocar pieza");                                                  //ocupada, no se puede insertar la pieza
                        return introducir_pieza = false;
                    }
                }
                j++;
            }
            j = 0;
            i++;

        }
        return introducir_pieza = true;
    }


    //Rellena tablero con ceros o se carga el guardado.
    public void llenarTablero() {
        if (cargar_tablero == true) {
            for (int i = 0; i < tablero.length; i++)
                for (int j = 0; j < tablero[i].length; j++)
                    tablero[i][j] = aux[i][j];
            //cargar_tablero = false;
        } else {
            for (int i = 0; i < tablero.length; i++)
                for (int j = 0; j < tablero[i].length; j++) {
                    if (i >= 20)
                        tablero[i][j] = '-';
                    else
                        tablero[i][j] = '0';
                }
        }
    }

    public void insertarPieza(Pieza oPieza) {
        int i, j;
        i = oPieza.pieza.length - 1;
        j = oPieza.pieza.length - 1;

        for (int x = oPieza.getPos_x() + 4; x > oPieza.getPos_x(); x--) {
            for (int y = oPieza.getPos_y() + 4; y > oPieza.getPos_y(); y--) {
                if (oPieza.pieza[i][j] != '0')
                    tablero[x][y] = oPieza.pieza[i][j];
                j--;
            }
            j = oPieza.pieza.length - 1;
            i--;
        }

    }


    public void guardarEstadoTablero() {
        for (int i = 0; i < tablero.length; i++)
            for (int j = 0; j < tablero[i].length; j++)
                aux[i][j] = tablero[i][j];
        cargar_tablero = true;
    }


    @Override
    public String toString() {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++)
                System.out.print(tablero[i][j]);
            System.out.print("\n");
        }
        return null;
    }

}