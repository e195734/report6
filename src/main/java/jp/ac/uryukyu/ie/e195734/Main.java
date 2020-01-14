package jp.ac.uryukyu.ie.e195734;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<Player> players = new ArrayList<>();
        Master master = new Master();

        master.roadFile();
        while(true){
            master.master(players);
        }
    }
}
