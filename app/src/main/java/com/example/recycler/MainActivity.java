package com.example.recycler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.recycler.Adapters.Adapter;
import com.example.recycler.models.contact;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView rcv;
    Adapter adapter;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rcv = findViewById(R.id.rcv);
        rcv.setHasFixedSize(true);
        rcv.setLayoutManager(new LinearLayoutManager(this));
        adapter = new Adapter(getData(),getApplicationContext());

        adapter.setOnclicklistener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                switch (rcv.getChildAdapterPosition(view));
                Toast.makeText(getApplicationContext(),"hola",Toast.LENGTH_LONG).show();

            }
        });

        rcv.setAdapter(adapter);


        
        //rcv.hasFixedSize(true);
    }

    public List<contact> getData(){
        List<contact> usuarios = new ArrayList<>();

        usuarios.add(new contact("Rogelio",R.drawable.boy));
        usuarios.add(new contact("Azamir",R.drawable.boy));
        usuarios.add(new contact("Juan",R.drawable.boy));
        usuarios.add(new contact("Juan",R.drawable.boy));
        usuarios.add(new contact("Edwin",R.drawable.boy));
        usuarios.add(new contact("Arturo",R.drawable.boy));
        usuarios.add(new contact("Daniel",R.drawable.boy));
        usuarios.add(new contact("Isaac",R.drawable.boy));
        usuarios.add(new contact("Jaime",R.drawable.boy));
        usuarios.add(new contact("Fabiola",R.drawable.girl));
        usuarios.add(new contact("Teresa",R.drawable.girl));
        usuarios.add(new contact("lizbeth",R.drawable.girl));
        usuarios.add(new contact("Sandra",R.drawable.girl));
        usuarios.add(new contact("Pamela",R.drawable.girl));
        usuarios.add(new contact("Brenda",R.drawable.girl));
        usuarios.add(new contact("Laura",R.drawable.girl));
        usuarios.add(new contact("Estela",R.drawable.girl));

        usuarios.add(new contact("Carlos",R.drawable.boy));
        usuarios.add(new contact("Felipe",R.drawable.boy));
        usuarios.add(new contact("Sergio",R.drawable.boy));
        usuarios.add(new contact("Omar",R.drawable.boy));
        usuarios.add(new contact("Esteban",R.drawable.boy));
        usuarios.add(new contact("Oscar",R.drawable.boy));
        usuarios.add(new contact("Pedro",R.drawable.boy));
        usuarios.add(new contact("Marco",R.drawable.boy));
        usuarios.add(new contact("Adrian",R.drawable.boy));
        usuarios.add(new contact("Susana",R.drawable.girl));
        usuarios.add(new contact("Mariane",R.drawable.girl));
        usuarios.add(new contact("Edith",R.drawable.girl));
        usuarios.add(new contact("Marlene",R.drawable.girl));
        usuarios.add(new contact("Sonia",R.drawable.girl));
        usuarios.add(new contact("Ariana",R.drawable.girl));
        usuarios.add(new contact("Sandra",R.drawable.girl));
        usuarios.add(new contact("Maria",R.drawable.girl));

        return usuarios;
    }

}
