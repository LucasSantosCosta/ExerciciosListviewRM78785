package br.com.fiap.exercicios.listview.RM78785;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Pizzas> listaPizzas;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaPizzas = GeraListaPIzzas.listaPizzas();

        listView = (ListView) findViewById(R.id.lstPizzas);

        PizzasAdapter p = new PizzasAdapter(listaPizzas, this);

        listView.setAdapter(p);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent it = new Intent(MainActivity.this, DetailActivity.class);

                Bundle bundle = new Bundle();
                bundle.putString("nomePizza", listaPizzas.get((position)).getNome());
                bundle.putString("igredientes", listaPizzas.get((position)).getIgredientes());
                bundle.putString("igredientesAlergenicos", listaPizzas.get((position)).getIgredienteAlergicos());
                bundle.putInt("imgPizza", listaPizzas.get((position)).getFoto());


                it.putExtras(bundle);
                startActivity(it);
            }
        });

    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item) {

        Intent intent = new Intent(MainActivity.this, PreferencesActivity.class);

        startActivity(intent);
        return true;
    }


}
