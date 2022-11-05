package chap05;
// import java.lang.*;
public class StringComparisonTest01 {
    public static void main(String[] args) {

        String s1 = "Hello ICT";
        String s2 = "Hello ICT";
        String s3 = new String("Hello ICT");

        System.out.println("s1 == s2 : " + (s1 == s2));
        System.out.println("s1 == s3 : " + (s1 == s3));

        // Assignment Operator
        s1 = s3;
        System.out.println("s1 == s3 : " + (s1 == s3));
    }
}
