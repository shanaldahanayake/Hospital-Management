package org.example.service;

import org.example.dto.Appointment;

import java.util.List;

public interface AppointmentService {
    void addAppointment(Appointment appointment);

    Boolean deleteById(Integer id);

    List<Appointment> findByAdminId(Integer id);

    List<Appointment> findByPatientId(Integer id);

    List<Appointment> findByType(String type);
}
