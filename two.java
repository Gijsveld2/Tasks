import java.util.Scanner;

public class two {
    public static String function1(){
	Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку");
        String str = scanner.nextLine();
        System.out.println("Введите n");
        int n = scanner.nextInt();
	String z = "";
	for(int i = 0; i < str.length(); i++) {
	    var o = str.charAt(i);
	    String k = Character.toString(o);
	    String l = k.repeat(n);
	    z = z + l;
	}
	return z;
    }
    public static int function2(){
	Scanner sc = new Scanner(System.in);
	System.out.println("Введите длину массива");
	int length = sc.nextInt();
	String[] input = new String[length];
	System.out.println("Введите элементы массива");
	for (int i = 0; i < length; i++) {
	    String userInput = sc.next();
	    input[i] = userInput;
	}
	int a = 0;
	for (int i = 0; i < length; i++) {
	    var k = Integer.parseInt(input[i]);
	    if (k > a) {
		a = k;
	    }
	}
	int b = a;
	for (int i = 0; i < length; i++) {
	    var k = Integer.parseInt(input[i]);
	    if (k < b) {
		b = k;
	    }
	}
	int z = a - b;
	return z;
    }
    public static String function3(){
	Scanner sc = new Scanner(System.in);
	System.out.println("Введите длину массива");
	int length = sc.nextInt();
	String[] input = new String[length];
	System.out.println("Введите элементы массива");
	for (int i = 0; i < length; i++) {
	    String userInput = sc.next();
	    input[i] = userInput;
	}
	double a = 0;
	double b = 0;
	String s = "";
	for (int i = 0; i < length; i++) {
	    var k = Double.parseDouble(input[i]);
	    a = a + k;
	    b = i + 1;
	}
	double c = a / b;
	if (c % 1 != 0) {
	    s = "false";
	}
	else {
	    s = "true";
	}
	return s;
    }
    public static String function4(){
	Scanner sc = new Scanner(System.in);
	System.out.println("Введите длину массива");
	int length = sc.nextInt();
	String[] input = new String[length];
	System.out.println("Введите элементы массива");
	for (int i = 0; i < length; i++) {
	    String userInput = sc.next();
	    input[i] = userInput;
	}
	int a = 0;
	for (int i = 1; i < length; i++) {
	    var k = Integer.parseInt(input[i]);
	    var g = Integer.parseInt(input[i-1]);
	    a = k + g;
	    input[i] = Integer.toString(a);
	}
	String o = String.join(" ", input);
	return o;
    }
    public static int function5(){
	Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        String str = scanner.nextLine();
	int a = 0;
	int p = str.length();
	for(int i = 0; i < str.length(); i++) {
	    char c = str.charAt(i);
	    String b = ".";
	    char d = b.charAt(0);
	    if (c == d) {
		a = p - i - 1;
	    }
	}
        return(a);
    }
    public static int function6(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        int n = in.nextInt();
        int n0 = 1;
        int n1 = 1;     
	int n2 = 0;
        for (int i = 2; i <= n; i++) {
            n2 = n0 + n1;
            n0 = n1;    
	    n1 = n2;
        }
	return n2;
    }
    public static String function7(){
	Scanner scanner = new Scanner(System.in);
        System.out.println("Введите индекс");
        String str = scanner.nextLine();
	var a = isNumeric(str);
	int b = 0;
	if (String.valueOf(a) == "true") {
	    b = 1;
	}
	if (str.length() > 5) {
	    b = 0;
	}
	String q = "";
	if (b == 1) {
	    q = "true";
	}
	else {
	    q = "false";
        }
	return q;
    }
    public static String function8(){
	Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 1 слово");
        String str1 = scanner.nextLine();
        System.out.println("Введите 2 слово");
        String str2 = scanner.nextLine();
	int a = str1.length();
	int b = str2.length();
	var k = str1.charAt(0);
	var l = str2.charAt(0);
	var n = str1.charAt(a-1);
	var m = str2.charAt(b-1);
	String o = "";
	if (k == m & l == n) {
	    o = "true";
	}
	else {
	    o = "false";
	}
	return o;
    }
    public static String isPrefix(){
	Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку");
        String str1 = scanner.nextLine();
        System.out.println("Введите префикс");
        String str2 = scanner.nextLine();
	String z = "";
	int a = 0;
	if (str2.length() < str1.length()) {
	    for(int i = 0; i < str2.length(); i++) {
	        var o = str1.charAt(i);
	        var e = str2.charAt(i);
	        if (o == e) {
		    a = a + 1;
	        }
	    }
	    if (a == str2.length()) {
	        z = "true";
	    }
	    else {
	        z = "false";
	    }
	}
	else {
	    z = "false";
	}
	return(z);
    }
    public static String isSuffix(){
	Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку");
        String str1 = scanner.nextLine();
        System.out.println("Введите префикс");
        String str2 = scanner.nextLine();
	String z = "";
	int a = 0;
	int p = str1.length() - str2.length();
	if (str2.length() < str1.length()) {
	    for(int i = p; i < str1.length(); i++) {
	        var o = str1.charAt(i);
	        var e = str2.charAt(i-p);
	        if (o == e) {
		    a = a + 1;
	        }
	    }
	    if (a == str2.length()) {
	        z = "true";
	    }
	    else {
	        z = "false";
	    }
	}
	else {
	    z = "false";
	}
	return(z);
    }
    public static String function9(){
	Scanner scanner = new Scanner(System.in);
        System.out.println("Какую функцию хотите выполнить? 1 - префикс; 2 - суффикс");
        int a = scanner.nextInt();
	String k = "";
	if (a == 1) {
	    k = isPrefix();
	}
	if (a == 2) {
	    k = isSuffix();
	}
	return(k);
    }
    public static int function10(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите шаг");
        int n = in.nextInt();
        int a = 0;
	if (n % 2 == 0) {
            a = n;
	}
	else {
	    a = n + 2;
        }
	return (a);
    }
    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
        System.out.println("Какую функцию хотите выполнить?");
        int a = scanner.nextInt();
	if (a == 1) {
	    String k = function1();
            System.out.println(k);
	}
	if (a == 2) {
	    int k = function2();
            System.out.println( "Разница между максимальным и минимальным элементом массива: " + k);
	}
	if (a == 3) {
	    String k = function3();
            System.out.println(k);
	}
	if (a == 4) {
	    String k = function4();
            System.out.println(k);
	}
	if (a == 5) {
	    int k = function5();
            System.out.println(k);
	}
	if (a == 6) {
	    int k = function6();
            System.out.println("число фибоначчи: " + k);
	}
	if (a == 7) {
	    String k = function7();
            System.out.println(k);
	}
	if (a == 8) {
	    String k = function8();
            System.out.println(k);
	}
	if (a == 9) {
	    String k = function9();
            System.out.println(k);
	}
	if (a == 10) {
	    int k = function10();
            System.out.println(k);
	}
    }
    public static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        }
    	catch (NumberFormatException e) {
            return false;
	}
    }
}