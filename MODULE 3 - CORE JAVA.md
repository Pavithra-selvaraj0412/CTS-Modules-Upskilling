**1.HelloWorld Program**



public class HelloWorld {

&#x20;   public static void main(String\[] args) {

&#x20;       System.out.println("Hello, World!");

&#x20;   }

}



**2. Simple calculator**

&#x20;import java.util.Scanner;



public class SimpleCalculator {

&#x20;   public static void main(String\[] args) {

&#x20;       Scanner sc = new Scanner(System.in);

&#x20;       System.out.print("Enter first number: ");

&#x20;       double num1 = sc.nextDouble();

&#x20;       System.out.print("Enter second number: ");

&#x20;       double num2 = sc.nextDouble();

&#x20;       System.out.println("Choose operation: +  -  \*  /");

&#x20;       char op = sc.next().charAt(0);

&#x20;       double result;

&#x20;       switch(op) {

&#x20;           case '+':

&#x20;               result = num1 + num2;

&#x20;               System.out.println("Result = " + result);

&#x20;               break;

&#x20;           case '-':

&#x20;               result = num1 - num2;

&#x20;               System.out.println("Result = " + result);

&#x20;               break;

&#x20;           case '\*':

&#x20;               result = num1 \* num2;

&#x20;               System.out.println("Result = " + result);

&#x20;               break;

&#x20;           case '/':

&#x20;               if(num2 != 0) {

&#x20;                   result = num1 / num2;

&#x20;                   System.out.println("Result = " + result);

&#x20;               } else {

&#x20;                   System.out.println("Error: Cannot divide by zero");

&#x20;               }

&#x20;               break;

&#x20;           default:

&#x20;               System.out.println("Invalid operation");

&#x20;       }

&#x20;       sc.close();

&#x20;   }

}

&#x20;

**3. Even or Odd**

import java.util.Scanner;

public class EvenOdd {

&#x20;   public static void main(String\[] args) {

&#x20;       Scanner sc = new Scanner(System.in);

&#x20;       System.out.print("Enter an integer: ");

&#x20;       int num = sc.nextInt();

&#x20;       if (num % 2 == 0) {

&#x20;           System.out.println(num + " is Even");

&#x20;       } else {

&#x20;           System.out.println(num + " is Odd");

&#x20;       }

&#x20;       sc.close();

&#x20;   }

}



**4.LEAPYEAR**

import java.util.Scanner;



public class LeapYear {

&#x20;   public static void main(String\[] args) {

&#x20;       Scanner sc = new Scanner(System.in);

System.out.print("Enter a year: ");



&#x20;       int year = sc.nextInt();



&#x20;       if ((year % 4 == 0 \&\& year % 100 != 0) || (year % 400 == 0)) {

&#x20;           System.out.println("Leap Year");

&#x20;       } else {

&#x20;           System.out.println("Not a Leap Year");

&#x20;       }



&#x20;       sc.close();

&#x20;   }

}



**5.MULTIPLICATION TABLE**

import java.util.Scanner;



public class MultiplicationTable {

&#x20;   public static void main(String\[] args) {

&#x20;       Scanner sc = new Scanner(System.in);

&#x20;       System.out.print("Enter a value: ");

&#x20;       int num = sc.nextInt();

&#x20;       for (int i = 1; i <= 20; i++) {

&#x20;           System.out.println(num + " x " + i + " = " + (num \* i));

&#x20;       }

&#x20;       sc.close();

&#x20;   }

}



**6.DATATYPE DEMONSTRATION**

public class DataTypes {

&#x20;   public static void main(String\[] args) {

&#x20;       int a = 10;

&#x20;       float b = 5.5f;

&#x20;       double c = 20.99;

&#x20;       char d = 'A';

&#x20;       boolean e = true;

&#x20;       String f = "Hello World";

&#x20;       System.out.println(a);

&#x20;       System.out.println(b);

&#x20;       System.out.println(c);

&#x20;       System.out.println(d);

&#x20;       System.out.println(e);

&#x20;       System.out.println(f);

&#x20;   }

}



**7.TYPECASTING**

public class TypeCasting {

&#x20;   public static void main(String\[] args) {



&#x20;       double a = 10.75;

&#x20;       int b = (int) a;

&#x20;       System.out.println(b);



&#x20;       int x = 5;

&#x20;       double y = (double) x;

&#x20;       System.out.println(y);

&#x20;   }

}



**8.OPERATOR**

public class Operators {

&#x20;   public static void main(String\[] args) {

&#x20;       int a = 10 + 5 \* 2;

&#x20;       int b = (10 + 5) \* 2;

&#x20;       int c = 20 / 5 + 3 \* 2;

&#x20;       System.out.println(a);

&#x20;       System.out.println(b);

&#x20;       System.out.println(c);

&#x20;   }

}



**9.GRADE CALCULATOR**

import java.util.Scanner;



public class GradeCalculator {

&#x20;   public static void main(String\[] args) {



&#x20;       Scanner sc = new Scanner(System.in);

&#x20;       System.out.print("Enter mark: ");

&#x20;       int marks = sc.nextInt();



&#x20;       if (marks >= 90 \&\& marks <= 100) {

&#x20;           System.out.println("A");

&#x20;       } else if (marks >= 80) {

&#x20;           System.out.println("B");

&#x20;       } else if (marks >= 70) {

&#x20;           System.out.println("C");

&#x20;       } else if (marks >= 60) {

&#x20;           System.out.println("D");

&#x20;       } else {

&#x20;           System.out.println("F");

&#x20;       }



&#x20;       sc.close();

&#x20;   }

}



**10.NUMBER GUESSING GAME**

import java.util.Random;

import java.util.Scanner;



public class GuessGame

&#x20;{

&#x20;   public static void main(String\[] args) {

&#x20;       Scanner sc = new Scanner(System.in);

&#x20;       Random rand = new Random();

&#x20;       int number = rand.nextInt(100) + 1;

&#x20;       int guess = 0;

&#x20;       while (guess != number) {

&#x20;           guess = sc.nextInt();



&#x20;           if (guess > number) {

&#x20;               System.out.println("Too High");

&#x20;           } else if (guess < number) {

&#x20;               System.out.println("Too Low");

&#x20;           } else {

&#x20;               System.out.println("Correct");

&#x20;           }

&#x20;       }

&#x20;       sc.close();

&#x20;   }

}



**11.FACTORIAL**

&#x20;import java.util.Scanner;



public class Factorial {

&#x20;   public static void main(String\[] args) {



&#x20;       Scanner sc = new Scanner(System.in);

System.out.print("Enter a Number: ");

&#x20;       int n = sc.nextInt();

&#x20;       long fact = 1;



&#x20;       for (int i = 1; i <= n; i++) {

&#x20;           fact = fact \* i;

&#x20;       }



&#x20;       System.out.println(fact);



&#x20;       sc.close();

&#x20;   }

}



**12. METHOD OVERLOADING**

public class MethodOverloading {



&#x20;   public static int add(int a, int b) {

&#x20;       return a + b;

&#x20;   }



&#x20;   public static double add(double a, double b) {

&#x20;       return a + b;

&#x20;   }



&#x20;   public static int add(int a, int b, int c) {

&#x20;       return a + b + c;

&#x20;   }



&#x20;   public static void main(String\[] args) {



&#x20;       System.out.println(add(10, 20));

&#x20;       System.out.println(add(5.5, 2.5));

&#x20;       System.out.println(add(1, 2, 3));

&#x20;   }

}



**13.FIBONACCI**

import java.util.Scanner;

public class Fibonacci {

&#x20;   static int fibonacci(int n) {

&#x20;       if (n == 0) return 0;

&#x20;       if (n == 1) return 1;

&#x20;       return fibonacci(n - 1) + fibonacci(n - 2);

&#x20;   }

&#x20;   public static void main(String\[] args) {

&#x20;       Scanner sc = new Scanner(System.in);

&#x20;       System.out.print("Enter a Number: ");

&#x20;       int n = sc.nextInt();

&#x20;       System.out.println(fibonacci(n));

&#x20;       sc.close();

&#x20;   }

}



**14.ARRAY SUM AND AVERAGE**

import java.util.Scanner;



public class ArraySumAverage {

&#x20;   public static void main(String\[] args) {

&#x20;       Scanner sc = new Scanner(System.in);



&#x20;       System.out.print("Enter number of elements: ");

&#x20;       int n = sc.nextInt();



&#x20;       int\[] arr = new int\[n];

&#x20;       int sum = 0;



&#x20;       System.out.println("Enter elements:");

&#x20;       for(int i = 0; i < n; i++) {

&#x20;           arr\[i] = sc.nextInt();

&#x20;           sum += arr\[i];

&#x20;       }



&#x20;       double average = (double) sum / n;



&#x20;       System.out.println("Sum = " + sum);

&#x20;       System.out.println("Average = " + average);

&#x20;   }

}



**15.STRING REVERSAL**

import java.util.Scanner;



public class StringReverse {

&#x20;   public static void main(String\[] args) {

&#x20;       Scanner sc = new Scanner(System.in);



&#x20;       System.out.print("Enter a string: ");

&#x20;       String str = sc.nextLine();



&#x20;       String reversed = new StringBuilder(str).reverse().toString();



&#x20;       System.out.println("Reversed String: " + reversed);

&#x20;   }

}

