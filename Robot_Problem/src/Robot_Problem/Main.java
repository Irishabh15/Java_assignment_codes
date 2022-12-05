package Robot_Problem;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Robot_Problem.ArcadeDrive_Of_Robot moves = new Robot_Problem.ArcadeDrive_Of_Robot();

        // Creating a file
//        File file = new File("instructions.txt");
//        file.createNewFile();


        // Writing to file
//        FileWriter fileWriter = new FileWriter("instructions.txt");
//        fileWriter.write("F\nR\nF\nF");
//        fileWriter.close();


        // Reading a file
        File file = new File("instructions.txt");
        Scanner sc= new Scanner(file);
        while(sc.hasNextLine()){
            String command = sc.nextLine();
            if(command.equals("F")){
                moves.moveForward();
            }
            else if(command.equals("B")){
                moves.moveBackward();
            }
            else if(command.equals("L")){
                moves.moveLeftward();
            }
            else if(command.equals("R")){
                moves.moveRightward();
            }
            else{
                System.out.println("Invalid instruction");
            }
        }
        sc.close();
    }
}
