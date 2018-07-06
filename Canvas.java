package com.company;

import java.util.Arrays;


public class Canvas {

    private int width;
    private int height;
    // 2D array to store all pixels with characters to be printed
    private char[][] charsToBePrinted;

    public Canvas(int width, int height) {

        try {

            if (height <= 0 || width <= 0) {
                throw new IllegalArgumentException();
            }
            this.width = width + 2;
            this.height = height + 2;
            charsToBePrinted = new char[this.height][this.width];
            init();
        } catch (IllegalArgumentException e) {
            System.out.println("Enter positive values for Canvas Height and Width " + e);
        }
    }

    public boolean drawLine(int x1, int y1, int x2, int y2) {

        try {
            if (x1 == x2) {
                drawVerticalLine(x1, y1, y2, 'x');
            } else if (y1 == y2) {
                drawHorizontalLine(y1, x1, x2, 'x');
            } else {
                throw new UnsupportedOperationException();
            }
            return true;
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Given values are out of range, please re enter proper values, " +
                    "if you want to quit press Q " + ex);
            return false;
        } catch (UnsupportedOperationException e) {
            System.out.println("Exception raised while drawing Line, please retry with proper values  " +
                    "if you want to quit press Q " + e);
            return false;
        } catch (Exception e) {
            System.out.println("Exception raised while drawing Line, please retry with proper values " +
                    "if you want to quit press Q " + e);
            return false;
        }
    }

    public boolean drawRectangle(int x1, int y1, int x2, int y2) {
        try {
            drawHorizontalLine(y1, x1, x2, 'x');
            drawHorizontalLine(y2, x1, x2, 'x');
            drawVerticalLine(x1, y1 + 1, y2 - 1, 'x');
            drawVerticalLine(x2, y1 + 1, y2 - 1, 'x');
            return true;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Given values are out of range, please reenter proper values  " +
                    "if you want to quit press Q " + e);
            return false;
        } catch (Exception e) {
            System.out.println("Exception raised while drawing Rectangle, please retry with proper values  " +
                    "if you want to quit press Q " + e);
            return false;
        }
    }

    public void getCanvas() {

        printLines(charsToBePrinted);


    }

    public static void printLines(char[][] lines) {

        for (char[] line : lines) {
            for (char characterToBePrinted : line) {
                System.out.print(characterToBePrinted);
            }
            System.out.println();
        }

    }


    private void init() {
        for (char[] line : charsToBePrinted) {
            Arrays.fill(line, ' ');
        }
        drawHorizontalLine(0, 0, width - 1, '-');
        drawHorizontalLine(height - 1, 0, width - 1, '-');
        drawVerticalLine(0, 1, height - 2, '|');
        drawVerticalLine(width - 1, 1, height - 2, '|');
    }

    private void drawHorizontalLine(int y, int start, int end, char characterToBePrinted) {
        for (int i = start; i <= end; i++) {
            charsToBePrinted[y][i] = characterToBePrinted;
        }
    }

    private void drawVerticalLine(int x, int start, int end, char characterToBePrinted) {
        for (int i = start; i <= end; i++) {
            charsToBePrinted[i][x] = characterToBePrinted;
        }
    }


}