package org.example.repository.impl;

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
public class PatientRepositoryImpl implements PatientService {
    List<Patient> patientList = new ArrayList<>();

    final PatientRepository patientRepository;
    final ModelMapper modelMapper;

    @Override
    public List<Patient> getPatient() {
        List<Patient> patients = new ArrayList<>();
        patientRepository.findAll().forEach(patientEntity -> {
            patients.add(modelMapper.map(patientEntity, Patient.class));
        });
        return patients;
    }

    @Override
    public void addPatient(Patient patient) {
        patientRepository.save(modelMapper.map(patient, PatientEntity.class));
    }

    @Override
    public void deletePatient(Integer id) {
        patientRepository.deleteById(id);
    }

    @Override
    public List<Patient> findPatientByName(String name) {
        List<Patient> patients = new ArrayList<>();
        patientRepository.findByName(name).forEach(entity->{
            patients.add(modelMapper.map(entity,Patient.class));
        });
        return patients;
    }

    @Override
    public List<Patient> findPatientByNIC(String nic) {
        List<Patient> patients = new ArrayList<>();
        patientRepository.findByNic(nic).forEach(entity->{
            patients.add(modelMapper.map(entity,Patient.class));
        });
        return patients;
    }

    @Override
    public List<Patient> findPatientByAddress(String address) {
        List<Patient> patients = new ArrayList<>();
        patientRepository.findByAddress(address).forEach(entity->{
            patients.add(modelMapper.map(entity,Patient.class));
        });
        return patients;
    }

    @Override
    public List<Patient> findPatientByBloodGroup(String bloodGroup) {
        List<Patient> patients = new ArrayList<>();
        patientRepository.findByBloodGroup(bloodGroup).forEach(entity->{
            patients.add(modelMapper.map(entity,Patient.class));
        });
        return patients;
    }

    @Override
    public List<Patient> findPatientByCategory(String category) {
        List<Patient> patients = new ArrayList<>();
        patientRepository.findByCategory(category).forEach(entity->{
            patients.add(modelMapper.map(entity,Patient.class));
        });
        return patients;
    }

    @Override
    public List<Patient> findPatientByContact(String contact) {
        List<Patient> patients = new ArrayList<>();
        patientRepository.findByContact(contact).forEach(entity->{
            patients.add(modelMapper.map(entity,Patient.class));
        });
        return patients;
    }
}
