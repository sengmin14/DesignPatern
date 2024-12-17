package NonProxy;

public class Reservation {

    private int reservationId;
    private String travelerName;
    private String destination;

    public Reservation(int reservation, String travelerName, String destination) {
        this.reservationId = reservation;
        this.travelerName = travelerName;
        this.destination = destination;
    }

    public int getReservationId() {
        return reservationId;
    }

    public String getTravelerName() {
        return travelerName;
    }

    public String getDestination() {
        return destination;
    }
}
