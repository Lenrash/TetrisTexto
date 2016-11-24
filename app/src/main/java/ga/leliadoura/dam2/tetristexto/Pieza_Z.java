package ga.leliadoura.dam2.tetristexto;

public class Pieza_Z extends Pieza {

    public Pieza_Z() {
        estado = 0;
        pieza = new char[4][4];
        pieza = generar(estado);
    }

    @Override
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

    @Override
    public String toString() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++)
                System.out.print(pieza[i][j]);
            System.out.println();
        }
        return null;
    }

    public char[][] generar(int estado){
        switch (estado) {
            case 0:
                pieza[0][0] = 'Z';	pieza[0][1] = 'Z';	pieza[0][2] = '0';	pieza[0][3] = '0';
                pieza[1][0] = '0';	pieza[1][1] = 'Z';	pieza[1][2] = 'Z';	pieza[1][3] = '0';
                pieza[2][0] = '0';	pieza[2][1] = '0';	pieza[2][2] = '0';	pieza[2][3] = '0';
                pieza[3][0] = '0';	pieza[3][1] = '0';	pieza[3][2] = '0';	pieza[3][3] = '0';

                break;
            case 2:
                pieza[0][0] = 'Z';	pieza[0][1] = 'Z';	pieza[0][2] = '0';	pieza[0][3] = '0';
                pieza[1][0] = '0';	pieza[1][1] = 'Z';	pieza[1][2] = 'Z';	pieza[1][3] = '0';
                pieza[2][0] = '0';	pieza[2][1] = '0';	pieza[2][2] = '0';	pieza[2][3] = '0';
                pieza[3][0] = '0';	pieza[3][1] = '0';	pieza[3][2] = '0';	pieza[3][3] = '0';

                break;
            case 1:
                pieza[0][0] = '0';	pieza[0][1] = 'Z';	pieza[0][2] = '0';	pieza[0][3] = '0';
                pieza[1][0] = 'Z';	pieza[1][1] = 'Z';	pieza[1][2] = '0';	pieza[1][3] = '0';
                pieza[2][0] = 'Z';	pieza[2][1] = '0';	pieza[2][2] = '0';	pieza[2][3] = '0';
                pieza[3][0] = '0';	pieza[3][1] = '0';	pieza[3][2] = '0';	pieza[3][3] = '0';

                break;
            case 3:
                pieza[0][0] = '0';	pieza[0][1] = 'Z';	pieza[0][2] = '0';	pieza[0][3] = '0';
                pieza[1][0] = 'Z';	pieza[1][1] = 'Z';	pieza[1][2] = '0';	pieza[1][3] = '0';
                pieza[2][0] = 'Z';	pieza[2][1] = '0';	pieza[2][2] = '0';	pieza[2][3] = '0';
                pieza[3][0] = '0';	pieza[3][1] = '0';	pieza[3][2] = '0';	pieza[3][3] = '0';

                break;
        }
        return pieza;
    }

}