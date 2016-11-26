package ga.leliadoura.dam2.tetristexto;


public class Hilo extends Thread {
    private Pieza oPieza;
    private Tablero oTablero;
    private int r;


    public Hilo(Pieza pieza, Tablero tablero) {
        oTablero = tablero;
        oPieza = pieza;
    }

    public synchronized void run() {
        r = (int) (Math.random() * 7);

        switch (r){
            case 0:
                oPieza = new Pieza_I();
                break;
            case 1:
                oPieza = new Pieza_J();
                break;
            case 2:
                oPieza = new Pieza_L();
                break;
            case 3:
                oPieza = new Pieza_O();
                break;
            case 4:
                oPieza = new Pieza_S();
                break;
            case 5:
                oPieza = new Pieza_T();
                break;
            case 6:
                oPieza = new Pieza_Z();
                break;
        }

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
    run();
    }
}

