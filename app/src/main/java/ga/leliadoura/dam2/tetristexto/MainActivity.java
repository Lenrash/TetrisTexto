package ga.leliadoura.dam2.tetristexto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Pieza oPieza;
    private Button rotar, moverIzq, moverDer, moverAbajo;
    private EditText area;
    private Tablero oTablero;
    private int r;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        rotar = (Button) findViewById(R.id.b_rotar);
        moverIzq = (Button) findViewById(R.id.b_moverIzq);
        moverDer = (Button) findViewById(R.id.b_moverDer);
        moverAbajo = (Button) findViewById(R.id.b_moverAbajo);

        rotar.setOnClickListener(this);
        moverDer.setOnClickListener(this);
        moverAbajo.setOnClickListener(this);
        moverIzq.setOnClickListener(this);

        area = (EditText) findViewById(R.id.area);

        oTablero = new Tablero();

        Thread hilo = new Thread() {

            public void run() {
                while (oTablero.fin() == false) {

                    r = (int) (Math.random() * 7);

                    switch (r) {
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
                        System.out.println(oTablero.toString());

                        try {
                            sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                area.setText(oTablero.toString());
                            }
                        });

                        oPieza.bajar();
                    }
                }
            }
        };

        hilo.start();

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.b_moverAbajo:
                oPieza.bajar();
                break;
            case R.id.b_moverDer:
                if (oPieza.getColumna() + oPieza.getTamaño() < Tablero.BORDE_DERECHO)
                    oPieza.mover_der();
                break;
            case R.id.b_moverIzq:
                if (oPieza.getColumna() > Tablero.BORDE_IZQUIERDO)
                    oPieza.mover_izq();
                break;
            case R.id.b_rotar:
                if (oPieza.getColumna() + oPieza.getTamaño() == Tablero.BORDE_DERECHO)
                    oPieza.setColumna(Tablero.BORDE_DERECHO - oPieza.getTamañoSiguientePieza());
                oPieza.girar();
                break;
        }
    }

}
