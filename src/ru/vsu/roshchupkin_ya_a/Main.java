package ru.vsu.roshchupkin_ya_a;

import ru.vsu.roshchupkin_ya_a.view.MainFrame;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(MainFrame::new);
    }
}
