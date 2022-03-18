/**
 * Created by nphau on 07/03/2022, 00:30
 * Copyright (c) 2022 . All rights reserved.
 * Last modified 07/03/2022, 15:54
 */
package sg.nphau.clean.principles;

import sg.nphau.clean.principles.delegation.FlightTicket;
import sg.nphau.clean.principles.delegation.TicketBookingByAgent;
import sg.nphau.clean.principles.delegation.TrainTicket;
import sg.nphau.clean.principles.solid.s.*;

public class Main {

    public static void main(String[] args) {
        // Delegation Demo
        TrainTicket trainTicket = new TrainTicket();
        FlightTicket flightTicket = new FlightTicket();
        TicketBookingByAgent agent = new TicketBookingByAgent(trainTicket);
        agent.book();
        agent.setT(flightTicket);
        agent.book();

        // Single Responsibility Demo
        SchedulingApplication application = new SchedulingApplication(
                new Compute(), new Save(), new Notification()
        );
        application.schedule();
    }
}
