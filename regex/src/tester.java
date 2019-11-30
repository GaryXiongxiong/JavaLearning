
public class tester {
    public static void main(String[] args) {
        String regex = "#!(/[\\w\\s]+)+";
        String str = "#!/bin/sh env";
        System.out.println(str.matches(regex));
    }
}
