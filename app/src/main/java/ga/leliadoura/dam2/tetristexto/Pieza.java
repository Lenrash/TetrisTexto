package ga.leliadoura.dam2.tetristexto;

public abstract class Pieza {

    private char pieza[][];         //<-- Para guardar la pieza
    private int estado;             //<- Para guardar el estado de la pieza (4 posiciones)
    private int fila;               //<- Para guardar la posicion actual de la pieza en el Tablero
    private int columna;

    /**
     * Cuando se crea la pieza se asigna la posicion por defecto que tendra en el tablero
     * y el estado en el que se va a generar la pieza.
     */
    public Pieza() {
        pieza = new char[21][10];
        estado = 0;
        fila = 0;
        columna = 4;
        generarPieza(pieza, estado);
    }


    /**
     * Para girar la posicion de la pieza.
     * Cuando se llame a este metodo, se ejecutará el metodo generarPieza correspondiente de la subclase
     * dependiendo de la Pieza y del estado en el que se encuentre.
     */
    public void girar() {
        switch (estado) {
            case 0:
                estado++;
                generarPieza(pieza, estado);
                break;
            case 1:
                estado++;
                generarPieza(pieza, estado);
                break;
            case 2:
                estado++;
                generarPieza(pieza, estado);
                break;
            case 3:
                estado = 0;
                generarPieza(pieza, estado);
                break;
        }
    }

    /**
     * Genera unha pieza dependiendo del estado en el que se encuentre y la guarda en el array de caracteres.
     * @param pieza array de caracteres en el que se guarda la pieza
     * @param estado estado en el que se guarda la pieza.
     */
    public abstract void generarPieza(char[][] pieza, int estado);

    /**
     * Mueve la pieza una (+1) posicion Vertical hacia Abajo.
     */
    public void bajar(){
        setFila(getFila()+1);
    }

    /**
     * Mueve la pieza una (+1) posicion Horizontal hacia la Derecha.
     */
    public void mover_der(){
        setColumna(getColumna()+1);
    }

    /**
     * Mueve la pieza una (-1) posicion Horizontal hacia la Izquierda.
     */
    public void mover_izq(){
        setColumna(getColumna()-1);
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