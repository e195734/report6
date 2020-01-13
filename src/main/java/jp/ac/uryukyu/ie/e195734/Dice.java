package jp.ac.uryukyu.ie.e195734;

import java.util.Random;

public class Dice {
    public static int dice(String diceType){
        String[] dice = diceType.split("d");
        if(dice.length != 2){
            int num = 0;

            for(int i = 0;i < Integer.parseInt(dice[0]);i++){
                Random random = new Random();
                num += random.nextInt(Integer.parseInt(dice[1]));
            }
            return num;
        }
        else{
            System.out.println("正しくダイスの条件を入力してください\n例：1d100");
            return -1;
        }
    }

    public static int dice(){
        return dice("1d100");
    }
}
