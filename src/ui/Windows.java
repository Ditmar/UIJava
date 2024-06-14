package ui;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import ui.palette.OursColor;
import ui.utils.Centered;
import ui.utils.atoms.Label;

public class Windows extends JFrame {
    public JPanel leftPanel;
    public JPanel rightPanel;
    public Label title, subTitle;
    public JTextField inputText;
    
    public Windows(String title) {
        super(title);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.setSize(1200, 700);
        setLocationRelativeTo(this);
        setLayout(null);
        this.setVisible(true);
        this.createUi();
    }
    public void createUi () {
        createLeftPanel();
        createRightPanel();
        this.add(leftPanel);
        this.add(rightPanel);
        createLabels();
        createTextField();
    }
    public void createLeftPanel() {
        leftPanel = new JPanel();
        leftPanel.setLayout(null);
        leftPanel.setSize(600, 500);
        leftPanel.setLocation(0, 0);
        leftPanel.setBackground(OursColor.primary);
    }
    public void createRightPanel() {
        rightPanel = new JPanel();
        rightPanel.setLayout(null);
        rightPanel.setSize(400, 500);
        rightPanel.setLocation(600, 0);
        rightPanel.setBackground(OursColor.secondary);
    }
    public void createLabels() {
        this.title = new Label("Spotify");
        this.title.setCentered(leftPanel);
        leftPanel.add(this.title);
        this.subTitle = new Label("We help you in everything");
        this.subTitle.setCentered(rightPanel);
        rightPanel.add(this.subTitle);
    }
    public void createTextField() {
        this.inputText = new JTextField("User name");
        this.inputText.setSize(new Dimension(260, 40));
        this.inputText.setLocation(Centered.getCenterWidth(inputText, rightPanel), 80);
        this.inputText.setForeground(OursColor.black);
        this.inputText.setBackground(OursColor.secondary);
        this.inputText.setCaretColor(OursColor.fourth);
        this.inputText.setHorizontalAlignment(SwingConstants.CENTER);
        rightPanel.add(this.inputText);
    }
}