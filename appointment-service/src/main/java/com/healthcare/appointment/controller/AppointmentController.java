package com.healthcare.appointment.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.jwt.Jwt;

@RestController
public class AppointmentController {
    @GetMapping("/appointment/info")
    public String getAppointmentInfo(@AuthenticationPrincipal Jwt jwt) {
        // Example: return appointment info for authenticated user
        return "Appointment info for user: " + jwt.getSubject();
    }
}
