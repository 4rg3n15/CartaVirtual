package com.upb.myrestaurant;

import android.app.ListActivity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class EntradaActivity extends ListActivity {
    public class Producto {

        private String nombreProducto;
        private String ingredientesProducto;
        private String precioProducto;
        private Integer imagenProducto;
    }

    private EntradaActivity.MyAdapter adaptador = null;
    private static ArrayList<EntradaActivity.Producto> arregloProductos = new ArrayList<EntradaActivity.Producto>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setData();
        adaptador = new EntradaActivity.MyAdapter(this);
        setListAdapter(adaptador);



        //EdgeToEdge.enable(this);
        //setContentView(R.layout.activity_producto);
        //ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
        //  Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
        //v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
        //return insets;
        //});
    }

    private void setData(){
        arregloProductos.clear();



        //Bebida 1
        EntradaActivity.Producto EntradaActual1 = new EntradaActivity.Producto();
        EntradaActual1.nombreProducto = this.getResources().getString(R.string.Entrada1);
        EntradaActual1.ingredientesProducto = this.getResources().getString(R.string.ING_Entrada1);
        EntradaActual1.precioProducto = this.getResources().getString(R.string.PRECIO_Entrada1);
        EntradaActual1.imagenProducto = R.drawable.carpaccio_pulpo;
        arregloProductos.add(EntradaActual1);

        //Bebida 2
        EntradaActivity.Producto EntradaActual2 = new EntradaActivity.Producto();
        EntradaActual2.nombreProducto = this.getResources().getString(R.string.Entrada2);
        EntradaActual2.ingredientesProducto = this.getResources().getString(R.string.ING_Entrada2);
        EntradaActual2.precioProducto = this.getResources().getString(R.string.PRECIO_Entrada2);
        EntradaActual2.imagenProducto = R.drawable.tacos_camaron;
        arregloProductos.add(EntradaActual2);

        //Bebida 3
        EntradaActivity.Producto EntradaActual3 = new EntradaActivity.Producto();
        EntradaActual3.nombreProducto = this.getResources().getString(R.string.Entrada3);
        EntradaActual3.ingredientesProducto = this.getResources().getString(R.string.ING_Entrada3);
        EntradaActual3.precioProducto = this.getResources().getString(R.string.PRECIO_Entrada3);
        EntradaActual3.imagenProducto = R.drawable.tiradito;
        arregloProductos.add(EntradaActual3);

    }

    public class MyAdapter extends BaseAdapter {

        private Context myContexto;

        public MyAdapter (Context c){
            myContexto = c;
        }

        @Override
        public int getCount(){
            return arregloProductos.size();
        }

        @Override
        public Object getItem(int arg){
            return arregloProductos.get(arg);
        }

        @Override
        public long getItemId(int arg){
            return 0;
        }

        @Override
        public View getView(int position, View vista, ViewGroup arg2){

            View view = null;

            if (vista == null){
                LayoutInflater inflater = (LayoutInflater) myContexto.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                view = inflater.inflate(R.layout.activity_producto, null);
            }
            else {
                view = vista;
            }


            ImageView imgProducto = (ImageView) view.findViewById(R.id.imageViewProducto);
            imgProducto.setImageDrawable(myContexto.getResources().getDrawable(arregloProductos.get(position).imagenProducto));

            TextView nombrePorducto = (TextView) view.findViewById(R.id.textViewNombreProducto);
            nombrePorducto.setText(arregloProductos.get(position).nombreProducto);

            TextView ingredientesPorducto = (TextView) view.findViewById(R.id.textViewIngredientes);
            ingredientesPorducto.setText(arregloProductos.get(position).ingredientesProducto);

            TextView precioPorducto = (TextView) view.findViewById(R.id.textViewPrecioProducto);
            precioPorducto.setText(arregloProductos.get(position).precioProducto);


            return view;
        }



    }

}