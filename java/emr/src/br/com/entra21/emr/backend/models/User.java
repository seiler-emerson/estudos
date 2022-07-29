package br.com.entra21.emr.backend.models;

import java.time.LocalDate;
import java.time.LocalTime;

import br.com.entra21.emr.backend.login.area.emr.crud.TypeUser;

public class User {
	private String user;
	private Integer password;
	private LocalDate createDate;
	private LocalTime createTime;
	private Enum<TypeUser> typeUser;
	
	public User() {
		super();
	}

	public User(String user, Integer password, LocalDate createDate, LocalTime createTime, Enum<TypeUser> typeUser) {
		super();
		this.user = user;
		this.password = password;
		this.createDate = createDate;
		this.createTime = createTime;
		this.typeUser = typeUser;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public Integer getPassword() {
		return password;
	}

	public void setPassword(Integer password) {
		this.password = password;
	}

	public LocalDate getCreateDate() {
		return createDate;
	}

	public void setCreateDate(LocalDate createDate) {
		this.createDate = createDate;
	}

	public LocalTime getCreateTime() {
		return createTime;
	}

	public void setCreateTime(LocalTime createTime) {
		this.createTime = createTime;
	}

	public Enum<TypeUser> getTypeUser() {
		return typeUser;
	}

	public void setTypeUser(Enum<TypeUser> typeUser) {
		this.typeUser = typeUser;
	}
	
	public static void createMessage(String user) {
		System.out.println("The user registration "+user+" was successful!");
	}
	
	public static void editMessage(String user) {
		System.out.println("The user selected "+user+" was successful!");
	}
	
	public static void deleteMessage(String user) {
		System.out.println("The user selected "+user+" was successfully deleted!");
	}
}
