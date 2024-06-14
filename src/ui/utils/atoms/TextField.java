package ui.utils.atoms;

import java.awt.Dimension;

import javax.swing.JComponent;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import ui.palette.OursColor;
import ui.utils.Centered;
import ui.utils.atoms.base.UiBase;

public class TextField extends JTextField implements UiBase{
    private Integer yDefault = 40;
    public TextField (String label) {
        super(label);
        this.setSize(new Dimension(260, 40));
        this.setForeground(OursColor.black);
        this.setBackground(OursColor.secondary);
        this.setCaretColor(OursColor.fourth);
        this.setHorizontalAlignment(SwingConstants.CENTER);
    }
    public void setCentered(JComponent parent) {
        this.setLocation(Centered.getCenterWidth(this, parent), yDefault);
    }
    public void setCentered(JComponent parent, Integer y) {
        this.setLocation(Centered.getCenterWidth(this, parent), y);
    }
    
}
