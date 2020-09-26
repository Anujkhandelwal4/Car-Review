package com.example.carreview;

import android.app.Application;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class myApplication extends Application {

    public  static ArrayList<row> cars;
    @Override
    public void onCreate() {
        super.onCreate();
        cars = new ArrayList<row>();

        cars.add(new row("audi","Audi","Anuj khandelwal","6378120544838"));
        cars.add(new row("benz","Benz","Shruti Agarwal","6378120544838"));
        cars.add(new row("bmw","BMW","Prachi khandelwal","78120544838"));
        cars.add(new row("hyundai","Hyundai","Himanshu","6378544838"));
        cars.add(new row("renault","Renault","Shyam sunder garg","63781205838"));
        cars.add(new row("suzuki","Suzuki","Rouank Garg","63781205448"));
        cars.add(new row("toyota","Toyota","Hemant pamnani","63120544838"));
    }
}
