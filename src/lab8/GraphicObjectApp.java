package lab8;

import java.awt.*;

public class GraphicObjectApp {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle(10.0,5.0);
        rec.setColor("Red");
        rec.draw();
        System.out.println(rec.findArea());
        System.out.println(rec.getColor());
        System.out.println(rec.getHigh());
        System.out.println(rec.getWidth());

        Circle cir = new Circle(20.0);
        cir.setColor("Blue");
        System.out.println("the area of me circle is: "+cir.findArea());



    }//main


}//class