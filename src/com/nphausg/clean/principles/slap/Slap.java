/**
 * Created by nphau on 07/03/2022, 00:30
 * Copyright (c) 2022 . All rights reserved.
 * Last modified 07/03/2022, 15:54
 */
package com.nphausg.clean.principles.slap;

/**
 * Single level of Abstraction Principle
 * One reason to change, Easy to Read, Reuse, Test
 */
public class Slap {

    // Should not
    public static void getDetailsAndMail() {
        // Code to fetch details from database
        System.out.println("Fetching details from database");
        // code to email the user
        System.out.println("Mailing to the user");
    }

    public static void getDetailsAndMailWithSlap() {
        // Code to fetch details from database
        System.out.println("Fetching details from database");
        String email = "email";
        emailTheUser(email);
    }

    // Should
    public static void emailTheUser(String email) {
        // code to email the user
        System.out.println("Mailing to the user: " + email);
    }
}
