package org.example.dto;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Appointment {
    private Integer id;
    private String type;
    private String qr;
    private LocalDateTime dateTime;
    private String description;
    private String status;
    private Integer roomNumber;
    private Integer queNumber;
    private Integer patientId;
    private Integer adminId;
}
