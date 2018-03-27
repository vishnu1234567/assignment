import java.applet.*;
import java.awt.*;
public class Vishnu4Demo extends Applet
{
  String msg;
  public void init()
  {
   setBackground(Color.orange);
   setForeground(Color.black);
   msg="good morning to all...";
   }
public void paint (Graphics g)
{
   g.drawString(msg,50,80);
   showStatus("Greetings to all...");
}
}
/*<Applet code = "Vishnu4Demo.class" width=300 Height=400>
</Applet>
*/

