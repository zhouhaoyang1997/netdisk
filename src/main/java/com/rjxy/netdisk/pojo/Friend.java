package com.rjxy.netdisk.pojo;

import java.io.Serializable;

public class Friend implements Serializable{
	private int fid;
	private String fMyTel;
	private String fFreindTel;
	private String fUser;
	private String fMemo;
	
	public int getFid() {
		return fid;
	}
	public void setFid(int fid) {
		this.fid = fid;
	}
	public String getfMyTel() {
		return fMyTel;
	}
	public void setfMyTel(String fMyTel) {
		this.fMyTel = fMyTel;
	}
	public String getfFreindTel() {
		return fFreindTel;
	}
	public void setfFreindTel(String fFreindTel) {
		this.fFreindTel = fFreindTel;
	}
	public String getfUser() {
		return fUser;
	}
	public void setfUser(String fUser) {
		this.fUser = fUser;
	}
	public String getfMemo() {
		return fMemo;
	}
	public void setfMemo(String fMemo) {
		this.fMemo = fMemo;
	}
	@Override
	public String toString() {
		return "Friend [fid=" + fid + ", fMyTel=" + fMyTel + ", fFreindTel="
				+ fFreindTel + ", fUser=" + fUser + ", fMemo=" + fMemo + "]";
	}
}
