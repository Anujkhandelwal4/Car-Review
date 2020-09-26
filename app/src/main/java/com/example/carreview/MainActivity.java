package com.example.carreview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements CarAdapter.ItemClicked {

    RecyclerView recyclerView;
    Button btnCar,btnOwner;
    TextView tvName,tvModel,tvTel;
    ImageView tvLogo;
    FragmentManager fragmentManager;
    Fragment buttuonFragment, ownerFragment,listfragment ,carFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCar = findViewById(R.id.btCar);
        btnOwner = findViewById(R.id.btOwner);
        tvName = findViewById(R.id.tvName);
        tvModel = findViewById(R.id.tvModel);
        tvLogo = findViewById(R.id.tvLogo);
        tvTel = findViewById(R.id.tvTel);

        fragmentManager = getSupportFragmentManager();
        listfragment = fragmentManager.findFragmentById(R.id.fragment);
        buttuonFragment = fragmentManager.findFragmentById(R.id.btnFragment);
        ownerFragment = fragmentManager.findFragmentById(R.id.owFragment);
        carFragment = fragmentManager.findFragmentById(R.id.fragment4);

        fragmentManager.beginTransaction()
                .show(listfragment)
                .show(buttuonFragment)
                .hide(ownerFragment)
                .show(carFragment)
                .commit();

        btnCar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                fragmentManager.beginTransaction()
                        .hide(ownerFragment)
                        .show(carFragment)
                        .commit();
            }
        });
        btnOwner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragmentManager.beginTransaction()
                        .show(ownerFragment)
                        .hide(carFragment)
                        .commit();
            }
        });
    }

    @Override
    public void onItemClicked(int index) {

        tvModel.setText(myApplication.cars.get(index).getCarname());
        tvName.setText(myApplication.cars.get(index).getPrname());
        tvTel.setText(myApplication.cars.get(index).getOwTel());

        if(myApplication.cars.get(index).getPic().equals("audi"))
        {
            tvLogo.setImageResource(R.drawable.audi);
        }
        else if(myApplication.cars.get(index).getPic().equals("benz"))
        {
            tvLogo.setImageResource(R.drawable.benz);
        }
        else if(myApplication.cars.get(index).getPic().equals("bmw"))
        {
            tvLogo.setImageResource(R.drawable.bmw);
        }
        else if(myApplication.cars.get(index).getPic().equals("hyundai"))
        {
            tvLogo.setImageResource(R.drawable.hyundai);
        }
        else if(myApplication.cars.get(index).getPic().equals("renault"))
        {
            tvLogo.setImageResource(R.drawable.renault);
        }
        else if(myApplication.cars.get(index).getPic().equals("suzuki"))
        {
            tvLogo.setImageResource(R.drawable.suzuki);
        }
        else if(myApplication.cars.get(index).getPic().equals("toyota"))
        {
            tvLogo.setImageResource(R.drawable.toyota);
        }
    }
}