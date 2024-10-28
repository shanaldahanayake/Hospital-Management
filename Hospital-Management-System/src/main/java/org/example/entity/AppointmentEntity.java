package org.example.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "Appointment")
public class AppointmentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
