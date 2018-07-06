package com.company;

import java.util.Scanner;

public class DrawCanvas {

    public static void main(String[] args) {
        PrepareCanvas prepCanvas = new PrepareCanvas();

        //Enter data using BufferReader
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter height and width to prepare canvas, for example: C 20 5");
        while (scanner.hasNextLine()) {
            String command = scanner.nextLine().trim();

            String[] commandOptions = command.split(" ");

            switch (commandOptions[0].toLowerCase()) {
                case "c":
                    prepCanvas.prepareCanvas(Integer.parseInt(commandOptions[1]), Integer.parseInt(commandOptions[2]));
                    break;
                case "l":
                    prepCanvas.drawLine(Integer.parseInt(commandOptions[1]), Integer.parseInt(commandOptions[2]), Integer.parseInt(commandOptions[3]), Integer.parseInt(commandOptions[4]));
                    break;
                case "r":
                    prepCanvas.drawRectangle(Integer.parseInt(commandOptions[1]), Integer.parseInt(commandOptions[2]), Integer.parseInt(commandOptions[3]), Integer.parseInt(commandOptions[4]));
                    break;
                case "q":
                    System.exit(0);
            }

        }

    }

}
