package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.dto.Appointment;
import org.example.service.AppointmentService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
public class AppointmentController {
    final AppointmentService appointmentService;

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public void addAppointment(@RequestBody Appointment appointment){
        appointmentService.addAppointment(appointment);
    }
    @PutMapping("/update")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void updateAppointment(@RequestBody Appointment appointment){
        appointmentService.addAppointment(appointment);
    }
    @DeleteMapping("/delete/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Boolean deleteAppointment(@PathVariable Integer id){
        return appointmentService.deleteById(id);
    }

    @GetMapping("/find-by-admin-id/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public List<Appointment> findByAdminId(@PathVariable Integer id){
        return appointmentService.findByAdminId(id);
    }

    @GetMapping("/find-by-patient-id/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public List<Appointment> findByPatientId(@PathVariable Integer id){
        return appointmentService.findByPatientId(id);
    }

    @GetMapping("/find-by-type/{type}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public List<Appointment> findByType(@PathVariable String type){
        return appointmentService.findByType(type);
    }

}
