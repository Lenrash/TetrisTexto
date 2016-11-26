package ga.leliadoura.dam2.tetristexto;


public class Hilo extends Thread {
    private Pieza oPieza;
    private Tablero oTablero;


    public Hilo(Pieza pieza, Tablero tablero) {
        oTablero = tablero;
        oPieza = pieza;
    }

    public synchronized void run() {
        while (oTablero.comprobarEspacio(oPieza)) {
            oTablero.insertarPieza(oPieza);
            oTablero.toString();

            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            oPieza.bajar();
        }
        //oTablero.toString();
    }
}

