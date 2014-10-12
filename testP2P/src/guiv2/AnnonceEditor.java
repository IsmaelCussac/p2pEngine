package guiv2;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.factories.FormFactory;

import javax.swing.JSeparator;
import javax.swing.JLabel;

import com.jgoodies.forms.factories.DefaultComponentFactory;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

import java.awt.Font;

import javax.swing.JRadioButton;

import java.awt.SystemColor;

import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JEditorPane;

import net.atlanticbb.tantlinger.shef.HTMLEditorPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Dimension;
import javax.swing.ImageIcon;

public class AnnonceEditor extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JLabel imageLabel;

	/**
	 * Create the dialog.
	 */
	public AnnonceEditor() {
		setModal(true);
		setResizable(false);
		setBounds(100, 100, 659, 714);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		
		JLabel lblNewLabel = new JLabel(Messages.getString("AnnonceEditor.lblNewLabel.text")); //$NON-NLS-1$
		lblNewLabel.setForeground(SystemColor.textHighlight);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JSeparator separator = new JSeparator();
		
		JLabel lblTypeDeLannonce = new JLabel(Messages.getString("AnnonceEditor.lblTypeDeLannonce.text")); //$NON-NLS-1$
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton(Messages.getString("AnnonceEditor.rdbtnNewRadioButton.text")); //$NON-NLS-1$
		
		JRadioButton rdbtnSouhait = new JRadioButton(Messages.getString("AnnonceEditor.rdbtnSouhait.text")); //$NON-NLS-1$
		
		JLabel lblTermesDeLchange = new JLabel(Messages.getString("AnnonceEditor.lblTermesDeLchange.text")); //$NON-NLS-1$
		
		JCheckBox chckbxTroc = new JCheckBox(Messages.getString("AnnonceEditor.chckbxTroc.text")); //$NON-NLS-1$
		chckbxTroc.setSelected(true);
		
		JCheckBox chckbxArgent = new JCheckBox(Messages.getString("AnnonceEditor.chckbxArgent.text")); //$NON-NLS-1$
		
		JLabel lblDiffusion = new JLabel(Messages.getString("AnnonceEditor.lblDiffusion.text")); //$NON-NLS-1$
		lblDiffusion.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDiffusion.setForeground(SystemColor.textHighlight);
		
		JSeparator separator_1 = new JSeparator();
		
		JLabel lblTitre = new JLabel(Messages.getString("AnnonceEditor.lblTitre.text_1")); //$NON-NLS-1$
		
		textField = new JTextField();
		textField.setText(Messages.getString("AnnonceEditor.textField.text")); //$NON-NLS-1$
		textField.setColumns(10);
		
		JLabel lblRsumDeDescription = new JLabel(Messages.getString("AnnonceEditor.lblRsumDeDescription.text")); //$NON-NLS-1$
		
		textField_1 = new JTextField();
		textField_1.setText(Messages.getString("AnnonceEditor.textField_1.text")); //$NON-NLS-1$
		textField_1.setColumns(10);
		
		JLabel lblAnnonce = new JLabel(Messages.getString("AnnonceEditor.lblAnnonce.text")); //$NON-NLS-1$
		lblAnnonce.setForeground(SystemColor.textHighlight);
		lblAnnonce.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JSeparator separator_2 = new JSeparator();
		
		JLabel lblDescription = new JLabel(Messages.getString("completeDesc")); //$NON-NLS-1$
		
		JPanel editorPane = new HTMLEditorPane();
		
		JLabel lblImageAperu = new JLabel(Messages.getString("AnnonceEditor.lblImageAperu.text_1"));
		
		JButton btnNewButton = new JButton(Messages.getString("AnnonceEditor.btnNewButton.text")); //$NON-NLS-1$
		imageLabel = new JLabel(Messages.getString("AnnonceEditor.label.text")); //$NON-NLS-1$
		imageLabel.setMinimumSize(new Dimension(100, 100));
		imageLabel.setMaximumSize(new Dimension(100, 100));
		imageLabel.setIcon(null);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ImageDialog dialog = new ImageDialog();
				dialog.showOpenDialog(null);
				imageLabel.setIcon(new ImageIcon(dialog.getSelectedFile().toString()));
			}
		});
		GroupLayout gl_contentPanel = new GroupLayout(contentPanel);
		gl_contentPanel.setHorizontalGroup(
			gl_contentPanel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(editorPane, GroupLayout.PREFERRED_SIZE, 631, Short.MAX_VALUE)
						.addComponent(separator_2, GroupLayout.DEFAULT_SIZE, 631, Short.MAX_VALUE)
						.addComponent(separator_1, GroupLayout.DEFAULT_SIZE, 631, Short.MAX_VALUE)
						.addComponent(lblNewLabel)
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
								.addComponent(lblTypeDeLannonce)
								.addComponent(lblTermesDeLchange))
							.addGap(48)
							.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPanel.createSequentialGroup()
									.addComponent(rdbtnNewRadioButton)
									.addGap(18)
									.addComponent(rdbtnSouhait))
								.addGroup(gl_contentPanel.createSequentialGroup()
									.addComponent(chckbxTroc)
									.addGap(18)
									.addComponent(chckbxArgent)))
							.addGap(67))
						.addComponent(separator, GroupLayout.DEFAULT_SIZE, 631, Short.MAX_VALUE)
						.addComponent(lblDiffusion)
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblRsumDeDescription)
							.addGap(18)
							.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING, false)
								.addComponent(textField_1)
								.addComponent(textField, GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)))
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblTitre))
						.addComponent(lblAnnonce)
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblDescription))
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblImageAperu)
							.addGap(162)
							.addComponent(imageLabel)
							.addPreferredGap(ComponentPlacement.RELATED, 237, Short.MAX_VALUE)
							.addComponent(btnNewButton)))
					.addContainerGap())
		);
		gl_contentPanel.setVerticalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addComponent(lblNewLabel)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(separator, GroupLayout.PREFERRED_SIZE, 2, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblTypeDeLannonce)
						.addComponent(rdbtnNewRadioButton)
						.addComponent(rdbtnSouhait))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblTermesDeLchange)
						.addComponent(chckbxTroc)
						.addComponent(chckbxArgent))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblDiffusion)
					.addGap(9)
					.addComponent(separator_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblTitre)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblRsumDeDescription)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblAnnonce)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(separator_2, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblDescription)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(editorPane, GroupLayout.PREFERRED_SIZE, 251, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblImageAperu)
						.addComponent(btnNewButton)
						.addComponent(imageLabel))
					.addContainerGap(41, Short.MAX_VALUE))
		);
		contentPanel.setLayout(gl_contentPanel);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton(Messages.getString("valider")); //$NON-NLS-1$
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton(Messages.getString("annuler")); //$NON-NLS-1$
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}