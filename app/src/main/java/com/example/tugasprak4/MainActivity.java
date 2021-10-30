package com.example.tugasprak4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import java.util.ArrayList;
public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private MahasiswaAdapter adapter;
    private ArrayList<Mahasiswa> mahasiswaArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addData();
        recyclerView = (RecyclerView)findViewById(R.id.recyclerview);
        adapter = new MahasiswaAdapter(mahasiswaArrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }
    private void addData() {
        mahasiswaArrayList = new ArrayList<>();
        mahasiswaArrayList.add(new Mahasiswa(R.drawable.angga,"Angga Pratama", "18180995", "2018"));
        mahasiswaArrayList.add(new Mahasiswa(R.drawable.kabul,"AKABUL YUWONO", "18180994", "2018"));
        mahasiswaArrayList.add(new Mahasiswa(R.drawable.toto,"TOTO ALBERTO", "18180993", "2018"));
        mahasiswaArrayList.add(new Mahasiswa(R.drawable.wawan,"WAWAN SULIAWAN", "18180992", "2018"));
        mahasiswaArrayList.add(new Mahasiswa(R.drawable.yudi,"YUDI AJAH", "18180991", "2018"));
    }
}

