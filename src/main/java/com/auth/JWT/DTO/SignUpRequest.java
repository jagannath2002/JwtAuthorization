package com.auth.JWT.DTO;

import lombok.Data;

@Data
public class SignUpRequest {

	private String name;
	private String email;
	private String password;
}
