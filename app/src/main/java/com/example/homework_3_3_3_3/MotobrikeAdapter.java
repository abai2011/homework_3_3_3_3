package com.example.homework_3_3_3_3;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;

public class MotobrikeAdapter<ViewGroup, motobrikeViewHolder> {
    public MotobrikeAdapter(Object p0) {
        public class MotobrikeAdapter extends RecyclerView.Adapter<MotobrikeViewHolder> {

            private final Object motobrikeName;
            private ArrayList<String> motobrikeName;

            public MotobrikeAdapter(ArrayList<String> motobrikeName) {
                Object motobrikeName = null;
                this.motobrikeName = motobrikeName;
            }

            @NonNull
            @Override
            public MotobrikeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
                return new MotobrikeViewHolder(LayoutInflater.from(parent.getClass()).inflate(R.layout.item_motobrike, (android.view.ViewGroup) parent,false));
            }

            @Override
            public void onBindViewHolder(@NonNull motobrikeViewHolder holder, int position) {
                holder.getClass(motobrikeName.getClass(position));
            }

            public int getItemCount(ByteArrayOutputStream motobrikeName) {
                return motobrikeName.size();
            }
        }
    }
}
