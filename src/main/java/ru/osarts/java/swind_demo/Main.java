package ru.osarts.java.swind_demo;

import java.awt.*;
import javax.swing.*;

public class Main {

    public static void main(String arg[]) {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setSize(300,200);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(new GridBagLayout());
        JButton button = new JButton("Кнопка 1");
        JButton button1 = new JButton("Кнопка 2");
        frame.add(button);
        frame.add(button1);
        JDialog dialog = new JDialog(frame, "диалог");
        dialog.setVisible(false);
        JPanel panel = new JPanel();
        JPanel panel1 = new JPanel();
        dialog.add(panel);
        dialog.add(panel1);

        panel.setBackground(Color.pink);
        panel1.setBackground(Color.BLUE);
        dialog.setLayout(new FlowLayout());
//        dialog.setResizable(false);
        button.addActionListener(e -> {
            panel.setVisible(true);
            panel.setPreferredSize(new Dimension( 100,100));
            panel1.setVisible(false);
            dialog.setSize(panel.getPreferredSize());
            dialog.setVisible(true);
        });
        button1.addActionListener(e -> {

            panel1.setVisible(true);
            panel.setVisible(false);
            panel1.setPreferredSize(new Dimension( 200,200));
            dialog.setSize(panel1.getPreferredSize());
            dialog.setVisible(true);
        });

    }
}