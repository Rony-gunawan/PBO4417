public class GamePlayer {
    private double width;
    private double height;
    private int positionX;
    private int positionY;

    public GamePlayer(){

    }
    public GamePlayer(double width, double height){
        this.width = width;
        this.height = height;
    }
    public GamePlayer(double width, double height, int positionX, int positionY){
        this.width = width;
        this.height = height;
        this.positionX = positionX;
        this.positionY = positionY;
    }
    public void setDimension(double width, double height){
        this.width = width;
        this.height = height;
    }
    public void setPosition(int positionX, int positionY){
        this.positionX = positionX;
        this.positionY = positionY;
    }
    public double getWidth(){
        return width;
    }
    public double getHeight(){
        return height;
    }
    public int getX(){
        return positionX;
    }
    public int getY() {
        return positionY;
    }
    public void Run() {
        System.out.println("Playernya masih lari gan");
    }
    public void Run(int incrementX) {
        positionX = positionX + incrementX;
        System.out.println("Playernya lari-lari kesana kemari...Posisinya di X = " + positionX);
    }
}