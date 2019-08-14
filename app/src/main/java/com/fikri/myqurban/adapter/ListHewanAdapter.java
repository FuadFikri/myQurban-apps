package com.fikri.myqurban.adapter;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.fikri.myqurban.DetailActivity;
import com.fikri.myqurban.R;
import com.fikri.myqurban.model.Hewan;

import java.util.ArrayList;

public class ListHewanAdapter extends RecyclerView.Adapter<ListHewanAdapter.ListViewHolder> {
    private ArrayList<Hewan> listHewan;

    public ListHewanAdapter(ArrayList<Hewan> list) {
        this.listHewan = list;
    }

    @NonNull
    @Override
    public ListHewanAdapter.ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_hewan, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        Hewan hewan = listHewan.get(position);

        Glide.with(holder.itemView.getContext())
                .load(hewan.getPhoto())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.imgPhoto);
        holder.tvJenis.setText(hewan.getJenis());
        holder.tvHarga.setText(hewan.getHarga());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Hewan selectedHewan = listHewan.get(holder.getAdapterPosition());
                Intent intent = new Intent(holder.itemView.getContext(), DetailActivity.class);
                intent.putExtra(DetailActivity.EXTRA_JENIS, selectedHewan.getJenis());
                intent.putExtra(DetailActivity.EXTRA_BOBOT, selectedHewan.getBobot());
                intent.putExtra(DetailActivity.EXTRA_HARGA, selectedHewan.getHarga());
                intent.putExtra(DetailActivity.EXTRA_DESKRIPSI, selectedHewan.getDeskripsi());
                intent.putExtra(DetailActivity.EXTRA_PHOTO, selectedHewan.getPhoto());
                holder.itemView.getContext().startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return listHewan.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvJenis, tvHarga;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvJenis = itemView.findViewById(R.id.tv_item_jenis);
            tvHarga = itemView.findViewById(R.id.tv_item_harga);
        }
    }
}
