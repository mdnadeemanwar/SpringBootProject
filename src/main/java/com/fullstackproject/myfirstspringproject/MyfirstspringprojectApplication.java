package com.fullstackproject.myfirstspringproject;

import com.fullstackproject.myfirstspringproject.dao.StudentDao;
import com.fullstackproject.myfirstspringproject.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;

import java.security.PublicKey;
import java.util.List;

@SpringBootApplication
public class MyfirstspringprojectApplication {

	public static void main(String[] args) {
        SpringApplication.run(MyfirstspringprojectApplication.class, args);
	}

    @Bean
    public CommandLineRunner commandLineRunner(StudentDao studentDao){
        return runner->{
//            createStudent(studentDao);
              createMultipleStudent(studentDao);
//            readStudent(studentDao);
//            findAllStudent(studentDao);
//            findByLastName(studentDao);
//            update(studentDao);
//            delete(studentDao);
//            deleteAll(studentDao);
        };
    }

    public void createStudent(StudentDao studentDao){

        //create a new student obj
        System.out.println("Creating a new studnet object ");
        Student tempStudent = new Student("nad","anwar","anwarnadeem2010@gmail.com");

        //save the student obj
        System.out.println("saving the student data..");
        studentDao.save(tempStudent);

        //display id of the student obj
        System.out.println("Saved the student generated id"+tempStudent.getId());


    }

    public void createMultipleStudent(StudentDao studentDao){
        //create a multiple student

        System.out.println("creating the 3 student ");

        Student s1 = new Student("raman","kmr","ramankmr@gmail.com");
        Student s2 = new Student("sohan","kumar","soham124@gmail.com");
        Student s3 = new Student("sam","altman","sam2025@gmail.com");

        //save the all student

        System.out.println("saving the all 3 students");
        studentDao.save(s1);
        studentDao.save(s2);
        studentDao.save(s3);


    }

    public void readStudent(StudentDao studentDao){

        Student newStudent = new Student("Khan","Tanveer","khantanveer@gmail.com");

        //saving above student
        studentDao.save(newStudent);

        // see the saved student id
        System.out.println("After Saving see the added student id "+newStudent.getId());

        //get the saved student

        Student seeTheSavedStudent = studentDao.findByID(newStudent.getId());
        System.out.println("The get student id is "+ seeTheSavedStudent);


    }

    public void findAllStudent(StudentDao studentDao){
        List<Student> theStudent = studentDao.findAll();
        for(Student tempStudent : theStudent){
            System.out.println("The getting students are"+tempStudent);
        }
    }

    public void findByLastName(StudentDao studentDao){
        List<Student> theStudent = studentDao.findByLastName("kumar");

        for(Student tempstudent : theStudent){
            System.out.println("The extracted students are"+tempstudent);
        }
    }

    public void update(StudentDao studentDao){
        int studnetId = 1;

        Student mystudent = studentDao.findByID(studnetId);
        //change firstname to john
        mystudent.setFirstName("John");
        studentDao.update(mystudent);
        System.out.println("The updated name is "+mystudent);
    }

    public void delete(StudentDao studentDao){
        int studentId = 5;

        System.out.println("Deleting the student id"+studentId);

        studentDao.delete(studentId);


    }


    public void deleteAll(StudentDao studentDao){

        System.out.println("Deleting all student");

        int noOfRowDeleted = studentDao.deleteAll();

        System.out.println("No of row delete"+noOfRowDeleted);
    }

}