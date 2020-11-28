/*****
* Last episode we revisited inputs, prints and conditions.
* In this snippet, we're covering loops and arrays.
* We'll try to use concepts from the previous lesson too!
*****/

import java.util.Scanner; // remember to import our trusty Scanner

class Main {
  public static void main(String[] args) {
    int[] simplearr = {1,2,3,4,5}; // this is a simple array
    int[][] multiarr = {{1,2,3},{4,5,6},{7,8,9}}; // this is a multi-dimensional array
    int nloop = 0; // this will let us loop N times based on user inputs

    Scanner scan = new Scanner(System.in); // creating the scanner

    while (true){ // this is an infinite loop, it will help us restarting the loop in case the user inputs 0 for the nloop variable (which we don't want to be 0)
      System.out.println("Please set the number of times you want to run the next loop:");
      nloop = scan.nextInt(); // we take user input to iterate our print loop
      if (nloop == 0){
        System.out.println("Zero is not a valid number to iterate through the loop. You have to choose a value higher than zero.");
        continue;
      } else{
        for (int i = 0; i < nloop; i++){
          System.out.println("Ripl.it is cool!");
        }
        break;
      }
    }

    System.out.println("Now we're using an enhanced for loop to iterate our simple array! (Check the code to learn the syntax):");
    for (int x: simplearr){
      System.out.println(x);
    }

    System.out.println("And finally, we're using the traditional way to access an array, by typing its index. Arrays index start at number 0, and the last index will always be equal to our (array.length) - 1");
    System.out.println("For example if we want to print number 5 from our multi-dimensional array, we would access it with multiarr[1][1]:");
    System.out.println(multiarr[1][1]);
    System.out.println("Check the code, fork it and play with it to learn more! =)");

    scan.close();
  }
}