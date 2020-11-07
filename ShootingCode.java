import java.util.TreeSet;
import java.lang.Math; 

public class Main { 
    public static void main(String[] args) {        
    
    double a = 9.8;
    //input for dx(legnth)
    String dxinp = System.console().readLine(); 
    double dx = Double.parseDouble(dxinp);
    //input for dy(width)
    String dyinp = System.console().readLine();
    double dy = Double.parseDouble(dyinp);
    //input for r(radius)
    String rinp = System.console().readLine();
    double r = Double.parseDouble(rinp);
    r=r/1000;
//equations used to find the velocityY, time, velocityX, velocity, and the RPM.
    //Y velocity equations
    double viy = 0;

    viy = Math.sqrt(2*dy*a);
    System.out.println("your velocity in Y-direction (value in m/s) " + viy); 

    //time equations
    double t = 0;
    t = Math.sqrt(dy/4.9);
    t = t*10;
    System.out.println("your time is (value in seconds) " + t);

    //X velocity equations
    double vix = 0;

    vix = dx/t;
    System.out.println("your velocity in X-direction " + vix);

    //velocity equations
    double v = 0;
    double i = 0;
    double n = 0;
    i = Math.pow(vix, 2);
    n = Math.pow(viy, 2);
    v = Math.sqrt(i+n);
    System.out.println("your velocity is " + v);

    //rpm equations
    double rpm = 0;

    rpm = v/(r*0.10472);
    System.out.println("Your RPM is " + rpm);
    } 
}
