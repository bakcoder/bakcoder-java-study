package effective.java.item01;

public interface HelloService {

    String hello();

    static String hi() {
        prepareMessage();
        return "hi";
    }

    static private void prepareMessage() {

    }

    static String hi1() {
        prepareMessage();
        return "hi1";
    }

    static String hi2() {
        prepareMessage();
        return "hi2";
    }

    default String bye() { return "bye"; }


}
