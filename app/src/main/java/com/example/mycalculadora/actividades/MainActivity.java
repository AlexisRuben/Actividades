package com.example.mycalculadora.actividades;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        final Button btnVerificar = findViewById(R.id.btnVerificar);
        final EditText palabra = findViewById(R.id.palabra);
        final TextView palindromo = findViewById(R.id.palindromo);
        final TextView longitud = findViewById(R.id.longitud);
        final TextView inversa = findViewById(R.id.inversa);
        final TextView letrass = findViewById(R.id.letrass);









        btnVerificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                boolean es = true;
                int fin = palabra.length()-1;
                int inicio =0;

                String cadena = palabra.getText().toString();
                String cadena2= palabra.getText().toString();
                String cadenaInvertida=" ";



                String texto = "";
                char [] letras;

                char letraRep = ' ';


                texto = palabra.getText().toString();
                letras = texto.toCharArray();

                for(int i=0; i<letras.length; i++){

                    char letraActual = letras[i];
                    int contador = 0;

                    for (int j =0; j<letras.length; j++){
                        if (letras[j] == letraActual)
                            contador++;
                    }

                    if(0 < contador)
                    {
                        letraRep = letraActual;
                    }
                    letrass.setText(""+letraRep);
                }




                while(inicio < fin){
                    if (cadena.charAt(inicio)!=cadena.charAt(fin)){
                        es=false;
                    }
                    inicio++;
                    fin--;
                }if(es){
                    palindromo.setText("Es palindromo");
                }else {
                    palindromo.setText("no es palindromo");
                }

                for (int i=cadena.length()-1;i>=0;i--){
                    cadenaInvertida+= cadena.charAt(i);

                }

                inversa.setText(""+ cadenaInvertida);
                longitud.setText(String.valueOf(palabra.length()));

            }
        });

    }
}
