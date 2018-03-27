package com.company;

import javax.swing.*;

public class ControlPanel extends JPanel{
    private final DrawingFrame frame;

    JButton loadBtn = new JButton("Load");
    JButton saveBtn = new JButton("Save");


    public ControlPanel(DrawingFrame frame) {
        this.frame = frame;
        init();
    }

    private void init() {
        add(saveBtn);
        add(loadBtn);
    }
}
