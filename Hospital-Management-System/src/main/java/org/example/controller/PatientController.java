package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.dto.Patient;
import org.example.service.PatientService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/patient")
@RequiredArgsConstructor
public class PatientController {
    final PatientService patientService;

    @GetMapping("/get-all")
    public List<Patient> getPatient(){
        return patientService.getPatient();
    }

    @PostMapping("/add-patient")
    @ResponseStatus(HttpStatus.CREATED)
    public void addPatient(@RequestBody Patient patient){
        patientService.addPatient(patient);
    }

    @DeleteMapping("/delete-by-id/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deletePatient(@PathVariable Integer id){ patientService.deletePatient(id); }

    @PutMapping("/update-patient")
    @ResponseStatus(HttpStatus.OK)
    public void updatePatient(@RequestBody Patient patient){
        patientService.addPatient(patient);
    }

    @GetMapping("/find-by-name/{name}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public List<Patient> findPatientByName(@PathVariable String name){ return patientService.findPatientByName(name); }

    @GetMapping("/find-by-nic/{nic}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public List<Patient> findPatientByNIC(@PathVariable String nic){ return patientService.findPatientByNIC(nic); }

    @GetMapping("/find-by-address/{address}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public List<Patient> findPatientByAddress(@PathVariable String address){ return patientService.findPatientByAddress(address); }

    @GetMapping("/find-by-bloodGroup/{bloodGroup}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public List<Patient> findPatientByBloodGroup(@PathVariable String bloodGroup){ return patientService.findPatientByBloodGroup(bloodGroup); }

    @GetMapping("/find-by-category/{category}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public List<Patient> findPatientByCategory(@PathVariable String category){ return patientService.findPatientByCategory(category); }

    @GetMapping("/find-by-contact/{contact}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public List<Patient> findPatientByContact(@PathVariable String contact){ return patientService.findPatientByContact(contact); }


}
