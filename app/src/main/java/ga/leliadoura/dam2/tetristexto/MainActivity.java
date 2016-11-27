package ga.leliadoura.dam2.tetristexto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Pieza oPieza;
    private Tablero oTablero;
    private Button rotar, moverIzq, moverDer, moverAbajo;
    private Hilo hilo1;
    private EditText area;



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

        hilo1 = new Hilo(oTablero);
        hilo1.start();

    }

    @Override
    public void onClick(View v) {
        oPieza = hilo1.getoPieza();
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

    public EditText getArea() {
        return area;
    }
}
