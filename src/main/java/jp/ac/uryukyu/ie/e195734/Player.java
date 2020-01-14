package jp.ac.uryukyu.ie.e195734;

import java.util.HashMap;

public class Player {
    private String name;
    private HashMap<String,Integer> stat = new HashMap<>();

    Player(String stringData){
        for(String sd:stringData.split(",")){
            String[] spd = sd.split(":");
            if(spd[0].equals("name")){
                this.name = spd[1];
            }
            else{
                this.stat.put(spd[0],Integer.parseInt(spd[1]));
            }
        }
    }

    public String getName(){
        return this.name;
    }

    public int getStat(String key){
        return this.stat.get(key);
    }

}
