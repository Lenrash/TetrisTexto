package ga.leliadoura.dam2.tetristexto;

public class Pieza_J extends Pieza {

    public Pieza_J() {
        super();
        setTamaño(2);
    }


    public void generarPieza(char[][] pieza, int estado){
        switch (estado) {
            case 0:
                pieza[0][0] = '0';	pieza[0][1] = 'J';	pieza[0][2] = '0';	pieza[0][3] = '0';
                pieza[1][0] = '0';	pieza[1][1] = 'J';	pieza[1][2] = '0';	pieza[1][3] = '0';
                pieza[2][0] = 'J';	pieza[2][1] = 'J';	pieza[2][2] = '0';	pieza[2][3] = '0';
                pieza[3][0] = '0';	pieza[3][1] = '0';	pieza[3][2] = '0';	pieza[3][3] = '0';
                setTamaño(2);
                break;
            case 1:
                pieza[0][0] = 'J';	pieza[0][1] = '0';	pieza[0][2] = '0';	pieza[0][3] = '0';
                pieza[1][0] = 'J';	pieza[1][1] = 'J';	pieza[1][2] = 'J';	pieza[1][3] = '0';
                pieza[2][0] = '0';	pieza[2][1] = '0';	pieza[2][2] = '0';	pieza[2][3] = '0';
                pieza[3][0] = '0';	pieza[3][1] = '0';	pieza[3][2] = '0';	pieza[3][3] = '0';
                setTamaño(3);
                break;
            case 2:
                pieza[0][0] = 'J';	pieza[0][1] = 'J';	pieza[0][2] = '0';	pieza[0][3] = '0';
                pieza[1][0] = 'J';	pieza[1][1] = '0';	pieza[1][2] = '0';	pieza[1][3] = '0';
                pieza[2][0] = 'J';	pieza[2][1] = '0';	pieza[2][2] = '0';	pieza[2][3] = '0';
                pieza[3][0] = '0';	pieza[3][1] = '0';	pieza[3][2] = '0';	pieza[3][3] = '0';
                setTamaño(2);
                break;
            case 3:
                pieza[0][0] = 'J';	pieza[0][1] = 'J';	pieza[0][2] = 'J';	pieza[0][3] = '0';
                pieza[1][0] = '0';	pieza[1][1] = '0';	pieza[1][2] = 'J';	pieza[1][3] = '0';
                pieza[2][0] = '0';	pieza[2][1] = '0';	pieza[2][2] = '0';	pieza[2][3] = '0';
                pieza[3][0] = '0';	pieza[3][1] = '0';	pieza[3][2] = '0';	pieza[3][3] = '0';
                setTamaño(3);
                break;
        }
        //return pieza;
    }

    @Override
    public int getTamañoSiguientePieza() {
        int i = 0;
        switch (getEstado()){
            case 0:
            case 2:
                i = 3;
                break;
            case 1:
            case 3:
                i = 2;
                break;
        }
        return i;
    }

}