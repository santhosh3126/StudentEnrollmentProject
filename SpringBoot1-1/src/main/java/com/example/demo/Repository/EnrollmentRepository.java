package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.EnrollmentModel;

public interface EnrollmentRepository extends JpaRepository <EnrollmentModel,Long> {

}
