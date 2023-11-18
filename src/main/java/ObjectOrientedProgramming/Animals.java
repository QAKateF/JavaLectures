package ObjectOrientedProgramming;

public interface Animals {
    public int numberOfLegs();
    public boolean isFlying();
    public default String voice(){
        return "";
    }
}
