package ga.leliadoura.dam2.tetristexto;


public class T1 extends Thread {
    private Pieza[] oPieza;
    private Tablero oTablero;


    public T1(Pieza[] pieza, Tablero tablero) {
        oTablero = tablero;
        oPieza = pieza;
        oPieza[0] = new Pieza_O();
        oPieza[1] = new Pieza_I();
        oPieza[2] = new Pieza_Z();
        oPieza[3] = new Pieza_T();
        oPieza[4] = new Pieza_J();
        oPieza[5] = new Pieza_L();
        oPieza[6] = new Pieza_S();

    }

    public synchronized void run() {

        //--GENERA PIEZA ALEATORIA
        int x = (int) (Math.random() * 7);


        while (oTablero.comprobarEspacio(oPieza[x]) == true) {
            oTablero.llenarTablero();
            oTablero.insertarPieza(oPieza[x]);
            oPieza[x].setPos_x(oPieza[x].getPos_x() + 1);

            oTablero.toString();

            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        oTablero.guardarEstadoTablero();

    }
}
