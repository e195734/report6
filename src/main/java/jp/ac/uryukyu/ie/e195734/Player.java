package jp.ac.uryukyu.ie.e195734;

import java.util.HashMap;

public class Player {
    private String name;
    private HashMap<String,Integer> stat = new HashMap<>();

    Player(HashMap<String,Integer> stat){

    }

    public String getName(){
        return this.name;
    }

    public int getStat(String key){
        return this.stat.get(key);
    }

}
