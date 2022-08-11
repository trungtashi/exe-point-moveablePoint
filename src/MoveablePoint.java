public class MoveablePoint extends Point{
    float xSpeed = 0.0f;
    float ySpeed = 0.0f;

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed){
        super(x,y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public  MoveablePoint(){

    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed(){
        float [] speed = {xSpeed, ySpeed};
        return speed;
    }
    public Point move(){
        x += xSpeed;
        y += ySpeed;
        return this;
    }
    @Override
    public String toString() {
        return "MoveablePoint{" +
                ", x=" + x +
                ", y=" + y +
                "xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }

}
