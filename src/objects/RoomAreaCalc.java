package objects;

import java.util.Scanner;

public class RoomAreaCalc {
    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Rectangle room1 = getRoom();
        double areaOfRoom1 = room1.calcArea();

        Rectangle room2 = new Rectangle(50, 65);
        double areaOfRoom2 = room2.calcArea();
        double totalArea = areaOfRoom1 + areaOfRoom2;

        System.out.println("Area of the rooms: " + totalArea + "square");


        public Rectangle getRoom(){

        }

    }
}
