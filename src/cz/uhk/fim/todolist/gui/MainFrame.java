package cz.uhk.fim.todolist.gui;

import javax.swing.*;

public class MainFrame extends JFrame {

    public MainFrame() {
        init();
    }

    private void init() {
        setTitle("TODO List app");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(800,600);
        setLocationRelativeTo(null);
    }

}
