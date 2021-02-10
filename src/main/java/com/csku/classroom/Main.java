package com.csku.classroom;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();

        Student student = new Student(name);
        System.out.println();
    }
}
