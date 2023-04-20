// Реализовать простой калькулятор (введите первое число, введите второе число, введите требуемую операцию, ответ)

import java.util.Scanner;

class FourTask {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int num1 = in.nextInt();
        System.out.print("Введите второе число: ");
        int num2 = in.nextInt();
        System.out.print("Введите операцию (+, -, *, /): ");
        String a = in.next();
        char operation = a.charAt(0);
        int res = 0;
        if (operation == '+') res = num1 + num2;
        else if (operation == '-') res = num1 - num2;
        else if (operation == '*') res = num1 * num2;
        else if (operation == '/') res = num1 / num2; 
        System.out.println(res);
        in.close();
    } 
} 