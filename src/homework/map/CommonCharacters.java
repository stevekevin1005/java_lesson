package homework.map;

public class CommonCharacters {
    public static void main(String[] args) {
        String str1 = "aabbcc";
        String str2 = "abcc";
        //合併字串
        String str = str1.concat(str2);

        //map 特性 有重複
        //set 特性 沒有重複
        SET<String> str = new MAP<>();
        for(String str: str){
            str.add(str);
        }
        // 預期結果 {a=1, b=1, c=2}
        System.out.println("");
    }
}
