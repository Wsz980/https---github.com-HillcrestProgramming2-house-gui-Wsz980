package DrawHouse;

import javax.swing.*;
import java.awt.*;

/**
 * Created by wzha1379 on 10/24/2017.
 */
public class House extends JComponent{

    public void paintComponent(Graphics g){
        Graphics2D g2 = (Graphics2D)g;
        //Grass
        g2.setColor(new Color(62, 160, 74));
        g2.fillRect(0, 550, 1000, 450);
        //Brick
        g2.setColor(new Color(132, 23, 23));
        g2.fillRect(250, 375, 500, 250);
        //Roof
        g2.setColor(new Color(58, 58, 58));
        int xpoints[] = {225, 500, 775};
        int ypoints[] = {375, 200, 375};
        g.fillPolygon(xpoints, ypoints, 3);
        //Chimney
        g2.setColor(new Color(58, 58, 58));
        g.fillRect(550, 175, 100, 200);
        //Door
        g2.setColor(new Color(130, 71, 59));
        g2.fillRect(450, 450, 100, 175);
        //Doorknob
        g2.setColor(new Color(58, 58, 58));
        g2.fillRoundRect(520, 525, 20, 20, 20, 20);
        //Window
        g2.setColor(new Color(147, 244, 255));
        g2.fillRect(300, 425, 100, 100);
        g2.fillRect(600, 425, 100, 100);

    }
}
