public class CinemaTicket {
    static String cinemaName = "Decent Cinema";
    public String filmTitle, seat, row, price;

    // Constructor 2nd approach
    // public CinemaTicket(String filmTitle1, String seat1, String row1, String
    // price1) {
    // filmTitle = filmTitle1;
    // seat = seat1;
    // row = row1;
    // price = price1;
    // }

    public void displayTicket() {
        System.out.println("Cienma Name: " + cinemaName);
        System.out.println("Film Title: " + filmTitle);
        System.out.println("Seat: " + seat);
        System.out.println("Row: " + row);
        System.out.println("Price: " + price + "$");
    }

    public static void main(String[] args) {
        CinemaTicket ticket1 = new CinemaTicket();
        ticket1.filmTitle = "Film Title1";
        ticket1.seat = "123";
        ticket1.row = "53";
        ticket1.price = "89";
        ticket1.displayTicket();

        // CinemaTicket ticket2 = new CinemaTicket("Filmt Title 2", "43", "23", "99");
        // ticket2.displayTicket();
    }
}