package JZOffer;

/**
 * @author: zdefys
 * @date: 2020/7/3 19:24
 * @version: v1.0
 * @description: 请实现一个函数，将一个字符串中的每个空格替换成“%20”。
 * 例如，当字符串为We Are Happy.
 * 则经过替换之后的字符串为We%20Are%20Happy。
 */
public class JZ2 {

    // 在线笔试
    public String replaceSpace1(StringBuffer str) {
        return str.toString().replaceAll(" ", "%20");
    }

    // 面试
    public String replaceSpace2(StringBuffer str) {
        char[] chars = new char[str.length() * 3];
        int p = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                chars[p] = str.charAt(i);
                p++;
            } else {
                chars[p] = '%';
                chars[p + 1] = '2';
                chars[p + 2] = '0';
                p += 3;
            }
        }
        return new String(chars,0,p);
    }

    public static void main(String[] args) {

    }
}
