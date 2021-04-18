/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teststudent;

/**
 *
 * @author Admin
 */
public class Student {
    private String name;
    private double totalScore;
    private int numberOfQuizzes;
    private String quizList="";
    
    
    public Student(String name) {
        if(name==null)
            throw new IllegalArgumentException("The given reference isn't referring to an object!");
        this.name=name;
    }
    public Student (String name, double score){
        if(score<0)
            throw new IllegalArgumentException("Score cannot be less than zero!");
        this.name=name;
//        this.totalScore+=score;
       
    }
    
    public Student(double score, String name) {
        this(name, score);
    }
    public Student(Student other) {
        
        this(other.name, other.totalScore);
    }
    public String getName() {
        return(this.name);
    }
    
    public double getAverage() {
        if(this.numberOfQuizzes==0)
            return(0.0);
        return(this.totalScore/this.numberOfQuizzes);
    }
    
    public double getTotalScore() {
        return(this.totalScore);
    }
    
    public void addQuiz(double score) {
        if(score<0)
            throw new IllegalArgumentException("Score is invalid");
        this.numberOfQuizzes++;
        this.totalScore+=score;
        this.quizList+="Quiz"+this.numberOfQuizzes+": "+(int)score+", ";
    }
    @Override
    public String toString(){
        return(String.format("%nName: %s, %s\b\b%nQuiz Average: %.2f",this.name, this.quizList, this.getAverage()));
        
    }
    @Override
    public boolean equals(Object other) {
        if(other==null)
            throw new NullPointerException("The given reference isn't referring to an object!");
        if(other.getClass().getName().equals(this.getClass().getName())) {
            Student ref = (Student)other;
            return(name.equals(ref.getName()));
        }
        else
            throw new ClassCastException("Objects of different types!");
    }
    
}
