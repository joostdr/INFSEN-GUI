package main;

import javax.swing.*;

public class MainClass extends JFrame{

    public MainClass() {
        initUI();
    }

    private void initUI(){
        setTitle("Example UI Window");
        setSize(400,400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        MainClass mainClass = new MainClass();
        mainClass.setVisible(true);
    }

}
