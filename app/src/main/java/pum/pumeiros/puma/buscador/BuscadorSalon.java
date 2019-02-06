package pum.pumeiros.puma.buscador;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class BuscadorSalon extends AppCompatActivity {
    int adivina;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buscador_salon);
    Random miRandom = new Random();
    adivina= miRandom.nextInt();

    }
    public void ejemplo(View miVista){
        TextView miEti = (TextView) findViewById(R.id.miEtiqueta);
        Button miBut = (Button) findViewById(R.id.elButton);
        EditText miEdit = (EditText) findViewById(R.id.cuadrito);

        int numero = Integer.parseInt(miEdit.getText().toString());

        if ( numero == adivina) {
            miEti.setText("Tan de buenas, ese sí era");
        }else{
            if (numero>adivina) {
                miEti.setText("Bájele un poquito ");
            }else{
                miEti.setText("Súbale un poquito");
            }

        }
    }


}

