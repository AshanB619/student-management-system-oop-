package com.example.studenet_manegement_system;

import com.example.studenet_manegement_system.entity.student;
import com.example.studenet_manegement_system.repositary.studentrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudenetManegementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudenetManegementSystemApplication.class, args);
	}

	@Autowired
	private studentrepo studentrepo;
	@Override
	public void run(String... args) throws Exception {
		student student1=new student("ashan","bandara","ashanbandara352@gmail.com");
		studentrepo.save(student1);

		student student2=new student("nuwandi","bandara","nuwandibandara728@gmail.com");
		studentrepo.save(student2);

		student student3=new student("inupa","bandara","inupa001@gmail.com");
		studentrepo.save(student3);






	}
}
