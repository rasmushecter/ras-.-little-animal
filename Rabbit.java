public class Rabbit {

    private String name;
    private int xrPosition;
    private int yrPosition;

    public Rabbit(String name, int xrPosition, int yrPosition) {
        this.name = name;
        this.xrPosition = xrPosition;
        this.yrPosition = yrPosition;
    }
    
    public void setNameRabbit(String name) {
        System.out.println("Rabbit");
    }
    public void moveUp(){
        this.yrPosition = yrPosition + 1 ;

    }
    public void moveDown(){
        this.yrPosition = yrPosition - 1 ;

    }
    public void moveRight(){
        this.xrPosition = xrPosition + 1 ;

    }
    public void moveLeft(){
        this.xrPosition = xrPosition - 1 ;

    }
    
    public void tellPosition(){
        System.out.println("Jeg er Rabbit. Jeg rykker hertil: " + xrPosition +"," + yrPosition);
    }
    
    //public void mercy(String) {
        //System.out.println("ask for mercy")
    //}
}
