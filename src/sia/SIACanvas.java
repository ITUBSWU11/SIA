package sia;

import java.awt.*;
import javax.swing.*;
import java.util.ArrayList;

/**
 * A canvas.
 * @author hypesystem
 */
public class SIACanvas extends JComponent {
    private ArrayList<String> output_texts;
    private ArrayList<Unit> displayed_units;
    
    public SIACanvas() {
        output_texts = new ArrayList<String>();
        displayed_units = new ArrayList<Unit>();
    }
    
    @Override
    public void paint(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, 800, 600);
        g.setColor(Color.WHITE);
        int i = 0;
        for(String text : output_texts) {
            g.drawString(text, (i*15)+10, (i*15)+10);
            i++;
        }
        for(Unit unit : displayed_units) {
            g.fillRect(unit.getX(), unit.getY(), 25, 25);
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
    
    public void addUnit(Unit unit) {
        displayed_units.add(unit);
        repaint();
    }
}
