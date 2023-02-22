package mz;

import java.sql.Blob;

public class MZ_tbl {
	int mzUid;
	String userName;
	String MzCode;
	String MzTitle;
	double MzStar;
	String MzHours;
	int	MzHit;
	String MzAddr;
	Blob mzImg;
	Blob mzImg2;
	
	public int getMzUid() {
		return mzUid;
	}
	public void setMzUid(int mzUid) {
		this.mzUid = mzUid;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getMzCode() {
		return MzCode;
	}
	public void setMzCode(String mzCode) {
		MzCode = mzCode;
	}
	public String getMzTitle() {
		return MzTitle;
	}
	public void setMzTitle(String mzTitle) {
		MzTitle = mzTitle;
	}
	public double getMzStar() {
		return MzStar;
	}
	public void setMzStar(double mzStar) {
		MzStar = mzStar;
	}
	public String getMzHours() {
		return MzHours;
	}
	public void setMzHours(String mzHours) {
		MzHours = mzHours;
	}
	public int getMzHit() {
		return MzHit;
	}
	public void setMzHit(int mzHit) {
		MzHit = mzHit;
	}
	public String getMzAddr() {
		return MzAddr;
	}
	public void setMzAddr(String mzAddr) {
		MzAddr = mzAddr;
	}
	public Blob getMzImg() {
		return mzImg;
	}
	public void setMzImg(Blob mzImg) {
		this.mzImg = mzImg;
	}
	public Blob getMzImg2() {
		return mzImg2;
	}
	public void setMzImg2(Blob mzImg2) {
		this.mzImg2 = mzImg2;
	}
	
	
}
