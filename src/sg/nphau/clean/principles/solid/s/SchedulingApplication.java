/**
 * Created by nphau on 07/03/2022, 00:30
 * Copyright (c) 2022 . All rights reserved.
 * Last modified 07/03/2022, 15:54
 */
package sg.nphau.clean.principles.solid.s;

public class SchedulingApplication {
    private Compute compute;
    private Save save;
    private Notification notification;

    public SchedulingApplication(Compute compute, Save save, Notification notification) {
        this.compute = compute;
        this.save = save;
        this.notification = notification;
    }

    public void schedule() {
        System.out.println(compute.compute());
        System.out.println(save.save());
        System.out.println(notification.sendNotification());
    }
}
