package ga.leliadoura.dam2.tetristexto;

public class Pieza_T extends Pieza {

    public Pieza_T() {
        super();
    }


    public void generarPieza(char[][] pieza, int estado){
        switch (estado) {
            case 0:
                pieza[0][0] = 'T';	pieza[0][1] = '0';	pieza[0][2] = '0';	pieza[0][3] = '0';
                pieza[1][0] = 'T';	pieza[1][1] = 'T';	pieza[1][2] = '0';	pieza[1][3] = '0';
                pieza[2][0] = 'T';	pieza[2][1] = '0';	pieza[2][2] = '0';	pieza[2][3] = '0';
                pieza[3][0] = '0';	pieza[3][1] = '0';	pieza[3][2] = '0';	pieza[3][3] = '0';

                break;
            case 1:
                pieza[0][0] = 'T';	pieza[0][1] = 'T';	pieza[0][2] = 'T';	pieza[0][3] = '0';
                pieza[1][0] = '0';	pieza[1][1] = 'T';	pieza[1][2] = '0';	pieza[1][3] = '0';
                pieza[2][0] = '0';	pieza[2][1] = '0';	pieza[2][2] = '0';	pieza[2][3] = '0';
                pieza[3][0] = '0';	pieza[3][1] = '0';	pieza[3][2] = '0';	pieza[3][3] = '0';

                break;
            case 2:
                pieza[0][0] = '0';	pieza[0][1] = 'T';	pieza[0][2] = '0';	pieza[0][3] = '0';
                pieza[1][0] = 'T';	pieza[1][1] = 'T';	pieza[1][2] = '0';	pieza[1][3] = '0';
                pieza[2][0] = '0';	pieza[2][1] = 'T';	pieza[2][2] = '0';	pieza[2][3] = '0';
                pieza[3][0] = '0';	pieza[3][1] = '0';	pieza[3][2] = '0';	pieza[3][3] = '0';

                break;
            case 3:
                pieza[0][0] = '0';	pieza[0][1] = 'T';	pieza[0][2] = '0';	pieza[0][3] = '0';
                pieza[1][0] = 'T';	pieza[1][1] = 'T';	pieza[1][2] = 'T';	pieza[1][3] = '0';
                pieza[2][0] = '0';	pieza[2][1] = '0';	pieza[2][2] = '0';	pieza[2][3] = '0';
                pieza[3][0] = '0';	pieza[3][1] = '0';	pieza[3][2] = '0';	pieza[3][3] = '0';

                break;
        }
        //return pieza;
    }

}