package com.example.thegameofpigpractica2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int jogador = 0;
    private int ac1 = 0;
    private int ac2 = 0;
    private int random1 = 0;
    private int random2 = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void tirarDado(View view) {
        TextView dado = (TextView) findViewById(R.id.dado);
        TextView acum1 = (TextView) findViewById(R.id.acum1);
        TextView acum2 = (TextView) findViewById(R.id.acum2);
        int num1 = ((int) (Math.random()*6)+1);
        dado.setText(String.valueOf(num1));
        if (jogador == 0) {
            if (num1 == 1) {
                ac1=0;
                acum1.setText(String.valueOf(ac1));
                dado.setText("");
                jogador = 1;
            } else {
                ac1 += num1;
                acum1.setText(String.valueOf(ac1));
            }
        } else {
            if (num1 == 1) {
                ac2=0;
                acum2.setText(String.valueOf(ac2));
                dado.setText("");
                jogador = 0;
            } else {
                ac2 += num1;
                acum2.setText(String.valueOf(ac2));
            }
        }
    }

    public void rendirse(View view) {
        TextView acum1 = (TextView) findViewById(R.id.acum1);
        TextView acum2 = (TextView) findViewById(R.id.acum2);
        TextView res1 = (TextView) findViewById(R.id.resultado1);
        TextView res2 = (TextView) findViewById(R.id.resultado2);
        TextView ganador = (TextView) findViewById(R.id.ganador);
        if (jogador == 0) {
            random1 += ac1;
            res1.setText(String.valueOf(random1));
            if (random1 >= 100) {
                ganador.setText("O JOGADOR 1 GANHA");
            }
            ac1 = 0;
            acum1.setText("0");
            jogador = 1;
        } else {
            random2 += ac2;
            res2.setText(String.valueOf(random2));
            if (random2 >= 100) {
                ganador.setText("O JOGADOR 2 GANHA");
            }
            ac2 = 0;
            acum2.setText("0");
            jogador = 0;
        }
    }

    public void nuevaPartida(View view) {
        TextView acum1 = (TextView) findViewById(R.id.acum1);
        TextView acum2 = (TextView) findViewById(R.id.acum2);
        TextView res1 = (TextView) findViewById(R.id.resultado1);
        TextView res2 = (TextView) findViewById(R.id.resultado2);
        TextView ganador = (TextView) findViewById(R.id.ganador);
        TextView dado = (TextView) findViewById(R.id.dado);
        ac1=0;
        ac2=0;
        random1 =0;
        random2 =0;
        acum1.setText("0");
        acum2.setText("0");
        res1.setText("0");
        res2.setText("0");
        ganador.setText("");
        dado.setText("");
        ganador.setText("");
    }
}