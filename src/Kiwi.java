public class Kiwi implements Animals{
    private String speed;
    private String color;



    public Kiwi() {
    }

    public Kiwi(String speed, String color) {
        this.speed = speed;
        this.color = color;
    }
    @Override
    public void ptitsa() {
        System.out.println("this bird can't fly");
    }

    @Override
    public String toString() {
        return "Kiwi"+"\n"+
                "speed= " + speed + "\n" +
                "color= " + color +"\n";
    }
}
