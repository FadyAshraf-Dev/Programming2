package org.example;

public class MyPoint {
    private int x=0,y=0;
    public static double pythagorus(double x ,double y){
        return Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
    }
    public MyPoint() {
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    public void setXY(int x, int y) {
        this.y = y;
        this.x = x;

    }
    public int[] getXY() {
        return new int[] {this.x,this.y};

    }

    @Override
    public String toString() {
        return "(" +
                x +
                "," + y +
                ")";
    }
    public double distance(){
        return pythagorus(x,y);
    }
    public double distance(int x, int y){
        return pythagorus(this.x-x, this.y-y);
    }
    public double distance(MyPoint another ){
        return pythagorus(this.x-another.x, this.y-another.y);
    }
}
