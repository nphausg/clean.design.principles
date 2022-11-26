/**
 * Created by nphau on 07/03/2022, 00:30
 * Copyright (c) 2022 . All rights reserved.
 * Last modified 07/03/2022, 15:54
 */
package com.nphausg.clean.principles.solid.srp;

public class TaskScheduling {
    public String compute() {
        return "computing data base on user input ...";
    }

    public String save() {
        return "save the objet to database";
    }

    public String sendNotification() {
        return "send the notification to the user";
    }
}
