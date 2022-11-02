package oops;
import java.util.Scanner;

class StudentDetails{
    int rollNum;
    String studName;
    double mark1, mark2, mark3;

    public StudentDetails(int rollNum, String studName, double mark1, double mark2, double mark3) {
        this.rollNum = rollNum;
        this.studName = studName;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }

    void setStudDetails(){
        Scanner sc = new Scanner(System.in);
        System.out.println("***Input the asked details***");
        System.out.println("Enter Roll Number:");
        rollNum = sc.nextInt();

        System.out.println("Enter Student Name:");
        studName = sc.next();

        System.out.println("Enter Mark1:");
        mark1 = sc.nextDouble();

        System.out.println("Enter  Mark2:");
        mark2 = sc.nextDouble();

        System.out.println("Enter Mark3");
        mark3 = sc.nextDouble();

    }
    public void calculateTotal(){
        double total= mark1+ mark2+ mark3;

        System.out.println("Total Marks :: "+ total);
    }

    public void displayStudDetails(){
        System.out.println("***Inputted Student Details***");
        System.out.println("Roll Number:"+rollNum);
        System.out.println("Name:"+studName);
        System.out.println("Mark1:"+mark1);
        System.out.println("Mark2:"+mark2);
        System.out.println("Mark3:"+mark3);
    }

}

public class StudentUsingConstructor {
    public static void main(String [] args){
        StudentDetails s = new StudentDetails(1,"shraddha",78,90,89);
      //  s.setStudDetails();
        s.displayStudDetails();
        s.calculateTotal();
    }
}
