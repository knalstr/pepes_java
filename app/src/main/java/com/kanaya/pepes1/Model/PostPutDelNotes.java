package com.kanaya.pepes1.Model;

import com.google.gson.annotations.SerializedName;

public class PostPutDelNotes {
        @SerializedName("status")
        String status;
        @SerializedName("message")
        String message;
        @SerializedName("data")
        NotesPelanggar mNotes;
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
        public NotesPelanggar getHeros() {
            return mNotes;
        }
        public void setHeros(NotesPelanggar NotesPelanggar) {
            mNotes = NotesPelanggar;
        }
    }
