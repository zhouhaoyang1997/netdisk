package com.rjxy.netdisk.pojo;

public class Log {
	private int fid;
	private String fTime;
	private String fTel;
	private String fType;
	private int fDocId;
	private String fResult;
	public int getFid() {
		return fid;
	}
	public void setFid(int fid) {
		this.fid = fid;
	}
	public String getfTime() {
		return fTime;
	}
	public void setfTime(String fTime) {
		this.fTime = fTime;
	}
	public String getfTel() {
		return fTel;
	}
	public void setfTel(String fTel) {
		this.fTel = fTel;
	}
	public String getfType() {
		return fType;
	}
	public void setfType(String fType) {
		this.fType = fType;
	}
	public int getfDocId() {
		return fDocId;
	}
	public void setfDoc(int fDoc) {
		this.fDocId = fDoc;
	}
	public String getfResult() {
		return fResult;
	}
	public void setfResult(String fResult) {
		this.fResult = fResult;
	}
	@Override
	public String toString() {
		return "Log [fid=" + fid + ", fTime=" + fTime + ", fTel=" + fTel
				+ ", fType=" + fType + ", fDoc=" + fDocId + ", fResult="
				+ fResult + "]";
	}
}
