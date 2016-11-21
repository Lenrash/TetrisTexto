package ga.leliadoura.dam2.tetristexto;

public class Pieza_I extends Pieza {

    public Pieza_I() {
        estado = 0;
        pieza = new char[4][4];
        pieza = generar(estado);
    }

    @Override
    public String toString() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++)
                System.out.print(pieza[i][j]);
            System.out.println();
        }
        return null;
    }

    public void girar() {
        switch (estado) {
            case 0:
                estado++;
                pieza = generar(estado);
                break;
            case 1:
                estado++;
                pieza = generar(estado);
                break;
            case 2:
                estado++;
                pieza = generar(estado);
                break;
            case 3:
                estado = 0;
                pieza = generar(estado);
                break;
        }
    }

    public char[][] generar(int estado){
        switch (estado) {
            case 0:
            case 2:
                pieza[0][0] = 'I';	pieza[1][0] = ' ';	pieza[2][0] = ' ';	pieza[3][0] = ' ';
                pieza[0][1] = 'I';	pieza[1][1] = ' ';	pieza[2][1] = ' ';	pieza[3][1] = ' ';
                pieza[0][2] = 'I';	pieza[1][2] = ' ';	pieza[2][2] = ' ';	pieza[3][2] = ' ';
                pieza[0][3] = 'I';	pieza[1][3] = ' ';	pieza[2][3] = ' ';	pieza[3][3] = ' ';

                break;
            case 1:
            case 3:
                pieza[0][0] = 'I';	pieza[1][0] = 'I';	pieza[2][0] = 'I';	pieza[3][0] = 'I';
                pieza[0][1] = ' ';	pieza[1][1] = ' ';	pieza[2][1] = ' ';	pieza[3][1] = ' ';
                pieza[0][2] = ' ';	pieza[1][2] = ' ';	pieza[2][2] = ' ';	pieza[3][2] = ' ';
                pieza[0][3] = ' ';	pieza[1][3] = ' ';	pieza[2][3] = ' ';	pieza[3][3] = ' ';

                break;

        }
        return pieza;
    }

}