package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuItem;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import view.OptionsWindow;
import view.Window;

public class MenuListener implements ActionListener {
	private static final Logger	log	= LoggerFactory.getLogger(MenuListener.class);
	
	public Window				window;
	
	public MenuListener(Window window) {
		this.window = window;
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() instanceof JMenuItem) {
			JMenuItem source = (JMenuItem) e.getSource();
			log.info("WindowListener - actionPerformed - source: JMenuItem - name: {}", source.getText());
			
			if (source.getText() == "Exit") {
				log.info("Exit program");
				System.exit(0);
			}
		} else if (e.getSource() instanceof JMenu) {
			JMenu source = (JMenu) e.getSource();
			log.info("WindowListener - actionPerformed - source: JMenu - name: {}", source.getText());
			
			if (source.getText() == "Options") {
				log.info("Options");
				new OptionsWindow(window);
			}
		}
	}
}
