package com.mochamadahya.mastersiswaidn;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

public class ClassAdapter extends RecyclerView.Adapter<ClassAdapter.ClassViewHolder>{

    // TODO: 2
    private ArrayList<HashMap<String, String>> listDataClass;
    private Context context;

    public ClassAdapter(FragmentActivity activity, ArrayList<HashMap<String, String>> classData) {
        // TODO: 3
        this.context = activity;
        this.listDataClass = classData;
    }

    @NonNull
    @Override
    public ClassAdapter.ClassViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        // memasukkan layout item student ke adapter
        // TODO: 4
        View view = LayoutInflater.from(context).inflate(R.layout.class_item, viewGroup,
                false);
        return new ClassAdapter.ClassViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ClassAdapter.ClassViewHolder classViewHolder, int i) {
        // memanmpilkan data di kompoen layout item student
        // TODO: 8
        classViewHolder.txtNamaClass.setText(listDataClass.get(i).get("namakelas"));
        classViewHolder.txtTeacherid.setText(listDataClass.get(i).get("idguru"));
    }

    @Override
    public int getItemCount() {
        // menentukan jumlah data yang ingin ditampilkan
        // TODO: 5
        return listDataClass.size();
    }

    public class ClassViewHolder extends RecyclerView.ViewHolder {
        // deklarasi
        // TODO: 6
        TextView txtNamaClass, txtTeacherid;

        public ClassViewHolder(@NonNull View itemView) {
            super(itemView);
            // inisialisasi
            // TODO: 7
            txtNamaClass = itemView.findViewById(R.id.item_namaclass);
            txtTeacherid = itemView.findViewById(R.id.item_teacher);
        }
    }
}
