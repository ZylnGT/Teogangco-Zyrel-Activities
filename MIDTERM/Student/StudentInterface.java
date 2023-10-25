import java.util.Scanner;

public class StudentInterface{
   public static void main(String[]args){
      Scanner scan = new Scanner(System.in);
      Student student = new Student();
   
      System.out.print("Input first name: ");
      student.setfirstName(scan.nextLine());
   
      System.out.print("Input middle name: ");
      student.setmiddleName(scan.nextLine());
   
      System.out.print("Input last name: ");
      student.setlastName(scan.nextLine());
   
      System.out.print("Input suffix name: ");
      student.setsuffix(scan.nextLine());
   
   System.out.println("First Name:"+ student.getfirstName());
   System.out.println("Middle Name:"+ student.getmiddleName());
   System.out.println("Last Name:"+ student.getlastName());
   System.out.println("Suffix:"+ student.getsuffix());
   System.out.println("Fullname: " + student.getfirstName() + " "+ student.getmiddleName() +" "+ student.getlastName());
   
}
}
