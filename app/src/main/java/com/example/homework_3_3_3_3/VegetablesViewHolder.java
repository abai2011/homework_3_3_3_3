package com.example.homework_3_3_3_3;

import android.annotation.SuppressLint;
import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.text.BreakIterator;

public class VegetablesViewHolder extends RecyclerView.ViewHolder {
    private TextView tvVegetablesName;

    public VegetablesViewHolder(@androidx.annotation.NonNull View itemView) {
        super(itemView);
    }

    @SuppressLint("NotConstructor")
    public void VegetablesViewHolder(@NonNull View itemView) {
        super(itemView);
        View tvVegetablesName = itemView.findViewById(R.id.tv_vegetablesName);
    }
    public void Bind(String foodName){
        BreakIterator tvVegetablesName = null;
        tvVegetablesName.setText(foodName);
    }
}
