package com.example.a10118427_catatanharian;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CatatanHarianAdapter extends RecyclerView.Adapter<CatatanHarianAdapter.CatatanHarianViewHolder> {

    private List<CatatanHarian> catatanList;

    public CatatanHarianAdapter(List<CatatanHarian> makanList) {
        this.catatanList = catatanList;
    }

    protected void onClick(int posision){}


    @NonNull
    @Override
    public CatatanHarianViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.items, null, false);
        return new CatatanHarianViewHolder(view) ;
    }

    @Override
    public void onBindViewHolder(@NonNull CatatanHarianViewHolder holder, int position) {



    }

    @Override
    public int getItemCount() {
        return catatanList.size();
    }





    public class CatatanHarianViewHolder extends RecyclerView.ViewHolder{

        private TextView tv_judul;
        private TextView tv_kategori, tv_isi;

        public CatatanHarianViewHolder(@NonNull View itemView) {
            super(itemView);

            tv_judul = itemView.findViewById(R.id.tv_judul);
            tv_kategori = itemView.findViewById(R.id.tv_kategori);
            tv_isi = itemView.findViewById(R.id.tv_isi);
        }
    }
}
