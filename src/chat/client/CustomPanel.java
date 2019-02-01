package chat.client;

import java.awt.Panel;
import java.awt.Dimension;

class CustomPanel extends Panel {

    public CustomPanel(int i, int j) {
        dimension = new Dimension(i, j);
        resize(dimension);
        validate();
    }

    @Override
    public Dimension minimumSize() {
        return dimension;
    }

    @Override
    public Dimension preferredSize() {
        return size();
    }

    /**
     * ***********Global Variable Declarations*********
     */
    public Dimension dimension;
}
