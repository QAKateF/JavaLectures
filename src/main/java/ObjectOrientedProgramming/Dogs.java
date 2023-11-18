package ObjectOrientedProgramming;
public class Dogs extends Mammals implements Animals {
    private double weight;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setWeight(int weight) {
        this.weight = (double) weight;
    }


    @Override
    public int numberOfLegs() {
        return 4;
    }

    @Override
    public boolean isFlying() {
        return false;
    }

    @Override
    public String voice() {
        return "gav-gav";
    }
}
