package com.upb.myrestaurant;

import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


        }
    public void abrirMenu (View v){
        Intent i;

        i = new Intent(this, MenuActivity.class);
        startActivity(i);

    }
    public void abrirCliente (View v){
        Intent i;

        i = new Intent(this, CalificarActivity.class);
        startActivity(i);

    }

    public void abrirReserva (View v){

        String numero = "+573225314333";
        String mensaje = "Quiero Reservar en el edén";
        String url = "https://api.whatsapp.com/send?phone="+ numero + "&text=" + Uri.encode(mensaje);


        String whatsApp = "com.whatsapp";
        PackageManager pm = getPackageManager();

        //* Abre un chat especifico
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);

    }

    public void abrirRegistro(View v){
        Intent i;

        i = new Intent(this, ClienteLoginActivity.class);
        startActivity(i);
    }
    public void abrirPedido (View v){

        String numero = "+573225314333";
        String mensaje = "Quiero ordenar un manjar del paraíso";
        String url = "https://api.whatsapp.com/send?phone="+ numero + "&text=" + Uri.encode(mensaje);


        String whatsApp = "com.whatsapp";
        PackageManager pm = getPackageManager();

        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);

    }

    public void abrirSedes (View v){
        Intent i;

        i = new Intent(this, MapsActivity.class);
        startActivity(i);

    }

    }


