public class Eagle implements Animals {
    private String speed;
    private String color;

    public Eagle(String speed, String color) {
        this.speed = speed;
        this.color = color;
    }

    @Override
    public void ptitsa() {
        System.out.println("this bird can fly");
    }

    public Eagle() {
    }

    @Override
    public String toString() {
        return "Eagle"+"\n"+
                "speed= " + speed + "\n" +
                "color= " + color +"\n";
    }

}
