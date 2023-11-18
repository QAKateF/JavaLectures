package ObjectOrientedProgramming;

public class Main {
    public static void main(String[] args){
        Cats tommy = new Cats();
        tommy.bodyTemp = 1.2;
        Kitty murka = new Kitty();
        System.out.println("Murka color number is " + murka.getColor());
        murka.setColor(200);
        System.out.println("new Murka color number is " + murka.getColor());
        System.out.println("Tommy's body temp is " + tommy.bodyTemp);
        System.out.println("Tommy's number of legs is " + tommy.numberOfLegs());

        Point p = new Point(1,2,3);
        Point p1 = new Point(2,3,5);
        System.out.println(p.getX());
        System.out.printf("%s", p1.getX());

        Dogs marty = new Dogs();
        System.out.println("marty weight = " + marty.getWeight());
        marty.setWeight(2.0);
        marty.setWeight(2);
        marty.setWeight('a');

    }
}

class Point{
    private int x,y;
    private int color;

    public Point(int x, int y, int color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }
}
