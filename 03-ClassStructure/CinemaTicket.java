public class CinemaTicket {
    static String cinemaName = "Morninig Star Cinema";
    public String filmTitle;
    public int seat, row, price;

    public CinemaTicket(String filmTitle, int seat, int row) {
        this.filmTitle = filmTitle;
        this.seat = seat;
        this.row = row;
        if (row <= 2) {
            this.price = 10;
        } else {
            this.price = 25;
        }
    }

    public void displayTicket() {
        System.out.println("Cienma Name: " + cinemaName);
        System.out.println("Film Title: " + filmTitle);
        System.out.println("Seat: " + seat);
        System.out.println("Row: " + row);
        System.out.println("Price: " + price + "$");
    }

    public static void main(String[] args) {

        CinemaTicket ticket1 = new CinemaTicket("Gladiator", 10, 2);
        CinemaTicket ticket2 = new CinemaTicket("Filmt Title 2", 13, 7);
        ticket1.displayTicket();
        ticket2.displayTicket();
    }
}