package pl.waw.sgh.Bank.GUI;

import javax.swing.*;
import java.awt.*;

public class BankFrame {
    public static void main(String[] args) {
        JFrame bankFrame = new JFrame("Bank App");
        bankFrame.setSize(700, 500);
        bankFrame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        bankFrame.setMinimumSize(new Dimension(400, 400));


        JPanel myPanel = new JPanel();
        myPanel.add(new JLabel("My first label"));
        bankFrame.add(myPanel);
        bankFrame.setLayout(new FlowLayout());
        bankFrame.setVisible(true);


    }

}
