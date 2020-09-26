package com.example.carreview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CarAdapter extends RecyclerView.Adapter<CarAdapter.ViewHolder> {

    private  ArrayList<row> cars;
    ItemClicked activity;
    Context context;

    public interface ItemClicked
    {
        void onItemClicked (int index);
    }

    public CarAdapter(ArrayList<row> list, Context context) {
        this.cars = list;
        this.context = context;
        activity = (ItemClicked) context;
    }


    @NonNull
    @Override
    public CarAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.carview,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.itemView.setTag(cars.get(position));
        holder.etName.setText(cars.get(position).getPrname());
        holder.etCar.setText(cars.get(position).getCarname());
        if(cars.get(position).getPic().equals("audi"))
        {
            holder.etLogo.setImageResource(R.drawable.audi);
        }
        else if(cars.get(position).getPic().equals("benz"))
        {
            holder.etLogo.setImageResource(R.drawable.benz);
        }
        else if(cars.get(position).getPic().equals("bmw"))
        {
            holder.etLogo.setImageResource(R.drawable.bmw);
        }
        else if(cars.get(position).getPic().equals("hyundai"))
        {
            holder.etLogo.setImageResource(R.drawable.hyundai);
        }
        else if(cars.get(position).getPic().equals("renault"))
        {
            holder.etLogo.setImageResource(R.drawable.renault);
        }
        else if(cars.get(position).getPic().equals("suzuki"))
        {
            holder.etLogo.setImageResource(R.drawable.suzuki);
        }
        else
        {
            holder.etLogo.setImageResource(R.drawable.toyota);
        }
    }

    @Override
    public int getItemCount() {
        return cars.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView etLogo;
        TextView etCar, etName;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            etLogo = itemView.findViewById(R.id.etLogo);
            etCar = itemView.findViewById(R.id.etCar);
            etName = itemView.findViewById(R.id.etName);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    activity.onItemClicked(cars.indexOf((row)view.getTag()));
                }
            });
        }
    }
}

