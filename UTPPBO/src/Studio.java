public class Studio {
    private Movie movie;
    private String type;
    private boolean seats;

    public Studio(String type) {
        this.type = type;
    }

    // public String getStudioInfo(){

    // }

    // public int isBooked(char row, int col) {
    //     return;
    // }

    // public boolean reserve(char row, int col){

    // }

    public Movie getMovie() {
        return movie;
    }

    public String getType() {
        return type;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    private void setSeats(boolean seats) {
        this.seats = seats;
    }

}
