public class Point {
    private int x ;
    private int y ;
    public Point(){}
    public Point(int x,int y){
        this.x=x;
        this.y=y;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public void setX(int x){
        this.x=x;
    }
    public void setY(int y){
        this.y=y;
    }
    public double distance (){
        return Math.sqrt((x*x)+(y*y));
    }
    public double distance(int x,int y){
        return Math.sqrt(Math.pow((x-this.x),2)+Math.pow((y-this.y),2));
    }
    public double distance(Point another){
        return distance(another.getX(),another.getY());
    }
}
