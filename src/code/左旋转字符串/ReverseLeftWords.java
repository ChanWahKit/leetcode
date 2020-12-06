package code.左旋转字符串;

/**
 * 是的，我是撒比
 */
public class ReverseLeftWords {
    public String reverseLeftWords(String s, int n) {
        StringBuilder result = new StringBuilder();
        String left = s.substring(0,n);
        result = result.append(s.replaceAll(left,"")).append(left);
        return result.toString();
    }

    public static void main(String[] args) {
        String result = new ReverseLeftWords().reverseLeftWords("lrloseumgh",6);
        assert result.equals("umghlrlose");
    }
}
