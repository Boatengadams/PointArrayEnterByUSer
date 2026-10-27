package Arrays.Class;

import java.awt.*;
import java.util.Arrays;
import java.util.Scanner;

public class PointArrayEnterByUSer {
        static void main(String[] args) {
            System.out.print("How many numbers do you want to:");
            usernumber();
        }


        static void usernumber() {
            int userInput = new Scanner(System.in).nextInt();
            System.out.println("Point of "+ userInput +" created.");

            Point[] userPoints = new Point[userInput];

            fillArrayOfPoints(userPoints);
            printArrayOfPoints(userPoints);
        }

        private static void printArrayOfPoints(Point[] userPoint) {
            System.out.println("The element are :");
            for(int i = 0; i< userPoint.length; i++)
                System.out.println("(" + userPoint[i].x + " , " + userPoint[i].y + ")");
        }

        private static void fillArrayOfPoints(Point[] userPoint) {
            Scanner input = new Scanner(System.in);

            for(int i = 0; i < userPoint.length; i++){
                System.out.print("Enter your values x and y for point "+ (i+1)+ ":");
                userPoint[i] = new Point(input.nextInt(), input.nextInt());
            }
        }
    }
