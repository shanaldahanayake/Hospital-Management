package org.example.service.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.dto.Appointment;
import org.example.entity.AppointmentEntity;
import org.example.repository.AppointmentRepository;
import org.example.service.AppointmentService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class AppointmentServiceImpl implements AppointmentService {
    final AppointmentRepository appointmentRepository;
    final ModelMapper mapper;

    @Override
    public void addAppointment(Appointment appointment) {
        log.info(appointment.toString());
        appointmentRepository.save(mapper.map(appointment, AppointmentEntity.class));
    }

    @Override
    public Boolean deleteById(Integer id) {
        appointmentRepository.deleteById(id);
        return true;
    }

    @Override
    public List<Appointment> findByAdminId(Integer id) {
        List<Appointment> appointmentList=new ArrayList<>();
        appointmentRepository.findByAdminId(id).forEach(entity->{
            appointmentList.add(mapper.map(entity, Appointment.class));
        });
        return appointmentList;
    }

    @Override
    public List<Appointment> findByPatientId(Integer id) {
        List<Appointment> appointmentList=new ArrayList<>();
        appointmentRepository.findByPatientId(id).forEach(entity->{
            appointmentList.add(mapper.map(entity, Appointment.class));
        });
        return appointmentList;
    }

    @Override
    public List<Appointment> findByType(String type) {
        List<Appointment> appointmentList=new ArrayList<>();
        appointmentRepository.findByType(type).forEach(entity->{
            appointmentList.add(mapper.map(entity, Appointment.class));
        });
        return appointmentList;
    }
}
