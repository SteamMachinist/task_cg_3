package ru.vsu.roshchupkin_ya_a.view;

import javax.swing.*;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import java.awt.*;

public class MainFrame extends JFrame {
    private final String imageIconPath = "resources/icon.png";
    private final Dimension initialDimension = new Dimension(1600, 1000);

    private final DrawPanel drawPanel;
    private final FunctionPanel functionPanel;

    private final JSplitPane splitPane;
    private final double panelWidthRatio = 0.75;

    public MainFrame() {
        this.setTitle("Graph drawer");
        this.setIconImage(new ImageIcon(imageIconPath).getImage());
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setSize(initialDimension);
        this.setLocationRelativeTo(null);
        try {
            UIManager.setLookAndFeel(new NimbusLookAndFeel());
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }

        this.drawPanel = new DrawPanel();
        this.functionPanel = new FunctionPanel();

        this.splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, true, drawPanel, functionPanel);
        splitPane.setSize(this.getSize());
        splitPane.setDividerLocation(panelWidthRatio);
        splitPane.setResizeWeight(0.5);
        this.add(splitPane);

        this.setVisible(true);
    }
}
