
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;

        public class Main {
            public static void main(String[] args) {
                //6 steps to graphics
                //1. create a frame
                JFrame frame = new JFrame();
                frame.setSize(500, 500);

                //2 pannel
                JPanel panel = new JPanel();

                //3. components


                JLabel output = new JLabel("");

//                JTextField textField = new JTextField(10);
//                textField.addActionListener(new ActionListener() {
//                    @Override
//                    public void actionPerformed(ActionEvent e) {
//                        // System.out.println("bye!");
//                        String blah = textField.getText();
//                        output.setText("Hello " + blah );
//                    }
//                });
//                JButton button = new JButton("push");
//                button.addActionListener(new ActionListener() {
//                    @Override
//                    public void actionPerformed(ActionEvent e) {
//                        String blah = textField.getText();
//                        output.setText("Hello " + blah );
//                    }
//                });

                JCheckBox boxie = new JCheckBox("Click here for blue!!");
                    boxie.addActionListener(new ActionListener(){
                        @Override
                        public void actionPerformed(ActionEvent b){
                            Color colb = new Color(100,150,200);
                            panel.setBackground(colb);
                        }
                    });

                JCheckBox boxen = new JCheckBox("Click here for green!!");
                boxie.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent b){
                        Color comb = new Color(100,200,150);
                        panel.setBackground(comb);
                    }
                });

                JCheckBox boxer = new JCheckBox("Click here for yellow!!");
                boxie.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent b){
                        Color crac = new Color(150,150,80);
                        panel.setBackground(crac);
                    }
                });
                //4. add compontent to panel
              //  panel.add(button);
             //   panel.add(textField);
                panel.add(output);
                panel.add(boxie);
                panel.add(boxen);
                panel.add(boxer);

                //5 add panel to frame
                frame.add(panel);

                //6 set frame visible
                frame.setVisible(true);
            }
        }