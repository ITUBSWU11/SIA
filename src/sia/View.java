package sia;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

/**
 * The view layer gathering input and showing a window.
 * @author hypesystem
 */
public class View {
    private JFrame window;
    private Container contentpane;
    private JMenuBar menu;
    private JMenu fileMenu;
    private JMenuItem newGame;
    private JMenuItem loadGame;
    private JMenuItem saveGame;
    private JMenuItem quitApp;
    private JMenu helpMenu;
    private JMenuItem helpItem;
    private JMenuItem aboutItem;
    private JPanel canvasPanel;
    private SIACanvas canvas;
    
    public View() {
        window = new JFrame("Space Invaders Advanced");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //menu bar
        menu = new JMenuBar();
        
        // file menu
        fileMenu = new JMenu("File");
        
        //  new game
        newGame = new JMenuItem("New game");
        fileMenu.add(newGame);
        
        //  load game
        loadGame = new JMenuItem("Load game");
        fileMenu.add(loadGame);
        
        //  save game
        saveGame = new JMenuItem("Save game");
        saveGame.setEnabled(false);
        fileMenu.add(saveGame);
        
        //  quit
        quitApp = new JMenuItem("Quit");
        quitApp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                window.dispose();
            }
        });
        fileMenu.add(quitApp);
        
        menu.add(fileMenu);
        
        // help menu
        helpMenu = new JMenu("Help");
        
        //  help item
        helpItem = new JMenuItem("View help");
        helpMenu.add(helpItem);
        
        //  about item
        aboutItem = new JMenuItem("About");
        helpMenu.add(aboutItem);
        
        menu.add(helpMenu);
        
        //canvas
        canvasPanel = new JPanel();
        canvas = new SIACanvas();
        canvasPanel.add(canvas);
        
        //pack and launch
        window.setJMenuBar(menu);
        window.getContentPane().add(canvasPanel);
        window.pack();
        window.setResizable(false);
        window.setVisible(true);
        
        //key listeners
        window.addKeyListener(new KeyListener() {
            @Override
            public void keyPressed(KeyEvent e) {
                canvas.outputText("PRESSED KEY OMG");
            }
            
            @Override
            public void keyReleased(KeyEvent e) {
                canvas.outputText("KEY RELEASED! WOW!");
            }
            
            @Override
            public void keyTyped(KeyEvent e) {}
        });
    }
}
