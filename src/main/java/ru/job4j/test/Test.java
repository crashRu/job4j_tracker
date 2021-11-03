package ru.job4j.test;

public class Test {
    public static void main(String[] args) {
        int a = 2;
        int n = 2;
        int b = 1;
        for (int index = 0; index < n; index++) {
            b = b * a;
        }
        System.out.println(b);
    }

        public static String check(String left, String s) {
            if (s.isEmpty()) {
                return "empty";
            } else if (s.length() > 0 && s.length() < 4) {
                return s;
        }
            StringBuffer sb = new StringBuffer(s);
            for (int index = 0; index < s.length() - 4; index++) {
                sb.setCharAt(index, '#');
            }
            return sb.toString();
        }
}
