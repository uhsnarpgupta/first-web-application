package com.uhsnarp.login;

import org.springframework.stereotype.Service;

@Service
public class LoginService {
	public boolean validateUser(String user, String password) {
		if (user.equals("pran") && password.equals("uhsnarp")) {
			return true;
		}
		return false;
	}
}
