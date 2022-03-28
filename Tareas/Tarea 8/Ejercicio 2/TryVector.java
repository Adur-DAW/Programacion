import java.util.*;

public class TryVector 
{
    public static void main (String [] args) 
    {
        Vector vecPuntos = new Vector();
        Point[] points = {new Point(3,2),new Point(8,6),new Point(3,4)};
        
        for(int i = 0; i < points.length; i++)
        {
            vecPuntos.add(points[i]);
            
            Point po = (Point)vecPuntos.get(i);
            System.out.println("El punto "+i+" tiene coordenadas:");
            System.out.println("X: "+po.getXCoord());
            System.out.println("Y: "+po.getYCoord());
        }
    }
}
