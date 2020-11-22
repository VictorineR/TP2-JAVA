package com.victorine;

public class Student {
    protected String register_number;
    private double project_score;
    private double exam_score;
    double lab_score;

    //Constructor
    public Student (String _register_number, double _project_score, double _exam_score, double _lab_score) throws InvalidNoteException {

        if (_project_score < 0 || _project_score > 20 || _exam_score < 0 || _exam_score > 20 || _lab_score < 0 || _lab_score > 20 )
            throw new InvalidNoteException("IT IS WRONG");

        this.register_number = _register_number;
        this.project_score = _project_score;
        this.exam_score = _exam_score;
        this.lab_score = _lab_score;
    }

    //Getters
    public String getRegister_number(){
        return this.register_number;
    }
    public double getProject_score(){
        return this.project_score;
    }
    public double getExam_score(){
        return this.exam_score;
    }
    public double getLab_score(){
        return this.lab_score;
    }

    //Setter
    public void setRegister_number(String _register_number){
        this.register_number = _register_number;
    }
    public void setProject_score(double _project_score){
        this.project_score = _project_score;
    }
    public void setExam_score(double _exam_score){
        this.exam_score = _exam_score;
    }
    public void setLab_score(double _lab_score){
        this.lab_score = _lab_score;
    }

    //The Exceptions:
    public static class InvalidNoteException extends Exception{
        public InvalidNoteException (String error){
            super(error);
        }
    }

    //Fonctions:
    public double average(){
        double a;
        a = (project_score*3 + exam_score*2 + lab_score*2)/7;
        return a;
    }

    @Override
    public String toString(){ //quand tu veux print qqlch  quand on utilise println
        return register_number;
    }

    public int compareTo(Student student){
        int i = Integer.parseInt(this.register_number);
        int j = Integer.parseInt(student.register_number);

        if (i == j){
            return 0;
        }else if (i < j){
            return -1;
        } else {
            return 1;
        }
        // return Integer.compare(i, j); ---> maniere plus simple de l'écrir


    }

    public double compareToAverage(Student student){
        double i = this.average();
        double j = student.average();

        return Double.compare(i, j);
    }


}
