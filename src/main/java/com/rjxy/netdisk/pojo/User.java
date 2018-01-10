package com.rjxy.netdisk.pojo;

public class User {
	private String fTel;
	private String fPassword;
	private String fUser;
	private String fLevel;
	private String fPhoto;
	private int fScore;
	private String fIntroduction;
	private int fSize;
	private String fRegist;
	private String fMemo;
	public String getfTel() {
		return fTel;
	}
	public void setfTel(String fTel) {
		this.fTel = fTel;
	}
	public String getfPassword() {
		return fPassword;
	}
	public void setfPassword(String fPassword) {
		this.fPassword = fPassword;
	}
	public String getfUser() {
		return fUser;
	}
	public void setfUser(String fUser) {
		this.fUser = fUser;
	}
	public String getfLevel() {
		return fLevel;
	}
	public void setfLevel(String fLevel) {
		this.fLevel = fLevel;
	}
	public String getfPhoto() {
		return fPhoto;
	}
	public void setfPhoto(String fPhoto) {
		this.fPhoto = fPhoto;
	}
	public int getfScore() {
		return fScore;
	}
	public void setfScore(int fScore) {
		this.fScore = fScore;
	}
	public String getfIntroduction() {
		return fIntroduction;
	}
	public void setfIntroduction(String fIntroduction) {
		this.fIntroduction = fIntroduction;
	}
	public int getfSize() {
		return fSize;
	}
	public void setfSize(int fSize) {
		this.fSize = fSize;
	}
	public String getfRegist() {
		return fRegist;
	}
	public void setfRegist(String fRegist) {
		this.fRegist = fRegist;
	}
	public String getfMemo() {
		return fMemo;
	}
	public void setfMemo(String fMemo) {
		this.fMemo = fMemo;
	}
	@Override
	public String toString() {
		return "User [fTel=" + fTel + ", fPassword=" + fPassword + ", fUser="
				+ fUser + ", fLevel=" + fLevel + ", fPhoto=" + fPhoto
				+ ", fScore=" + fScore + ", fIntroduction=" + fIntroduction
				+ ", fSize=" + fSize + ", fRegist=" + fRegist + ", fMemo="
				+ fMemo + "]";
	}
	
}
