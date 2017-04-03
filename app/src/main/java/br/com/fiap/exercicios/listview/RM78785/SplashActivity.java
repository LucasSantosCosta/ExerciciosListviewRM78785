package br.com.fiap.exercicios.listview.RM78785;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        String txt = "false";
        String txt2 = null;
        FileInputStream fis = null;
//        FileInputStream fis2 = null;
        try {
            fis = openFileInput("ativeSplash.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(fis));
            txt = br.readLine();
            fis.close();

            fis = openFileInput("tempoSplash.txt");
            br = new BufferedReader(new InputStreamReader(fis));
            txt2 = br.readLine();
            fis.close();

            System.out.println("TESTE2");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        if(txt.equals("true")){

            Handler handler = new Handler();     handler.postDelayed(new Runnable() {
                @Override           public void run() {
                    //Lógica para abrir a outra activity aqui
                    Intent it = new Intent(SplashActivity.this, MainActivity.class);
                    startActivity(it);
                    finish();
                }     }, Integer.parseInt(txt2) * 1000);
        }else {
            Intent it = new Intent(SplashActivity.this, MainActivity.class);
            startActivity(it);
        }
    }
}