package com.example.homework_3_3_3_3;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class VegetablesAdapter {
    public VegetablesAdapter(Object vegetablesList) {

        public class VegetablesAdapter extends RecyclerView.Adapter<VegetablesViewHolder> {

            private ArrayList<String> foodList;

            public VegetablesAdapter(ArrayList<String> vgetablesList) {
                Object VegetablesList;
                VegetablesList = null;
                this.List = VegetablesList;
            }

            @NonNull
            @Override
            public VegetablesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
                return new VegetablesViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_Vegetables,parent ,false));
            }

            @Override
            public void onBindViewHolder(@NonNull VegetablesViewHolder holder, int position) {
                holder.Bind(vegetablesList.get(position));
            }

            @Override
            public int getItemCount() {
                return vegetablesList.size();
            }
        }
    }
}
