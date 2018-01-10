package pokemon.view;

import pokemon.controller.*;
import pokemon.model.*;
import javax.swing.*;
import java.util.*;
import java.awt.Color;
import java.awt.event.*;
import java.awt.Font;

public class PokemonPanel extends JPanel {
	private PokemonController appController;
	private PokemonFrame frame;
	private SpringLayout appLayout;
	
	private JLabel healthLabel;
	private JLabel attackLabel;
	private JLabel nameLabel;
	private JLabel numberLabel;
	private JLabel evolvableLabel;
	private JLabel modifierLabel;
	private JLabel iconLabel;
	
	private JCheckBox evolvableBox;
	private JTextField nameField;
	private JTextField numberField;
	private JTextField attackField;
	private JTextField healthField;
	private JTextField modifierField;
	
	private JTextArea descriptionArea;
	private JTextArea typeArea;
	
	private JButton saveButton;
	private JButton clearButton;
	private JComboBox pokedexDropdown;
	
	private JPanel firstType;
	private JPanel secondType;
	private JPanel thirdType;
	private JPanel fourthType;
	
	private void updatePokedexInfo(int index) {
		nameField.setText(appController.getPokedex().get(index).getName());
		evolvableBox.setSelected(appController.getPokedex().get(index).isCanEvolve());
		numberField.setText(appController.getPokedex().get(index).getNumber() + "");
		attackField.setText(appController.getPokedex().get(index).getAttackPoints() + "");
		healthField.setText(appController.getPokedex().get(index).getHealthPoints() + "");
		modifierField.setText(appController.getPokedex().get(index).getEnhancemetModifier() + "");
	}
	public PokemonPanel(PokemonController app) {
		super();
		this.appController = app;
//		frame = new PokemonFrame();
		appLayout = new SpringLayout();
		
		nameLabel = new JLabel("Name");
		appLayout.putConstraint(SpringLayout.NORTH, nameLabel, 10, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.EAST, nameLabel, 100, SpringLayout.WEST, nameLabel);
		appLayout.putConstraint(SpringLayout.SOUTH, nameLabel, 15, SpringLayout.NORTH, nameLabel);
		appLayout.putConstraint(SpringLayout.WEST, nameLabel, 10, SpringLayout.WEST, this);
		

		nameField = new JTextField("name...");
		appLayout.putConstraint(SpringLayout.NORTH, nameField, 0, SpringLayout.NORTH, nameLabel);
		appLayout.putConstraint(SpringLayout.EAST, nameField, 100, SpringLayout.WEST, nameField);
		appLayout.putConstraint(SpringLayout.SOUTH, nameField, 0, SpringLayout.SOUTH, nameLabel);
		appLayout.putConstraint(SpringLayout.WEST, nameField, 0, SpringLayout.EAST, nameLabel);
		
		numberLabel = new JLabel("Number");
		appLayout.putConstraint(SpringLayout.NORTH, numberLabel, 10, SpringLayout.SOUTH, nameLabel);
		appLayout.putConstraint(SpringLayout.EAST, numberLabel, 100, SpringLayout.WEST, numberLabel);
		appLayout.putConstraint(SpringLayout.SOUTH, numberLabel, 15, SpringLayout.NORTH, numberLabel);
		appLayout.putConstraint(SpringLayout.WEST, numberLabel, 0, SpringLayout.WEST, nameLabel);
		
		numberField = new JTextField("#...");
		appLayout.putConstraint(SpringLayout.NORTH, numberField, 0, SpringLayout.NORTH, numberLabel);
		appLayout.putConstraint(SpringLayout.EAST, numberField, 100, SpringLayout.WEST, numberField);
		appLayout.putConstraint(SpringLayout.SOUTH, numberField, 0, SpringLayout.SOUTH, numberLabel);
		appLayout.putConstraint(SpringLayout.WEST, numberField, 0, SpringLayout.EAST, numberLabel);
		
		healthLabel = new JLabel("Health");
		appLayout.putConstraint(SpringLayout.NORTH, healthLabel, 10, SpringLayout.SOUTH, numberLabel);
		appLayout.putConstraint(SpringLayout.EAST, healthLabel, 100, SpringLayout.WEST, healthLabel);
		appLayout.putConstraint(SpringLayout.SOUTH, healthLabel, 15, SpringLayout.NORTH, healthLabel);
		appLayout.putConstraint(SpringLayout.WEST, healthLabel, 0, SpringLayout.WEST, nameLabel);
		
		healthField = new JTextField("HP...");
		appLayout.putConstraint(SpringLayout.NORTH, healthField, 0, SpringLayout.NORTH, healthLabel);
		appLayout.putConstraint(SpringLayout.EAST, healthField, 100, SpringLayout.WEST, healthField);
		appLayout.putConstraint(SpringLayout.SOUTH, healthField, 0, SpringLayout.SOUTH, healthLabel);
		appLayout.putConstraint(SpringLayout.WEST, healthField, 0, SpringLayout.EAST, healthLabel);
		
		attackLabel = new JLabel("Attack");
		appLayout.putConstraint(SpringLayout.NORTH, attackLabel, 10, SpringLayout.SOUTH, healthLabel);
		appLayout.putConstraint(SpringLayout.EAST, attackLabel, 100, SpringLayout.WEST, attackLabel);
		appLayout.putConstraint(SpringLayout.SOUTH, attackLabel, 15, SpringLayout.NORTH, attackLabel);
		appLayout.putConstraint(SpringLayout.WEST, attackLabel, 0, SpringLayout.WEST, nameLabel);
		
		attackField = new JTextField("AP...");
		appLayout.putConstraint(SpringLayout.NORTH, attackField, 0, SpringLayout.NORTH, attackLabel);
		appLayout.putConstraint(SpringLayout.EAST, attackField, 100, SpringLayout.WEST, attackField);
		appLayout.putConstraint(SpringLayout.SOUTH, attackField, 0, SpringLayout.SOUTH, attackLabel);
		appLayout.putConstraint(SpringLayout.WEST, attackField, 0, SpringLayout.EAST, attackLabel);
		
		modifierLabel = new JLabel("Modifier");
		appLayout.putConstraint(SpringLayout.NORTH, modifierLabel, 10, SpringLayout.SOUTH, attackLabel);
		appLayout.putConstraint(SpringLayout.EAST, modifierLabel, 100, SpringLayout.WEST, modifierLabel);
		appLayout.putConstraint(SpringLayout.SOUTH, modifierLabel, 15, SpringLayout.NORTH, modifierLabel);
		appLayout.putConstraint(SpringLayout.WEST, modifierLabel, 0, SpringLayout.WEST, nameLabel);
		
		modifierField = new JTextField("modifier...");
		appLayout.putConstraint(SpringLayout.NORTH, modifierField, 0, SpringLayout.NORTH, modifierLabel);
		appLayout.putConstraint(SpringLayout.EAST, modifierField, 100, SpringLayout.WEST, modifierField);
		appLayout.putConstraint(SpringLayout.SOUTH, modifierField, 0, SpringLayout.SOUTH, modifierLabel);
		appLayout.putConstraint(SpringLayout.WEST, modifierField, 0, SpringLayout.EAST, modifierLabel);
		
		evolvableLabel = new JLabel("Evolvable");
		appLayout.putConstraint(SpringLayout.NORTH, evolvableLabel, 10, SpringLayout.SOUTH, modifierLabel);
		appLayout.putConstraint(SpringLayout.EAST, evolvableLabel, 100, SpringLayout.WEST, evolvableLabel);
		appLayout.putConstraint(SpringLayout.SOUTH, evolvableLabel, 15, SpringLayout.NORTH, evolvableLabel);
		appLayout.putConstraint(SpringLayout.WEST, evolvableLabel, 0, SpringLayout.WEST, nameLabel);
		
		evolvableBox = new JCheckBox();
		appLayout.putConstraint(SpringLayout.NORTH, evolvableBox, 0, SpringLayout.NORTH, evolvableLabel);
		appLayout.putConstraint(SpringLayout.EAST, evolvableBox, 100, SpringLayout.WEST, evolvableBox);
		appLayout.putConstraint(SpringLayout.SOUTH, evolvableBox, 0, SpringLayout.SOUTH, evolvableLabel);
		appLayout.putConstraint(SpringLayout.WEST, evolvableBox, 0, SpringLayout.EAST, evolvableLabel);
		
		
		
		
//		pokedexDropdown = new JComboBox();
//		appLayout.putConstraint(SpringLayout.SOUTH, pokedexDropdown, -10, SpringLayout.SOUTH, this);
//		appLayout.putConstraint(SpringLayout.EAST, pokedexDropdown, -177, SpringLayout.EAST, this);
//		clearButton = new JButton("clear");
//		appLayout.putConstraint(SpringLayout.WEST, clearButton, 34, SpringLayout.WEST, this);
//		saveButton = new JButton("save");
//		appLayout.putConstraint(SpringLayout.WEST, pokedexDropdown, 46, SpringLayout.EAST, saveButton);
//		appLayout.putConstraint(SpringLayout.SOUTH, clearButton, -25, SpringLayout.NORTH, saveButton);
//		appLayout.putConstraint(SpringLayout.NORTH, saveButton, -1, SpringLayout.NORTH, pokedexDropdown);
//		descriptionArea = new JTextArea(5,10);
//		appLayout.putConstraint(SpringLayout.WEST, descriptionArea, 300, SpringLayout.WEST, this);
//		appLayout.putConstraint(SpringLayout.SOUTH, descriptionArea, -23, SpringLayout.NORTH, pokedexDropdown);
//		typeArea = new JTextArea(4,15);
//		appLayout.putConstraint(SpringLayout.NORTH, typeArea, 26, SpringLayout.NORTH, this);
//		appLayout.putConstraint(SpringLayout.WEST, saveButton, 0, SpringLayout.WEST, typeArea);
//		appLayout.putConstraint(SpringLayout.WEST, typeArea, 300, SpringLayout.WEST, this);
//		firstType = new JPanel();
//		secondType = new JPanel();
//		thirdType = new JPanel();
//		fourthType = new JPanel();
//		iconLabel = new JLabel("", new ImageIcon(getClass()
//				.getResource("/pokemon/view/images/ChuckNorrisFinal.png")), SwingConstants.CENTER);
		
		setupComboBox();
		setupTypePanels();
		setupPanel();
		setupLayout();
		setupListeners();
	}
	private void setupComboBox() {
		DefaultComboBoxModel pokemonModel = new DefaultComboBoxModel(appController.convertPokedex());
		pokedexDropdown.setModel(pokemonModel);
	}
	private void setupTypePanels() {
		firstType.setSize(50,50);
		secondType.setSize(50,50);
		thirdType.setSize(50,50);
		fourthType.setSize(50,50);
	}
	private void setupPanel() {
		this.setBackground(Color.LIGHT_GRAY);
		this.setLayout(appLayout);
		this.add(nameLabel);
		this.add(nameField);	
		this.add(numberLabel);
		this.add(numberField);
		this.add(healthLabel);
		this.add(healthField);
		this.add(attackLabel);
		this.add(attackField);
		this.add(modifierLabel);
		this.add(modifierField);
		this.add(evolvableLabel);
		this.add(evolvableBox);

		//this.add(iconLabel);
//		this.add(descriptionArea);
//		this.add(typeArea);
//		this.add(saveButton);
//		this.add(clearButton);
//		this.add(pokedexDropdown);
//		this.add(firstType);
//		this.add(secondType);
//		this.add(thirdType);
//		this.add(fourthType);
	}
	private void updateTypePanels() {
		String[] types = appController.getPokedex().get(pokedexDropdown.getSelectedIndex()).getPokemonTypes();
		String[] type = new String[] {"firstType", "secondType", "thirdType", "fourthType"};
		for (int i = 0; i < types.length; i++) {
			for (int j = 0; j < type.length; j++) {
				if (j == 0) {
					if (types[i].equals("Rock")) {
						firstType.setBackground(Color.GREEN);
					} else if (types[i].equals("Fighting")) {
						firstType.setBackground(Color.RED);
					} else if (types[i].equals("Psychcic")) {
						firstType.setBackground(Color.PINK);
					} else {
						firstType.setBackground(Color.WHITE);
					}
				}
				if (j == 1) {
					if (types[i].equals("Rock")) {
						secondType.setBackground(Color.GREEN);
					} else if (types[i].equals("Fighting")) {
						secondType.setBackground(Color.RED);
					} else if (types[i].equals("Psychcic")) {
						secondType.setBackground(Color.PINK);
					} else {
						secondType.setBackground(Color.WHITE);
					}
				}
				if (j == 2) {
					if (types[i].equals("Rock")) {
						thirdType.setBackground(Color.GREEN);
					} else if (types[i].equals("Fighting")) {
						thirdType.setBackground(Color.RED);
					} else if (types[i].equals("Psychcic")) {
						thirdType.setBackground(Color.PINK);
					} else {
						thirdType.setBackground(Color.WHITE);
					}
				}
				if (j == 3) {
					if (types[i].equals("Rock")) {
						fourthType.setBackground(Color.GREEN);
					} else if (types[i].equals("Fighting")) {
						fourthType.setBackground(Color.RED);
					} else if (types[i].equals("Psychcic")) {
						fourthType.setBackground(Color.PINK);
					} else {
						fourthType.setBackground(Color.WHITE);
					}
				}
			}
		}
	}
	private void setupLayout() {
		iconLabel.setSize(50, 50);
	}
	private void setupListeners() {
		pokedexDropdown.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent selection) {
				int selectedPokemonIndex = pokedexDropdown.getSelectedIndex();
				updatePokedexInfo(selectedPokemonIndex);
//				updateImage();
				updateTypePanels();
				repaint();
			}
		});
	}
}
