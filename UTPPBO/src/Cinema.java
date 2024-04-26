import java.util.*;

public class Cinema {
    Scanner in = new Scanner(System.in);

    private String name;
    private User[] users;
    private Studio[] listStudio;
    private int studioCapacity;

    public Cinema(String name, int studioCapacity) {
        this.name = name;
        this.studioCapacity = studioCapacity;
    }

    private void init (){
        addStudioWithMovies("Premiere", "Siksa Kubur", 8.9, new String[]{"Horror", "Drama", "Thriller"});
        addStudioWithMovies("Imax", "Siksa Kubur", 8.9, new String[]{"Horror", "Drama", "Thriller"});
        addStudioWithMovies("Reguler", "Siksa Kubur", 8.9, new String[]{"Horror", "Drama", "Thriller"});
        addStudioWithMovies("Premiere", "AADC", 8.6, new String[]{"Roman", "Drama", "Fiksi"});
        addStudioWithMovies("Imax", "AADC", 8.6, new String[]{"Roman", "Drama", "Fiksi"});
        addStudioWithMovies("Reguler", "AADC", 8.6, new String[]{"Roman", "Drama", "Fiksi"});
        addStudioWithMovies("Premiere", "Kancil & Kepiting", 7.1, new String[]{"Edukasi", "Drama", "Fiksi"});
        addStudioWithMovies("Imax", "Kancil & Kepiting", 7.1, new String[]{"Edukasi", "Drama", "Fiksi"});
        addStudioWithMovies("Reguler", "Kancil & Kepiting", 7.1, new String[]{"Edukasi", "Drama", "Fiksi"});
        addStudioWithMovies("Premiere", "Anak Durhaka", 7.5, new String[]{"Edukasi", "Drama", "Fiksi"});
        
    }

    public boolean registerUser(User user){
        User user1 = new User("nafasyah@gmail.com", "1234", "nafasyah", 100000)
        System.out.println("Register to our system");
        System.out.println("Fullname: " + user1); in.nextLine();
        System.out.println("Email: "); in.nextLine();
        System.out.println("Password: "); in.nextLine();
        System.out.println("Initial Balance: "); in.nextInt();
        System.out.println("Successfully registered User!");
        return true;
    }

    public User authenticateUser(String email, String password){

    }
    
    public void displayListStudio(){

    }

    public void displayStudioDetail(int studioNumber){
        
    }

    public boolean addStudioWithMovies(String studioType, String movieTitle, double movieRating, String[] movieGenres){

    }

    public boolean bookTicket(User user, int studioNumber, char row, int col){

    }

    public String getName(){
        return name;
    }
    
}
