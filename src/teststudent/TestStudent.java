
package teststudent;
import java.util.*;


public class TestStudent {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String studentName;
        System.out.print("Enter name of student: ");
        studentName=in.nextLine();
        Student st1 = new Student(studentName);
        int quizScore;
        System.out.print("Enter grade of quiz#1 for "+st1.getName()+": ");
        quizScore=in.nextInt();
        st1.addQuiz(quizScore);
        
        System.out.print("Enter grade of quiz#2 for "+st1.getName()+": ");
        quizScore=in.nextInt();
        st1.addQuiz(quizScore);
        
        System.out.print("Enter grade of quiz#3 for "+st1.getName()+": ");
        quizScore=in.nextInt();
        st1.addQuiz(quizScore);
        
        System.out.println(st1);
    }
    
}
