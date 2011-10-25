package sia;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author hypesystem
 */
public class SIACanvas extends JComponent {
    
    public SIACanvas() {
        
    }
    
    @Override
    public void paint(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(10, 10, 10, 10);
    }
}
