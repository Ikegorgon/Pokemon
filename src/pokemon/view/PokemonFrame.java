package pokemon.view;

import pokemon.controller.*;
import javax.swing.*;
	
public class PokemonFrame {
		//Basic Frame to hold Panel
		private PokemonController app;
		private PokemonPanel appPanel;
		public PokemonFrame(PokemonController app) {
			super();
			this.app = app;
			appPanel = new PokemonPanel(app);
			setupFrame();
		}
		public PokemonFrame() {
			
		}
		private void setupFrame() {
//			this.setContentPane(appPanel);
//			this.setTitle("Chatbot");
//			this.setSize(500, 500);
//			this.setResizable(false);
//			this.setVisible(true);
//			this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		}
		public PokemonController getBaseController() {
			return app;
		}

}
