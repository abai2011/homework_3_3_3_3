package com.example.homework_3_3_3_3;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class MotobrikeFragment extends Fragment {

    RecyclerView recyclerView;
    ArrayList<String>motobrikeName=new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_motobrike, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView=view.findViewById(R.id.rv_motobrike);
        loadData();MotobrikeAdapter carAdapter=new MotobrikeAdapter(motobrikeName);
        RecyclerView.Adapter motobrikeAdapter = null;
        recyclerView.setAdapter(motobrikeAdapter);
    }
    private void loadData() {
        motobrikeName.add("Yamaha YZF-R1");
        motobrikeName.add("BME472");
        motobrikeName.add("FDBDSFN44");
        motobrikeName.add("FBDFB8979");
        motobrikeName.add("FGFDH5436");
        motobrikeName.add("FGFHTJ77777");
        motobrikeName.add("HJU800KHIU00");

    }
}
