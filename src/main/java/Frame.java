import org.w3c.dom.Text;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame extends JFrame {
        Frame(float result){
            Font myFont = new Font("Arial", Font.PLAIN, 45);

            JLabel calculatingPreview = new JLabel();
            Border border = BorderFactory.createLineBorder(Color.gray, 3);
            calculatingPreview.setBounds(0,35,334,100);
            calculatingPreview.setText(Float.toString(result));
            calculatingPreview.setForeground(Color.white);
            calculatingPreview.setFont(myFont);
            calculatingPreview.setBorder(border);
            calculatingPreview.setLocation(200,10);
            calculatingPreview.setHorizontalAlignment(JLabel.RIGHT);
            calculatingPreview.setVerticalAlignment(JLabel.CENTER);

            JPanel upperPanel = new JPanel();
            upperPanel.setLayout(new BorderLayout());
            upperPanel.add(calculatingPreview);
            upperPanel.setBounds(0,35,334,100);
            upperPanel.setBackground(Color.DARK_GRAY);

            JPanel bottomPanel = new JPanel();
            String[] numbers = {"+","7","8","9","-","4","5","6","*","1","2","3","/","0",".","=","←"};
            String operators = "+-*/.";
            JButton[] numButtons = new JButton[numbers.length];
            for (int i = 0; i < numbers.length;i++){
                numButtons[i] = new JButton();
                numButtons[i].setText(numbers[i]);
                numButtons[i].setFont(myFont);
                numButtons[i].setBackground(new java.awt.Color(31, 28, 28));
                numButtons[i].setForeground(Color.white);
                int finalI = i;
                numButtons[i].addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String labelVal = calculatingPreview.getText();
                        if (numbers[finalI]=="←"){
                            StringBuffer sb= new StringBuffer(labelVal);
                            sb.deleteCharAt(sb.length()-1);
                            calculatingPreview.setText(String.valueOf(sb));
                        }else{
                            if (String.valueOf(labelVal.charAt(labelVal.length()-1)).equals(numbers[finalI])){
                                if (operators.indexOf(labelVal.charAt(labelVal.length()-1)) ==-1 && operators.indexOf(numbers[finalI])==-1){
                                    calculatingPreview.setText(labelVal+numbers[finalI]);
                                }
                            }else{
                                calculatingPreview.setText(labelVal+numbers[finalI]);
                            }
                        }
                        if (labelVal.length()>=11){
                            calculatingPreview.setFont(new Font("Arial", Font.PLAIN, 22));
                        }else{
                            calculatingPreview.setFont(new Font("Arial", Font.PLAIN, 45));
                        }
                    }
                });
                bottomPanel.add(numButtons[i]);
            }
            bottomPanel.setBackground(Color.blue);
            bottomPanel.setLayout(new GridLayout(5,4));
            bottomPanel.setBounds(2,150,330,345);

            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setVisible(true);
            this.setSize(350,550);
            this.setTitle("Calculator");
            this.setLocationRelativeTo(null);
            this.setResizable(false);
            this.setLayout(null);
            this.setBackground(Color.DARK_GRAY);
            this.getContentPane().setBackground(Color.DARK_GRAY);
            this.add(upperPanel);
            this.add(bottomPanel);
        }
}
