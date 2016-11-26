package ga.leliadoura.dam2.tetristexto;

public abstract class Pieza {

    char pieza[][];         //<-- Para guardar la pieza
    int estado;             //<- Para guardar el estado de la pieza (4 posiciones)
    int fila;               //<- Para guardar la posicion actual de la pieza en el Tablero
    int columna;

    /**
     * Cuando se crea la pieza se asigna la posicion por defecto que tendra en el tablero
     * y el estado en el que se va a generar la pieza.
     */
    public Pieza() {
        pieza = new char[4][4];
        estado = 0;
        fila = 0;
        columna = 4;
    }


    /**
     * Para girar la posicion de la pieza.
     * Cuando se llame a este metodo, se ejecutará el correspondiente de la subclase.
     */
    public abstract void girar();

    /**
     * Mueve la pieza una (+1) posicion Vertical hacia Abajo.
     */
    public void bajar(){
        fila = fila + 1;
    }

    /**
     * Mueve la pieza una (+1) posicion Horizontal hacia la Derecha.
     */
    public void mover_der(){
        columna = columna + 1;
    }

    /**
     * Mueve la pieza una (-1) posicion Horizontal hacia la Izquierda.
     */
    public void mover_izq(){
        columna = columna - 1;
    }

    //-------GETTERS Y SETTERS--------

    public char[][] getPieza() {
        return pieza;
    }

    public void setPieza(char[][] pieza) {
        this.pieza = pieza;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
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

}