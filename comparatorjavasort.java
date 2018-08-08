/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2.comparatorjavasort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import javaapplication2.person.Student;

public class comparatorjavasort {
    
    static void fillStudentsArrayList(ArrayList<Student> students) {

        students.add(new Student("Andrew Kostenko", 75));
        students.add(new Student("Julia Veselkina", 100));
        students.add(new Student("Maria Perechrest", 90));
    }
    
    //компаратор ("сравниватель") для сравнения по среднему баллу
    static Comparator<Student> compareByAverageMark = new Comparator<Student>() {
        @Override
        public int compare(Student o1, Student o2) {

            if(o1.getAverageMark() < o2.getAverageMark()) {
                return -1;
            } else if(o1.getAverageMark() > o2.getAverageMark()) {
                return 1;
            } else {
                return 0;
            }
        }
    };
    
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<Student>();

        fillStudentsArrayList(students);

        for (Student s : students) {
            s.println();
        }

        Collections.sort(students, compareByAverageMark);

        //сортировка в обратном порядке
       

        System.out.println();
        System.out.println("Отсортированные данные:");
        System.out.println();

        for (Student s : students) {
            s.println();
        }
    }
} 

