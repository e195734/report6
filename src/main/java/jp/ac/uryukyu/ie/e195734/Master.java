package jp.ac.uryukyu.ie.e195734;

import java.util.ArrayList;
import java.util.Arrays;

public class Master {

    public void master(){
        String gcl = utils.GetCommandLine();
        if(otherAction(gcl)==-1){
            return;
        }
        mainAction(gcl);
    }

    void roadFile() {
        System.out.println("プレイヤーデータのファイルを指定してください");
        String path = utils.GetCommandLine();
        if(path.equals("")){
            path = "/Users/naoru/Desktop/data.txt";
        }
        ArrayList<String> playersStringData = RoadFile.readLine(path);
        for (String playerStringData : playersStringData) {
            Players.players.add(new Player(playerStringData));
        }
    }

    int otherAction(String gcl){
        if(gcl.equals("fin.")){
            System.out.println("プログラムを終了します。");
            System.exit(0);
            return -1;
        }
        else if(gcl.equals("help")||gcl.equals("?")){
            System.out.println("使用法：ロール名 対象\n全員を対象とする場合は空白または all と入力");
            return -1;
        }
        if(gcl.equals("")){
            return -1;
        }
        return 0;
    }

    private void mainAction(String gcl){
        ArrayList<String> cll = new ArrayList<>(Arrays.asList(gcl.split(" ")));
        ArrayList<String> playerList = new ArrayList<>();
        if(cll.size()==1){
            cll.add("all");
        }

        if(cll.get(1).equals("all")){
            for(Player player:Players.players){
                playerList.add(player.getName());
            }
        }
        else{
            playerList.addAll(Arrays.asList(cll.get(1).split(",")));
        }

        if(cll.get(0).equals("san")){
            System.out.println("近日実装");
        }
        else {
            String roll = cll.get(0);
            loop:
            for(String playerName:playerList){
                for(Player player:Players.players){
                    if(playerName.equals(player.getName())){
                        int stat;
                        try{
                            stat = player.getStat(roll);
                            Dice.result(Dice.dice(),stat,playerName);
                        }catch(NullPointerException e){
                            System.out.println("正しい技能値を入力してください。");
                            break loop;
                        }
                        break;
                    }
                }
            }
        }
    }
}
