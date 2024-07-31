import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.Color;
import java.util.ArrayList;

/**
 * The class that shows the GUI of my banking system.
 *
 * Pabisha bhatta AI2
 * @version (a version number or a date)
 */
// class BankGUI and implementing ActionListener interface
public class BankGUI implements ActionListener {
    // declearing variales with data types
   JFrame frame; 
   JPanel panel, panel1, panel2;
   JLabel label1, label2, label3, label4, label5, label6, label7, label8, label9, label10, label11, label12, label13, labe14, label15, label16, label17, label18, label19, label20, label21, label22, label23, label24, label25, label26, label27, label28;
   JTextField field1, field2, field3, field4, field5, field6, field7, field8, field9, field10, field11, field12, field13, field14, field15, field16, field17, field18;
   JButton button1, button2, button3, button4, button5, button6, button7, button8, button9, button10, buttoon11, button12, button13, button14, button15, button16;
   JComboBox < String > box1, box2, box3, box4;
   ArrayList < BankCard > ObjArray;
   public BankGUI() {
      ObjArray = new ArrayList < BankCard > ();

      frame = new JFrame(); // creating a object for JFrame
      panel = new JPanel();// creating a object for panel
      panel1 = new JPanel();
      panel2 = new JPanel();

      panel.setLayout(null);
      panel1.setLayout(null);
      panel2.setLayout(null);

      label1 = new JLabel("CardID");
      label2 = new JLabel("ClientName");    //  creating object for JLabel
      label3 = new JLabel("IssuerBank");
      label4 = new JLabel("BankAccount");
      label5 = new JLabel("BalanceAmount");
      label11 = new JLabel("PinNumber");
      label12 = new JLabel("WithdrawalAmount");
      label13 = new JLabel("WithdrawalDate");
      label6 = new JLabel("CVCNumber");
      label7 = new JLabel("CreditLimit");
      label8 = new JLabel("InterestRate");
      label9 = new JLabel("GracePeriod");
      labe14 = new JLabel("CardID");
      label15 = new JLabel("ClientName");
      label16 = new JLabel("IssuerBank");
      label17 = new JLabel("BankAccount");
      label18 = new JLabel("BalanceAmount");
      label24 = new JLabel("Date Of Withdrawal");
      label25 = new JLabel("Expiration Date");
      label26 = new JLabel("PinNumber");
      label27 = new JLabel("CardId");
      label28 = new JLabel("WELCOME TO THE SMART BANK");

      field1 = new JTextField();        // creating a object for JTextField
      field2 = new JTextField();
      field3 = new JTextField();
      field4 = new JTextField();
      field5 = new JTextField();
      field6 = new JTextField();
      field7 = new JTextField();
      field8 = new JTextField();
      field9 = new JTextField();
      field10 = new JTextField();
      field11 = new JTextField();
      field12 = new JTextField();
      field13 = new JTextField();
      field14 = new JTextField();
      field15 = new JTextField();
      field16 = new JTextField();
      field17 = new JTextField();
      field18 = new JTextField();

      button1 = new JButton("Display");   // creating a object for JButton
      button2 = new JButton("Set Credit Limit");
      button3 = new JButton("Cancel Credit Card");
      button4 = new JButton("Clear");
      button5 = new JButton("Withdraw");
      button6 = new JButton("Credit");
      button7 = new JButton("Add debit card");
      button8 = new JButton("Clear");
      button9 = new JButton("Return");
      button10 = new JButton("Submit");
      buttoon11 = new JButton("Clear");
      button12 = new JButton("Return");
      button13 = new JButton("Submit");
      button14 = new JButton("Clear");
      button15 = new JButton("Add Credit Card");
      button16 = new JButton("Display");

      // array with the variable month
      String[] month = {
         "January",
         "Feburary",
         "March",
         "April",
         "May",
         "June"
      };
      String[] day = {
         "2",
         "3",
         "4",
         "5",
         "6"
      };
      box1 = new JComboBox < String > (month);  // creating object of JComboBox
      box2 = new JComboBox < String > (day);
      box3 = new JComboBox < String > (month);
      box4 = new JComboBox < String > (day);
      
      // setting the placement of labels
      label1.setBounds(39, 124, 73, 45);    
      label2.setBounds(39, 215, 99, 51);
      label3.setBounds(39, 311, 99, 49);
      label4.setBounds(31, 399, 115, 53);
      label5.setBounds(31, 482, 134, 66);
      label6.setBounds(382, 124, 122, 47);
      label7.setBounds(382, 208, 111, 61);
      label8.setBounds(382, 305, 106, 54);
      label9.setBounds(382, 402, 132, 33);
      labe14.setBounds(64, 149, 134, 44);
      label15.setBounds(64, 235, 183, 49);
      label16.setBounds(64, 325, 184, 47);
      label17.setBounds(60, 408, 211, 51);
      label18.setBounds(60, 481, 245, 63);
      label11.setBounds(49, 67, 163, 97);
      label12.setBounds(49, 427, 252, 49);
      label24.setBounds(49, 254, 272, 49);
      label25.setBounds(384, 469, 162, 66);
      label26.setBounds(68, 69, 73, 45);
      label27.setBounds(60, 545, 75, 50);
      label28.setBounds(200, 20, 200, 50);

      button1.setBounds(10, 569, 136, 38);
      button2.setBounds(545, 569, 137, 38);
      button3.setBounds(10, 652, 141, 38);
      button4.setBounds(556, 653, 134, 37);
      button5.setBounds(11, 564, 120, 32);
      button6.setBounds(11, 659, 120, 32);
      button7.setBounds(287, 607, 148, 36);
      button8.setBounds(372, 659, 120, 32);
      button9.setBounds(5, 43, 151, 45);
      button10.setBounds(259, 643, 169, 47);
      buttoon11.setBounds(536, 643, 156, 48);
      button12.setBounds(5, 643, 151, 45);
      button13.setBounds(259, 643, 169, 47);
      button14.setBounds(536, 643, 156, 48);
      button15.setBounds(350, 652, 141, 38);
      button16.setBounds(565, 699, 120, 45);

      field12.setBounds(231, 305, 225, 34); 
      field13.setBounds(231, 400, 225, 34); 
      field14.setBounds(231, 495, 234, 34); 
      field15.setBounds(337, 75, 309, 67);
      field16.setBounds(334, 415, 309, 67);
      field1.setBounds(186, 124, 122, 36);
      field2.setBounds(186, 223, 122, 36);
      field3.setBounds(186, 318, 128, 36);
      field4.setBounds(188, 408, 128, 36);
      field5.setBounds(188, 498, 124, 36);
      field6.setBounds(551, 129, 135, 33);
      field7.setBounds(551, 222, 135, 33); //ceditlimit
      field8.setBounds(545, 315, 135, 33);
      field9.setBounds(545, 402, 135, 33); 
      field10.setBounds(237, 135, 239, 33);
      field11.setBounds(237, 225, 239, 33);
      field17.setBounds(238, 70, 225, 36); 
      field18.setBounds(338, 540, 300, 50);

      box1.setBounds(337, 246, 142, 65);
      box2.setBounds(518, 246, 142, 65);
      box3.setBounds(545, 485, 78, 33);
      box4.setBounds(627, 485, 73, 33);

      // panel is added to the frame
      frame.add(panel);
      frame.add(panel2);
      frame.add(panel1);

      // labels buttons, textfield and combobox added to the panels
      panel.add(label1);
      panel.add(label2);
      panel.add(label3);
      panel.add(label4);
      panel.add(label5);
      panel.add(label6);
      panel.add(label7);
      panel.add(label8);
      panel.add(label9);
      panel.add(label25);

      panel.add(field1);
      panel.add(field2);
      panel.add(field3);
      panel.add(field4);
      panel.add(field5);
      panel.add(field6);
      panel.add(field7);
      panel.add(field8);
      panel.add(field9);

      panel.add(button1);
      panel.add(button2);
      panel.add(button3);
      panel.add(button4);
      panel.add(button9);
      panel.add(button15);
      //panel.add(button10);

      panel.add(box3);
      panel.add(box4);

      //panel1.add(label10);
      panel1.add(labe14);
      panel1.add(label15);
      panel1.add(label16);
      panel1.add(label17);
      panel1.add(label18);
      panel1.add(label26);
      panel1.add(label28);

      panel2.add(label11);
      panel2.add(label12);
      panel2.add(label24);
      panel2.add(label27);

      panel1.add(field10);
      panel1.add(field11);
      panel1.add(field12);
      panel1.add(field13);
      panel1.add(field14);
      panel1.add(field17);

      panel1.add(button5);
      panel1.add(button6);
      panel1.add(button7);
      panel1.add(button8);

      panel2.add(field15);
      panel2.add(field16);
      panel2.add(field18);

      panel2.add(button12);
      panel2.add(button13);
      panel2.add(button14);
      panel2.add(button16);

      panel2.add(box1);
      panel2.add(box2);
      
      // ActionListener method is set in the buttons
      button1.addActionListener(this);
      button2.addActionListener(this);
      button3.addActionListener(this);
      button4.addActionListener(this);
      button5.addActionListener(this);
      button6.addActionListener(this);
      button7.addActionListener(this);
      button8.addActionListener(this);
      button9.addActionListener(this);
      button10.addActionListener(this);
      buttoon11.addActionListener(this);
      button12.addActionListener(this);
      button13.addActionListener(this);
      button14.addActionListener(this);
      button15.addActionListener(this);
      button16.addActionListener(this);

      panel.setBackground(Color.PINK);
      frame.setVisible(true);
      frame.setSize(700, 800);
      frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);  // it will closee the program
   }
   // method that is run when the button with ActionListener is pressed
   public void actionPerformed(ActionEvent ea) {
      if (ea.getSource() == button5) { // check the source of the button
          if (field14.getText().isEmpty() || field10.getText().isEmpty() || field13.getText().isEmpty() || field12.getText().isEmpty() || field11.getText().isEmpty() || field17.getText().isEmpty()) {
            JOptionPane.showMessageDialog(frame, "Please fill up the form", "Alert", JOptionPane.INFORMATION_MESSAGE);
         } else{
         frame.add(panel2);  // to add panel to frame
         frame.remove(panel1);  // remove panel from frame
         frame.repaint();
         frame.validate();}
      }
      if (ea.getSource() == button6) {
         frame.add(panel);
         frame.remove(panel1);
         frame.repaint();
         frame.validate();
      }
      if (ea.getSource() == button9) {
         frame.add(panel1);
         frame.remove(panel);
         frame.repaint();
         frame.validate();
      }
      if (ea.getSource() == button12) {
         frame.add(panel1);
         frame.remove(panel2);
         frame.repaint();
         frame.validate();
      }
      if (ea.getSource() == button8) {
         field10.setText("");
         field11.setText("");
         field12.setText("");
         field13.setText("");
         field14.setText("");
         field17.setText("");
         JOptionPane.showMessageDialog(frame, "Everything is cleared", "Successfully", JOptionPane.INFORMATION_MESSAGE);
      }
      if (ea.getSource() == button4) {
         field1.setText("");
         field2.setText("");
         field3.setText("");
         field4.setText("");
         field5.setText("");
         field6.setText("");
         field7.setText("");
         field8.setText("");
         field9.setText("");
         field10.setText("");
         JOptionPane.showMessageDialog(frame, "Everything is cleared", "Successfully", JOptionPane.INFORMATION_MESSAGE);
      }
      if (ea.getSource() == button14) {
         field15.setText("");
         field16.setText("");
         JOptionPane.showMessageDialog(frame, "Everything is cleared", "Successfully", JOptionPane.INFORMATION_MESSAGE);
      }
      if (ea.getSource() == button7) {

         if (field14.getText().isEmpty() || field10.getText().isEmpty() || field13.getText().isEmpty() || field12.getText().isEmpty() || field11.getText().isEmpty() || field17.getText().isEmpty()) {
            JOptionPane.showMessageDialog(frame, "Please fill up the form", "Alert", JOptionPane.INFORMATION_MESSAGE);
         } else {
            try {
                // initializing the variables and converting the type in some parts
               int balanceAmount = Integer.parseInt(field14.getText()); 
               int cardId = Integer.parseInt(field10.getText());
               String bankAccount = field13.getText();
               String issuerBank = field12.getText();
               String client_name = field11.getText();
               int pinNumber = Integer.parseInt(field17.getText());
               BankCard bank = new Debit_card(balanceAmount, cardId, bankAccount, issuerBank, client_name, pinNumber); // creating object of DebitCard class
               ObjArray.add(bank); // adding bank object to ArrayList
               JOptionPane.showMessageDialog(frame, "Your debit Card is added", "Successfully", JOptionPane.INFORMATION_MESSAGE);// to display a dialog box
            } catch (NumberFormatException bank) {
               JOptionPane.showMessageDialog(frame, "Inavlid Input", "Error", JOptionPane.WARNING_MESSAGE);
            }
         }
      }
      if (ea.getSource() == button15) {
         if (field5.getText().isEmpty() || field1.getText().isEmpty() || field4.getText().isEmpty() || field3.getText().isEmpty() || field2.getText().isEmpty() || field6.getText().isEmpty() || field8.getText().isEmpty()) {
            JOptionPane.showMessageDialog(frame, "Please fill up the form", "Alert", JOptionPane.INFORMATION_MESSAGE);
         } else {
            try {
               int balanceAmount = Integer.parseInt(field5.getText());
               int cardId = Integer.parseInt(field1.getText());
               String bankAccount = field4.getText();
               String issuerBank = field3.getText();
               String client_name = field2.getText();
               int cvcNumber = Integer.parseInt(field6.getText());
               int interestRate = Integer.parseInt(field8.getText());
               String expirationDate = box3.getSelectedItem().toString() + box4.getSelectedItem().toString();
               BankCard bankobj = new Credit_card(balanceAmount, cardId, bankAccount, issuerBank, client_name, cvcNumber, interestRate, expirationDate);
               ObjArray.add(bankobj);
               JOptionPane.showMessageDialog(frame, "Your credit Card is added", "Successfully", JOptionPane.INFORMATION_MESSAGE);
            } catch (NumberFormatException banking) {
               JOptionPane.showMessageDialog(frame, "Inavlid Input", "Error", JOptionPane.WARNING_MESSAGE);
            }
         }
      }//
      if (ea.getSource() == button13) {
          if (field14.getText().isEmpty() || field10.getText().isEmpty() || field13.getText().isEmpty() || field12.getText().isEmpty() || field11.getText().isEmpty() || field17.getText().isEmpty()) {
            JOptionPane.showMessageDialog(frame, "Please fill up the form", "Alert", JOptionPane.INFORMATION_MESSAGE);
         } 
            else{
         if (field15.getText().isEmpty() || field16.getText().isEmpty() || field18.getText().isEmpty()) {
            JOptionPane.showMessageDialog(frame, "Please fill up the form", "Alert", JOptionPane.INFORMATION_MESSAGE);
         } else {
            for (BankCard banc: ObjArray) {
               if (banc instanceof Debit_card) {
                  if (Integer.parseInt(field18.getText()) == banc.getCard_id()) {   //  comparing the cardID of the gui with the arraylist
                     try {
                        int withdrawalAmount = Integer.parseInt(field16.getText());
                        String dateOfWithdrawal = box1.getSelectedItem().toString() + box2.getSelectedItem().toString();
                        int pinNumber = Integer.parseInt(field15.getText());
                        if (Integer.parseInt(field15.getText()) == ((Debit_card) banc).getPinNumber()) { //  to check pin number
                           ((Debit_card) banc).withdraw(withdrawalAmount, dateOfWithdrawal, pinNumber);
                           JOptionPane.showMessageDialog(frame, "Your amount is withdrawn", "Successful", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                           JOptionPane.showMessageDialog(frame, "Wrong pin number", "Alert", JOptionPane.WARNING_MESSAGE);
                        }
                     } catch (NumberFormatException banker) {  //  numberformat exception is not shown from this
                        JOptionPane.showMessageDialog(frame, "Inavlid Input", "Error", JOptionPane.WARNING_MESSAGE);
                     }
                  } else {
                     JOptionPane.showMessageDialog(frame, "Your Card Id doesnot match", "Alert", JOptionPane.WARNING_MESSAGE);
                  }
               }
            }
         }
      }
    }
      if (ea.getSource() == button2) {
         if (field7.getText().isEmpty() || field9.getText().isEmpty()) {  // not allowed to leave the textfield empty
            JOptionPane.showMessageDialog(frame, "Please fill up the form", "Alert", JOptionPane.WARNING_MESSAGE);
         } else {
            for (BankCard banc: ObjArray) {
               if (banc instanceof Credit_card) {

                  if (banc.getCard_id() == Integer.parseInt(field1.getText())) {
                     try {
                        int gracePeriod = Integer.parseInt(field9.getText());
                        int creditLimit = Integer.parseInt(field7.getText());
                        ((Credit_card) banc).setcreditLimit(gracePeriod, creditLimit); //  calling setcreditLimit od Credit_card class 
                        JOptionPane.showMessageDialog(frame, "Your Credit Limit is set", "Successful", JOptionPane.INFORMATION_MESSAGE);
                     } catch (NumberFormatException banks) {
                        JOptionPane.showMessageDialog(frame, "Your Card Id doesnot match", "Alert", JOptionPane.WARNING_MESSAGE);
                     }
                  } else {
                     JOptionPane.showMessageDialog(frame, "The Card Id doesnot match", "Error", JOptionPane.WARNING_MESSAGE);
                  }
               }
            }
         }
      }
      if (ea.getSource() == button3) {
         if (field1.getText().isEmpty()) {
            JOptionPane.showMessageDialog(frame, "Please fill up the form", "Alert", JOptionPane.WARNING_MESSAGE);
         } else {
            try {
               for (BankCard banc: ObjArray) {
                  if ((banc.getCard_id() == Integer.parseInt(field1.getText()))) {
                     ((Credit_card) banc).cancel_creditCard(); // calling cancel credit card method
                     JOptionPane.showMessageDialog(frame, "Your Credit Card is canceled", "Successful", JOptionPane.INFORMATION_MESSAGE);

                  } else {
                     JOptionPane.showMessageDialog(frame, "Your Card Id doesnot match", "Successful", JOptionPane.INFORMATION_MESSAGE);
                  }
               }
            } catch (NumberFormatException ah) {
               JOptionPane.showMessageDialog(frame, "THE form content is invalid", "Error", JOptionPane.WARNING_MESSAGE);
            }
         }
      }
      if (ea.getSource() == button1) {
         for (BankCard banc: ObjArray) {
            if (banc instanceof Credit_card) {
               banc.display(); // calling display method of credit card class
               JOptionPane.showMessageDialog(frame, "Your Credit Card information is Displayed", "Successful", JOptionPane.INFORMATION_MESSAGE);
            }
         }
      }
      if (ea.getSource() == button16) {
         for (BankCard banc: ObjArray) {
            if (banc instanceof Debit_card) {
               banc.display(); // calling display method of debit card class
               JOptionPane.showMessageDialog(frame, "Your Debit Card information is Displayed", "Successful", JOptionPane.INFORMATION_MESSAGE);
            }
         }
      }
   }
   // main method if the class 
   public static void main(String[] args) {
      BankGUI bank = new BankGUI();
   }
}