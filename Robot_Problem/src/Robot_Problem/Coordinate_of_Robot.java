package Robot_Problem;

public class Coordinate_of_Robot {
    private int x;
    private int y;

    public Coordinate_of_Robot(){
        this.x = 0;
        this.y = 0;
    }

    public Coordinate_of_Robot(int x, int y){
        this.x = x;
        this.y = y;
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

    public String robotPosition(){
        return (this.x +","+this.y);
    }
}
