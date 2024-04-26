public class Ticket {
    private Movie movie;
    private int studioNumber;
    private static double price;
    private String seat;

    public Ticket(Movie movie, int studioNumber, String seat) {
        this.movie = movie;
        this.studioNumber = studioNumber;
        this.seat = seat;
    }

    public String getTicketInfo(){
        String display = "List Tiket yang sudah dipesan: \n" + 
        "Studio Number:  "+ getStudioNumber() + "\n" + "Movie name: " + movie.getTitle()+"\n" + 
        "Price: " + getPrice() + "\n" + "Seat: " + getSeat() + "\n";
        return display;
    }

    public Movie getMovie(){
        return this.movie;
    }

    public int getStudioNumber(){
        return this.studioNumber;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice(){
        return this.price;
    }

    public String getSeat(){
        return this.seat;
    }

    public static double getTicketPrice(String type){
        if (type.equalsIgnoreCase("Premiere")) {
            price = 120;
        }
        else if (type.equalsIgnoreCase("Imax")){
            price = 100;
        }
        else if (type.equalsIgnoreCase("Reguler")){
            price = 50;
        }
        return price;
    }
    
}
