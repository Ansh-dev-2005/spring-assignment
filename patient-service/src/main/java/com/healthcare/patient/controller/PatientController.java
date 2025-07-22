package com.healthcare.patient.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.jwt.Jwt;

@RestController
public class PatientController {
    @GetMapping("/patient/info")
    public String getPatientInfo(@AuthenticationPrincipal Jwt jwt) {
        // Example: return user info from JWT
        return "Patient info for user: " + jwt.getSubject();
    }
}
