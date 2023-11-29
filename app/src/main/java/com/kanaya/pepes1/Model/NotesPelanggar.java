package com.kanaya.pepes1.Model;

import com.google.gson.annotations.SerializedName;

public class NotesPelanggar {
    @SerializedName("idpelanggar")
    private String idpelanggar;
    @SerializedName("namasiswa")
    private String namasiswa;
    @SerializedName("tingkat")
    private String tingkat;
    @SerializedName("jurusan")
    private String jurusan;
    @SerializedName("rombel")
    private String rombel;
    @SerializedName("angkatan")
    private String angkatan;
    @SerializedName("keterangan")
    private String keterangan;
    @SerializedName("point")
    private String point;
    @SerializedName("tanggal")
    private String tanggal;

    public NotesPelanggar(String idpelanggar, String namasiswa, String tingkat, String jurusan, String rombel, String angkatan, String keterangan, String point, String tanggal) {
        this.idpelanggar = idpelanggar;
        this.namasiswa = namasiswa;
        this.tingkat = tingkat;
        this.jurusan = jurusan;
        this.rombel = rombel;
        this.angkatan = angkatan;
        this.keterangan = keterangan;
        this.point = point;
        this.tanggal = tanggal;
    }

    public String getIdpelanggar() {
        return idpelanggar;
    }

    public void setIdpelanggar(String idpelanggar) {
        this.idpelanggar = idpelanggar;
    }

    public String getNamasiswa() {
        return namasiswa;
    }

    public void setNamasiswa(String namasiswa) {
        this.namasiswa = namasiswa;
    }

    public String getTingkat() {
        return tingkat;
    }

    public void setTingkat(String tingkat) {
        this.tingkat = tingkat;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public String getRombel() {
        return rombel;
    }

    public void setRombel(String rombel) {
        this.rombel = rombel;
    }

    public String getAngkatan() {
        return angkatan;
    }

    public void setAngkatan(String angkatan) { this.angkatan = angkatan; }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public String getPoint() {
        return point;
    }

    public void setPoint(String point) {
        this.point = point;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }
}
