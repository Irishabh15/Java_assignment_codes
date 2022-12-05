package Robot_Problem;

public class ArcadeDrive_Of_Robot {
    Robot_Problem.Coordinate_of_Robot robotPosition;
    Robot_Problem.Direction_of_Robot robotOrientation;

    public ArcadeDrive_Of_Robot(){
        robotPosition = new Robot_Problem.Coordinate_of_Robot();
        robotOrientation = new Robot_Problem.Direction_of_Robot();
    }
    public void moveForward(){
        System.out.println("Moving forward..");
        String direction = robotOrientation.getFaceDirection();
        if(direction.equals("E")){
            robotPosition.setX(robotPosition.getX()+1);    // Positive x-axis.
        }
        else if(direction.equals("W")){
            robotPosition.setX(robotPosition.getX()-1);    // Negative x-axis.
        }
        else if(direction.equals("S")){
            robotPosition.setY(robotPosition.getY()-1);    // Negative y-axis.
        }
        else if(direction.equals("N")){
            robotPosition.setY(robotPosition.getY()+1);    // Positive y-axis.
        }

        System.out.println("Moved 1 unit forward successfully. Now at "+robotPosition.robotPosition()+" and facing "+robotOrientation.getFaceDirection());
    }

    public void moveBackward(){
        System.out.println("Moving backward..");
        String direction = robotOrientation.getFaceDirection();
        if(direction.equals("E")){
            robotPosition.setX(robotPosition.getX()-1);    // Negative x-axis.
        }
        else if(direction.equals("W")){
            robotPosition.setX(robotPosition.getX()+1);    // Positive x-axis.
        }
        else if(direction.equals("S")){
            robotPosition.setY(robotPosition.getY()+1);    // Positive y-axis.
        }
        else if(direction.equals("N")){
            robotPosition.setY(robotPosition.getY()-1);    // Negative y-axis.
        }
        System.out.println("Moved 1 unit backward successfully. Now at "+robotPosition.robotPosition()+" and facing "+robotOrientation.getFaceDirection());
    }

    public void moveLeftward(){
        System.out.println("Moving leftward");
        String newFaceDirection = robotOrientation.getFaceDirection();
        if(newFaceDirection.equals("E")){
            robotPosition.setY(robotPosition.getY()+1);
            robotPosition.setX(robotPosition.getX()+1);
            robotOrientation.leftRotation();
        }
        else if(newFaceDirection.equals("W")){
            robotPosition.setY(robotPosition.getY()-1);
            robotPosition.setX(robotPosition.getX()-1);
            robotOrientation.leftRotation();
        }
        else if(newFaceDirection.equals("S")){
            robotPosition.setY(robotPosition.getY()-1);
            robotPosition.setX(robotPosition.getX()+1);
            robotOrientation.leftRotation();
        }
        else if(newFaceDirection.equals("N")){
            robotPosition.setY(robotPosition.getY()+1);
            robotPosition.setX(robotPosition.getX()-1);
            robotOrientation.leftRotation();
        }
        System.out.println("Moved 1 unit leftward successfully. Now at "+robotPosition.robotPosition()+" and facing "+robotOrientation.getFaceDirection());
    }

    public void moveRightward(){
        System.out.println("Moving rightward..");
        String newFaceDirection = robotOrientation.getFaceDirection();
        if(newFaceDirection.equals("E")){
            robotPosition.setY(robotPosition.getY()-1);
            robotPosition.setX(robotPosition.getX()+1);
            robotOrientation.rightRotation();
        }
        else if(newFaceDirection.equals("W")){
            robotPosition.setY(robotPosition.getY()+1);
            robotPosition.setX(robotPosition.getX()-1);
            robotOrientation.rightRotation();
        }
        else if(newFaceDirection.equals("S")){
            robotPosition.setY(robotPosition.getY()-1);
            robotPosition.setX(robotPosition.getX()-1);
            robotOrientation.rightRotation();
        }
        else if(newFaceDirection.equals("N")){
            robotPosition.setY(robotPosition.getY()+1);
            robotPosition.setX(robotPosition.getX()+1);
            robotOrientation.rightRotation();
        }
        System.out.println("Moved 1 unit rightward successfully. Now at "+robotPosition.robotPosition()+" and facing "+robotOrientation.getFaceDirection());
    }


}
