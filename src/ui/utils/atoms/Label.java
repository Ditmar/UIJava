package ui.utils.atoms;

import java.awt.Dimension;

import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import ui.palette.OursColor;
import ui.utils.Centered;
import ui.utils.atoms.base.UiBase;

public class Label extends JLabel implements UiBase{
    private Integer yDefault = 40;
    public Label(String labelText) {
        super(labelText);
        this.setSize(new Dimension(130, 20));
        this.setForeground(OursColor.fourth);
        this.setHorizontalAlignment(SwingConstants.CENTER);
    }
    public void setCentered(JComponent parent) {
        this.setLocation(Centered.getCenterWidth(this, parent), yDefault);
    }
    public void setCentered(JComponent parent, Integer y) {
        this.setLocation(Centered.getCenterWidth(this, parent), y);
    }
}
