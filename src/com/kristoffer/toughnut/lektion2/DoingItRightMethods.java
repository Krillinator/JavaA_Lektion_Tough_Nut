package com.kristoffer.toughnut.lektion2;

public class DoingItRightMethods {

    // MIMC - More is more complex - Programming Principle
    // DRY - Do not repeat yourself - Programming Principle

    public void ifPractice() {
        int age = 18;

        if (age >= 18) {
            System.out.println("ADULT");
        } else {
            System.out.println("UNDERAGE");
        }
    }
    public void forLoopPractice() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
    public void SwitchPractice() {
        int day = 6;

        switch (day) {
            case 6:
            case 7:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("WEEKDAY");
        }
    }

    // What about data params?
    public int addition(int x, int y) {

        return x + y;
    }

}
