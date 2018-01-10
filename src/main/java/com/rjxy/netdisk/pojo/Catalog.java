package com.rjxy.netdisk.pojo;

public class Catalog {
	private int fid;
	private String ftel;
	private String fCatelog;
	public int getFid() {
		return fid;
	}
	public void setFid(int fid) {
		this.fid = fid;
	}
	public String getFtel() {
		return ftel;
	}
	public void setFtel(String ftel) {
		this.ftel = ftel;
	}
	public String getfCatelog() {
		return fCatelog;
	}
	public void setfCatelog(String fCatelog) {
		this.fCatelog = fCatelog;
	}
	@Override
	public String toString() {
		return "Catelog [fid=" + fid + ", ftel=" + ftel + ", fCatelog="
				+ fCatelog + "]";
	}
}
