package ObjectOrientedProgramming;

public class Kitty extends Cats{
    private int color;
    private int x;
    private int y;
    private double z;

    public Kitty(){
        this.color = -2;
    }
    
    public Kitty(int color){
        this.color = color;
    }
    
    public Kitty(int x, int y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    private boolean isValueCorrect(int value, int min, int max){
        return (min < value && value < max);
    }

    public void setColor(int color){
        if (isValueCorrect(color, 0, 100)) {
            this.color = color;
        }
        else System.out.println("Error");
    }

    public int getColor(){
        return color;
    }

}
