package ru.ranepa;

import java.util.Scanner;
import java.util.ArrayList;

import java.util.List;

public class Student {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        List<Integer> marks = new ArrayList<>();
        int kolvo = 0;

        while (scanner.hasNextInt()) {
            int mark = scanner.nextInt();
            if (mark == 0) break;
            marks.add(mark);
            kolvo += mark;
        }

        double SRS = marks.isEmpty() ? 0 : (double) kolvo / marks.size();
         String SRS_status = "Никто";
         if (SRS < 2.5);
        System.out.println(name);
        for (int mark : marks) {
            System.out.print(mark + " ");
        }
        System.out.println();
        System.out.println(SRS);

        scanner.close();
    }
}