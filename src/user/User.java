package user;

import java.io.Serializable;


public class User implements Serializable
{
	private static final long serialVersionUID = 12L;
	
	private String username;
	private String name;
	private String surname;
	private String password;
	private String creditCard;
	private String address;
	
	private Cart myCart;
	
	private int checkNo;

	public User(String usernam, String nam, String surnam, String pass, String credit, String addre , Cart cart , int check)
	{
		username = usernam;
		name =nam;
		surname = surnam;
		password = pass;
		creditCard = credit;
		address = addre;
		myCart = cart;
		checkNo = check;
	}
	//-----------getset----------\\
	
	
	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public void setUsername(String username) {
		this.username = username;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getCreditCard() {
		return creditCard;
	}

	public void setCreditCard(String creditCard) {
		this.creditCard = creditCard;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Cart getMyCart() {
		return myCart;
	}

	public void setMyCart(Cart myCart) {
		this.myCart = myCart;
	}

	public int getCheckNo() {
		return checkNo;
	}

	public void setCheckNo(int checkNo) {
		this.checkNo = checkNo;
	}




}
