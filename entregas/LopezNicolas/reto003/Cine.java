package entregas.LopezNicolas.reto003;

 class Cinema {

    public Cinema(String name, Location location);

    public void open();
    public void open(Date date);
    public void open(Intervalo time);
    public void closed();
    public boolean nowOpen();
    public String[] billboard(Movie movie);
    public int rooms();
    public Ticket sellTicket();
 }
 class Movie {
    public Movie (String title, String director, int duration);
 }
 class Location{
    public Location (String street, String city, int number);
 }
 class Room{
    public Room (int roomNumber, int roomCapacity);
 }
 class Ticket {
    public Ticket (Movie movie, Room room, int seat, Visitor visitor);
 }
 class Visitor {
    public Visitor (String name, int age);
 }

 Location myLocation = new Location("C. Ruamayor","Santander",6);
 Cinema myCinema = new Cinema("Los Angeles", myLocation);

 if(myCinema.nowOpen()){
    Movie Cars = new Movie("Cars","John Lasseter", 117);
    Visitor mMasias = new Visitor("Masias", 25);
    myCinema.sellTicket(mMasias);
 } else {
    myCinema.open();
 }
myCinema.closed();


 
