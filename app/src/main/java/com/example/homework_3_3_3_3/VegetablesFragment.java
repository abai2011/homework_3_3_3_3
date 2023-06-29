package com.example.homework_3_3_3_3;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.ArrayList;


public class VegetablesFragment extends Fragment {
    private Button btn_contact;
    private RecyclerView recyclerView;
    private ArrayList<String> VegetablesList=new ArrayList<>();
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_vegetables, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        InitView();
        InitListener();
        recyclerView=view.findViewById(R.id.rv_vegetables);
        loadData();
        Object VegetablesList;
        VegetablesList = null;
        VegetablesAdapter foodAdapter=new VegetablesAdapter(VegetablesList);
        RecyclerView.Adapter vegetablesAdapter;
        vegetablesAdapter = null;
        recyclerView.setAdapter(vegetablesAdapter);
    }


    private void InitView() {
        btn_contact=requireActivity().findViewById(R.id.btn_contact);

    }
    private void InitListener() {
        btn_contact.setOnClickListener(view -> {
            requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragments,new ContactFragment()).addToBackStack(null).commit();
        });
    }

    private void loadData() {
        VegetablesList.add("капуста");
        VegetablesList.add("огурцы");
        VegetablesList.add("помидоры");
        VegetablesList.add("баклажан");
        VegetablesList.add("сельдерей");
        VegetablesList.add("картошка");
        VegetablesList.add("морковь");
        VegetablesList.add("лук");
        VegetablesList.add("чеснок");

    }


}