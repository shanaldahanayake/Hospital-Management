package org.example.service;

import org.example.dto.Patient;

import java.util.List;

public interface PatientService {
    public List<Patient> getPatient();
    public void addPatient(Patient patient);

    void deletePatient(Integer id);

    List<Patient> findPatientByName(String name);

    List<Patient> findPatientByNIC(String nic);

    List<Patient> findPatientByAddress(String address);

    List<Patient> findPatientByBloodGroup(String bloodGroup);

    List<Patient> findPatientByCategory(String category);

    List<Patient> findPatientByContact(String contact);
}
