package ga.leliadoura.dam2.tetristexto;

public class Pieza {

    public char pieza[][];  //<-- Para guardar la pieza
    int estado;             //<- Para guardar el estado de la pieza (4 posiciones)
    int i;                  //<- Para generar un numero aleatorio
    int pos_x;              //<- Para guardar la posicion actual de la pieza en el Tablero
    int pos_y;

    //Cuando se crea la pieza se asigna la posicion por defecto que tendra en el tablero
    public Pieza() {
        pos_x = 0;
        pos_y = 4;
        //Se añade una pieza aleatoria al char array
    }

    //Cuando se llame a este metodo, se ejecutará el correspondiente de la subclase
    public void girar() {
    }

    //Imprime por consola la pieza
    @Override
    public String toString() {
        for (int i = 0; i < pieza.length; i++) {
            for (int j = 0; j < pieza[i].length; j++)
                System.out.print(pieza[i][j]);
            System.out.print("\n");
        }
        return null;
    }

    //Genera una pieza aleatoria y la asigna al array
   /* private char[][] obtenerPieza() {
        i = (int) (Math.random() * 7);
        switch (i) {
            case 0:
                Pieza_O po = new Pieza_O();
                pieza = po.generar(0);
                break;
            case 1:
                Pieza_I pi = new Pieza_I();
                pieza = pi.generar(0);
                break;
            case 2:
                Pieza_J pj = new Pieza_J();
                pieza = pj.generar(0);
                break;
            case 3:
                Pieza_L pl = new Pieza_L();
                pieza = pl.generar(0);
                break;
            case 4:
                Pieza_S ps = new Pieza_S();
                pieza = ps.generar(0);
                break;
            case 5:
                Pieza_T pt = new Pieza_T();
                pieza = pt.generar(0);
                break;
            case 6:
                Pieza_Z pz = new Pieza_Z();
                pieza = pz.generar(0);
                break;
        }
    return pieza;
    }
*/

    //-------GETTERS Y SETTERS--------

    public char[][] getPieza() {
        return pieza;
    }

    public void setPieza(char[][] pieza) {
        this.pieza = pieza;
    }

    public int getPos_x() {
        return pos_x;
    }

    public void setPos_x(int pos_x) {
        this.pos_x = pos_x;
    }

    public int getPos_y() {
        return pos_y;
    }

    public void setPos_y(int pos_y) {
        this.pos_y = pos_y;
    }

}