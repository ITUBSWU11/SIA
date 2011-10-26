package sia;

import java.awt.*;
import javax.swing.*;
import java.util.ArrayList;

/**
 *
 * @author hypesystem
 */
public class SIACanvas extends JComponent {
    private ArrayList<String> output_texts;
    
    public SIACanvas() {
        output_texts = new ArrayList<String>();
    }
    
    @Override
    public void paint(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, 800, 600);
        g.setColor(Color.WHITE);
        int i = 0;
        for(String text : output_texts) {
            g.drawString(text, (i*15)+10, (i*15)+10);
        }
    }
    
    @Override
    public Dimension getPreferredSize() {
        return new Dimension(800,600);
    }
    
    @Override
    public Dimension getMinimumSize() {
        return new Dimension(400,300);
    }
    
    public void outputText(String text) {
        output_texts.add(text);
        repaint();
    }
}
