package com.projectauth.authify_app.io;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class ResetPasswordRequest {

    @NotBlank(message = "Password Required")
    private String newPassword;
    @NotBlank(message = "OTP Required")
    private String otp;
    @NotBlank(message = "Email Required")
    private String email;
}
