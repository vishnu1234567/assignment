import java.awt.*;
import java.applet.*;
public class Rect10 extends Applet
{
 public void paint(Graphics g)
{
 g.setColor(Color.blue);
 g.fillRect(10,10,100,50);
 g.setColor(Color.red);
 g.fillRect(10,70,100,50);
 g.setColor(Color.green);
 g.fillRect(10,130,100,50);
}
}

/*<Applet code = "Rect10.class" width=400 Height=500>
</Applet>
*/

