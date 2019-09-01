package threads;

import domain.FestivalGate;

public class FestivalStatisticsThread implements Runnable {
    FestivalGate gate;

    public FestivalStatisticsThread(FestivalGate gate) {
        this.gate = gate;
    }

    @Override
    public void run() {
        while (gate.getAttendeeList() != null) {
            try {
                gate.printTicketsNumber();
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
