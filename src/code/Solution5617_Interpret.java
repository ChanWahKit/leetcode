package code;

/**
 * @description:
 * @author: chanwahkit
 * @time: 2021/2/22 18:28
 * @level: easy
 * @solution: 只需按部就班判断当前字符和下一个字符
 */

public class Solution5617_Interpret {
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
}
