public class Coordinate {

    int x_axis;
    int y_axis;

    public int getX_axis() {
        return x_axis;
    }

    public void setX_axis(int x_axis) {
        this.x_axis = x_axis;
    }


    public int getY_axis() {
        return y_axis;
    }

    public void setY_axis(int y_axis) {
        this.y_axis = y_axis;
    }


    public Coordinate(int x, int y){
        setX_axis(x);
        setY_axis(y);
    }

}
