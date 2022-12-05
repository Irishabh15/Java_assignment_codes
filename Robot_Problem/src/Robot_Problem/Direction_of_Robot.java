package Robot_Problem;

public class Direction_of_Robot {
    Robot_Problem.Coordinate_of_Robot position_of_robot;
    private String faceDirection;

    public Direction_of_Robot(){          // Default direction of Robot.
        this.faceDirection = "E";
    }

    public Direction_of_Robot(String direction){
        this.faceDirection = direction;
    }

    public String getFaceDirection(){
        return this.faceDirection;
    }


    // Using these methods to change the direction of the robot.
    public void leftRotation(){
        String direction = getFaceDirection();
        if(direction.equals("E")){
            this.faceDirection = "N";
        }
        else if(direction.equals("W")){
            this.faceDirection = "S";
        }
        else if(direction.equals("S")){
            this.faceDirection = "E";
        }
        else if(direction.equals("N")){
            this.faceDirection = "W";
        }
    }

    public void rightRotation(){
        String direction = getFaceDirection();
        if(direction.equals("E")){
            this.faceDirection = "S";
        }
        else if(direction.equals("W")){
            this.faceDirection = "N";
        }
        else if(direction.equals("S")){
            this.faceDirection = "W";
        }
        else if(direction.equals("N")){
            this.faceDirection = "E";
        }
    }

//    public String robotStatus(){
//        return "Robot is facing towards "+this.faceDirection+" at "+position_of_robot.robotPosition();
//    }
}
