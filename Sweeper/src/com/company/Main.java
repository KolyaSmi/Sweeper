package com.company;

import javax.swing.*;

import static com.company.Config.*;

public class Main {
    public JFrame mainMenu = new JFrame();
    public JLabel text = new JLabel("Меню");
    public JLabel text2 = new JLabel("Размер поля");
    public JLabel text3 = new JLabel("Количество бомб");
    public JTextField numberBox = new JTextField();
    public JTextField numberBomb = new JTextField();
    public JPanel panel = new JPanel();
    public JButton start = new JButton();

    public static void main(String[] args) {
	    new Main().Go();
    }

    private void Go () {
        startMainMenu();
        initInterfase();
    }

    private void startMainMenu () {
        mainMenu.setBounds(100, 100, sizeMainMenuX, sizeMainMenuY);
        mainMenu.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainMenu.setResizable(false);
    }

    private void initInterfase () {
        text.setBounds(125, 0, 100, 50);
        text.setVisible(true);
        mainMenu.add(text);

        text2.setBounds(10, 60, 100, 50);
        text2.setVisible(true);
        mainMenu.add(text2);

        numberBox.setBounds(170, 60, 100, 50);
        numberBox.setVisible(true);
        mainMenu.add(numberBox);

        text3.setBounds(10, 120, 150, 50);
        text3.setVisible(true);
        mainMenu.add(text3);

        numberBomb.setBounds(170, 120, 100, 50);
        numberBomb.setVisible(true);
        mainMenu.add(numberBomb);

        start.setBounds(100, 350, 100, 50);
        start.setVisible(true);
        mainMenu.add(start);

        mainMenu.add(panel);
        mainMenu.setVisible(true);
    }
}
