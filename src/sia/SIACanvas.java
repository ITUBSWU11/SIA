package sia;

import java.awt.*;
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
        g.fillRect(0, 0, 800, 600);
    }
    
    @Override
    public Dimension getPreferredSize() {
        return new Dimension(800,600);
    }
    
    @Override
    public Dimension getMinimumSize() {
        return new Dimension(400,300);
    }
}
