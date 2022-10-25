public class CinemaTicket {
    
    String CinemaName;
    String FilmTitle;
    int row;
    int seat;
    int price;

    public void displayAll(){
        System.out.println("Cinema name "+CinemaName+"FilmTitle "+FilmTitle+"Row "+row+"seat "+seat+"price "+price);
    }
}
    public static void main(String[] args){
        CinemaTicket T1 = new CinemaTicket();
        CinemaTicket T2 = new CinemaTicket();
        
        T1.FilmTitle="DrStranger"
        T1.row=5;
        T1.seat=7;
        T.price=5.50;
        
        t1.displayTicket();
        t2.displayTickets();
    }