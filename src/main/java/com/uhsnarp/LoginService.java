package com.uhsnarp;

public class LoginService {
	public boolean isUserValid(String user, String password) {
		if(user.equals("pran") && password.equals("uhsnarp")) {
			return true;
		}
		return false;
	}
}
