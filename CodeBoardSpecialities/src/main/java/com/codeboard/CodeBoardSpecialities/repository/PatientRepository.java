package com.codeboard.CodeBoardSpecialities.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.codeboard.CodeBoardSpecialities.entity.Patient;

@RepositoryRestResource( collectionResourceRel="CodeBoardPatients", path="patients")
@CrossOrigin("http://localhost:4200")
public interface PatientRepository extends JpaRepository<Patient, Integer> {

}
