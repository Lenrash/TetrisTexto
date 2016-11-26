package ga.leliadoura.dam2.tetristexto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Pieza[] aPiezas;
    private Tablero oTablero;
    private Button rotar, moverIzq, moverDer, moverAbajo;
    private Hilo hilo1;
    int r;


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

        oTablero = new Tablero();
        aPiezas = new Pieza[7];
        aPiezas[0] = new Pieza_O();
        aPiezas[1] = new Pieza_I();
        aPiezas[2] = new Pieza_Z();
        aPiezas[3] = new Pieza_T();
        aPiezas[4] = new Pieza_J();
        aPiezas[5] = new Pieza_L();
        aPiezas[6] = new Pieza_S();


        r = (int) (Math.random() * 7);
        hilo1 = new Hilo(aPiezas[r], oTablero);
        hilo1.start();

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.b_moverAbajo:
                aPiezas[r].bajar();
                break;
            case R.id.b_moverDer:
                if (aPiezas[r].getColumna() < 10)
                    aPiezas[r].mover_der();
                break;
            case R.id.b_moverIzq:
                if (aPiezas[r].getColumna() > 0)
                    aPiezas[r].mover_izq();
                break;
            case R.id.b_rotar:
                aPiezas[r].girar();
                break;
        }
    }

}
