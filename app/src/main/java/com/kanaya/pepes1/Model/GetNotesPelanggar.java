package com.kanaya.pepes1.Model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GetNotesPelanggar {
    @SerializedName("status")
    String status;
    @SerializedName("message")
    String message;
    @SerializedName("data")
    List<NotesPelanggar> listDataNotesPelanggar;

    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }

    public List<NotesPelanggar> getListDataNotesPelanggar() {
        return listDataNotesPelanggar;
    }
    public void setListDataNotesPelanggar(List<NotesPelanggar> listDataNotesPelanggar) {
        this.listDataNotesPelanggar = listDataNotesPelanggar;
    }
}
