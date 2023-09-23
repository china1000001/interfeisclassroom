public class Crow implements  Animals {
    private String speed;
    private String color;

    public Crow() {
    }

    public Crow(String speed, String color) {
        this.speed = speed;
        this.color = color;
    }
    @Override
    public void ptitsa() {
        System.out.println("this bird can fly");
    }

    @Override
    public String toString() {
        return "Crow"+"\n"+
                "speed= " + speed + "\n" +
                "color= " + color +"\n";
    }
}
