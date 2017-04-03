package br.com.fiap.exercicios.listview.RM78785;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;


public class PizzasAdapter extends BaseAdapter {

    Context context;
    List<Pizzas> lista;

    public PizzasAdapter(List<Pizzas> lista, Context context) {
        this.lista = lista;
        this.context = context;
    }

    @Override
    public int getCount() {
        return this.lista.size();
    }

    @Override
    public Object getItem(int position) {
        return (Object) this.lista.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(this.context);

        Pizzas pizzas = lista.get(position);
        View v = inflater.inflate(R.layout.lista_pizzas, null);
        ImageView foto = (ImageView)v.findViewById(R.id.imgPizza);
        TextView nomePizza  =(TextView) v.findViewById(R.id.nomePizza);
        TextView valorPizza  =(TextView) v.findViewById(R.id.valorPizza);
        TextView descricaoPizza  =(TextView) v.findViewById(R.id.descricaoPizza);


        NumberFormat df = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));


        foto.setImageResource(pizzas.getFoto());
        nomePizza.setText(pizzas.getNome());
        valorPizza.setText(df.format(pizzas.getValor()).toString());
        descricaoPizza.setText(pizzas.getDescricao());
        return  v;
    }

}
