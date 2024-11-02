package spinningDonut.elements;

import utility.constants.Thickness;
import utility.dataTypes.Point2D;

public class Frame {
    char[][] pixels;

    public Frame(int width,int height){
        pixels = new char[width][height];
        
        for(int i=0;i<width;i++){
            for(int j=0;j<height;j++){
                pixels[i][j] = ' ';
            }
        }
    }

    public void plot(Point2D<Integer,Integer> pixel,Thickness thickness) {
        pixels[pixel.getX()][pixel.getY()] = thickness.getPlotChar();
    }

    public void display(){
        for(int i=0;i<pixels.length;i++){
            for(int j=0;j<pixels[i].length;j++){
                System.out.print(pixels[i][j]);
            }
            System.out.println("");
        }
    }

}
