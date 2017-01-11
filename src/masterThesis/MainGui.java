/*
 * Created during the master thesis of
 * 
 * Peter Praeder - University of Cologne - praederp@smail.uni-koeln.de
 * 
 * Copyright 2016-2017
 * 
 */
package masterThesis;

import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;
import java.util.prefs.Preferences;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JEditorPane;
import javax.swing.JFileChooser;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkListener;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;
import javax.swing.filechooser.FileNameExtensionFilter;

import org.json.JSONException;

import com.mashape.unirest.http.exceptions.UnirestException;

import entity.Page;
import util.ApiCaller;
import util.IO;
import java.awt.FlowLayout;

/**
 * The main GUI class which has all crawler windows other than data base
 * specific, which are in the DBSettings class.
 * 
 *
 */
public class MainGui {

	private static final String LAST_USED_FOLDER = "LAST_USED_FOLDER";
	private JFrame wikiToneForm;
	private String path;
	private List<String> category;
	protected String category2;
	private JButton saveButton;
	private JFormattedTextField pathTextField;
	private JTextArea categoryTextField;
	private JButton runButton;
	private JLabel categoryLabel;
	private JRadioButton pageButton;
	private JPanel optionsPanel;
	private ButtonGroup bg;
	private JRadioButton characterButton;
	private JMenuBar menuBar;
	private JMenu mnHelp;
	private JMenu mnFile;
	private JPanel savePanel;
	private JRadioButton networkButton;
	private JComboBox<?> languageSelect;
	private JRadioButton exportButton;
	private List<Page> pList;
	private JRadioButton liwcButton;
	private JRadioButton toneButton;
	private JRadioButton alchemyButton;
	private JMenuItem mntmDatabase;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					try {
						UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
					} catch (Exception e) {
						e.printStackTrace();
					}
					MainGui window = new MainGui();
					window.wikiToneForm.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 *
	 * @throws IOException
	 */
	public MainGui() throws IOException {

		initialize();
		addMenu();
		addActionListeners();
		// sq = new SqlUtil();

	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		wikiToneForm = new JFrame();
		wikiToneForm.setTitle("Wiki Tone Analyzer v.0.5");
		wikiToneForm.setBounds(100, 100, 519, 339);
		wikiToneForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		savePanel = new JPanel();
		savePanel.setBounds(8, 5, 264, 33);
		wikiToneForm.getContentPane().add(savePanel);
		saveButton = new JButton("Save as...");
		savePanel.add(saveButton);
		pathTextField = new JFormattedTextField();
		pathTextField.setColumns(20);
		savePanel.add(pathTextField);
		savePanel.setVisible(false);

		bg = new ButtonGroup();

		optionsPanel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) optionsPanel.getLayout();
		flowLayout.setVgap(8);
		flowLayout.setAlignment(FlowLayout.LEFT);
		optionsPanel.setBounds(277, 5, 171, 229);
		wikiToneForm.getContentPane().add(optionsPanel);

		pageButton = new JRadioButton("Collect Pages");

		pageButton.setSelected(true);
		optionsPanel.add(pageButton);
		bg.add(pageButton);

		characterButton = new JRadioButton("Collect Characters");
		optionsPanel.add(characterButton);
		bg.add(characterButton);

		networkButton = new JRadioButton("Calculate Network Metrics");
		optionsPanel.add(networkButton);
		bg.add(networkButton);

		liwcButton = new JRadioButton("Calculate LIWC");
		optionsPanel.add(liwcButton);
		bg.add(liwcButton);
		toneButton = new JRadioButton("Calculate Watson Tone");
		optionsPanel.add(toneButton);
		bg.add(toneButton);
		alchemyButton = new JRadioButton("Calculate Watson Alchemy");
		optionsPanel.add(alchemyButton);
		bg.add(alchemyButton);
		exportButton = new JRadioButton("Export as CSV");
		optionsPanel.add(exportButton);
		bg.add(exportButton);
		runButton = new JButton("Run");

		runButton.setBounds(10, 245, 485, 23);
		wikiToneForm.getContentPane().add(runButton);

		categoryTextField = new JTextArea();
		categoryTextField.setRows(5);
		categoryTextField.setBounds(101, 42, 171, 161);
		wikiToneForm.getContentPane().add(categoryTextField);

		categoryLabel = new JLabel("Categories");
		categoryLabel.setBounds(18, 45, 79, 14);
		wikiToneForm.getContentPane().add(categoryLabel);

	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	private void addMenu() {
		menuBar = new JMenuBar();
		wikiToneForm.setJMenuBar(menuBar);
		mnFile = new JMenu("Settings");
		menuBar.add(mnFile);

		mntmDatabase = new JMenuItem("Database");
		mntmDatabase.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				DbSettings dbS = new DbSettings();
				dbS.setVisible(true);
			}
		});

		mnFile.add(mntmDatabase);

		mnHelp = new JMenu("Help");
		mnHelp.addMenuListener(new MenuListener() {
			@Override
			public void menuCanceled(MenuEvent arg0) {
			}

			@Override
			public void menuDeselected(MenuEvent arg0) {
			}

			@Override
			public void menuSelected(MenuEvent arg0) {
				// for copying style
				JLabel label = new JLabel();
				Font font = label.getFont();

				// create some css from the label's font
				StringBuffer style = new StringBuffer("font-family:" + font.getFamily() + ";");
				style.append("font-weight:" + (font.isBold() ? "bold" : "normal") + ";");
				style.append("font-size:" + font.getSize() + "pt;");

				// html content
				final JEditorPane ep = new JEditorPane("text/html",
						"<html><body style=\"" + style + "\">" //
								+ "This interface is part of the Masterthesis of<br/>"
								+ "<center><a href='mailto:praederp@outlook.de'>Peter Praeder</a><br/>"
								+ "</center></body></html>");

				// handle link events
				ep.addHyperlinkListener(new HyperlinkListener() {
					@Override
					public void hyperlinkUpdate(HyperlinkEvent e) {
						if (e.getEventType().equals(HyperlinkEvent.EventType.ACTIVATED)) {
							// ProcessHandler.launchUrl(e.getURL().toString());
							try {

								Desktop.getDesktop().mail(new URI(e.getURL().toString()));
								Window win = SwingUtilities.getWindowAncestor(ep);
								win.setVisible(false);
							} catch (IOException e1) {
								e1.printStackTrace();
							} catch (URISyntaxException e1) {
								e1.printStackTrace();
							}
						}
					}
				});
				ep.setEditable(false);
				ep.setBackground(label.getBackground());

				JOptionPane.showMessageDialog(null, ep);

			}
		});
		mnHelp.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {

			}
		});
		menuBar.add(mnHelp);
		wikiToneForm.getContentPane().setLayout(null);

		languageSelect = new JComboBox();
		languageSelect.setModel(new DefaultComboBoxModel(new String[] { "EN" }));
		languageSelect.setBounds(106, 214, 166, 20);
		wikiToneForm.getContentPane().add(languageSelect);
	}

	ItemListener listener = new ItemListener() {

		@Override
		public void itemStateChanged(ItemEvent e) {
			if (e.getStateChange() == ItemEvent.SELECTED) {
				setInvisible();
			}

		}

	};

	/**
	 * Add action listeners to the buttons to show only relevant interaction
	 * objects
	 */
	public void addActionListeners() {
		exportButton.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				categoryLabel.setVisible(false);
				savePanel.setVisible(true);
				categoryTextField.setVisible(false);
				categoryLabel.setVisible(false);
				languageSelect.setVisible(false);

			}
		});
		pageButton.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				categoryLabel.setVisible(true);
				categoryTextField.setVisible(true);
				categoryLabel.setVisible(true);
				savePanel.setVisible(false);
				languageSelect.setVisible(true);

			}
		});
		characterButton.addItemListener(listener);
		networkButton.addItemListener(listener);
		liwcButton.addItemListener(listener);
		toneButton.addItemListener(listener);
		alchemyButton.addItemListener(listener);

		runButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				try {
					runPerformed();
				} catch (ClassNotFoundException | SQLException e1) {
					e1.printStackTrace();
				}

			}
		});
		saveButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				openOrSave(false);
			}
		});
	}

	private void setInvisible() {
		savePanel.setVisible(false);
		categoryTextField.setVisible(false);
		categoryLabel.setVisible(false);
		languageSelect.setVisible(false);
	}

	boolean openOrSave(boolean save) {

		Preferences prefs = Preferences.userRoot().node(getClass().getName());
		JFileChooser chooser;

		if (path == null) {
			path = System.getProperty("user.home");
		}
		File file = new File(path.trim());

		chooser = new JFileChooser(prefs.get(LAST_USED_FOLDER, new File(".").getAbsolutePath()));
		chooser.setDialogType(save ? JFileChooser.SAVE_DIALOG : JFileChooser.OPEN_DIALOG);

		FileNameExtensionFilter filter = new FileNameExtensionFilter("Comma Separated (.csv)", "csv");

		chooser.removeChoosableFileFilter(chooser.getAcceptAllFileFilter());

		chooser.setFileFilter(filter);
		chooser.setDialogTitle(save ? "Save as..." : "Open...");
		chooser.setVisible(true);

		int result = chooser.showSaveDialog(wikiToneForm);

		if (result == JFileChooser.APPROVE_OPTION) {

			path = chooser.getSelectedFile().toString();
			file = new File(path);
			if (!filter.accept(file)) {
				path += ".json";
			}
			prefs.put(LAST_USED_FOLDER, file.getParent());
			chooser.setVisible(false);
			pathTextField.setText(path);
			return true;
		}
		chooser.setVisible(false);
		chooser = null;
		return false;
	}

	public void runPerformed() throws ClassNotFoundException, SQLException {
		IO io = new IO();
		if (pageButton.isSelected()) {

			if (categoryTextField.getText() == null) {
				new Thread() {
					@Override
					public void run() {
						JOptionPane.showMessageDialog(null, "No category entered.");
					}
				}.start();
				return;
			}
			new Thread() {
				@Override
				public void run() {
					JOptionPane.showMessageDialog(null, "Collect pages.");
				}
			}.start();
			category = Arrays.asList(categoryTextField.getText().split("\n"));
			ApiCaller api;
			try {
				api = new ApiCaller(path, category);
				System.out.println("Started");
				api.start();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if (characterButton.isSelected()) {
			new Thread() {
				@Override
				public void run() {
					JOptionPane.showMessageDialog(null, "Collect characters and links.");
				}
			}.start();
			try {
				io.getLinksFromWikipediaTemplate();
				io.getLinksFromWikipediaConnection();
			} catch (IOException | JSONException e) {
				e.printStackTrace();
			}
		} else if (networkButton.isSelected()) {
			new Thread() {
				@Override
				public void run() {
					JOptionPane.showMessageDialog(null, "Generate degree.");
				}
			}.start();
			io.setDegree();
		} else if (toneButton.isSelected()) {
			new Thread() {
				@Override
				public void run() {
					JOptionPane.showMessageDialog(null, "Collect ToneAnalyzer tone.");
				}
			}.start();
			io.getIBMTone();
		} else if (liwcButton.isSelected()) {
			new Thread() {
				@Override
				public void run() {
					JOptionPane.showMessageDialog(null, "Collect liwc tone.");
				}
			}.start();
			try {
				io.getLIWCTone();
			} catch (UnirestException | JSONException e) {
				e.printStackTrace();
			}
		} else if (alchemyButton.isSelected()) {
			new Thread() {
				@Override
				public void run() {
					JOptionPane.showMessageDialog(null, "Collect alchemy tone.");
				}
			}.start();
			io.getAlchemyTone();
		} else if (exportButton.isSelected()) {
			new Thread() {
				@Override
				public void run() {
					JOptionPane.showMessageDialog(null, "Export started.");
				}
			}.start();
			try {
				io.writeToCSV(pathTextField.getText());
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("Nothing defined");
		}

	}
}
