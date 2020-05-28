package com.codeboard.CodeBoardSpecialities.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.codeboard.CodeBoardSpecialities.entity.Patient;

@RepositoryRestResource( collectionResourceRel="CodeBoardPatients", path="patients")
public interface PatientRepository extends JpaRepository<Patient, Integer> {

}
