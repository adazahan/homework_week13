package domain;

import java.util.ArrayList;
import java.util.List;

public class FestivalGate {
    private List<TicketType> attendeeList = new ArrayList<>();
    int nrFull = 0, nrFullVip = 0, nrFreePass = 0, nrOneDay = 0, nrOneDayVip = 0, s = 0;

    public List<TicketType> getAttendeeList() {
        return attendeeList;
    }

    public void setAttendeeList(List<TicketType> attendeeList) {
        this.attendeeList = attendeeList;
    }

    public void addAttendee(TicketType ticketType) {
        attendeeList.add(ticketType);
    }

    public void printTicketsNumber() {
        for (int i = 0; i < attendeeList.size(); i++) {
            if (attendeeList.get(i).equals(TicketType.FULL)) {
                nrFull++;
            }
            if (attendeeList.get(i).equals(TicketType.FULLVIP)) {
                nrFullVip++;
            }

            if (attendeeList.get(i).equals(TicketType.FREEPASS)) {
                nrFreePass++;
            }

            if (attendeeList.get(i).equals(TicketType.ONEDAY)) {
                nrOneDay++;
            }

            if (attendeeList.get(i).equals(TicketType.ONEDAYVIP)) {
                nrOneDayVip++;
            }
        }
        s = nrFull + nrFullVip + nrFreePass + nrOneDay + nrOneDayVip;

        System.out.println(s + " people entered");
        System.out.println(nrFull + " people have full tickets");
        System.out.println(nrFreePass + " have free passes");
        System.out.println(nrFullVip + "  have full VIP passes");
        System.out.println(nrOneDay + " have one-day passes");
        System.out.println(nrOneDayVip + " have one-day VIP passes");
    }
}

