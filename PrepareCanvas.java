package com.company;

import java.io.IOException;

public class PrepareCanvas {

    private Canvas canvas;

    public void prepareCanvas(int height, int width) {
        canvas = new Canvas(height, width);
        if (canvas != null)
            canvas.getCanvas();

    }

    public void drawLine(int x1, int y1, int x2, int y2) {
        boolean lineStatus = canvas.drawLine(x1, y1, x2, y2);
        if (canvas != null && lineStatus)
            canvas.getCanvas();
    }

    public void drawRectangle(int x1, int y1, int x2, int y2) {
        boolean rectStatus = canvas.drawRectangle(x1, y1, x2, y2);
        if (canvas != null && rectStatus)
            canvas.getCanvas();
    }

}
