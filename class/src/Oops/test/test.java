package Oops.test;

abstract class QuickRide {
    int price;
    String booking_ID;
    QuickRide(int price,String booking_ID){
        this.price = price;
        this.booking_ID = booking_ID;
    }
    public void rideBooked(){
        System.out.println("Your ride has been booked");
    }

    }

    interface Cancel{
    void getRefund();
    }


    class Cab extends QuickRide implements Cancel{
    Cab(int price,String booking_ID){
        super(price,booking_ID);
    }

    @Override
      public void getRefund(){
        System.out.println("gets a refund of Rs 300 on Canceling");
    }
    public void Schedule(){
        System.out.println("Scheduled the ride at 10:00 AM");
    }


    }
    class TrainTicket extends QuickRide implements Cancel{
        public TrainTicket(int price, String booking_ID) {
            super(price, booking_ID);
        }
        @Override
        public void getRefund(){
            System.out.println("gets a refund of Rs 1000 on Canceling");
        }
    }
    class Bus extends QuickRide{
        public Bus(int price, String booking_ID) {
            super(price, booking_ID);
        }

    }
public class test {
    public static void main(String[] args) {
        Cab customer1 = new Cab(500,"CAB101");
        Bus customer2 = new Bus(1200,"TRN202");
        TrainTicket customer3 = new TrainTicket(200,"BUS303");
        customer1.rideBooked();customer1.getRefund();
        customer2.rideBooked();
        customer3.rideBooked();
        customer3.getRefund();
    }
}