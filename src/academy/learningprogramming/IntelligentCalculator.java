package academy.learningprogramming;

import java.util.Scanner;

public class IntelligentCalculator {
    public static void main(String[] args) {
        double num1=inputAmount();
        menu();
        char action=inputAction();
        double num2=inputAmount();
        double result=equation(num1,num2,action);
        System.out.println("Result is: "+equation(num1,num2,action));
        while (go(action)){
            action=inputAction();
            num1=inputAmount();
            System.out.println("Result is: "+equation(result,num1,action));
            result = equation(result,num1,action);
        }
    }

    public static double inputAmount(){
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Insert amount");
            try {
                double amount = scanner.nextDouble();
                return amount;
            }
            catch (Exception e){
                scanner.nextLine();
            }
        }
    }

    public static char inputAction(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert char");
        char action = scanner.next().charAt(0);
        int x = action;
        while (true){
            if (x == 43 || x == 42 || x == 47 || x == 45 || x== 120) return action;
            else {action = scanner.next().charAt(0);
                System.out.println("Insert char");}
            x = action;
        }
    }

    public static void menu(){
        System.out.println("Available operations: \n +|-|/|* \nTo end insert x");
    }

    public static double equation(double num1,double num2, char action){
        if(action=='+')return num1+num2;
        else if (action=='-')return num1-num2;
        else if (action=='*')return num1*num2;
        else if (action=='/')return num1/num2;
        else return 0;
    }

    public static boolean go(char action){
        if(action=='x')return false;
        return true;
    }
}