package org.example;

public class Main {
    public static void main(String[] args) {
        int a = sum(15);
        System.out.println(a);
    }

    public static Integer sum(Integer n) {
        Integer tot = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                tot += i;
            }
        }
        return tot;
    }
}