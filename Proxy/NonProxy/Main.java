package NonProxy;

public class Main {

    public static void main(String[] args) {
        ReservationService reservationService = new ReservationService();

        Reservation reservation = new Reservation(1, "홍길동", "프랑스 파리");
        reservationService.addReservation(reservation);

        Reservation findReservation = reservationService.findReservation(1);
        if(findReservation != null) {
            System.out.println("예약 번호: " + findReservation.getReservationId() +
                    ", 여행자: " + findReservation.getTravelerName() +
                    ", 목적지: " + findReservation.getDestination());
        } else {
            System.out.println("에약 정보를 찾을 수 없습니다.");
        }

    }
}
