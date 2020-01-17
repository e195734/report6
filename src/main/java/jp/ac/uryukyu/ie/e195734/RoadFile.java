package jp.ac.uryukyu.ie.e195734;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * RoadFileクラス。
 * created by Naoru Chinen
 */
public class RoadFile {
    /**
     * ファイルを読み込み1行ずつに分け返します。
     * @param path String ファイルを読み込む絶対パス
     * @return ArrayList
     */
    public static ArrayList<String> readLine(String path) {
        ArrayList<String> list = new ArrayList<>();
        try {
            File file = new File(path);

            if (!file.exists()) {
                System.out.println("ファイルが存在しません");
                return list;
            }
            else{
                System.out.println("ファイルを読み込みました。");
            }

            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String data;
            while ((data = bufferedReader.readLine()) != null) {
                list.add(data);
            }

            bufferedReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

}
