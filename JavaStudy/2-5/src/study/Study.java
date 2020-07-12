package study;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * 本課題では、コレクションフレームワークのList系クラスとMap系クラスの基本的な記述を学びましょう。
 * 現場で必ず使用するものなので、ポイントをしっかり押さえておきましょう。
 *
 * 問①〜問③まであります。 問②に関しては、コメントを記述してください。
 *
 */
public class Study {
    public static final String SHOP_SHOHIN_00 = "バナナ";
    public static final String SHOP_SHOHIN_01 = "牛乳";
    public static final String SHOP_SHOHIN_02 = "豚肉";
    public static final String SHOP_SHOHIN_03 = "コロッケ";

    public static void main(String args[]) {
        // ① 定数を全て使って、String型のListを記述してください。
        List<String> shohinList = new LinkedList<String>();
        shohinList.add(SHOP_SHOHIN_00);
        shohinList.add(SHOP_SHOHIN_01);
        shohinList.add(SHOP_SHOHIN_02);
        shohinList.add(SHOP_SHOHIN_03);
        // ② 以下の「shopMap.put(shohinList.get(1), 180);」の処理について、コメントを記述してください。
        /*
         * shopMapにputメソッドで要素の追加をする。
         * putメソッドは第１引数がキー、第２引数がキーに紐づく値の２つ指定する。
         * getメソッドによってshohinListの2番目の値を取り出したものを第1引数に。
         * 第2引数にはそれに紐づく値段（180）をそれぞれ入れている。
         *
         */
        HashMap<String, Integer> shopMap = new HashMap<String, Integer>();
        shopMap.put(shohinList.get(0), 125);
        shopMap.put(shohinList.get(1), 180);
        shopMap.put(shohinList.get(2), 350);
        shopMap.put(shohinList.get(3), 100);
        // ③ カリキュラムを参考に拡張for文を使って、課題の画像と同じ表示になるよう記述してください。
        // 「shohinList」と「shopMap」が保持する値を上手く利用しましょう。
        for (String list : shohinList) {
            System.out.println(list + "=" + shopMap.get(list) + "円になります！");
        }
    }
}