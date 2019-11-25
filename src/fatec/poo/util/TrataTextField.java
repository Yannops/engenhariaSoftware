/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.util;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;

/**
 *
 * @author Kaique
 */
public class TrataTextField extends JFrame {

    private JPanel contentPane;
    private JTextField textField;
    private JLabel label;

    /**
     * Launch the application.
     */
    /**
     * Create the frame.
     */
    public TrataTextField() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(new BorderLayout(0, 0));
        setContentPane(contentPane);
        contentPane.add(getTextField(), BorderLayout.NORTH);
        contentPane.add(getLabel(), BorderLayout.SOUTH);
    }

    private JTextField getTextField() {
        if (textField == null) {
            textField = new JTextField();
            textField.setColumns(10);
            textField.getDocument().addDocumentListener(new DocumentListener() {
                @Override
                public void changedUpdate(DocumentEvent e) {
                    Document d = e.getDocument();
                    try {
                        String texto = d.getText(0, d.getLength());
                        label.setText(texto.toUpperCase()); // um exemplo do que fazer com o texto
                    } catch (BadLocationException ex) {
                    }
                }

                @Override
                public void insertUpdate(DocumentEvent e) {
                    Document d = e.getDocument();
                    try {
                        String texto = d.getText(0, d.getLength());
                        label.setText(texto.toUpperCase()); // um exemplo do que fazer com o texto
                    } catch (BadLocationException ex) {
                    }
                }

                @Override
                public void removeUpdate(DocumentEvent e) {
                    Document d = e.getDocument();
                    try {
                        String texto = d.getText(0, d.getLength());
                        label.setText(texto.toUpperCase()); // um exemplo do que fazer com o texto
                    } catch (BadLocationException ex) {
                    }
                }

            });
        }
        return textField;
    }

    private JLabel getLabel() {
        if (label == null) {
            label = new JLabel("-");
        }
        return label;
    }
}
