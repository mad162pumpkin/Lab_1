package lab_1;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class lab_1 {
	 public static void main(String[] args) {
	        boolean t1 = lab_1.subtask1();
	        System.out.println("1.1 " + t1);
	        boolean t2 = lab_1.subtask2();
	        System.out.println("1.2 " + t2);
	        boolean t3 = lab_1.subtask3();
	        System.out.println("1.3 " + t3);
	        boolean t4 = lab_1.subtask4();
	        System.out.println("1.4 " + t4);
	        boolean t5 = lab_1.subtask5();
	        System.out.println("1.5 " + t5);
	        boolean t6 = lab_1.subtask6();
	        System.out.println("1.6 " + t6);
	        boolean t7 = lab_1.subtask7();
	        System.out.println("1.7 " + t7);
	        boolean t8 = lab_1.subtask8(new int[]{1, -10, 5, 6, 45, 23, 45, -34, 0, 32,
	        56, -1, 2, -2});
	        System.out.println("1.8 " + t8);
	        boolean t9 = lab_1.subtask9(new int[] { 15, 10, 51, 6, 5, 3, 10, -34, 0, 32, 56, 12, 24, 52 });
	        System.out.println("1.9 " + t9);
	        boolean t10 = lab_1.subtask10(new int[] { 15, 10, 0, -6, -5, 3, 0, -34, 0, 32, 56, 0, 24, 52 });
	        System.out.println("1.10 " + t10);
	    }

	    private static boolean subtask1() { // ���������� ������
	        System.out.println("\n1.1 =================");
	        Scanner sc = new Scanner(System.in); // ����������� �����������
	        System.out.print("������� ����� �����: ");
	        String str = sc.nextLine(); // reads string
	        boolean bNumeric = lab_1.isNumeric(str);
	        if (!bNumeric) {
	            System.out.println("�� ���� ��������� �����!!!");
	            return lab_1.subtask1();
	        }
	        char lastNumber = str.charAt(str.length() - 1);
	        System.out.println("��������� �����: " + lastNumber);
	        return true;
	    }

	    private static boolean subtask2() { // ���������� ������
	        System.out.println("\n1.2 =================");
	        Scanner sc = new Scanner(System.in); // ����������� �����������
	        System.out.print("������� ����� ����������� �����: ");
	        String str = sc.nextLine(); // reads string
	        boolean bNumeric = lab_1.isNumeric(str);
	        if (!bNumeric) {
	            System.out.println("�� ���� ��������� �����!!!");
	            return lab_1.subtask2();
	        }
	        if (str.length() != 3) {
	            System.out.println("��������� ����� ����������� �����!!!!!!");
	            return lab_1.subtask2();
	        }
	        int number00 = Integer.parseInt(str.substring(0, 1));
	        int number01 = Integer.parseInt(str.substring(1, 2));
	        int number02 = Integer.parseInt(str.substring(2, 3));
	        int numberSum = number00 + number01 + number02;
	        System.out.println("�����:" + numberSum);
	        return true;
	    }

	    private static boolean subtask3() { // ���������� ������
	        System.out.println("\n1.3 =================");
	        Scanner sc = new Scanner(System.in); // ����������� �����������
	        System.out.print("������� ����� �����: ");
	        String str = sc.nextLine(); // reads string
	        // �������� ��� ��� �����
	        boolean bNumeric = lab_1.isNumeric(str);
	        if (!bNumeric) {
	            System.out.println("�� ���� ��������� �����!!!");
	            return lab_1.subtask3();
	        }
	        // ���������� � �����
	        int number = Integer.parseInt(str);
	        // ��������� ���������������
	        boolean pos = number > 0;
	        if (pos) {
	            System.out.println(number + 1);
	        } else {
	            System.out.println(number);
	        }
	        return true;
	    }

	    private static boolean subtask4() { // ���������� ������
	        System.out.println("\n1.4 =================");
	        Scanner sc = new Scanner(System.in); // ����������� �����������
	        System.out.print("������� ����� �����: ");
	        String str = sc.nextLine(); // reads string
	        // �������� ��� ��� �����
	        boolean bNumeric = lab_1.isNumeric(str);
	        if (!bNumeric) {
	            System.out.println("�� ���� ��������� �����!!!");
	            return lab_1.subtask4();
	        }
	        // ���������� � �����
	        int number = Integer.parseInt(str);
	        if (number > 0) {
	            System.out.println(number + 1);
	        } else if (number < 0) {
	            System.out.println(number - 2);
	        } else {
	            System.out.println(10);
	        }
	        return true;
	    }

	    private static boolean subtask5() { // ���������� ������
	        System.out.println("\n1.5 =================");
	        Scanner sc = new Scanner(System.in); // ����������� �����������
	        System.out.print("������� ����� �����: ");
	        String str0 = sc.nextLine(); // reads string
	        // �������� ��� ��� �����
	        boolean bNumeric0 = lab_1.isNumeric(str0);
	        if (!bNumeric0) {
	            System.out.println("�� ���� ��������� �����!!!");
	            return lab_1.subtask5();
	        }
	        // ���������� � �����
	        int number0 = Integer.parseInt(str0);
	        System.out.print("������� ����� �����: ");
	        String str1 = sc.nextLine(); // reads string
	        // �������� ��� ��� �����
	        boolean bNumeric1 = lab_1.isNumeric(str1);
	        if (!bNumeric1) {
	            System.out.println("�� ���� ��������� �����!!!");
	            return lab_1.subtask5();
	        }
	        // ���������� � �����
	        int number1 = Integer.parseInt(str1);
	        System.out.print("������� ����� �����: ");
	        String str2 = sc.nextLine(); // reads string
	        // �������� ��� ��� �����
	        boolean bNumeric2 = lab_1.isNumeric(str2);
	        if (!bNumeric2) {
	            System.out.println("�� ���� ��������� �����!!!");
	            return lab_1.subtask5();
	        }
	        // ���������� � �����
	        int number2 = Integer.parseInt(str2);
	        int min = number0;
	        if (min > number1) {
	            min = number1;
	        }
	        if (min > number2) {
	            min = number2;
	        }
	        System.out.println("������� �����:");
	        System.out.println(min);
	        return true;
	    }

	    private static boolean subtask6() { // ���������� ������
	        System.out.println("\n1.6 =================");
	        Scanner sc = new Scanner(System.in); // ����������� �����������
	        System.out.print("������� ����� �����: ");
	        String str = sc.nextLine(); // reads string
	        // �������� ��� ��� �����
	        boolean bNumeric = lab_1.isNumeric(str);
	        if (!bNumeric) {
	            System.out.println("�� ���� ��������� �����!!!");
	            return lab_1.subtask6();
	        }
	        // ���������� � �����
	        int number = Integer.parseInt(str);
	        if (number > 0 && (number % 2) == 0) {
	            System.out.println("������������� ������");
	        } else if (number > 0 && (number % 2) != 0) {
	            System.out.println("������������� ��������");
	        } else if (number < 0 && (number % 2) == 0) {
	            System.out.println("������������� ������");
	        } else if (number < 0 && (number % 2) != 0) {
	            System.out.println("������������� ��������");
	        } else if (number == 0) {
	            System.out.println("����");
	        }
	        return true;
	    }

	    private static boolean subtask7() { // ���������� ������
	        System.out.println("\n1.7 =================");
	        Scanner sc = new Scanner(System.in); // ����������� �����������
	        System.out.print("������� ��� ������(������-905, ������-194, ���������-491, �����-800): ");
	        String str = sc.nextLine(); // reads string
	        // �������� ��� ��� �����
	        boolean bNumeric = lab_1.isNumeric(str);
	        if (!bNumeric) {
	            System.out.println("�� ���� ��������� �����!!!");
	            return lab_1.subtask7();
	        }
	        // ���������� � �����
	        int number = Integer.parseInt(str);
	        double price = 0;
	        String city = "";
	        switch (number) {
	            case (905):
	                city = "������";
	                price = 4.15;
	                break;
	            case (194):
	                city = "������";
	                price = 1.98;
	                break;
	            case (491):
	                city = "���������";
	                price = 2.69;
	                break;
	            case (800):
	                city = "�����";
	                price = 5.00;
	                break;

	            default:
	                System.out.println("�������� ���");
	                return false;

	        }

	        System.out.println(city + ". ��������� ���������: " + price * 10);

	        return true;
	    }

	    private static boolean subtask8(int[] numbers) { // ���������� ������
	        System.out.println("\n1.8 =================");
	        int max = numbers[0];
	        int sumPos = 0;
	        int sumChetNeg = 0;
	        int countPos = 0;
	        double avgNeg = 0;
	        double avgNegSum = 0;
	        int avgCountNeg = 1;
	        for (int i = 0; i < numbers.length; i++) {
	            if (numbers[i] > max)
	                max = numbers[i];
	            if (numbers[i] > 0) {
	                sumPos = numbers[i] + sumPos;
	                countPos++;
	            }
	            if (numbers[i] < 0) {
	                if (numbers[i] % 2 == 0)
	                    sumChetNeg = sumChetNeg + numbers[i];
	                avgNegSum = avgNegSum + numbers[i];
	                avgNeg = avgNegSum / avgCountNeg;
	                avgCountNeg++;
	            }
	        }
	        System.out.println("������������ ��������: " + max + "\n����� ������������� ���������: " + sumPos
	                + "\n����� ������ ������������� ���������: " + sumChetNeg + "\n���������� ������������� ���������: "
	                + countPos + "\n������� �������������� ������������� ���������: " + avgNeg);

	        return true;
	    }

	    private static boolean subtask9(int[] numbers) { // ���������� ������
	        System.out.println("\n1.9 =================");
	        int[] massive = new int[numbers.length];
	        String str = "";
	        for (int i = 0; i < numbers.length; i++) {
	            massive[numbers.length - i - 1] = numbers[i];
	        }
	        str = Arrays.toString(massive);
	        System.out.println(str);
	        return true;
	    }

	    private static boolean subtask10(int[] numbers) { // ���������� ������
	        System.out.println("\n1.10 =================");
	        int[] massive = new int[numbers.length];
	        String str = "";
	        int j = 0;
	        int nullsCount = 0;
	        for (int i = 0; i < numbers.length; i++) {
	            if (numbers[i] != 0) {
	                massive[j] = numbers[i];
	                j++;
	            } else {
	                massive[massive.length - 1 - nullsCount] = numbers[i];
	                nullsCount++;
	            }
	        }
	        str = Arrays.toString(massive);
	        System.out.println(str);
	        return true;
	    }

	    private static Pattern pattern = Pattern.compile("-?\\d+");

	    public static boolean isNumeric(String strNum) {
	        if (strNum == null) {
	            return false;
	        }
	        return pattern.matcher(strNum).matches();
	    }
	}
