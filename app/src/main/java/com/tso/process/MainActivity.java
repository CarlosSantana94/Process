package com.tso.process;

import android.os.Bundle;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Arrays;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    String[] vector = {"","","","","","","","","","","","","","","","","","","",""};
    int Ciclos=0, contador1=0,contador2=0,posicionEnVector=0,seleccion,Rand_Letter,Rand_number;
    String letra,numeroString;
    String[] chars = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","x","y","z"};//25 letras
    Random rand = new Random();

    Button button ;
    TextView texto ;
    TextView cilosTxt;
            TextView txt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        button = (Button) findViewById(R.id.button);
        texto = (TextView) findViewById(R.id.textView);
        cilosTxt = (TextView) findViewById(R.id.txtciclos);
        txt2=(TextView) findViewById(R.id.textView2);



        button.setOnClickListener(new View.OnClickListener() {



            @Override

            public void onClick(View view) {

                //Toast.makeText(MainActivity.this, "Button Clicked", Toast.LENGTH_SHORT).show();
                txt2.setText("rouerflkndlmskjm");
                SystemClock.sleep(1050);
                txt2.setText("aaaaaaaa");
                SystemClock.sleep(1050);

               // procesador();

            }



        });




    }


public void procesador()
{

    while(contador1<20||contador2<20)
    {
        //seleccion = rand.nextInt(2);
        seleccion=1;


        Ciclos++;

        switch (seleccion)
        {
            case 0:
                if (contador1<20)
                {
                    Rand_Letter = rand.nextInt(24);
                    letra=chars[Rand_Letter];

                    if (posicionEnVector<=19)
                    {
                        vector[posicionEnVector]=letra;
                    }

                    if (posicionEnVector<=19)
                    {
                        posicionEnVector++;
                    }

                    contador1++;
                }
                break;
            case 1:
                if (contador2<20)
                {
                    Rand_number = rand.nextInt(24);
                    numeroString=String.valueOf(Rand_number);

                    if (posicionEnVector<=19)
                    {
                        vector[posicionEnVector]=numeroString;
                    }

                    if (posicionEnVector<=19)
                    {
                        posicionEnVector++;
                    }


                    contador2++;
                }
                break;
            case 2:

                if (posicionEnVector!=0)
                {
                    posicionEnVector--;
                }
                break;
        }

        texto.setText(Arrays.toString(vector));
        String ciclostxt = String.valueOf(Ciclos);
        cilosTxt.setText(ciclostxt);
        SystemClock.sleep(350);




    }

}

}
