package com.victorine;
import java.util.ArrayList;

public class Promotion  {

    private ArrayList <Student> listofstudent;

    //Constructeur
    public Promotion (){
        this.listofstudent = new ArrayList<Student>();
    }

    //Geteur
    public ArrayList <Student> getListofstudent(){
        return this.listofstudent;
    }

    //Method
    public void add(Student _student){
        listofstudent.add(_student);
    }

    public void sortByRegister(){
        for (int i = (listofstudent.size()-1); i >= 0; i--)
        {
            for (int j = 1; j <= i; j++)
            {
                if (listofstudent.get(j-1).compareTo(listofstudent.get(j)) == 1)
                {
                    Student temp = listofstudent.get(j-1);
                    listofstudent.set(j-1, listofstudent.get(j) );
                    listofstudent.set(j, temp);
                }
            }
        }
    }

    public void sortByAverage(){
        for (int i = (listofstudent.size()-1); i >= 0; i--)
        {
            for (int j = 1; j <= i; j++)
            {
                if (listofstudent.get(j-1).compareToAverage(listofstudent.get(j)) == 1)
                {
                    Student temp = listofstudent.get(j-1);
                    listofstudent.set(j-1, listofstudent.get(j) );
                    listofstudent.set(j, temp);
                }
            }
        }
    }



    public Student getBestLab(){
        int max = 0;
        for (int i = 1; i < (listofstudent.size()) ; i++ ){
            if (listofstudent.get(i).lab_score > listofstudent.get(max).lab_score){
                max = i;
            }
        }
        return listofstudent.get(max);
    }

    public void displayPromo(){
        for(Student s : this.listofstudent){
            System.out.println("\nStudent:");
            System.out.println("Register number: "+s.getRegister_number());
            System.out.println("Project grade: "+s.getProject_score());
            System.out.println("Exam grade: "+s.getExam_score());
            System.out.println("Lab grade: "+s.getLab_score());
            System.out.println("Average: "+ String.format("%.2f", s.average()));
        }
    }
}