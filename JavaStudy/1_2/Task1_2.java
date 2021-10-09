public class Task1_2{
    public static void main(String[] args){
        String[] country = {"JAPAN", "AMWRICA", "KOREA"};
        System.out.println("配列countryの要素数…" + country.length);
        String[] strArray = new String[3];
        strArray[0] = "りんご";
        strArray[1] = "もも";
        strArray[2] = "ぶどう";
        System.out.println(strArray[1]);
        //「10」、「20」、「30」、「40」、「50」を要素の値とする配列 intArrayを作成。
        int[] intArray = {10, 20, 30, 40, 50};
        //添え字（インデックス）が1の要素の値と4の要素の値の合計を表示
        System.out.println(intArray[1] + intArray[4]);
    }
}