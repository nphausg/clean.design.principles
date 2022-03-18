/**
 * Created by nphau on 07/03/2022, 00:30
 * Copyright (c) 2022 . All rights reserved.
 * Last modified 07/03/2022, 15:54
 */
package sg.nphau.clean.principles.solid.srp;

public class SRPExample {
    public static void main(String[] args) {
        SchedulingApplication application = new SchedulingApplication(
                new Compute(), new Save(), new Notification()
        );
        application.schedule();
    }
}
