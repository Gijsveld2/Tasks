import java.util.Scanner;

public class one {
    public static int function1(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число 1");
        int a = scanner.nextInt();
        System.out.println("Введите число 2");
        int b = scanner.nextInt();
	int c = a % b;
	return c;
    }
    public static double function2(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите основение треугольника");
        double a = scanner.nextDouble();
        System.out.println("Введите высоту треугольника");
        double b = scanner.nextDouble();
	double c = a * b / 2;
	return c;
    }
    public static int function3(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число куриц");
        int a = scanner.nextInt();
	a = a *2;
        System.out.println("Введите число коров");
        int b = scanner.nextInt();
	b = b * 4;
        System.out.println("Введите число свиней");
        int c = scanner.nextInt();
	c = c * 4;
	int d = a + b + c;
	return d;
    }
    public static String function4(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите prob");
        double a = scanner.nextDouble();
        System.out.println("Введите prize");
        double b = scanner.nextDouble();
	System.out.println("Введите pay");
        double c = scanner.nextDouble();
	double d = a * b;
	String w = "";
	if (d > c) {
	    w = "true";
	}
	else {
	    w = "false";
	}
	return w;
    }
    public static String function5(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите результат");
        double a = scanner.nextDouble();
        System.out.println("Введите число 1");
        double b = scanner.nextDouble();
	System.out.println("Введите число 2");
        double c = scanner.nextDouble();
	String w = "";
	if (b + c == a) {
	    w = "Сложение";
	}
	else if (b - c == a | c - b == a) {
	    w = "Вычитание";
	}
	else if (b * c == a) {
	    w = "Умножение";
	}
	else if (b / c == a | c / b == a) {
	    w = "Деление";
	}
	else {
	    w = "Результат никак не получить";
	}
	return w;
    }
    public static int function6(){
        Scanner sc = new Scanner(System.in); 
        System.out.println("Введите символ");
        char s = sc.next().charAt(0); 
	int c = (int) s;
	return c;
    }
    public static int function7(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите последнее число");
        int a = scanner.nextInt();
	int b = (a * (a + 1)) / 2;
	return b;
    }
    public static int function8(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ребро 1");
        int a = scanner.nextInt();
        System.out.println("Введите ребро 2");
        int b = scanner.nextInt();
	int c = a + b - 1;
	return c;
    }
    public static int function9(){
	Scanner sc = new Scanner(System.in);
	System.out.println("Введите длину массива");
	int length = sc.nextInt();
	String[] input = new String[length];
	System.out.println("Введите элементы массива");
	for (int i = 0; i < length; i++) {
	    String userInput = sc.next();
	    input[i] = userInput;
	}
	int o = 0;
	for (int i = 0; i < length; i++) {
	    int b = Integer.valueOf(input[i]);
	    b = b * b * b; 
	    o = o + b;
	}
	return o;
    }
    public static String function10(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число A");
        int a = scanner.nextInt();
        System.out.println("Введите число B");
        int b = scanner.nextInt();
        System.out.println("Введите число C");
        int c = scanner.nextInt();
	for (int i = 0; i < b; i++) {
	    a = a + a;
	}
	String w = "";
	if (a % c == 0) {
	    w = "Делится";
	}
	else {
	    w = "Не делится";
	}
	return w;
    }
    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
        System.out.println("Какую функцию хотите выполнить?");
        int a = scanner.nextInt();
	if (a == 1) {
	    int k = function1();
            System.out.println( "остаток от деления числа 1 на число 2: " + k);
	}
	if (a == 2) {
	    double k = function2();
            System.out.println( "Площадь треугольника: " + k);
	}
	if (a == 3) {
	    int k = function3();
            System.out.println( "У всех животных " + k + " ног");
	}
	if (a == 4) {
	    String k = function4();
            System.out.println(k);
	}
	if (a == 5) {
	    String k = function5();
            System.out.println(k);
	}
	if (a == 6) {
	    int k = function6();
            System.out.println(k);
	}
	if (a == 7) {
	    int k = function7();
            System.out.println(k);
	}
	if (a == 8) {
	    int k = function8();
            System.out.println(k);
	}
	if (a == 9) {
	    int k = function9();
            System.out.println(k);
	}
	if (a == 10) {
	    String k = function10();
            System.out.println(k);
	}
    }
}