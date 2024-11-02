package com.example.studenet_manegement_system.repositary;

import com.example.studenet_manegement_system.entity.student;
import org.springframework.data.jpa.repository.JpaRepository;


public interface studentrepo extends JpaRepository<student,Long> {

}
