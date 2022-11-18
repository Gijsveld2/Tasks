import java.util.Arrays;
import java.util.Scanner;

public class three {
    public static String function1(){
	Scanner scanner = new Scanner(System.in);
        System.out.println("Введите a");
        int a = scanner.nextInt();
        System.out.println("Введите b");
        int b = scanner.nextInt();
        System.out.println("Введите c");
        int c = scanner.nextInt();
	String str = "";
	if (b * b - 4 * a * c < 0) {
	    str = "уравнение не имеет решений";
	}
	else if (b * b - 4 * a * c == 0) {
	    str = "уравнение имеет одно решение";
	}
	else {
	    str = "уравнение имеет два решения";
	}
	return str;
    }
    public static int function2(){
	Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку");
        String str = scanner.nextLine();
	int o = 0;
	int k = 0;
	for (int i = 0; i < str.length() - 2; i++) {
	    var a = str.charAt(i);
	    var b = str.charAt(i+1);
	    var c = str.charAt(i+2);
	    var z = "z";
	    var l = "i";
	    var p = "p";
	    if (a == z.charAt(0) & b == l.charAt(0) & c == p.charAt(0)) {
		k = k + 1;
	    }
	    if (k == 2) {
		o = i;
		break;
	    }
	}
	if (k < 2) {
	    o = -1;
	}
	return o;
    }
    public static String function3(){
	Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int a = scanner.nextInt();
	int b = 0;
	String z = "";
	for (int i = 0; i < a; i++) {
	    if (a % (i + 1) == 0) {
	    b = b + i + 1;
	    }
	}
	b = b - a;
	if (a == b) {
	    z = "Число " + a + " является совершенным";
	}
	else {
	    z = "Число " + a + " не является совершенным";
	}
	return z;
    }
    public static String function4(){
	Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку");
        String str = scanner.nextLine();
	String z = "";
	if (str.length() < 2) {
	    z = "Несовместимо";
	    return z;
	}
	var a = str.charAt(0);
	var b = str.charAt(str.length() - 1);
	String o = str.substring(1, str.length() - 1);
	String q = b + o + a;
	if (a == b) {
	    z = "Два - это пара";
	}
	else {
	    z = q;
	}
	return z;
    }
    public static String function5(){
	Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку");
        String str = scanner.nextLine();
	String z = "";
	String p = "#";
	if (str.charAt(0) != p.charAt(0) || str.length() != 7) {
	    z = "Строка не является допустимым шестнадцатеричным кодом";
	}
	String a = "a";
	String b = "b";
	String c = "c";
	String d = "d";
	String e = "e";
	String f = "f";
	String a1 = "A";
	String b1 = "B";
	String c1 = "C";
	String d1 = "D";
	String e1 = "E";
	String f1 = "F";
	String s0 = "0";
	String s1 = "1";
	String s2 = "2";
	String s3 = "3";
	String s4 = "4";
	String s5 = "5";
	String s6 = "6";
	String s7 = "7";
	String s8 = "8";
	String s9 = "9";
	for (int i = 1; i < str.length(); i++) {
	    if (str.charAt(i) != a.charAt(0) && str.charAt(i) != b.charAt(0) && str.charAt(i) != c.charAt(0) && str.charAt(i) != d.charAt(0) && str.charAt(i) != e.charAt(0) && str.charAt(i) != f.charAt(0) && str.charAt(i) != a1.charAt(0) && str.charAt(i) != b1.charAt(0) && str.charAt(i) != c1.charAt(0) && str.charAt(i) != d1.charAt(0) && str.charAt(i) != e1.charAt(0) && str.charAt(i) != f1.charAt(0) && str.charAt(i) != s0.charAt(0) && str.charAt(i) != s1.charAt(0) && str.charAt(i) != s2.charAt(0) && str.charAt(i) != s3.charAt(0) && str.charAt(i) != s4.charAt(0) && str.charAt(i) != s5.charAt(0) && str.charAt(i) != s6.charAt(0) && str.charAt(i) != s7.charAt(0) && str.charAt(i) != s8.charAt(0) && str.charAt(i) != s9.charAt(0)) {
	        z = "Строка не является допустимым шестнадцатеричным кодом";
	    }
	}
	if (z == "") {
	    z = "Строка является допустимым шестнадцатеричным кодом";
	}
        return(z);
    }
    public static String function6(){
	Scanner sc = new Scanner(System.in);
	System.out.println("Введите длину первого массива");
	int length = sc.nextInt();
	String[] input = new String[length];
	System.out.println("Введите элементы первого массива");
	for (int i = 0; i < length; i++) {
	    String userInput = sc.next();
	    input[i] = userInput;
	}
	System.out.println("Введите длину второго массива");
	int length2 = sc.nextInt();
	String[] input2 = new String[length2];
	System.out.println("Введите элементы второго массива");
	for (int i = 0; i < length2; i++) {
	    String userInput = sc.next();
	    input2[i] = userInput;
	}
	String z = "";
	int a = 0;
	int b = 0;
	for (int i = 0; i < length; i++) {
	    for (int j = i+1; j < length; j++) {
	        var x = Integer.parseInt(input[i]);
	        var y = Integer.parseInt(input[j]);
		if (x == y) {
		    a = a + 1;
		    break;
		}
	    }
	}
	for (int i = 0; i < length2; i++) {
	    for (int j = i+1; j < length2; j++) {
	        var x = Integer.parseInt(input2[i]);
	        var y = Integer.parseInt(input2[j]);
		if (x == y) {
		    b = b + 1;
		    break;
		}
	    }
	}
	a = length - a;
	b = length2 - b;
	if (a == b) {
	    z = "true";
	}
	else {
	    z = "false";
	}
	return z;
    }
    public static String function7(){
	Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int a = scanner.nextInt();
	String z = "";
	int c = a;
	a = a * a;
	int b = 1;
	int x = a;
	int y = 0;
	int s = 1;
	int p = a;
	while (a > 10) {
	    a = a / 10;
	    b = b + 1;
	}
	if (b % 2 == 0) {
	    b = b / 2;
	    for (int i = 0; i < b; i++) {
		x = x / 10;
		s = s * 10;
	    }
	    y = p % s;
	}
	else {
	    b = b / 2 + 1;
	    for (int i = 0; i < b; i++) {
		x = x / 10;
		s = s * 10;
	    }
	    y = p % s;
	}
	if (x + y == c) {
	    z = "true";
	}
	else {
	    z = "false";
	}
        return z;
    }
    public static String function8(){
	Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку");
        String str = scanner.nextLine();
        String[] subStr;
        String delimeter = "1";
        subStr = str.split(delimeter);
	int q = 0;
	String u = "";
        for(int i = 0; i < subStr.length; i++) { 
	    if (subStr[i].length() > q) {
		q = subStr[i].length();
		u = subStr[i];
	    }
        }
	return u;
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
    public static int function9(){
	Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int a = scanner.nextInt();
	int b = 0;
	for (int i = 1; i < a; i++){
	    if (a % i == 0) {
		b = b + 1;
	    }
	}
	if (b < 3) {
            return a;
	}
	else {
	    for (int i = a; ; i++) {
	        b = 0;
		for (int j = 1; j < i+1; j++) {
	            if (i % j == 0) {
			b = b + 1;
		    }
		}
	        if (b < 3) {
            	    return i;
	        }
	    }
        }
    }
    public static String function10(){
	Scanner scanner = new Scanner(System.in);
        System.out.println("Введите x");
        int x = scanner.nextInt();
        System.out.println("Введите y");
        int y = scanner.nextInt();
        System.out.println("Введите z");
        int z = scanner.nextInt();
	String t = "";
	int a = x * x;
	int b = y * y;
	int c = z * z;
	if (a + b == c) {
	    t = "true";
	}
	else if (a + c == b) {
	    t = "true";
	}
	else if (c + b == a) {
	    t = "true";
	}
	else {
	    t = "false";
	}
        return t;
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
            System.out.println(k);
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
	    String k = function5();
            System.out.println(k);
	}
	if (a == 6) {
	    String k = function6();
            System.out.println(k);
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
	    int k = function9();
            System.out.println(k);
	}
	if (a == 10) {
	    String k = function10();
            System.out.println(k);
	}
    }
}