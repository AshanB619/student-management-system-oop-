package com.example.studenet_manegement_system.service.impl;

import com.example.studenet_manegement_system.entity.student;
import com.example.studenet_manegement_system.repositary.studentrepo;
import com.example.studenet_manegement_system.service.studetservice;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class studenserviceimpls implements studetservice {

    private studentrepo studentrepo;
    public studenserviceimpls(studentrepo studentrepo) {
        super();
        this.studentrepo = studentrepo;
    }
    @Override
    public List<student> getAllStudents() {
        return studentrepo.findAll();
    }
}
