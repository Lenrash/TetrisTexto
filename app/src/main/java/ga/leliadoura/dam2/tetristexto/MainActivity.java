package ga.leliadoura.dam2.tetristexto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private char[][] fondo, pieza;
    private EditText area;
    private Button rotar, moverIzq, moverDer, moverAbajo;
    private Pieza[] oPieza;
    private T1 t1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        area = (EditText)findViewById(R.id.area);
        fondo = new char[20][10];
        
        Log.i("valor",fondo[1].toString());

        fondo = fill_array_blank(fondo);

        oPieza = new Pieza[7];
        oPieza[0] = new Pieza_O();
        oPieza[1] = new Pieza_I();
        oPieza[2] = new Pieza_Z();
        oPieza[3] = new Pieza_T();
        oPieza[4] = new Pieza_J();
        oPieza[5] = new Pieza_L();
        oPieza[6] = new Pieza_S();

        int x = (int)(Math.random()*7);

        oPieza[x].obtenerPieza();
        pieza = oPieza[x].pieza;


        fondo = inserta_pieza(fondo, pieza);

        for(int i = 0; i< fondo.length;i++){
            String str = new String(fondo[i]);
            area.append(str + "\n");
        }


        rotar = (Button)findViewById(R.id.b_rotar);
        moverIzq = (Button)findViewById(R.id.b_moverIzq);
        moverDer = (Button)findViewById(R.id.b_moverDer);
        moverAbajo = (Button)findViewById(R.id.b_moverAbajo);

        rotar.setOnClickListener(this);
        moverDer.setOnClickListener(this);
        moverAbajo.setOnClickListener(this);
        moverIzq.setOnClickListener(this);

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

    private char[][] fill_array_blank(char[][] ch_array){
        for (int i = 0;i < ch_array.length; i++){
            for (int j = 0; j < ch_array[i].length; j++){
                ch_array[i][j] = ' ';
                /*if(j == 0 || j == 11)
                    ch_array[i][j] = '|';
                if(i == 20)
                    ch_array[i][j] = '_';*/
            }
        }
        return ch_array;
    }

    private char[][] inserta_pieza(char[][] ch_array, char[][] pieza){
        int x, y;
        x = 0;
        y = 0;

        for(int i = 0; i < 4; i++){
            for(int j = 4; j < 8; j++){
                ch_array[i][j] = pieza[x][y];
                y++;
            }
            x++;
            y = 0;
        }
        return ch_array;
    }


}
