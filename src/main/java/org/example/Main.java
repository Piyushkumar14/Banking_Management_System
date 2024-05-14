package org.example;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // Run GUI updates on the Event Dispatch Thread
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Menu();
            }
        });
    }
}