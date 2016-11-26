package ga.leliadoura.dam2.tetristexto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Pieza oPieza;
    private Tablero oTablero;
    private Button rotar, moverIzq, moverDer, moverAbajo;
    private Hilo hilo1;



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
        //oPieza = new Pieza();

        hilo1 = new Hilo(oPieza, oTablero);
        hilo1.start();

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.b_moverAbajo:
                oPieza.bajar();
                break;
            case R.id.b_moverDer:
                if (oPieza.getColumna() < 10)
                    oPieza.mover_der();
                break;
            case R.id.b_moverIzq:
                if (oPieza.getColumna() > 0)
                    oPieza.mover_izq();
                break;
            case R.id.b_rotar:
                oPieza.girar();
                break;
        }
    }

}
