public class Main {
    public static void main(String[] args) {
        Crow crow = new Crow("30-км в час", "black");
        System.out.println(crow);
        crow.ptitsa();
        System.out.println("------------------");
        Kiwi kiwi = new Kiwi("4-км в час", "brow");
        System.out.println(kiwi);
        kiwi.ptitsa();
        System.out.println("------------------");
        Popugay popugay = new Popugay("20-км в час", "red + yellow");
        System.out.println(popugay);
        popugay.ptitsa();
        System.out.println("------------------");
        Eagle eagle = new Eagle("50-км в час ", "brow + white");
        System.out.println(eagle);
        eagle.ptitsa();
    }
}