/**
 * Created by nphau on 07/03/2022, 00:30
 * Copyright (c) 2022 . All rights reserved.
 * Last modified 07/03/2022, 15:54
 */
package sg.nphau.clean.principles.delegation;

public class DelegationExample {
    public static void main(String[] args) {
        // Delegation Demo
        TrainTicket trainTicket = new TrainTicket();
        FlightTicket flightTicket = new FlightTicket();
        TicketBookingByAgent agent = new TicketBookingByAgent(trainTicket);
        agent.book();
        agent.setT(flightTicket);
        agent.book();
    }
}
