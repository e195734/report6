package jp.ac.uryukyu.ie.e195734;

import java.util.ArrayList;
import java.util.Arrays;

public class Master {

    public void master(){
        String gcl = utils.GetCommandLine();
        otherAction(gcl);
        mainAction(gcl);
    }

    void roadFile(){
        System.out.println("プレイヤーデータのファイルを指定してください");
        String path = utils.GetCommandLine();
        ArrayList<String> playersStringData = RoadFile.readLine(path);
        for(String playerStringData:playersStringData){
            Players.players.add(new Player(playerStringData));
        }
    }

    void otherAction(String gcl){
        if(gcl.equals("fin.")){
            System.out.println("プログラムを終了します。");
            System.exit(0);
        }
        else if(gcl.equals("help")||gcl.equals("?")){
            System.out.println("使用法：ロール名 対象\n全員を対象とする場合は空白または all と入力");
        }
    }

    private void mainAction(String gcl){
        ArrayList<String> cll = new ArrayList<>(Arrays.asList(gcl.split(" ")));
        if(cll.size()==1){
            cll.add("all");
        }
        if(cll.get(0).equals("san")){

        }
        else {

        }
    }
}
