package pokemon.view;

import pokemon.controller.*;
import pokemon.model.*;
import javax.swing.*;
import java.util.*;
import java.awt.Color;
import java.awt.event.*;
import java.awt.Font;

public class PokemonPanel {
	private PokemonController app;
	private PokemonFrame frame;
	public PokemonPanel(PokemonController app) {
		super();
		this.app = app;
		frame = new PokemonFrame();
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	private void setupPanel() {
		
	}
	private void setupLayout() {
		
	}
	private void setupListeners() {
		
	}
}
