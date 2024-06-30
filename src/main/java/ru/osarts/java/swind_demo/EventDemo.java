package ru.osarts.java.swind_demo;

// обработка события в программе swing
import java.awt.*;
import java.awt.event.*;
import java.beans.BeanProperty;
import javax.swing.*;

class EventDemo {
    JLabel jlab;
    EventDemo() {
        // создать контейнер JFrame.
        JFrame jfrm = new JFrame("An Event Example");
        // пример обработки события.
        // Задать диспетчер компоновки FlowLayout.
        jfrm.setLayout(new FlowLayout());

        // Установить начальные размеры фрейма.
        jfrm.setSize( 220, 90);

        // закончить работу, когда пользователь закрывает приложение.
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // создать две кнопки.
        JButton jbtnAlpha = new JButton("Alpha");
        JButton jbtnBeta = new JButton("Beta");

        // Добавить прослушиватель событий действий для кнопки Alpha
        jbtnAlpha.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae) {
                jlab.setText("Alpha was pressed.");
//                            Нажата кнопка Альфа.
            }
        });

        // Добавить прослушиватель событий действий для кнопки Beta
        jbtnBeta.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae) {
                jlab.setText("Beta was pressed.");
//                            Нажата кнопка Бета.


            }


        });

        // Добавить кнопки в панель содержимого.
        jfrm.add(jbtnAlpha);
        jfrm.add(jbtnBeta);

        // Создать текстовую метку.
        jlab = new JLabel("Press a button");

        // Добавить метку в панель содержимого.
        jfrm.add(jlab);

        // отобразить фрейм.
        jfrm.setVisible(true);
    }

    public static void main(String[] args) {
        //  Создать фрейм в потоке диспетчеризации событий.
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new EventDemo();
            }
        });
    }
}
