package com.kanaya.pepes1.Model;

import com.google.gson.annotations.SerializedName;

public class Data{

	@SerializedName("iduser")
	private String iduser;
	@SerializedName("idpetugas")
	private String idpetugas;
	@SerializedName("username")
	private String username;

	public void setUserId(String iduser){
		this.iduser = iduser;
	}

	public String getUserId(){
		return iduser;
	}

	public void setUserIdpetugas(String idpetugas){
		this.idpetugas = idpetugas;
	}

	public String getUserIdpetugas(){
		return idpetugas;
	}

	public void setUsername(String username){
		this.username = username;
	}

	public String getUsername(){
		return username;
	}


}