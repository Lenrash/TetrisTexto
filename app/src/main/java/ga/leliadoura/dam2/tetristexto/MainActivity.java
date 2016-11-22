package ga.leliadoura.dam2.tetristexto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText area;
    private Button rotar, moverIzq, moverDer, moverAbajo;
    private T1 t1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        area = (EditText)findViewById(R.id.area);

        rotar = (Button)findViewById(R.id.b_rotar);
        moverIzq = (Button)findViewById(R.id.b_moverIzq);
        moverDer = (Button)findViewById(R.id.b_moverDer);
        moverAbajo = (Button)findViewById(R.id.b_moverAbajo);

        rotar.setOnClickListener(this);
        moverDer.setOnClickListener(this);
        moverAbajo.setOnClickListener(this);
        moverIzq.setOnClickListener(this);

        t1 = new T1();
        t1.start();
    }

    @Override
    public void onClick(View v) {
       switch (v.getId()){
           case R.id.b_moverAbajo:
               break;
           case R.id.b_moverDer:
               break;
           case R.id.b_moverIzq:
               break;
           case R.id.b_rotar:
               break;
       }
     }

}
