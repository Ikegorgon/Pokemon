package pokemon.view;

import pokemon.controller.*;
import javax.swing.*;
	
public class PokemonFrame extends JFrame {
		//Basic Frame to hold Panel
		private PokemonController app;
		private PokemonPanel appPanel;
		public PokemonFrame(PokemonController app) {
			super();
			this.app = app;
			this.appPanel = new PokemonPanel(app);
			setupFrame();
		}
		private void setupFrame() {
			this.setContentPane(appPanel);
			this.setTitle("Pokemon");
			this.setSize(750, 750);
			this.setResizable(false);
			this.setVisible(true);
			this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		}
		public PokemonController getBaseController() {
			return app;
		}

}
