package jp.ac.uryukyu.ie.e195734;

import java.util.HashMap;

/**
 * playerクラス。
 * name プレイヤーの名前
 * stat プレイヤーのステータス。技能名をkey,技能値をvalueとし、hashMapで保存。
 * created by Naoru Chinen
 */
public class Player {
    private String name;
    private HashMap<String,Integer> stat = new HashMap<>();

    /**
     * コンストラクタ。Stringデータからプレイヤーのフィールド変数に代入。
     * Stringのデータ例：
     * 格闘:25,目星:50,聞き耳:20,name:太郎
     *
     * 技能名:技能値を1つのデータとし、カンマで区切る。
     *
     * @param stringData Player
     */
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

    /**
     * フィールド変数nameのgetterメソッド
     * @return String
     */
    public String getName(){
        return this.name;
    }

    /**
     * 技能値に対応する技能値をフィールド変数statから取り出すgetterメソッド。
     * @param key String 技能名
     * @return String 技能値
     */
    public int getStat(String key){
        return this.stat.get(key);
    }

}
