package com.alxkls.mfcore.map;

import jakarta.persistence.Entity;
import lombok.*;
import org.springframework.cloud.openfeign.EnableFeignClients;

public record MFUser(String name, double startCapital, String currency) {
}
