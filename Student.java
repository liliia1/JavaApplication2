/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2.person;


import javaapplication2.person.consciousness.Knowledge;

public class Student {
    
    private String FULLNAME;
    private int averageMark;
 
    //конструктор
    public Student (String _FULLNAME, int _averageMark) {
        FULLNAME = _FULLNAME;
        averageMark = _averageMark;
    }

    
    public String getFULLNAME() {
        return FULLNAME;
    }
    
    public void setFULLNAME(String _FULLNAME) {
        FULLNAME = _FULLNAME;
    }
    
    public int getAverageMark() {
        return averageMark;
    }
    
    public void setAverageMark(int _averageMark) {
        averageMark = _averageMark;
    }
    
    //вывод информации о студенте в консоль
    public void println() {
        System.out.println(FULLNAME + " " + averageMark);
    }
}
    

    //public void setKnowledge(Knowledge knowledge) {
        //TODO: Implementation is needed
   // }
//}