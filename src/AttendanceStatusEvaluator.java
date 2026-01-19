
import java.util.Scanner;
public class AttendanceStatusEvaluator{
public static void main(String[] args){
  System.out.println("Enter the attendance: ");
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  if(n<100 && n>85){
    System.out.println("Excellent");
  }else if(n<=85 && n>=60){
    System.out.println("Satisfactory");
  }else{
    System.out.println("Poor");
  }
}
}
