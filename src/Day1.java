/*
# 30DaysOfCode

# Challenges on Core Java

# Day 1

WAP the Code Using Only Using One System.out.println().

Output :
Hi
Hello
Bye

 */


import java.util.Scanner;

public class Day1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String value1=scanner.next();
        String value2=scanner.next();
        String value3=scanner.next();
        System.out.println(value1+"\n"+value2+"\n"+value3);
    }
}
