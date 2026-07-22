import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashSet;
import java.util.HashMap;
public class Practice4 {
    public static void main(String[]args){

        //ArrayList


        ArrayList <String> movieNames = new ArrayList<>();
        movieNames.add("KGF");
        movieNames.add("DHURENDAR");
        movieNames.add("PIE");
        System.out.println(movieNames);
        System.out.println(movieNames.size());
        System.out.println(movieNames.remove("KGF"));
        System.out.println(movieNames);


       System.out.println(movieNames.get(0));
       System.out.println(movieNames);

       for(int i = 0 ; i <movieNames.size();i++){
        System.out.println(movieNames.get(i));

    //Linkedlist


    LinkedList <String> games = new LinkedList<>();
    games.add("GTA");
    games.add("BGMI");
    games.add("ABC");
    games.add("RUN");
    System.out.println(games);

     games.addFirst("SWIM");
     System.out.println(games);
     System.out.println(games.getFirst());
     System.out.println(games.getLast());
     games.removeFirst();
     System.out.println(games);

    //HashSet

    HashSet <String> cities = new HashSet<>();
    cities.add("Sonipt");
    cities.add("panipat");
    cities.add("karnal");
    cities.add("Sonipt");

    cities.size();
     System.out.println(cities.size());
    System.out.println(cities);


    //Hashmap 

      HashMap <String, Integer> play = new HashMap<>();


      play.put("BGMI", 10);
      play.put("FreeFire", 8);
      play.put("WAR", 5);
      System.out.println(play.get("BGMI"));








        
       }

    }
    

