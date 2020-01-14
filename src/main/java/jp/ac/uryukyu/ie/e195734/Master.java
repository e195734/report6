package jp.ac.uryukyu.ie.e195734;

import javax.print.attribute.standard.Finishings;
import java.util.ArrayList;

public class Master {
    String path = "PlayerData.txt";

    public void master(ArrayList<Player> players){
        String gcl = utils.GetCommandLine();
        otherAction(gcl);
    }

    void roadFile(){
        System.out.println("プレイヤーデータのファイルを指定してください");
        this.path = utils.GetCommandLine();
    }

    void otherAction(String gcl){
        if(gcl.equals("fin.")){
            System.out.println("プログラムを終了します。");
            System.exit(0);
        }
        else if(gcl.equals("help")||gcl.equals("?")){
            System.out.println("使用法：ロール名 対象\n全員を対象とする場合は空白or all と入力");
        }
    }
}
