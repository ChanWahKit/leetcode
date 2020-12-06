package code;

import java.util.ArrayList;
import java.util.List;

/**
 * 杨辉三角生成，第一位和最后一位永远是1，第二层起每一层的第n（length>n>1）位都是上一层第n-1位+第n位之和
 */
public class triangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        if (numRows == 0) return result;

        //行数
        for (int i = 1; i <= numRows; i++) {
            List<Integer> rowList = new ArrayList<>();
            //第一位都是1
            rowList.add(1);
            if (i == 1) {
                result.add(rowList);
            }
            //当前层级为数组长度-1，上一层应该是-2
            if (i > 1) {
                for (int j = 1; j < i - 1; j++) {
                    rowList.add(result.get(i - 2).get(j - 1) + result.get(i - 2).get(j));
                }
                rowList.add(1);
                result.add(rowList);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new triangle().generate(1) + "\n");
        System.out.println(new triangle().generate(2) + "\n");
        System.out.println(new triangle().generate(3) + "\n");
        System.out.println(new triangle().generate(4));
    }
}