package com.example.homework_3_3_3_3;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.text.BreakIterator;

public class MotobrikeViewHolder extends RecyclerView.ViewHolder {
    public MotobrikeViewHolder(Object p0) {
        super();

        public class MotobrikeViewHolder extends RecyclerView.ViewHolder {
            private TextView tvCarName;
            public MotobrikeViewHolder(@NonNull View itemView) {
                super(itemView);
                View tv_MotobrikeName = itemView.findViewById(R.id.tv_motobrikeName);
            }

            public void bind(String car){
                BreakIterator tvMotobrikeName;
                tvMotobrikeName = null;
                tvMotobrikeName.setText(car);
            }
        }
    }
}
