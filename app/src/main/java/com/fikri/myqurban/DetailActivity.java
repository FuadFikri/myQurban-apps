package com.fikri.myqurban;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {
    public static final String EXTRA_JENIS = "extra_jenis";
    public static final String EXTRA_BOBOT = "extra_bobot";
    public static final String EXTRA_HARGA = "extra_harga";
    public static final String EXTRA_DESKRIPSI = "extra_deskripsi";
    public static final String EXTRA_PHOTO= "extra_photo";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        TextView tvJenis = findViewById(R.id.jenis);
        TextView tvBobot = findViewById(R.id.bobot);
        TextView tvHarga = findViewById(R.id.harga);
        TextView tvDeskripsi= findViewById(R.id.deskripsi);
        ImageView detailImageView= findViewById(R.id.img_detail_photo);

        String jenis = getIntent().getStringExtra(EXTRA_JENIS);
        String bobot = getIntent().getStringExtra(EXTRA_BOBOT);
        String harga = getIntent().getStringExtra(EXTRA_HARGA);
        String deskripsi = getIntent().getStringExtra(EXTRA_DESKRIPSI);
        String photo = getIntent().getStringExtra(EXTRA_PHOTO);

        tvJenis.setText(jenis);
        tvBobot.setText(bobot);
        tvHarga.setText(harga);
        tvDeskripsi.setText(deskripsi);
        Glide.with(this).load(photo).into(detailImageView);
    }
}
