package com.company;

public class Ex15alt {

//see Ex15.java for a more "formal" solution

//this solution is an alternative idea of finding primes without sieving for them

//instead of a sieve, it uses a loop with a continue and a break conditions
//where break depends on a counter, continue depends on a method which checks
//the division of the running odd number

//it's possible to set the range to numbers other than 50 and 70 and get a different solution
//(this is done by setting the "int start" and "int finish" variable values)

//since it's easy to "break" the program if something else gets changed, it's an
//"alternative", or a less stable solution

    public static void main(String[] args) {

        //count shows how many times we wrote out primes - this is to break from loop
        int count = 0;

        //this might come in handy to try more output
        //the loop might end before countLimit gets reached
        int countLimit = 2;


        //boolean is to not use a continue operator and finish the loop
        //which will increment the count and show the running number (which is supposed to be prime)
        //since it passed the check from the method cheeseSolution(int)
        boolean flag = false;

        //some extra code to make the solution less disgusting and more general
        int start = 50;
        int finish = 70;

        //dealing with zero and negative inputs
        if (start <= 0)
            start = 1;
        if (finish <= 0)
            finish = 2;

        //since only odd numbers get checked, we have to explicitly check 2 out of the loop
        if (start <= 2 && finish >= 2)
            countLimit--;

        if (start <= 2 && finish >= 2)
            System.out.print("2 ");;

        //this is to start from the odd element in the loop and not end up checking division of
        //only even numbers by odd ones
        int iStart = start + ((start + 1) % 2);

        //50 gets skipped since it's even and not two, i gets incremented by 2 to skip all even numbers
        for (int i = iStart; i <= finish; i += 2) {

            //checking if number is prime
            flag = cheeseSolution(i);

            //if it isn't, we go to the next iteration
            if (!flag)
                continue;

            //otherwise, we increment count (the breaking condition) and print out the prime number
            count++;
            System.out.print(i + " ");

            //in other words, if the count is already 2, we break
            if (count > countLimit - 1)
                break;

        };
    };

    //only odd numbers get inputted here to skip the division check for even numbers
    static boolean isPrime (int num) {

        if (num == 1)
            return false;

        //if we find and odd number 3 or larger that divides our number, then the number is not prime
        int i = 3;
        while (i < num) {
          if (num % i == 0) return false;
          i += 2;
        };

        //if there's no such odd number, then we decide that the number is prime
        return true;
    };

}
