import domain.FestivalGate;
import domain.TicketType;
import threads.FestivalAttendeeThread;
import threads.FestivalStatisticsThread;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        FestivalGate gate = new FestivalGate();


        TicketType ticketType = null;


        for (int i = 0; i < 100; i++) {
            Thread t2 = new Thread(new FestivalAttendeeThread(ticketType.getRandomTicketType(), gate));
            t2.start();
            //System.out.println(ticketType.getRandomTicketType());
        }

        Thread t1 = new Thread(new FestivalStatisticsThread(gate));
        t1.start();

    }

}
