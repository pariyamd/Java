import com.oracle.xmlns.internal.webservices.jaxws_databinding.ExistingAnnotationsType;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
   static int propertyNum=40;
    static ArrayList<Room> rooms=new ArrayList<>();
//    private static List<Player> players=new List<>();
    private static ArrayList<Player> players=new ArrayList<>();
    public static Room getPropertyById(int id) {
        for (int i=0;i<propertyNum;i++)
            if(rooms.get(i).getId()==id) return rooms.get(id);
        return null;
    }
    public static void main(String[] args) {
        //building rooms
        Room Go=new Room(0);
        rooms.add(Go);
        Room Jail=new Room(10);
        rooms.add(Jail);
        Room Parking=new Room(20);
        rooms.add(Parking);
        Room GoToJail=new Room(30);
        rooms.add(GoToJail);
        int PlayersNum=6;
        for (int i = 0; i <PlayersNum ; i++) {
            Player player=new Player();
            System.out.println(i+" "+ Player.totalPlayers);
            players.add(player);
        }
        //        player1.play(T1.toss()+T2.toss());
        GUI game=new GUI();
        game.setFrame();
        }
}

