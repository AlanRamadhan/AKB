package com.example.a10118427_catatanharian;

public class CatatanHarian {
    private String id;
    private String tanggal;
    private String judul;
    private String kategori;
    private String isi;

    public CatatanHarian(String id, String tanggal, String judul, String kategori, String isi) {
        this.id = id;
        this.tanggal = tanggal;
        this.judul = judul;
        this.kategori = kategori;
        this.isi = isi;
    }

    public String getId() {
        return id;
    }

    public String getTanggal() {
        return tanggal;
    }

    public String getJudul() {
        return judul;
    }

    public String getKategori() {
        return kategori;
    }

    public String getIsi() {
        return isi;
    }
}
