package domain;

import java.util.Random;

public enum TicketType {
    FULL, FULLVIP, FREEPASS, ONEDAY, ONEDAYVIP;

    public static TicketType getRandomTicketType() {
        Random random = new Random();
        return values()[random.nextInt(values().length)];
    }
}
