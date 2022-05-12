package com.chainsys.exceptions;

import java.util.Scanner;

/**
 *
 * @author suji3135 created on: 1 April 2022
 */
public class Calculator {
public int divide(int pValueA, int pValueB) {
return pValueA / pValueB;
}

public static void testDivide() {
Calculator calculator = null;
int args1 = 100;
Scanner scanner = new Scanner(System.in);
System.out.println("Enter a number less than 100:");
int args2 = scanner.nextInt();
int result = 0;
System.out.println("Before:");
calculator = new Calculator();
result = calculator.divide(args1, args2);
System.out.println("Result:" + result);
System.out.println("After:");
scanner.close();

}

public static void testDivideWithTry() {
/**
* Before Try:use for local variable declaration don't instantiate the variable
* here
*/
Calculator calculator = null;
int args1 = 100, args2 = 0, result = 0;
Scanner scanner = null;
System.out.println("Before Try");

// int localwithinTry = 0;
try {
System.out.println("Inside Try");
scanner = new Scanner(System.in);
System.out.println("Enter a number less than 100");
args2 = scanner.nextInt();
calculator = new Calculator();
result = calculator.divide(args1, args2);
System.out.println("Result:" + result);
// System.out.println(localwithinTry);
} catch (Exception e) {
// localwithinTry=2000;
System.out.println("Inside Catch:" + e.getMessage());
// e.printStackTrace();
} finally {
System.out.println("Inside Finally");
scanner.close();
}
System.out.println("After Try-Catch-Finally");
// System.out.println(localwithinTry);
}

public static void callDivide() {
Calculator calculator = null;
int result = 0;
System.out.println("Before Try-catch-finally");
try {
calculator = new Calculator();
calculator.divide(100, 0);
System.out.println("Result:" + result);
} catch (Exception err) {
String msg = err.getMessage();
System.out.println(msg);
} finally {
System.out.println("Inside Finally");
}
System.out.println("After-Try-catch-finally");

}
}


