package ga.leliadoura.dam2.tetristexto;

public class Pieza_I extends Pieza {

    public Pieza_I() {
        super();
    }


    public void generarPieza(char[][] pieza, int estado){
        switch (estado) {
            case 0:
            case 2:
                pieza[0][0] = 'I';	pieza[0][1] = '0';	pieza[0][2] = '0';	pieza[0][3] = '0';
                pieza[1][0] = 'I';	pieza[1][1] = '0';	pieza[1][2] = '0';	pieza[1][3] = '0';
                pieza[2][0] = 'I';	pieza[2][1] = '0';	pieza[2][2] = '0';	pieza[2][3] = '0';
                pieza[3][0] = 'I';	pieza[3][1] = '0';	pieza[3][2] = '0';	pieza[3][3] = '0';

                break;
            case 1:
            case 3:
                pieza[0][0] = 'I';	pieza[0][1] = 'I';	pieza[0][2] = 'I';	pieza[0][3] = 'I';
                pieza[1][0] = '0';	pieza[1][1] = '0';	pieza[1][2] = '0';	pieza[1][3] = '0';
                pieza[2][0] = '0';	pieza[2][1] = '0';	pieza[2][2] = '0';	pieza[2][3] = '0';
                pieza[3][0] = '0';	pieza[3][1] = '0';	pieza[3][2] = '0';	pieza[3][3] = '0';

                break;

        }
        //return pieza;
    }

}