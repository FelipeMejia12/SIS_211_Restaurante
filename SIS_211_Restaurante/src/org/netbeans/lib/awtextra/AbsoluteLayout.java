package org.netbeans.lib.awtextra;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.LayoutManager2;
import java.util.IdentityHashMap;
import java.util.Map;

public class AbsoluteLayout implements LayoutManager2 {

    private final Map<Component, AbsoluteConstraints> constraintsMap = new IdentityHashMap<>();

    @Override
    public void addLayoutComponent(Component comp, Object constraints) {
        if (constraints instanceof AbsoluteConstraints) {
            constraintsMap.put(comp, (AbsoluteConstraints) constraints);
        }
    }

    @Override
    public Dimension maximumLayoutSize(Container target) {
        return target.getMaximumSize();
    }

    @Override
    public float getLayoutAlignmentX(Container target) {
        return 0.5f;
    }

    @Override
    public float getLayoutAlignmentY(Container target) {
        return 0.5f;
    }

    @Override
    public void invalidateLayout(Container target) {
        // no-op
    }

    @Override
    public void addLayoutComponent(String name, Component comp) {
        // no-op
    }

    @Override
    public void removeLayoutComponent(Component comp) {
        constraintsMap.remove(comp);
    }

    @Override
    public Dimension preferredLayoutSize(Container parent) {
        return new Dimension(0, 0);
    }

    @Override
    public Dimension minimumLayoutSize(Container parent) {
        return new Dimension(0, 0);
    }

    @Override
    public void layoutContainer(Container parent) {
        for (Component c : parent.getComponents()) {
            AbsoluteConstraints ac = constraintsMap.get(c);
            if (ac != null) {
                int w = ac.width > 0 ? ac.width : c.getPreferredSize().width;
                int h = ac.height > 0 ? ac.height : c.getPreferredSize().height;
                c.setBounds(ac.x, ac.y, w, h);
            }
        }
    }

}
