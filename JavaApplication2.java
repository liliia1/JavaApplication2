/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import javaapplication2.institution.University;
import javaapplication2.institution.interlink.Internship;
import javaapplication2.person.Student;

public class JavaApplication2 {

   
    public static void main(String[] args) {
        // TODO code application logic here
        University university = new University("CH.U.I.");
        university.addStudent(new Student("Andrew Kostenko", 75));
        university.addStudent(new Student("Julia Veselkina", 100));
        university.addStudent(new Student("Maria Perechrest", 90));
        //University university = new University("CH.U.I.");
        //university.addStudent(new Student("Andrew Kostenko"));
        //university.addStudent(new Student("Julia Veselkina"));
        //university.addStudent(new Student("Maria Perechrest"));

        //Internship internship = new Internship("Interlink");
        //System.out.println("List of internship's students:");
        //System.out.println(internship.getStudents());
        

    }
    


    
}
