package br.com.fiap.exercicios.listview.RM78785;

import java.util.ArrayList;
import java.util.List;

public class GeraListaPIzzas {

    public static List<Pizzas> listaPizzas(){

        List<Pizzas> lista = new ArrayList<Pizzas>();

        lista.add(new Pizzas(1,"Mussarela","Sem bordas rechadas","Queijo mussarela", 55.0,"Nenhum",5,R.drawable.mussarela));
        lista.add(new Pizzas(2,"Calabresa","Bordas com Cheddar","Calabresa fatiada com cebolas", 45.0,"Calabresa",5,R.drawable.calabresa));
        lista.add(new Pizzas(3,"Frango com Catupiry","Gratis um Refri","FRango desfiado coberto de Catupiry", 60.0,"Nenhum",5,R.drawable.frango_catupiry));
        lista.add(new Pizzas(5,"Camarão","Camarão Fresco","Camarão refogado coberto com (Catupiry ou Mussarela)", 70.0,"Camarão",5,R.drawable.camarao));
        lista.add(new Pizzas(6,"Atum","Atum temperado","Atum e cebolas", 65.0,"Atum",5,R.drawable.atum));
        lista.add(new Pizzas(7,"Presunto","Presunto Defumado","Queijo e mais queijo", 35.0,"Calabresa 2",5,R.drawable.presunto));
        lista.add(new Pizzas(8,"Nordestina","Carne Seca","Carne seca desfiada refogada com cobertura de mussarela e cebola", 40.0,"Nenhum",5,R.drawable.carne_seca));


        return lista;
    }


}
