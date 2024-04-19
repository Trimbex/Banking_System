import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class home extends JFrame  {
    private JButton Deposit;
    private JButton withdrawButton;
    private JButton loanProcessingButton;
    private JButton transferButton;
    private JButton inquiryButton;
    private JButton transactionHistoryButton;
    private JPanel home;
    private JButton accountDetailsButton;
    private JLabel welcome;

    JFrame frame = new JFrame();

    private Customer customer; // Declare a Customer object



    home(Customer customer){
        this.customer = customer;
       frame.setSize(600,600);
       frame.setVisible(true);
       frame.setContentPane(home);
       welcome();

       inquiryButton.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {

               gotodeposit();
                frame.dispose();
           }
       });
   }

public void gotodeposit(){
   inquiryform nav = new inquiryform( customer);

}

public void welcome(){
        welcome.setText("welcome " + customer.FName);
}

}
