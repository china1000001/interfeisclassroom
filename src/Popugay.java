public class Popugay implements Animals{
    private String speed;
    private String color;

    public Popugay(String speed, String color) {
        this.speed = speed;
        this.color = color;
    }

    public Popugay() {
    }


    @Override
    public void ptitsa() {
        System.out.println("this bird can fly");
    }

    @Override
    public String toString() {
        return "Popugay"+"\n"+
                "speed= " + speed + "\n" +
                "color= " + color +"\n";
    }
}
