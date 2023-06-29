package com.example.homework_3_3_3_3;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class ContactViewHolder {

    public class ContactViewHolder extends RecyclerView.ViewHolder {
        private TextView tv_contact;
        public ContactViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_contact=itemView.findViewById(R.id.tvContact);
        }

        public void bind(String contact){
            tv_contact.setText(contact);
        }
    }
}
