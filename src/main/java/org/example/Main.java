package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //menu
        int program;
        Scanner input = new Scanner (System.in);
        Scanner scanner = new Scanner (System.in);
        System.out.print("Enter a number 1-7 for which program you wish to run: ");
        program = input.nextInt();




        //further substring fun
        if (program==1){
        String sentence;
       int start;
       int end;
       System.out.print("Enter a string:");
       sentence = scanner.nextLine();

       System.out.print("Enter beginning index: ");
       start = input.nextInt() ;
       
       System.out.print("Enter ending index: ");
       end = input.nextInt() ;
       
       System.out.println("Original string:");
       System.out.println(sentence);
       System.out.println("Substring: ");
       sentence = sentence.substring(start,end);
       System.out.println(sentence);}


            //RUN OF INTEGERS
      else if (program==2){ 
       int start1;
       int end1;
       System.out.println("Enter Start:");
       start1 = input.nextInt();
       System.out.println("Enter End:");
       end1 = input.nextInt();
       while (start1 <= end1) {
           System.out.println(start1) ;
           start1 ++;
       }}


        //Repeat ECHO
        else if (program==3){
        String word;
       int length;
       System.out.println("Enter a word:");
       word = scanner.nextLine();
       length = word.length();
       for (int i = 0; i<length; i++) {
           System.out.println(word);
       }}


       //sum of range SEQUENTIAL
       else if (program==4){
       int low;
      int high;
      int sum = 0;
      System.out.println("Enter low:");
      low = input.nextInt();
      System.out.println("Enter high:");
      high = input.nextInt();
      while (low <= high) {
          sum = sum + low;
         low ++;
      }
      System.out.println("Sum = " + sum);}



        //Exercise — Words Separated by Dots
        else if (program==5){
        System.out.println("Enter first word:");
        String word1 = scanner.nextLine();

        System.out.println("Enter second word:");
        String word2 = scanner.nextLine();

        int totalLength = 30;
        int numDots = totalLength - word1.length() - word2.length();

        System.out.print(word1);


        for (int i = 0; i < numDots; i++) {
            System.out.print(".");
        }

        System.out.println(word2);}







        //Exercise — Adding up Integers
        else if (program==6){
        int numberOfInt;
        int currentInt;
        int sum1=0;
        System.out.println("How many integers will be added:");
        numberOfInt = input.nextInt();
        for (int i =0; i<numberOfInt; i++){
            System.out.println("Enter an integer:");
            currentInt = input.nextInt();
            sum1 = sum1 + currentInt;
        }
        System.out.print("The sum is " + sum1);}






        //Exercise — Shipping Cost Calculator
        else{
        Double weight;
        Double newWeight;
        Double cost = 3.00;
        do{
            System.out.println("Weight of Order:");
            weight = input.nextDouble();
            cost = 3.00;
            newWeight=weight-10;
            if (newWeight>0){
                cost = 3.00 + newWeight*.25;
            }
            System.out.println("Shipping Cost: $" + cost +"0");
        }while (weight>0);
    }}
}
