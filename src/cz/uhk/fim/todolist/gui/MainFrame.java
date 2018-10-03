package cz.uhk.fim.todolist.gui;

import cz.uhk.fim.todolist.model.TodoItem;
import cz.uhk.fim.todolist.model.TodoList;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {

    private JTable table;
    private TodoTableModel model;
    private TodoList todoList;

    public MainFrame() {
        init();
    }

    private void init() {
        setTitle("TODO List app");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);

        todoList = new TodoList();
        model = new TodoTableModel();
        model.setTodoList(todoList);

        initControlPanel();
        initContentPanel();
    }

    private void initContentPanel() {
        table = new JTable();
        table.setModel(model);
        add(new JScrollPane(table), BorderLayout.CENTER);
    }

    private void initControlPanel() {
        JPanel controlPanel = new JPanel(new BorderLayout());

        JLabel lblAddTodo = new JLabel("Add TODO");
        JTextField txtAddTodo = new JTextField();
        JButton btnAdd = new JButton("Add");

        btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (txtAddTodo.getText().trim().length() == 0) {
                    JOptionPane.showMessageDialog(null, "Use a better name for your todo!", "Empty name", JOptionPane.ERROR_MESSAGE);
                } else {
                    todoList.add(new TodoItem(txtAddTodo.getText()));
                    txtAddTodo.setText("");
                    model.setTodoList(todoList);
                }
            }
        });

        controlPanel.add(lblAddTodo, BorderLayout.WEST);
        controlPanel.add(txtAddTodo, BorderLayout.CENTER);
        controlPanel.add(btnAdd, BorderLayout.EAST);

        add(controlPanel, BorderLayout.NORTH);
    }

}
