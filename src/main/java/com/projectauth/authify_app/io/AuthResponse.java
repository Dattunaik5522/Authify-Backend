package com.projectauth.authify_app.io;


import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class AuthResponse {
    private  String email;
    private String token;
}
