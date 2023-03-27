import ecs100.*;
import java.awt.Color;
/**
 * Support class that draws a star
 *
 * @author Janelle Woolley
 * @version 2.0 27/03/23
 */
public class Star
{
    // instance variables - replace the example below with your own
    private double xPos; 
    private double yPos; 
    private final double sizeY = 50;
    private final double sizeX = 70;
    /**
     * Constructor for objects of class Star
     */
    public Star(double x, double y)
    {
        // initialise instance variables
        xPos = x;
        yPos = y;
    }
    
    /**
     * draws star
     */
    public void drawStar(){
        UI.setColor(Color.black);
        // star 1
        double [] a = {(xPos-sizeX*(0.09756)), (xPos), (xPos+sizeX*(0.09756))}; // x axis
        double [] b= {(yPos-sizeY*(0.09434)), (yPos-sizeY*(0.43396)), (yPos-sizeY*(0.09434))};  // y axis
        UI.fillPolygon (a, b, 3);
        
        // star 2
        double [] c = {(xPos+sizeX*(0.09756)), (xPos+sizeX*(0.14634)), (xPos+sizeX*(0.31707))}; // x axis
        double [] d = {(yPos-sizeY*(0.09434)), (yPos+sizeY*(0.13208)), (yPos-sizeY*(0.09434))};  // y axis
        UI.fillPolygon (c, d, 3);
        
        // star 3
        double [] e = {(xPos), (xPos+sizeX*(0.14634)), (xPos+sizeX*(0.21951))}; // x axis
        double [] f = {(yPos+sizeY*(0.28302)), (yPos+sizeY*(0.13208)), (yPos+sizeY*(0.43396))};  // y axis
        UI.fillPolygon (e, f, 3);
        
        // star 4
        double [] g = {(xPos-sizeX*(0.21951)), (xPos-sizeX*(0.14634)), (xPos)}; // x axis
        double [] h = {(yPos+sizeY*(0.43396)), (yPos+sizeY*(0.13208)), (yPos+sizeY*(0.28302))};  // y axis
        UI.fillPolygon (g, h, 3);
        
        // star 5
        double [] i = {(xPos-sizeX*(0.31707)), (xPos-sizeX*(0.14634)), (xPos-sizeX*(0.09756))}; // x axis
        double [] j = {(yPos-sizeY*(0.09434)), (yPos+sizeY*(0.13208)), (yPos-sizeY*(0.09434))};  // y axis
        UI.fillPolygon (i, j, 3);
        
        // triangle 1
        double [] k = {(xPos-sizeX*(0.14634)), (xPos-sizeX*(0.09756)), (xPos+sizeX*(0.09756))}; // x axis
        double [] l = {(yPos+sizeY*(0.13208)), (yPos-sizeY*(0.09434)), (yPos-sizeY*(0.09434))};  // y axis
        UI.fillPolygon (k, l, 3);
        
        // triangle 2
        double [] m = {(xPos-sizeX*(0.14634)), (xPos+sizeX*(0.09756)), (xPos+sizeX*(0.14634))}; // x axis
        double [] n = {(yPos+sizeY*(0.13208)), (yPos-sizeY*(0.09434)), (yPos+sizeY*(0.13208))};  // y axis
        UI.fillPolygon (m, n, 3);
        
        // triangle 3
        double [] o = {(xPos-sizeX*(0.14634)), (xPos), (xPos+sizeX*(0.14634))}; // x axis
        double [] p = {(yPos+sizeY*(0.13208)), (yPos+sizeY*(0.28302)), (yPos+sizeY*(0.13208))};  // y axis
        UI.fillPolygon (o, p, 3);
    }
}
