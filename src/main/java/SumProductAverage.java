/*
 * Write a Java program (or method) that does the following:
 *
 * 1. Prompts the user to enter a positive integer n.
 *
 * 2. Then, n times, reads in three numbers 
 *    (they may be integers or real numbers).
 *
 * 3. For each set of three numbers, computes their sum, product, and average.
 *
 * 4. Prints out the results (one line per set).
 *
 * 5. After processing all n sets, the program ends.
 */

//NAME                  :   Parker Gilliland
//GROUP                 :   APCS-A
//PROBLEM ID            :   Java Software Solutions, Programming Projects, 2.3
//PROBLEM DESCRIPTION   :   Asks the user to enter two floating point numbers,
//                          then finds the sum and product
//SOURCES I USED        :   IntelliJ, Java Software Solutions 3rd edition
//PEOPLE I HELPED       :
//PEOPLE WHO HELPED ME  :   Mr. Houtrouw

import java.util.Scanner;
public class SumProductAverage
{
    //-----------------------------------------------------------------
    // Sum and product of two numbers
    //-----------------------------------------------------------------
    public static void main(String[] args)
    {
        // Scan in numbers
        Scanner scan = new Scanner(System.in);

        System.out.println("Parker Gilliland\nAPCS-A\nAP Java Software Solutions 2.2 & 2.3\n");

        System.out.print("\nHow many runs would you like to do: ");
        int runs = scan.nextInt();

        for(int i= 1; i <= runs; i++)
        {
            // Three numbers
            System.out.print("\nPlease insert three numbers: ");
            double x = scan.nextDouble();
            double y = scan.nextDouble();
            double z = scan.nextDouble();

            // Find average, sum, and product and print
            double average = (x + y + z) / 3.0;
            double sum = (x + y + z);
            double product = (x * y * z);
            System.out.println("\nThe average is " + average);
            System.out.println("The sum is " + sum);
            System.out.println("The product is " + product);
        }
    }
}
/*
47 C:\Users\parke\.jdks\openjdk-24.0.2+12-54\bin\java.exe "-javaagent:C:\Program Files\JetBrains

\IntelliJ IDEA 2025.2.1\lib\idea_rt.jar=61704" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-
8 -Dsun.stderr.encoding=UTF-8 -classpath C:\Users\parke\OneDrive\Desktop\Programs

\GillilandParkerProject2.2-3\out\production\GillilandParkerProject2.2-3
GillilandParkerProject2223
Parker Gilliland
APCS-A
AP Java Software Solutions 2.2 & 2.3


How many runs would you like to do: 3

Please insert three numbers: 222.2 222.2 222.2

The average is 222.19999999999996
The sum is 666.5999999999999
The product is 1.0970645047999999E7

Please insert three numbers: 3.14159 25.6 17

The average is 15.247196666666667
The sum is 45.74159
The product is 1367.219968

Please insert three numbers: 100 0 55.5

The average is 51.833333333333336
The sum is 155.5
The product is 0.0

Process finished with exit code 0
 */

