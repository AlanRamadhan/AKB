package com.example.a10118427_catatanharian.ui.catatan;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.example.a10118427_catatanharian.BuatCatatan;
import com.example.a10118427_catatanharian.CatatanHarianImp;
import com.example.a10118427_catatanharian.MainActivity;
import com.example.a10118427_catatanharian.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Catatan extends AppCompatActivity {
    public static BuatCatatan bc;
    CatatanHarianImp dbcenter;
    protected Cursor cursor;
    String[] daftar;
    RecyclerView recyclerView01;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tools);


        FloatingActionButton fab = (FloatingActionButton)findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Catatan.this, BuatCatatan.class);
                startActivity(intent);

            }
        });


}

}
