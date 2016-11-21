package ga.leliadoura.dam2.tetristexto;

public class Pieza {

    public char pieza[][];
    int estado, i;

    public void girar() {};


    public void obtenerPieza(){
        i = (int)(Math.random()*7);
        switch (i){
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

    }

}