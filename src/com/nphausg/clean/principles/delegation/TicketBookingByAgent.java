/**
 * Created by nphau on 07/03/2022, 00:30
 * Copyright (c) 2022 . All rights reserved.
 * Last modified 07/03/2022, 15:54
 */
package com.nphausg.clean.principles.delegation;

public class TicketBookingByAgent implements TravelBooking {

    private TravelBooking t;

    public TicketBookingByAgent(TravelBooking t) {
        this.t = t;
    }

    @Override
    public void book() {
        t.book();
    }

    public void setT(TravelBooking t) {
        this.t = t;
    }
}
