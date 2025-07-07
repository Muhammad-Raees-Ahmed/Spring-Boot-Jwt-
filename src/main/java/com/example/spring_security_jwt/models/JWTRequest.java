package com.example.spring_security_jwt.models;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class JWTRequest {

    private String userName;
    private String password;
}
