package quzi;

import java.util.HashMap;

public class Win10DTO {
	HashMap<String, String> info = new HashMap<>();
	private String clac, notepad;
	private String msg;
	public HashMap<String, String> getInfo() {
		return info;
	}
	public void setInfo(HashMap<String, String> info) {
		this.info = info;
	}
	public String getClac() {
		return clac;
	}
	public void setClac(String clac) {
		this.clac = clac;
	}
	public String getNotepad() {
		return notepad;
	}
	public void setNotepad(String notepad) {
		this.notepad = notepad;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
}
