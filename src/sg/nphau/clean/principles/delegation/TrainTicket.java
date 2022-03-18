/**
 * Created by nphau on 07/03/2022, 00:30
 * Copyright (c) 2022 . All rights reserved.
 * Last modified 07/03/2022, 15:54
 */
package sg.nphau.clean.principles.delegation;

public class TrainTicket implements TravelBooking {

    @Override
    public void book() {
        System.out.println("Train ticket booked!.");
    }
}
