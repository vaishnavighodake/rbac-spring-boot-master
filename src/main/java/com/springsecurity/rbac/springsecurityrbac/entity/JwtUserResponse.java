package com.springsecurity.rbac.springsecurityrbac.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JwtUserResponse {
    private String token;
    private LocalDateTime expiry;
}
