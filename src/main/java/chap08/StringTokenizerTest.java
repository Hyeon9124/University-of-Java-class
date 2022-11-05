package chap08;

import java.util.StringTokenizer;

public class StringTokenizerTest {

    public static void main(String[] args) {
        String str = "of the people, by the people, for the people";

        StringTokenizer st = new StringTokenizer(str ," ,");

        System.out.println(st.countTokens());

        while (st.hasMoreTokens()){
            System.out.print("[" + st.nextToken() + "] ");
        }

    }
}
