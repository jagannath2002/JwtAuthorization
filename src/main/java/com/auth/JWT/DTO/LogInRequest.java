package com.auth.JWT.DTO;

import lombok.Data;

@Data
public class LogInRequest {

	private String email;
	private String password;
}
