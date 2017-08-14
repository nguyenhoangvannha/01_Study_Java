package quanlycongvan.model;

import java.io.Serializable;

public class NguoiDung implements Serializable{
	public NguoiDung() {
		
	}
	
	public NguoiDung(int iD, String userName, String passWord, String name) {
		super();
		ID = iD;
		this.userName = userName;
		this.passWord = passWord;
		this.name = name;
	}

	private int ID;
	private String userName;
	private String passWord;
	private String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	
	
}
