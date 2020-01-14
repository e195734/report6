package jp.ac.uryukyu.ie.e195734;

import java.util.Scanner;

public class utils {
    public static String GetCommandLine(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static void diceResult(int dice,int value,String name){
        String stat;
        if(dice<=value) {
            stat = "成功";
            if (dice <= 5) {
                stat = "クリティカル";
            }
        }
        else {
            stat = "失敗";
            if (dice > 96) {
                stat = "ファンブル";
            }
        }
        System.out.println(name + ":" + stat + "( ダイス:" + dice + " 技能値:" + value +" )");
    }



}
