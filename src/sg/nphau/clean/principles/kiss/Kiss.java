/**
 * Created by nphau on 07/03/2022, 00:30
 * Copyright (c) 2022 . All rights reserved.
 * Last modified 07/03/2022, 15:54
 */
package sg.nphau.clean.principles.kiss;

/**
 * Most systems work best if they are kept simple rather than made complex.
 * <p>
 * Why
 * <p>
 * Less code takes less time to write, has less bugs, and is easier to modify.
 * Simplicity is the ultimate sophistication.
 * It seems that perfection is reached not when there is nothing left to add, but when there is nothing left to take away.
 */
public class Kiss {

    private static String getMonthWithKISS(int month) {
        return switch (month) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> throw new IllegalArgumentException("Month must be in range 1 to 12");
        };
    }

    private static String getMonthNoKISS(int month) {
        if (month < 1 || month > 12)
            throw new IllegalArgumentException("Month must be in range 1 to 12");
        else {
            String[] months = {"January", "February", "March", "April", "May", "June", "July", "August",
                    "September", "November", "December"};
            return months[month - 1];
        }
    }
}
