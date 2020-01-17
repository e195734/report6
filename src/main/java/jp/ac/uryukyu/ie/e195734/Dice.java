package jp.ac.uryukyu.ie.e195734;

import java.util.Random;

/**
 * Diceクラス。
 * created by Naoru Chinen
 */
public class Dice {
    /**
     *ダイスの値を返すメソッド。
     * @param diceType ダイスの種類。1d100や1d6などと入力。
     * @return ただしく実行されたときはダイスの値、その他は-1と返す。
     */
    public static int dice(String diceType){
        String[] dice = diceType.split("d");
        if(dice.length == 2){
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

    /**
     *ダイスの値を返すメソッド。引数がない場合で、1d100(1から100までのランダムな値)を返す。
     * @return ただしく実行されたときはダイスの値、その他は-1と返す。
     */
    public static int dice(){
        return dice("1d100");
    }

    /**
     * ロールの成功か否かをコマンドラインに出力するメソッド。
     * @param dice int 通常1から100の間
     * @param value int 通常1から100の間
     * @param name String プレイヤーの名前
     */
    public static void result(int dice,int value,String name){
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
