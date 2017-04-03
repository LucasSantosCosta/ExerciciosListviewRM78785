package br.com.fiap.exercicios.listview.RM78785;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.CompoundButton;
import android.widget.NumberPicker;
import android.widget.Switch;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class PreferencesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preferences);


        NumberPicker np = (NumberPicker) findViewById(R.id.numberPicker1);

        np.setMinValue(0);
        np.setMaxValue(10);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        Switch aSwitch =(Switch) findViewById(R.id.switch1);
        String txt = "false";
        String txt2 = null;
        FileInputStream ativeSplash = null;
        FileInputStream tempoSplash = null;
        try {
            ativeSplash = openFileInput("ativeSplash.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(ativeSplash));

            txt = br.readLine(); ativeSplash.close();
            aSwitch.setChecked(false);

            tempoSplash = openFileInput("tempoSplash.txt");
            BufferedReader br2 = new BufferedReader(new InputStreamReader(tempoSplash));
            txt2 = br2.readLine(); tempoSplash.close();

            np.setValue(Integer.parseInt(txt2));


            if(txt.equals("true")){
                aSwitch.setChecked(true);
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:

                Switch aSwitch =(Switch) findViewById(R.id.switch1);
                NumberPicker nm =(NumberPicker) findViewById(R.id.numberPicker1);

                aSwitch.isChecked();
                System.out.println(aSwitch.isChecked());

                FileOutputStream ativeSplash = null;
                FileOutputStream tempoSplash = null;
                try {
                    ativeSplash = openFileOutput("ativeSplash.txt", MODE_PRIVATE);
                    tempoSplash = openFileOutput("tempoSplash.txt", MODE_PRIVATE);

                    String txt = String.valueOf(aSwitch.isChecked());
                    ativeSplash.write(txt.getBytes());
                    ativeSplash.close();

                    System.out.println(nm.getValue());
                    String txt2 =  String.valueOf(nm.getValue());
                    tempoSplash.write(txt2.getBytes());
                    tempoSplash.close();

                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }



                this.finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        System.out.println(isChecked);
    }
}
