package org.example.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.dto.Patient;
import org.example.entity.PatientEntity;
import org.example.repository.PatientRepository;
import org.example.service.PatientService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PatientServiceImpl implements PatientService {


    final PatientRepository repository;
    final ModelMapper mapper;

    List<Patient> patients=new ArrayList<>();
    @Override
    public List<Patient> getPatient() {
        for (PatientEntity patientEntity : repository.findAll()) {
            patients.add(mapper.map(patientEntity,Patient.class));
        }
        return patients;
    }

    @Override
    public void addPatient(Patient patient) {
        repository.save(mapper.map(patient, PatientEntity.class));
    }

    @Override
    public void deletePatient(Integer id) {

    }

    @Override
    public List<Patient> findPatientByName(String name) {
        return List.of();
    }

    @Override
    public List<Patient> findPatientByNIC(String nic) {
        return List.of();
    }

    @Override
    public List<Patient> findPatientByAddress(String address) {
        return List.of();
    }

    @Override
    public List<Patient> findPatientByBloodGroup(String bloodGroup) {
        return List.of();
    }

    @Override
    public List<Patient> findPatientByCategory(String category) {
        return List.of();
    }

    @Override
    public List<Patient> findPatientByContact(String contact) {
        return List.of();
    }
}
