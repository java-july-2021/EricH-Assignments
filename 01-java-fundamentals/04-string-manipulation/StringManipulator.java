public class StringManipulator {
    public String trimAndConcat(String srt1, String str2) {
        String str3 = srt1.trim() + str2.trim();
        return str3;
    }

    public Integer getIndexOrNull(String srt, char letter) {
        int value = srt.indexOf(letter);
        if (value < 0){
            return null;
        }
        return value;
    }

    public Integer getIndexOrNull(String strA, String strB) {
        int values = strA.indexOf(strB);
        if (values < 0){
            return null;
        }
        return values;
    }

    public String concatSubstring(String str1, int int1, int int2, String str2) {
        str1 = str1.substring(int1, int2);
        String newWord = str1 + str2;
        return newWord;
    }
}
