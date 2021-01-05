package code.较大分组的位置830;

import java.util.ArrayList;
import java.util.List;

/**
 * 在一个由小写字母构成的字符串 s 中，包含由一些连续的相同字符所构成的分组。
 *
 * 例如，在字符串 s = "abbxxxxzyy"中，就含有 "a", "bb", "xxxx", "z" 和 "yy" 这样的一些分组。
 *
 * 分组可以用区间 [start, end] 表示，其中 start 和 end 分别表示该分组的起始和终止位置的下标。上例中的 "xxxx" 分组用区间表示为 [3,6] 。
 *
 * 我们称所有包含大于或等于三个连续字符的分组为 较大分组 。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/positions-of-large-groups
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class largeGroupPositions {
    public List<List<Integer>> largeGroupPositions(String s) {
        int count = 1;
        char temp = s.charAt(0);
        List<List<Integer>> largeGroupPositions = new ArrayList<>();
        List<Integer> position = new ArrayList<>();
        position.add(0);
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == temp) {
                count++;
                if (i == s.length() - 1 && count >= 3) {
                    position.add(i);
                    largeGroupPositions.add(position);
                }
            } else {
                if (count >= 3) {
                    position.add(i - 1);
                    largeGroupPositions.add(position);
                }
                count = 1;
                temp = s.charAt(i);
                position = new ArrayList<>();
                position.add(i);
            }
        }
        System.out.println(largeGroupPositions);
        return largeGroupPositions;
    }

    public static void main(String[] args) {
        new largeGroupPositions().largeGroupPositions("eeee");
    }
}
