package com.pauloricardo.security;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordGenerator {
	  
	  public static void main(String[] args) {
	    BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
	    String rawPassword = "prfultra";
	    String encodedPassword = encoder.encode(rawPassword);
	    
	    System.out.println(encodedPassword);
	  }
	  
	}

