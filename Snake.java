public class Snake {
    // attributter 
    private String name;
    private int xsPosition ; 
    private int ysPosition ;

    public Snake(String name, int xsPosition, int ysPosition ) {
        this.name = name; 
        this.xsPosition = xsPosition;
        this.ysPosition = ysPosition; 
    }


     //hvis man vi have en metode der retunere en verdi, "kan svare"

    //public "type" getfirstname(){
        //return this.x... ; (return afslutter metode, kan ikke placere noget nedenunder)
    //}

    //eks
    // public String firstname = person1.getfirstname();
    // System.out.println(firstname);

    //"ovre i run class"



    //operations
    public void setNameSnake(String name) {
        System.out.println("Snake");
    }

    public void moveUp(){
        this.ysPosition = ysPosition + 1 ;
        

    }
    public void moveDown(){
        this.ysPosition = ysPosition - 1 ;

    }
    public void moveRight(){
        this.xsPosition = xsPosition + 1 ;

    }
    public void moveLeft(){
        this.xsPosition = xsPosition - 1 ;

    }
    
    public void tellPosition(){
        System.out.println("Jeg er Snake. Jeg rykker hertil: " + xsPosition +"," + ysPosition);
         
    }
     public void kill(int xsPosition, int xrPosition,int ysPosition, int yrPosition){
        if (xsPosition == xrPosition  && ysPosition == yrPosition){
        System.out.println("Haps Haps");
        }
    }
    
    //public void PositionSnake() { //opdatere koordinaterne for hvert ryk
       
        //if public void moveUp() { // for snake til at rykke up
        //System.out.println("iam a snake i will move up to x,y")
        //}
            //else if public void moveDown() {
        //System.out.println("iam a snake i will move down to x,y")
        //}
            //else if public void moveLeft() {
        //System.out.println("iam a snake i will move left to x,y")
        //}
            //else public void moveRight() {
        //System.out.println("iam a snake i will move right to x,y")
        //}

    //}
    
    //public void iKiilYou(String) {
        //System.out.println("I Kiiil YOU")
    //}


}