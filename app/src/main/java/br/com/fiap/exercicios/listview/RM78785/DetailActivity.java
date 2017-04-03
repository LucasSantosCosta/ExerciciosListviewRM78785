package br.com.fiap.exercicios.listview.RM78785;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        ActionBar actionbar = getSupportActionBar();
        actionbar.setDisplayHomeAsUpEnabled(true);

        Bundle bd = getIntent().getExtras();
        actionbar.setTitle(bd.getString("nomePizza"));

        ImageView imagem = (ImageView)findViewById(R.id.imgPizzaBig);
        TextView igredientes = (TextView) findViewById(R.id.igredientes);
        TextView igredientesAlergenicos = (TextView) findViewById(R.id.igredientesAlergenicos);
        RatingBar pontuacao =(RatingBar) findViewById(R.id.pontuacao);


        imagem.setImageResource(bd.getInt("imgPizza"));
        igredientes.setText(bd.getString("igredientes"));
        igredientesAlergenicos.setText(bd.getString("igredientesAlergenicos"));
        pontuacao.setNumStars(6);
        pontuacao.setStepSize(1);
        pontuacao.setRating(2);


    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                this.finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
