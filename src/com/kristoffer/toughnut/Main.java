package com.kristoffer.toughnut;

import com.kristoffer.toughnut.lektion1.DataAddressArray;
import com.kristoffer.toughnut.lektion2.DoingItRightMethods;

public class Main {
    public static void main(String[] args) {

        // Instantiate Objects
        DataAddressArray dataAddressArray = new DataAddressArray();
        DoingItRightMethods doingItRightMethods = new DoingItRightMethods();

        // Lektion #1
        /* dataAddressArray.printArray();
        * */

        // Lektion #2

        doingItRightMethods.ifPractice();
        doingItRightMethods.forLoopPractice();
        doingItRightMethods.SwitchPractice();

        int x = 15;
        int y = 35;

        doingItRightMethods.addition(x, y);



    }
}
