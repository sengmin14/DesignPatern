package NonProxy;

import java.util.ArrayList;
import java.util.List;

public class ReservationService {

    private List<Reservation> reservations = new ArrayList<>();

    public void addReservation(Reservation reservation) {
        reservations.add(reservation);
    }

    public Reservation findReservation(int reservationId) {
        for(Reservation reservation : reservations) {
            if(reservation.getReservationId() == reservationId) {
                return reservation;
            }
        }
        return null;
    }


}
