package jp.ac.uryukyu.ie.e195734;

import java.util.Scanner;

/**
 * utilsクラス。
 */
public class utils {
    /**
     *
     * @return String コマンドラインに入力された文字列をString で返します。
     */
    public static String GetCommandLine(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
