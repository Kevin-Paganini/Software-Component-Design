package networks;

public class Node {
    private double x;
    private double y;

    public Node(double x, double y){
        this.x = x;
        this.y = y;

    }

    public double getX(){
        return x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setX(double x) {
        this.x = x;
    }
}
