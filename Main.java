import java.util.Scanner;

class Main {

  public static void main(String[] args) {
  

        Scanner scan = new Scanner(System.in);

          System.out.println("Hello 1st student, What is your name?");

        String students1 = scan.next();
// this is where the first scanner will end and the second will begin


          System.out.println("Hello 2nd student, What is your name?");
          
        String students2 = scan.next();


          System.out.println("Hello 3rd student, What is your name?");
          
        String students3 = scan.next();


          System.out.println("Hello 4th student, What is your name?");
          
        String students4 = scan.next();



          System.out.println("Hello 5th student, What is your name?");
          
        String students5 = scan.next();



          System.out.println("Hello 6th student, What is your name?");
          
        String students6 = scan.next();



          System.out.println("Hello 7th student, What is your name?");
          
        String students7 = scan.next();




          System.out.println("Hello 8th student, What is your name?");
          
        String students8 = scan.next();



          System.out.println("Hello 9th student, What is your name?");
          
        String students9 = scan.next();



          System.out.println("Hello 10th student, What is your name?");
          
        String students10 = scan.next();



          System.out.println("Hello 11th student, What is your name?");
          
        String students11 = scan.next();



          System.out.println("Hello 12th student, What is your name?");
          
        String students12 = scan.next();



          System.out.println("Hello 13th student, What is your name?");
          
        String students13 = scan.next();



          System.out.println("Hello 14th student, What is your name?");
          
        String students14 = scan.next();



          System.out.println("Hello 15th student, What is your name?");
          
        String students15 = scan.next();
//the final string array
    String students[] = {students1, students2, students3, students4, students5, students6, students7, students8, students9, students10, students11 ,students12, students13, students14, students15 };


    int  seatNumbers[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
// declaring the seat numbers
    for(int a = 0; a < 1; a++){
     
        int count = 0;
     //created the while loop that repeats the students names  
          while(count <= 14) {
            System.out.println(students[count] + " is going to sit in sit in seat # " + seatNumbers[count]);
          count++;
          }
        }
}
} 