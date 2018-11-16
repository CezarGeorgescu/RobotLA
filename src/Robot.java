import stanford.karel.Karel;

public class Robot extends Karel {
    public void run(){

        while(true){
            build();
            moveDown();

            if(frontIsBlocked()) break;
            moveToTheLeft();
        }

    }

    private void build(){

        turnLeft();

        while(frontIsClear()){
            if( noBeepersPresent()) putBeeper();
            move();

        }
        if( noBeepersPresent()) putBeeper();

    }

    private void moveDown(){

        turnLeft();
        turnLeft();

        while(frontIsClear()){
            move();
        }
        turnLeft();

    }

    private void moveToTheLeft(){
        for(int i = 0; i < 4; i++){

            move();

        }

    }

}