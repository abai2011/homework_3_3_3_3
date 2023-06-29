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


public class ContactFragment extends Fragment {
    private Button btn_motobrike;
    private ArrayList<String> contactList = new ArrayList<>();
    private RecyclerView recyclerView;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_contact, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = view.findViewById(R.id.rv_contact);
        loadData();
        ContactAdapter contactAdapter = new ContactAdapter(contactList);
        recyclerView.setAdapter(contactAdapter);
        btn_motobrike = requireActivity().findViewById(R.id.motobrike);
        btn_motobrike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragments, new MotobrikeFragment()).commit();
            }
        });
    }

    private void loadData() {
        contactList.add("+996 999 7427489");
        contactList.add("+996 999 4632649");
        contactList.add("+996 999 8609548");
        contactList.add("+996 999 8508436");
        contactList.add("+996 999 6957658");
        contactList.add("+996 999 8658968");
        contactList.add("+996 999 7787858");
        contactList.add("+996 999 8778844");
        contactList.add("+996 999 8068540");
        contactList.add("+996 999 8859348");
        contactList.add("+996 999 8586895");
        contactList.add("+996 999 8675654");
    }
    }
