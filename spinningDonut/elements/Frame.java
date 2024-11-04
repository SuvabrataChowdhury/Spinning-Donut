package spinningDonut.elements;

import spinningDonut.exceptions.InvalidPositionException;
import utility.constants.Thickness;
import utility.dataTypes.Point2D;

public class Frame {
    private static Frame instance =  null;

    char[][] pixels;

    public Frame(int width,int height){
        pixels = new char[height][width];
        
        for(int i=0;i<height;i++){
            for(int j=0;j<width;j++){
                pixels[i][j] = ' ';
            }
        }
    }

    public static Frame getInstance(int width,int height){
        if(null == Frame.instance)
            Frame.instance = new Frame(width, height);
        return Frame.instance;
    }

    public void plot(Point2D pixel,Thickness thickness) throws InvalidPositionException {
        if(!isValidPosition(pixel))
            throw new InvalidPositionException("Given position ("+pixel.getX()+","+pixel.getY()+")is invalid");
        pixels[pixel.getY()][pixel.getX()] = thickness.getPlotChar();
    }

    private boolean isValidPosition(Point2D pos){
        return ((pos.getX()>=0 && pos.getX()<pixels[0].length) && (pos.getY()>=0 && pos.getY()<pixels.length));
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
