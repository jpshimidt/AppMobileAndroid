package com.example.preposiesbaixas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gerarNovaPreposicao(View view){

        String[] preposicoes = {
                "Quem não odeia ninguém não tem coração.",
                "A gente ouve muito a frase \"seja você mesmo\". Mas talvez a pessoa não queira ser ela mesma; ela pode inclusive estar fazendo um bom trabalho não sendo ela mesma, fazendo um verdadeiro bem pra sociedade. Não podemos estragar isso",
                "Se você quiser, se você se esforçar, se você treinar, se você entrar de cabeça, se você se concentrar... Nada garante que você vai conseguir.",
                "Às vezes é difícil separar a coragem da burrice, e a persitência da falta do que fazer",
                "A esperança é o sentimento mais nocivo que tem para qualquer ser humano, porque mantem você sofrendo por algo que nunca vai conseguir.",
                "Todos têm direito a opinião, desde que não seja uma opinião patética.",
                "Nunca é tarde demais pra parar de sonhar.",
                "Quando você chega no ponto mais alto de uma montanha, não há nada a fazer a não ser rolar ladeira abaixo descontroladamente, onde há uma caçamba de entulho te esperando. E o nome dessa caçamba é Sua Vida.",
                "Quando uma pessoa diz pra você acreditar em você e você acredita, você não está acreditando em você. Você está acreditando na pessoa que acredita em você.",
                "Querer comprar algo, e não ter dinheiro, isso é felicidade! Ter que batalhar pelas coisas!"
        };

        int numero = new Random().nextInt(10); // DE 0 A 9 (OU SEJA 10 NUMEROS)

        TextView texto = findViewById(R.id.preposicaoResultado);
        texto.setText(preposicoes[numero]);
    }

}