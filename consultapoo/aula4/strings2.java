package aula4;

public class strings2 {
    public static void main(String[] args) {
        String s1;
        s1 = "01234567890";
        int p1, p2;
        p1 = s1.indexOf('4');
        p2 = s1.indexOf('0', 6);
        System.out.println(p1);
        System.out.println(p2);

    }

}
