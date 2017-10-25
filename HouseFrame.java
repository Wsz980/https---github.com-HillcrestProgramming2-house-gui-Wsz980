package DrawHouse;

import javax.swing.*;
import java.awt.*;

/**
 * Created by wzha1379 on 10/24/2017.
 */
public class HouseFrame {

    public static void main(String[] args){
        JFrame frame = new JFrame();
        frame.setSize(1000,1000);
        frame.setName("House");
        frame.getContentPane().setBackground(new Color(178, 235, 255));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        House house = new House();
        frame.add(house);
    }
}
