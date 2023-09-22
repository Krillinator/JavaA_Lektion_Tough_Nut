package com.kristoffer.toughnut;

import com.kristoffer.toughnut.lektion1.DataAddressArray;
import com.kristoffer.toughnut.lektion2.DoingItRightMethods;
import com.kristoffer.toughnut.lektion3.Student;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {

        /* Coding and Packages, what should be included */

        // Instantiate Objects
        DataAddressArray dataAddressArray = new DataAddressArray();
        DoingItRightMethods doingItRightMethods = new DoingItRightMethods();
        Student benny = new Student("Benny", 18, true);

        // Lektion #1
        /* dataAddressArray.printArray();
        * */

        // Lektion #2
        /*
        doingItRightMethods.ifPractice();
        doingItRightMethods.forLoopPractice();
        doingItRightMethods.SwitchPractice();

        int x = 15;
        int y = 35;

        doingItRightMethods.addition(x, y);
         */

        // Lektion #3
        System.out.println(benny);



    }
}
