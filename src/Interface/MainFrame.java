package Interface;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class MainFrame extends JFrame{
    
    public void initialize(){
        final Font mainFont = new Font("Segoe print", Font.BOLD, 18);
        JTextField tf, lsname;
        JLabel lbw;

        JLabel lbl = new JLabel("First Name");
        lbl.setFont(mainFont);
        tf = new JTextField();
        tf.setFont(mainFont);

        JLabel lb = new JLabel("Last Name");
        lb.setFont(mainFont);
        lsname = new JTextField();
        lsname.setFont(mainFont);


        JPanel pnl = new JPanel();
        pnl.setLayout(new GridLayout(4, 1, 5, 5));
        pnl.setOpaque(false);
        pnl.add(lbl);
        pnl.add(tf);
        pnl.add(lb);
        pnl.add(lsname);

        lbw = new JLabel();
        lbw.setFont(mainFont);

        JButton btnOk = new JButton("OK");
        btnOk.setFont(mainFont);
        btnOk.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e){
                String firstName = tf.getText();
                String lastName = lsname.getText();
                lbw.setText("Hello " + firstName +" "+ lastName);
            }
        });

        JButton btnClear = new JButton("Clear");
        btnClear.setFont(mainFont);
        btnClear.addActionListener( new ActionListener(){
          
            public void actionPerformed(ActionEvent e){
                tf.setText("");
                lsname.setText("");
                lbw.setText("");
            }
        });

        JPanel btnpnl = new JPanel();
        btnpnl.setLayout(new GridLayout(1, 2, 5, 5));
        btnpnl.setOpaque(false);
        btnpnl.add(btnOk);
        btnpnl.add(btnClear);




        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBackground(new Color(128,128,255));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        mainPanel.add(pnl, BorderLayout.NORTH);
        mainPanel.add(lbw, BorderLayout.CENTER);
        mainPanel.add(btnpnl, BorderLayout.SOUTH);

        add(mainPanel);

        setTitle("welcome");
        setSize(500,600);
        setMinimumSize(new Dimension(300,400));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        MainFrame mf = new MainFrame();
        mf.initialize();
    }
}
