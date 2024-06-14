package ui.utils;

import javax.swing.JComponent;

public class Centered {
    public static Integer getCenterWidth(JComponent child, JComponent parent) {
        if (parent.getWidth() < child.getWidth()) {
            new Error("the parent must be more bigger than the child");
        }
        return (parent.getWidth() - child.getWidth()) / 2;
    }
    public static Integer getCenterHeight(JComponent child, JComponent parent) {
        if (parent.getHeight() < child.getHeight()) {
            new Error("the parent must be more bigger than the child");
        }
        return (parent.getHeight() - child.getHeight()) / 2;
    }
}
