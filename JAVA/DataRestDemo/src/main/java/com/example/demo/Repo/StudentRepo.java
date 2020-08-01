package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.demo.Model.Student;

@RepositoryRestResource(collectionResourceRel = "Student" , path = "student")
public interface StudentRepo extends JpaRepository<Student, Integer> {

}
