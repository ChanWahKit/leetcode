package code.设计Goal解析器5617;

/**
 * 只需按部就班判断当前字符和下一个字符
 */
public class Interpret {
    public String interpret(String command) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < command.length(); i++) {
            char current = command.charAt(i);
            if (current == 'G') {
                result.append('G');
                continue;
            }
            if (current == '(') {
                char pre = command.charAt(i + 1);
                if (pre == ')') {
                    result.append('o');
                    i = i + 1;
                } else {
                    result.append("al");
                    i = i + 2;
                }
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String result = new Interpret().interpret("(al)G(al)()()G");
        System.out.println(result);
        assert result.equals("alGalooG");
    }
}
