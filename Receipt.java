/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package kenn.receipt;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRootPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author KennMujar
 */
public class Receipt {

    /**
     * @return the item
     */
    public String getItem() {
        return item;
    }

    /**
     * @param item the item to set
     */
    public void setItem(String item) {
        this.item = item;
    }

    /**
     * @return the quantity
     */
    public String getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    /**
     * @return the price
     */
    public String getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(String price) {
        this.price = price;
    }

    /**
     * @return the cash
     */
    public String getCash() {
        return cash;
    }

    /**
     * @param cash the cash to set
     */
    public void setCash(String cash) {
        this.cash = cash;
    }

    private String item;
    private String quantity;
    private String price;
    private String cash;
    JTextField itemName = new JTextField();
    JTextField quantityName = new JTextField();
    JTextField priceName = new JTextField();
    JTextField cashName = new JTextField();

    public static void main(String[] args) {
        Receipt receipts = new Receipt();
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        JButton order = new JButton("ORDER");
        JButton receipt = new JButton("RECEIPT");
        JButton exit = new JButton("EXIT");

        frame.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbc.fill = GridBagConstraints.HORIZONTAL;

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        order.setPreferredSize(new Dimension(200, 50));
        order.setBackground(new Color(0, 255, 255));
        order.setFont(new Font("Arial", Font.BOLD, 25));
        order.setFocusPainted(false);
        order.setForeground(Color.black);
        order.setBorderPainted(false);
        receipts.Buttons(order, frame);

        receipt.setPreferredSize(new Dimension(200, 50));
        receipt.setBackground(new Color(0, 255, 255));
        receipt.setFont(new Font("Arial", Font.BOLD, 25));
        receipt.setFocusPainted(false);
        receipt.setForeground(Color.black);
        receipt.setBorderPainted(false);
        receipts.Buttons(receipt, frame);

        exit.setPreferredSize(new Dimension(200, 50));
        exit.setBackground(new Color(0, 255, 255));
        exit.setFont(new Font("Arial", Font.BOLD, 25));
        exit.setFocusPainted(false);
        exit.setForeground(Color.black);
        exit.setBorderPainted(false);
        receipts.Buttons(exit, frame);

        frame.add(order, gbc);
        frame.add(receipt, gbc);
        frame.add(exit, gbc);

        frame.getContentPane().add(panel);
        frame.setSize(450, 450);
        frame.setUndecorated(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }

    public void Order() {
        JFrame frame = new JFrame();
        JLabel space = new JLabel();

        JLabel nameLabel = new JLabel("Name");
        JLabel quantityLabel = new JLabel("Quantity");
        JLabel priceLabel = new JLabel("Price");
        JLabel cashLabel = new JLabel("Cash");
        JPanel panel = new JPanel();
        JButton placeOrder = new JButton("PLACE ORDER");

        nameLabel.setBounds(40, 55, 70, 40);
        nameLabel.setFont(new Font("Arial", Font.BOLD, 20));
        itemName.setBounds(130, 50, 200, 40);
        itemName.setFont(new Font("Arial", Font.PLAIN, 20));

        quantityLabel.setBounds(40, 100, 100, 40);
        quantityLabel.setFont(new Font("Arial", Font.BOLD, 20));
        quantityName.setBounds(130, 100, 200, 40);
        quantityName.setFont(new Font("Arial", Font.PLAIN, 20));

        priceLabel.setBounds(40, 150, 70, 40);
        priceLabel.setFont(new Font("Arial", Font.BOLD, 20));
        priceName.setBounds(130, 150, 200, 40);
        priceName.setFont(new Font("Arial", Font.PLAIN, 20));

        cashLabel.setBounds(40, 200, 70, 40);
        cashLabel.setFont(new Font("Arial", Font.BOLD, 20));
        cashName.setBounds(130, 200, 200, 40);
        cashName.setFont(new Font("Arial", Font.PLAIN, 20));

        placeOrder.setFont(new Font("Arial", Font.BOLD, 15));
        placeOrder.setFocusPainted(false);
        placeOrder.setForeground(Color.white);
        placeOrder.setBackground(Color.black);
        placeOrder.setPreferredSize(new Dimension(150, 60));
        Buttons(placeOrder, frame);
        panel.setAlignmentX(Component.CENTER_ALIGNMENT);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setSize(400, 400);
        frame.setLocationRelativeTo(null);
        frame.add(itemName);
        frame.add(quantityName);
        frame.add(priceName);
        frame.add(cashName);
        frame.add(nameLabel);
        frame.add(quantityLabel);
        frame.add(priceLabel);
        frame.add(cashLabel);
        panel.add(placeOrder);
        frame.add(space);
        frame.add(panel, BorderLayout.SOUTH);
    }

    public void printReceipt() {

        JFrame frame = new JFrame();
        JLabel storeName = new JLabel("7-ELEVEN");
        JLabel label1 = new JLabel("Magayon Phil Trading Corp");

        storeName.setFont(new Font("Arial", Font.BOLD, 30));
        label1.setFont(new Font("Arial", Font.PLAIN, 12));
        JPanel panel = new JPanel();
        JButton claim = new JButton("CLAIM RECEIPT");
        JPanel upPanel = new JPanel();

        upPanel.setAlignmentY(Component.CENTER_ALIGNMENT);
        upPanel.setBorder(BorderFactory.createTitledBorder("Show Products"));

        upPanel.add(storeName);
        upPanel.add(Box.createRigidArea(new Dimension(1000, 5)));
        upPanel.add(label1);

        claim.setFont(new Font("Arial", Font.BOLD, 15));
        claim.setFocusPainted(false);
        claim.setForeground(Color.white);
        claim.setBackground(Color.black);
        claim.setPreferredSize(new Dimension(150, 60));
        Buttons(claim, frame);

        panel.setAlignmentX(Component.CENTER_ALIGNMENT);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setResizable(false);
        frame.setSize(400, 700);
        frame.setLocationRelativeTo(null);

        frame.add(upPanel);
        panel.add(claim);

        frame.add(panel, BorderLayout.SOUTH);
        frame.setUndecorated(true);
        frame.setVisible(true);

    }

    public void Buttons(JButton button, JFrame closeFrame) {
        Receipt receipt = new Receipt();
        button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                String clickedButton = actionEvent.getActionCommand();

                switch (clickedButton) {

                    case "ORDER" -> {
                        receipt.Order();
                        closeFrame.dispose();
                    }
                    case "RECEIPT" -> {
                        receipt.printReceipt();
                        closeFrame.dispose();
                    }
                    case "EXIT" -> {
                        closeFrame.dispose();
                    }
                    case "PLACE ORDER" -> {
                        item = itemName.getText();
                        setItem(item);

                        quantity = quantityName.getText();
                        setQuantity(quantity);

                        price = priceName.getText();
                        setPrice(price);

                        cash = cashName.getText();
                        setCash(cash);

                        main(null);
                        closeFrame.dispose();
                    }
                    case "CLAIM RECEIPT" -> {
                        main(null);
                        closeFrame.dispose();
                    }
                }

            }
        });
    }
}
