package pokemon.view;

import pokemon.controller.*;
import pokemon.model.*;
import javax.swing.*;
import java.util.*;
import java.awt.Color;
import java.awt.event.*;
import java.awt.Font;
import java.awt.Dimension;
import java.awt.Component;
import java.awt.Rectangle;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;

public class PokemonPanel extends JPanel {
	private PokemonController appController;
	private PokemonFrame frame;
	private SpringLayout appLayout;
	
	private JLabel background;
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
	
	public PokemonPanel(PokemonController app) {
		super();
		this.appController = app;
//		frame = new PokemonFrame();
		appLayout = new SpringLayout();
		
		nameLabel = new JLabel(" Name");
		appLayout.putConstraint(SpringLayout.NORTH, nameLabel, 30, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.WEST, nameLabel, 265, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, nameLabel, 50, SpringLayout.NORTH, this);
		nameLabel.setBorder(new LineBorder(new Color(0, 0, 0)));
		nameLabel.setBackground(Color.LIGHT_GRAY);
		nameLabel.setPreferredSize(new Dimension(120, 20));
		nameLabel.setSize(new Dimension(120, 20));
		nameLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
		nameLabel.setToolTipText("Pokemon Name");
		nameLabel.setOpaque(true);
		appLayout.putConstraint(SpringLayout.EAST, nameLabel, 360, SpringLayout.WEST, this);

		nameField = new JTextField("name...");
		nameField.setPreferredSize(new Dimension(120, 20));
		nameField.setSize(new Dimension(120, 20));
		nameField.setFont(new Font("Times New Roman", Font.BOLD, 15));
		nameField.setToolTipText("Name/NickName Of Pokemon");
		appLayout.putConstraint(SpringLayout.NORTH, nameField, 0, SpringLayout.NORTH, nameLabel);
		appLayout.putConstraint(SpringLayout.WEST, nameField, 0, SpringLayout.EAST, nameLabel);
		appLayout.putConstraint(SpringLayout.SOUTH, nameField, 0, SpringLayout.SOUTH, nameLabel);
		appLayout.putConstraint(SpringLayout.EAST, nameField, 120, SpringLayout.EAST, nameLabel);
		
		numberLabel = new JLabel(" Number");
		numberLabel.setBorder(new LineBorder(new Color(0, 0, 0)));
		numberLabel.setBackground(Color.LIGHT_GRAY);
		numberLabel.setOpaque(true);	
		numberLabel.setSize(new Dimension(120, 20));
		numberLabel.setPreferredSize(new Dimension(120, 20));
		numberLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
		numberLabel.setToolTipText("Pokemon Number");
		appLayout.putConstraint(SpringLayout.NORTH, numberLabel, 10, SpringLayout.SOUTH, nameLabel);
		appLayout.putConstraint(SpringLayout.WEST, numberLabel, 0, SpringLayout.WEST, nameLabel);
		appLayout.putConstraint(SpringLayout.SOUTH, numberLabel, 30, SpringLayout.SOUTH, nameLabel);
		appLayout.putConstraint(SpringLayout.EAST, numberLabel, 0, SpringLayout.EAST, nameLabel);

		
		numberField = new JTextField("#...");
		numberField.setEditable(false);
		appLayout.putConstraint(SpringLayout.NORTH, numberField, 0, SpringLayout.NORTH, numberLabel);
		appLayout.putConstraint(SpringLayout.WEST, numberField, 0, SpringLayout.EAST, numberLabel);
		appLayout.putConstraint(SpringLayout.SOUTH, numberField, 0, SpringLayout.SOUTH, numberLabel);
		appLayout.putConstraint(SpringLayout.EAST, numberField, 120, SpringLayout.EAST, numberLabel);
		numberField.setSize(new Dimension(120, 20));
		numberField.setPreferredSize(new Dimension(120, 20));
		numberField.setFont(new Font("Times New Roman", Font.BOLD, 15));
		numberField.setToolTipText("###");
		
		healthLabel = new JLabel(" Health");
		healthLabel.setBorder(new LineBorder(new Color(0, 0, 0)));
		healthLabel.setBackground(Color.LIGHT_GRAY);
		healthLabel.setOpaque(true);
		appLayout.putConstraint(SpringLayout.NORTH, healthLabel, 10, SpringLayout.SOUTH, numberLabel);
		appLayout.putConstraint(SpringLayout.WEST, healthLabel, 0, SpringLayout.WEST, nameLabel);
		appLayout.putConstraint(SpringLayout.SOUTH, healthLabel, 30, SpringLayout.SOUTH, numberLabel);
		appLayout.putConstraint(SpringLayout.EAST, healthLabel, 0, SpringLayout.EAST, nameLabel);
		healthLabel.setPreferredSize(new Dimension(120, 20));
		healthLabel.setSize(new Dimension(120, 20));
		healthLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
		healthLabel.setToolTipText("Pokemon Health");
		
		healthField = new JTextField("hp...");
		appLayout.putConstraint(SpringLayout.NORTH, healthField, 0, SpringLayout.NORTH, healthLabel);
		appLayout.putConstraint(SpringLayout.WEST, healthField, 0, SpringLayout.EAST, healthLabel);
		appLayout.putConstraint(SpringLayout.SOUTH, healthField, 0, SpringLayout.SOUTH, healthLabel);
		appLayout.putConstraint(SpringLayout.EAST, healthField, 120, SpringLayout.EAST, healthLabel);
		healthField.setPreferredSize(new Dimension(120, 20));
		healthField.setSize(new Dimension(120, 20));
		healthField.setFont(new Font("Times New Roman", Font.BOLD, 15));
		healthField.setToolTipText("Health Points");
		
		attackLabel = new JLabel(" Attack");
		attackLabel.setBorder(new LineBorder(new Color(0, 0, 0)));
		attackLabel.setBackground(Color.LIGHT_GRAY);
		attackLabel.setOpaque(true);
		appLayout.putConstraint(SpringLayout.NORTH, attackLabel, 10, SpringLayout.SOUTH, healthLabel);
		appLayout.putConstraint(SpringLayout.WEST, attackLabel, 0, SpringLayout.WEST, nameLabel);
		appLayout.putConstraint(SpringLayout.SOUTH, attackLabel, 30, SpringLayout.SOUTH, healthLabel);
		appLayout.putConstraint(SpringLayout.EAST, attackLabel, 0, SpringLayout.EAST, nameLabel);
		attackLabel.setSize(new Dimension(120, 20));
		attackLabel.setPreferredSize(new Dimension(120, 20));
		attackLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
		attackLabel.setToolTipText("Pokemon Attack");
		
		attackField = new JTextField("ap...");
		appLayout.putConstraint(SpringLayout.NORTH, attackField, 0, SpringLayout.NORTH, attackLabel);
		appLayout.putConstraint(SpringLayout.WEST, attackField, 0, SpringLayout.EAST, attackLabel);
		appLayout.putConstraint(SpringLayout.SOUTH, attackField, 0, SpringLayout.SOUTH, attackLabel);
		appLayout.putConstraint(SpringLayout.EAST, attackField, 120, SpringLayout.EAST, attackLabel);
		attackField.setSize(new Dimension(120, 20));
		attackField.setPreferredSize(new Dimension(120, 20));
		attackField.setFont(new Font("Times New Roman", Font.BOLD, 15));
		attackField.setToolTipText("Attack Points");
		
		modifierLabel = new JLabel(" Modifier");
		modifierLabel.setBorder(new LineBorder(new Color(0, 0, 0)));
		modifierLabel.setBackground(Color.LIGHT_GRAY);
		modifierLabel.setOpaque(true);
		appLayout.putConstraint(SpringLayout.NORTH, modifierLabel, 10, SpringLayout.SOUTH, attackLabel);
		appLayout.putConstraint(SpringLayout.SOUTH, modifierLabel, 30, SpringLayout.SOUTH, attackLabel);
		appLayout.putConstraint(SpringLayout.WEST, modifierLabel, 0, SpringLayout.WEST, nameLabel);
		appLayout.putConstraint(SpringLayout.EAST, modifierLabel, 0, SpringLayout.EAST, nameLabel);
		modifierLabel.setPreferredSize(new Dimension(120, 20));
		modifierLabel.setSize(new Dimension(120, 20));
		modifierLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
		modifierLabel.setToolTipText("Pokemon Modifier");
		
		modifierField = new JTextField("mod...");
		appLayout.putConstraint(SpringLayout.NORTH, modifierField, 0, SpringLayout.NORTH, modifierLabel);
		appLayout.putConstraint(SpringLayout.WEST, modifierField, 0, SpringLayout.EAST, modifierLabel);
		appLayout.putConstraint(SpringLayout.SOUTH, modifierField, 0, SpringLayout.SOUTH, modifierLabel);
		appLayout.putConstraint(SpringLayout.EAST, modifierField, 120, SpringLayout.EAST, modifierLabel);
		modifierField.setPreferredSize(new Dimension(120, 20));
		modifierField.setSize(new Dimension(120, 20));
		modifierField.setFont(new Font("Times New Roman", Font.BOLD, 15));
		modifierField.setToolTipText("Modifier");
		
		evolvableLabel = new JLabel(" Evolvable");
		evolvableLabel.setBorder(new LineBorder(new Color(0, 0, 0)));
		evolvableLabel.setBackground(Color.LIGHT_GRAY);
		evolvableLabel.setOpaque(true);
		evolvableLabel.setSize(new Dimension(120, 20));
		appLayout.putConstraint(SpringLayout.NORTH, evolvableLabel, 10, SpringLayout.SOUTH, modifierLabel);
		appLayout.putConstraint(SpringLayout.WEST, evolvableLabel, 0, SpringLayout.WEST, nameLabel);
		appLayout.putConstraint(SpringLayout.SOUTH, evolvableLabel, 30, SpringLayout.SOUTH, modifierLabel);
		appLayout.putConstraint(SpringLayout.EAST, evolvableLabel, 0, SpringLayout.EAST, nameLabel);
		evolvableLabel.setPreferredSize(new Dimension(120, 20));
		evolvableLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
		evolvableLabel.setToolTipText("Pokemon Evolvability");
		
		evolvableBox = new JCheckBox();
		appLayout.putConstraint(SpringLayout.NORTH, evolvableBox, 0, SpringLayout.NORTH, evolvableLabel);
		appLayout.putConstraint(SpringLayout.WEST, evolvableBox, 0, SpringLayout.EAST, evolvableLabel);
		appLayout.putConstraint(SpringLayout.SOUTH, evolvableBox, 0, SpringLayout.SOUTH, evolvableLabel);
		appLayout.putConstraint(SpringLayout.EAST, evolvableBox, 120, SpringLayout.EAST, evolvableLabel);
		evolvableBox.setPreferredSize(new Dimension(20, 20));
		evolvableBox.setSize(new Dimension(20, 20));
		evolvableBox.setFont(new Font("Times New Roman", Font.BOLD, 15));
		evolvableBox.setToolTipText("Evolvable = Selected \n Non-Evolvable = Not Selected");
		
		background = new JLabel();
		appLayout.putConstraint(SpringLayout.NORTH, background, -20, SpringLayout.NORTH, nameLabel);
		appLayout.putConstraint(SpringLayout.SOUTH, background, 20, SpringLayout.SOUTH, evolvableLabel);
		background.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		background.setOpaque(true);
		background.setForeground(Color.DARK_GRAY);
		background.setBackground(Color.DARK_GRAY);
		appLayout.putConstraint(SpringLayout.WEST, background, -10, SpringLayout.WEST, nameLabel);
		appLayout.putConstraint(SpringLayout.EAST, background, 10, SpringLayout.EAST, nameField);
		
		
		
		saveButton = new JButton("Save");
		saveButton.setMultiClickThreshhold(2L);
		saveButton.setPreferredSize(new Dimension(75, 30));
		saveButton.setFont(new Font("Times New Roman", Font.BOLD, 15));
		saveButton.setToolTipText("Click To Save Progress");
		pokedexDropdown = new JComboBox();
		appLayout.putConstraint(SpringLayout.NORTH, saveButton, 5, SpringLayout.NORTH, pokedexDropdown);
		appLayout.putConstraint(SpringLayout.WEST, saveButton, 10, SpringLayout.EAST, pokedexDropdown);
		appLayout.putConstraint(SpringLayout.SOUTH, saveButton, -5, SpringLayout.SOUTH, pokedexDropdown);
		pokedexDropdown.setFont(new Font("Times New Roman", Font.BOLD, 15));
		pokedexDropdown.setToolTipText("Select Which Pokemon To View");
		clearButton = new JButton("Clear");
		appLayout.putConstraint(SpringLayout.NORTH, clearButton, 0, SpringLayout.NORTH, saveButton);
		appLayout.putConstraint(SpringLayout.WEST, clearButton, 10, SpringLayout.EAST, saveButton);
		appLayout.putConstraint(SpringLayout.SOUTH, clearButton, 0, SpringLayout.SOUTH, saveButton);
		clearButton.setFont(new Font("Times New Roman", Font.BOLD, 15));
		clearButton.setToolTipText("Click To Reset To Default");

		descriptionArea = new JTextArea(5,10);
		descriptionArea.setToolTipText("Pokemon Description");
		descriptionArea.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		descriptionArea.setFont(new Font("Times New Roman", Font.BOLD, 15));
		typeArea = new JTextArea(4,15);
		typeArea.setFont(new Font("Times New Roman", Font.BOLD, 15));
		typeArea.setToolTipText("Pokemon Type");
		typeArea.setLineWrap(true);
		typeArea.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		appLayout.putConstraint(SpringLayout.NORTH, typeArea, 10, SpringLayout.SOUTH, background);
		appLayout.putConstraint(SpringLayout.WEST, typeArea, 0, SpringLayout.WEST, background);
		appLayout.putConstraint(SpringLayout.SOUTH, typeArea, 110, SpringLayout.SOUTH, background);
		appLayout.putConstraint(SpringLayout.EAST, typeArea, 0, SpringLayout.EAST, background);

		iconLabel = new JLabel("", new ImageIcon(getClass()
				.getResource("/pokemon/view/images/PokemonLogoF.png")), SwingConstants.CENTER);
		iconLabel.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		iconLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
		appLayout.putConstraint(SpringLayout.NORTH, descriptionArea, 10, SpringLayout.SOUTH, iconLabel);
		appLayout.putConstraint(SpringLayout.WEST, descriptionArea, 0, SpringLayout.WEST, iconLabel);
		appLayout.putConstraint(SpringLayout.SOUTH, descriptionArea, 110, SpringLayout.SOUTH, iconLabel);
		appLayout.putConstraint(SpringLayout.EAST, descriptionArea, 0, SpringLayout.EAST, iconLabel);
		iconLabel.setBackground(Color.DARK_GRAY);
		iconLabel.setOpaque(true);
		iconLabel.setSize(new Dimension(230, 230));
		iconLabel.setToolTipText("Pokemon Picture");
		iconLabel.setFocusable(false);
		iconLabel.setBounds(new Rectangle(0, 0, 230, 230));
		iconLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		iconLabel.setPreferredSize(new Dimension(230, 230));
		iconLabel.setMaximumSize(new Dimension(230, 230));
		iconLabel.setMinimumSize(new Dimension(230, 230));
		appLayout.putConstraint(SpringLayout.NORTH, iconLabel, 0, SpringLayout.NORTH, background);
		appLayout.putConstraint(SpringLayout.WEST, iconLabel, 10, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, iconLabel, 0, SpringLayout.SOUTH, background);
		appLayout.putConstraint(SpringLayout.EAST, iconLabel, -10, SpringLayout.WEST, background);
		System.out.println(iconLabel.getPreferredSize());
		System.out.println(iconLabel.getSize());
		
		setupComboBox();
		setupTypePanels();
		setupPanel();
		setupLayout();
		setupListeners();
	}
	private void updatePokedexInfo(int index) {
		nameField.setText(appController.getPokedex().get(index).getName());
		numberField.setText(appController.getPokedex().get(index).getNumber() + "");
		healthField.setText(appController.getPokedex().get(index).getHealthPoints() + "");
		attackField.setText(appController.getPokedex().get(index).getAttackPoints() + "");
		modifierField.setText(appController.getPokedex().get(index).getEnhancemetModifier() + "");
		evolvableBox.setSelected(appController.getPokedex().get(index).isCanEvolve());
		
		descriptionArea.setText(appController.getPokedex().get(index).toString());
		typeArea.setText("");
		for (String current : appController.getPokedex().get(index).getPokemonTypes()) {
			typeArea.append(current + "\n");
		}
	}
	private void updateImage() {
		String path ="/pokemon/vie         w/images/";
		String defaultName = "PokemonLogoF";
		String name = pokedexDropdown.getSelectedItem().toString();
		String extension = ".png";
		ImageIcon pokemonIcon;
		
		try {
			pokemonIcon = new ImageIcon(getClass().getResource(path + name + extension));
		} catch (NullPointerException missingImageFile) {
			pokemonIcon = new ImageIcon(getClass().getResource(path + defaultName + extension));
		}
		iconLabel.setIcon(pokemonIcon);
		
	}
	private void setupComboBox() {
		DefaultComboBoxModel pokemonModel = new DefaultComboBoxModel(appController.convertPokedex());
		pokedexDropdown.setModel(pokemonModel);
	}
	private void setupTypePanels() {
		firstType = new JPanel();
		appLayout.putConstraint(SpringLayout.NORTH, pokedexDropdown, 10, SpringLayout.SOUTH, firstType);
		appLayout.putConstraint(SpringLayout.WEST, pokedexDropdown, 0, SpringLayout.WEST, firstType);
		appLayout.putConstraint(SpringLayout.SOUTH, pokedexDropdown, 50, SpringLayout.SOUTH, firstType);
		firstType.setSize(500, 50);
		firstType.setToolTipText("Type One");
		firstType.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		appLayout.putConstraint(SpringLayout.NORTH, firstType, 10, SpringLayout.SOUTH, descriptionArea);
		appLayout.putConstraint(SpringLayout.WEST, firstType, 0, SpringLayout.WEST, descriptionArea);
		appLayout.putConstraint(SpringLayout.SOUTH, firstType, 85, SpringLayout.SOUTH, descriptionArea);
		appLayout.putConstraint(SpringLayout.EAST, firstType, 112, SpringLayout.WEST, descriptionArea);



		secondType = new JPanel();
		appLayout.putConstraint(SpringLayout.EAST, pokedexDropdown, 0, SpringLayout.EAST, secondType);
		secondType.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		appLayout.putConstraint(SpringLayout.NORTH, secondType, 0, SpringLayout.NORTH, firstType);
		appLayout.putConstraint(SpringLayout.WEST, secondType, 10, SpringLayout.EAST, firstType);
		appLayout.putConstraint(SpringLayout.SOUTH, secondType, 0, SpringLayout.SOUTH, firstType);
		appLayout.putConstraint(SpringLayout.EAST, secondType, 122, SpringLayout.EAST, firstType);
		secondType.setSize(50, 50);
		secondType.setToolTipText("Type Two");
		thirdType = new JPanel();
		appLayout.putConstraint(SpringLayout.EAST, saveButton, 0, SpringLayout.EAST, thirdType);
		thirdType.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		appLayout.putConstraint(SpringLayout.NORTH, thirdType, 0, SpringLayout.NORTH, firstType);
		appLayout.putConstraint(SpringLayout.WEST, thirdType, 10, SpringLayout.EAST, secondType);
		appLayout.putConstraint(SpringLayout.SOUTH, thirdType, 0, SpringLayout.SOUTH, firstType);
		appLayout.putConstraint(SpringLayout.EAST, thirdType, 122, SpringLayout.EAST, secondType);
		thirdType.setSize(50, 50);
		thirdType.setToolTipText("Type Three");
		fourthType = new JPanel();
		appLayout.putConstraint(SpringLayout.EAST, clearButton, 0, SpringLayout.EAST, fourthType);
		fourthType.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		appLayout.putConstraint(SpringLayout.NORTH, fourthType, 0, SpringLayout.NORTH, firstType);
		appLayout.putConstraint(SpringLayout.WEST, fourthType, 10, SpringLayout.EAST, thirdType);
		appLayout.putConstraint(SpringLayout.SOUTH, fourthType, 0, SpringLayout.SOUTH, firstType);
		appLayout.putConstraint(SpringLayout.EAST, fourthType, 122, SpringLayout.EAST, thirdType);
		fourthType.setSize(50, 50);
		fourthType.setToolTipText("Type Four");
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
		this.add(background);
		
		this.add(descriptionArea);
		this.add(typeArea);
		this.add(saveButton);
		this.add(clearButton);
		this.add(pokedexDropdown);
		this.add(firstType);
		this.add(secondType);
		this.add(thirdType);
		this.add(fourthType);
		this.add(iconLabel);
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
		
	}
	private void setupListeners() {
		pokedexDropdown.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent selection) {
				int selectedPokemonIndex = pokedexDropdown.getSelectedIndex();
				updatePokedexInfo(selectedPokemonIndex);
				updateImage();
				updateTypePanels();
				repaint();
			}
		});
		saveButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent click) {
				if (appController.isValidInteger(attackField.getText()) && 
						appController.isValidInteger(healthField.getText()) && 
						appController.isValidDouble(modifierField.getText())) {
					int selected = pokedexDropdown.getSelectedIndex();
					int health = Integer.parseInt(healthField.getText());
					int attack = Integer.parseInt(attackField.getText());
					double modifier = Double.parseDouble(modifierField.getText());
					String name = nameField.getText();
					boolean evolvable = evolvableBox.isSelected();
					appController.updateSelected(selected, health, attack, evolvable,
							modifier, name);
				}
			}
		});
	}
}
