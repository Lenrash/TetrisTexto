package ga.leliadoura.dam2.tetristexto;


public class T1 extends Thread {
    private Pieza[] oPieza;
    private Tablero tablero;


    public T1() {
        tablero = new Tablero();

    }

    public synchronized void run() {

          //--GENERA PIEZA ALEATORIA
          oPieza = new Pieza[7];
          oPieza[0] = new Pieza_O();
          oPieza[1] = new Pieza_I();
          oPieza[2] = new Pieza_Z();
          oPieza[3] = new Pieza_T();
          oPieza[4] = new Pieza_J();
          oPieza[5] = new Pieza_L();
          oPieza[6] = new Pieza_S();

          int x = (int) (Math.random() * 7);
          //-------------------------


        while (true){ //while (tablero.comprobarEspacio(oPieza[x]) == true)
            tablero.insertarPieza(oPieza[x]);
            oPieza[x].setPos_x(oPieza[x].getPos_x()+1);
            tablero.toString();
            try {
                sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }

}
