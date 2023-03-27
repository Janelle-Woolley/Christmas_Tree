import ecs100.*;
import java.awt.Color;
/**
 * creates a bulb
 * support class for decorate
 *
 * @author Janelle Woolley
 * @version 1.0 27/03/23
 */
public class Bulb
{
    // instance variables - replace the example below with your own
    private double bulbX;
    private double bulbY;
    private int bulbSize;
    
    private Color bulbColor;
    
    private double left;
    private double top;
    private double bottom;

    /**
     * Constructor for objects of class Bulb
     */
    public Bulb(double x, double y, int size, Color col)
    {
        // initialise instance variables
        bulbX = x;
        bulbY = y;
        bulbSize = size;
        
        bulbColor = col;
        
        setTop();
        setLeft();
        setBottom();
    }
    
    /**
     * set top
     */
    public void setTop() {
        this.top = this.bulbY - this.bulbSize/2.0;
    }
    
    /**
     * set left
     */
    public void setLeft() {
        this.left = this.bulbX - this.bulbSize/2.0;
    }
    
    /**
     * set top
     */
    public void setBottom() {
        this.bottom = this.bulbY + this.bulbSize/2.0;
    }
    
    /**
     * draw bulb
     */
    public void drawBulb(){
        UI.setLineWidth(5);
        UI.setColor(bulbColor);
        UI.fillOval(left, top, bulbSize/2.0, bulbSize);
    }
}
