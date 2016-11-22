package ga.leliadoura.dam2.tetristexto;


public class Tablero {

    public char[][] tablero = new char[20][10];
    private Pieza pieza;

    public Tablero() {
       llenarTablero();
    }

    //Comprueba si la pieza se puede introducir en el tablero.
    public boolean comprobarEspacio(Pieza oPieza) {
        boolean libre = true;
        int x, y;                                                       //tablero | pieza |
        pieza = oPieza;                                                 //        |       | si
        x = pieza.getPos_x();                                           //     x  |       | no
        y = pieza.getPos_y();                                           //        |   x   | no
        for (; x < pieza.getPos_x() + 4; x++) {                         //     x  |   x   | no
            for (; y < pieza.getPos_y() + 4; y++) {
                if (tablero[x][y] != ' ' && pieza.pieza[x][y] != ' ') {   //Si el tablero y la pieza tienen la posicion
                    System.out.print("No se puede colocar pieza");        //ocupada, no se puede insertar la pieza
                    libre = false;
                }
            }
        }
        return libre;
    }

    //Rellena tablero con espacios en blanco
    public void llenarTablero() {
        for (int i = 0; i < tablero.length; i++)
            for (int j = 0; j < tablero[i].length; j++)
                tablero[i][j] = ' ';


    }

    public void insertarPieza(Pieza oPieza){
        int i, j;
        i = 3;
        j = 3;
        pieza = oPieza;
        llenarTablero();
        for (int x = pieza.getPos_x()+4; x > pieza.getPos_x(); x--) {
            for (int y = pieza.getPos_y()+4; y > pieza.getPos_y(); y--) {
                tablero[x][y] = oPieza.pieza[i][j];
                j--;
                }
            j=3;
            i--;
        }
    }

    /*
    public void insertarPieza(Pieza oPieza){
        int i, j;
        i = 0;
        j = 0;
        pieza = oPieza;

        for (int x = pieza.getPos_x(); x < pieza.getPos_x() + 4; x++) {
            for (int y = pieza.getPos_y(); y < pieza.getPos_y() + 4; y++) {
                tablero[x][y] = oPieza.pieza[i][j];
                j++;
                }
            j=0;
            i++;
        }
    }

     */

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