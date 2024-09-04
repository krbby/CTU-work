/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author loure
 */
import javax.swing.*;

public class form extends JFrame {

    // Declare the components
    private JTextField nameField;
    private JTextField numberField;
    private JTextField emailField;
    private JButton submitButton;

    public form() {
        // Create the components
        nameField = new JTextField(15);
        numberField = new JTextField(15);
        emailField = new JTextField(15);
        submitButton = new JButton("Submit");

        // Set up the labels
        JLabel nameLabel = new JLabel("Name:");
        JLabel numberLabel = new JLabel("Number:");
        JLabel emailLabel = new JLabel("Email:");

        // Add an ActionListener to the button
        submitButton.addActionListener(e -> submitForm());

        // Set up the layout
        setLayout(new java.awt.FlowLayout());
        add(nameLabel);
        add(nameField);
        add(numberLabel);
        add(numberField);
        add(emailLabel);
        add(emailField);
        add(submitButton);

        // Configure the frame
        setTitle("Form");
        setSize(250, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    // Method to handle form submission
    private void submitForm() {
        String name = nameField.getText();
        String number = numberField.getText();
        String email = emailField.getText();

        System.out.println("Name: " + name);
        System.out.println("Number: " + number);
        System.out.println("Email: " + email);
    }

    public static void main(String[] args) {
        // Create and display the form
        java.awt.EventQueue.invokeLater(() -> new form().setVisible(true));
    }
}


