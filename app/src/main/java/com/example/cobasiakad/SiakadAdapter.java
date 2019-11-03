package com.example.cobasiakad;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SiakadAdapter extends RecyclerView.Adapter<SiakadAdapter.SiakadHolder> {
    Context context;
    ArrayList <SiakadModel> siakadModels;
    public SiakadAdapter(Context context, ArrayList<SiakadModel> siakadModels) {
        this.context = context;
        this.siakadModels = siakadModels;
    }


    @NonNull
    @Override
    public SiakadAdapter.SiakadHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.siakad_list,parent,false);
        return new SiakadHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SiakadAdapter.SiakadHolder holder, final int position) {
        holder.semester.setText(siakadModels.get(position).semester);
        holder.matkul1.setText(siakadModels.get(position).matkul1);
        holder.matkul2.setText(siakadModels.get(position).matkul2);
        holder.matkul3.setText(siakadModels.get(position).matkul3);
        holder.matkul4.setText(siakadModels.get(position).matkul4);
        holder.matkul5.setText(siakadModels.get(position).matkul5);
        holder.matkul6.setText(siakadModels.get(position).matkul6);
        holder.sks1.setText(siakadModels.get(position).sks1);
        holder.sks2.setText(siakadModels.get(position).sks2);
        holder.sks3.setText(siakadModels.get(position).sks3);
        holder.sks4.setText(siakadModels.get(position).sks4);
        holder.sks5.setText(siakadModels.get(position).sks5);
        holder.sks6.setText(siakadModels.get(position).sks6);
        holder.total.setText(siakadModels.get(position).total);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context,Overview.class);
                intent.putExtra("semeter",siakadModels.get(position).semester);
                intent.putExtra("matkul1",siakadModels.get(position).matkul1);
                intent.putExtra("matkul2",siakadModels.get(position).matkul2);
                intent.putExtra("matkul3",siakadModels.get(position).matkul3);
                intent.putExtra("matkul4",siakadModels.get(position).matkul4);
                intent.putExtra("matkul5",siakadModels.get(position).matkul5);
                intent.putExtra("matkul6",siakadModels.get(position).matkul6);
                intent.putExtra("sks1",siakadModels.get(position).sks1);
                intent.putExtra("sks2",siakadModels.get(position).sks2);
                intent.putExtra("sks3",siakadModels.get(position).sks3);
                intent.putExtra("sks4",siakadModels.get(position).sks4);
                intent.putExtra("sks5",siakadModels.get(position).sks5);
                intent.putExtra("sks6",siakadModels.get(position).sks6);
                intent.putExtra("totalsks",siakadModels.get(position).total);
                context.startActivity(intent);

            }
        });
    }

    @Override
    public int getItemCount() {
        return siakadModels.size();
    }

    public class SiakadHolder extends RecyclerView.ViewHolder {
        TextView semester,matkul1,matkul2,matkul3,matkul4,matkul5,matkul6,sks1,sks2,sks3,sks4,sks5,sks6,total;
        public SiakadHolder(@NonNull View itemView) {
            super(itemView);
            semester = itemView.findViewById(R.id.semester);
            matkul1 = itemView.findViewById(R.id.matkul1);
            matkul2 = itemView.findViewById(R.id.matkul2);
            matkul3 = itemView.findViewById(R.id.matkul3);
            matkul4 = itemView.findViewById(R.id.matkul4);
            matkul5 = itemView.findViewById(R.id.matkul5);
            matkul6 = itemView.findViewById(R.id.matkul6);
            sks1 = itemView.findViewById(R.id.sks1);
            sks2 = itemView.findViewById(R.id.sks2);
            sks3 = itemView.findViewById(R.id.sks3);
            sks4 = itemView.findViewById(R.id.sks4);
            sks5 = itemView.findViewById(R.id.sks5);
            sks6 = itemView.findViewById(R.id.sks6);
            total = itemView.findViewById(R.id.totalsks);
        }
    }
}
