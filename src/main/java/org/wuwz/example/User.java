package org.wuwz.example;

import org.wuwz.poi.ExportConfig;

public class User {

	@ExportConfig(value = "UID", width = 150)
	private Integer uid;

	@ExportConfig(value = "用户名", width = 200)
	private String username;

	@ExportConfig(value = "密码(不可见)", width = 120, isExportData = false)
	private String password;

	@ExportConfig(value = "昵称", width = 200)
	private String nickname;

	private Integer age;

	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "User [uid=" + uid + ", username=" + username + ", password=" + password + ", nickname=" + nickname
				+ ", age=" + age + "]";
	}
}
