package com.mycompany.quizapplication;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class QuizTest extends JFrame implements ActionListener {
    private JRadioButton[] radioButtons; // changed from Object[] to JRadioButton[]
    private JLabel label;
    private JButton btnNext, btnResult;
    private ButtonGroup bg;
    private int current = 0;
    private int count = 0;
    private int[] m = new int[10];

    // constructor
    public QuizTest(String s) {
        super(s);
        radioButtons = new JRadioButton[4]; // set array size to 4
        label = new JLabel();
        add(label);
        bg = new ButtonGroup();

        for (int i = 0; i < 4; i++) { // changed loop to go up to 4
            radioButtons[i] = new JRadioButton();
            add(radioButtons[i]);
            bg.add(radioButtons[i]);
        }
        btnNext = new JButton("Next");
        btnResult = new JButton("Result");
        btnResult.setVisible(false);
        btnResult.addActionListener(this);
        btnNext.addActionListener(this);
        add(btnNext);
        add(btnResult);
        setData();
        label.setBounds(30, 40, 450, 20);
        radioButtons[0].setBounds(50, 80, 420, 20);
        radioButtons[1].setBounds(50, 110, 200, 20);
        radioButtons[2].setBounds(50, 140, 200, 20); // changed y value to 140
        radioButtons[3].setBounds(50, 170, 200, 20); // added fourth button
        btnNext.setBounds(100, 240, 100, 30);
        btnResult.setBounds(270, 240, 70, 30);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocation(250, 100);
        setVisible(true);
        setSize(600, 350);
    }

    // set data for each question
    void setData() {
        bg.clearSelection(); // added to clear selection before setting new question
        if (current == 0) {
            label.setText("Question 1: What is the official language of Android Development");
            radioButtons[0].setText("JAVA");
            radioButtons[1].setText("Kotlin");
            radioButtons[2].setText("C++");
            radioButtons[3].setText("C"); // added fourth option
        } else if (current == 1) {
            label.setText("Question 2 : Which programming language provides GUI");
            radioButtons[0].setText("JAVA");
            radioButtons[1].setText("Kotlin");
            radioButtons[2].setText("C++");
            radioButtons[3].setText("C"); // added fourth option
        } else if (current == 2) {
            label.setText("Question 3: Which language is taught in LPU");
            radioButtons[0].setText("JAVA");
            radioButtons[1].setText("Kotlin");
            radioButtons[2].setText("C++");
            radioButtons[3].setText("All of the above");
        } else if (current == 3) {
            label.setText("Question 4: Which language is best for programmers ");
            radioButtons[0].setText("JAVA");
            radioButtons[1].setText("kotlin");
            radioButtons[2].setText("C++");
            radioButtons[3].setText("all of above");
        }
           
            if(current ==4){
            label.setText("Question 5:which is faster programming language");
            radioButtons[0].setText("JAVA");
            radioButtons[1].setText("kotlin");
            radioButtons[2].setText("C++");
            radioButtons[3].setText("c");
        }
            
             if(current ==5){
            label.setText("Question 6:which is not a programming language");
            radioButtons[0].setText("JAVA");
            radioButtons[1].setText("kotlin");
            radioButtons[2].setText("C++");
            radioButtons[3].setText("html");
        }
             
              if(current ==6){
            label.setText("Question 7:which is used for web development ");
            radioButtons[0].setText("JAVA");
            radioButtons[1].setText("html");
            radioButtons[2].setText("C++");
            radioButtons[3].setText("c");
        }
               if(current ==7){
            label.setText("Question 8: which language is rarely used for cp");
            radioButtons[0].setText("JAVA");
            radioButtons[1].setText("kotlin");
            radioButtons[2].setText("C++");
            radioButtons[3].setText("c");
        }
    
                if(current ==8){
            label.setText("Question 9: What is the offical language of Andriod Development");
            radioButtons[0].setText("JAVA");
            radioButtons[1].setText("kotlin");
            radioButtons[2].setText("C++");
            radioButtons[3].setText("c");
        }
                 if(current ==9){
            label.setText("Question 10: What is the offical language of Andriod Development");
            radioButtons[0].setText("JAVA");
            radioButtons[1].setText("kotlin");
            radioButtons[2].setText("C++");
            radioButtons[3].setText("c");
        }
                 label.setBounds(30,40,450,20);
                 for(int i=0,  j=0; i<=90; i+=30,j++){
            radioButtons[j].setBounds(50,80+i,200,20);
            
            
    
    } 
   }
   boolean checkAns(){
       if(current==0){
           return(radioButtons[1].isSelected());
       }
       
       if(current==1){
           return(radioButtons[1].isSelected());
       }
       
       if(current==2){
           return(radioButtons[1].isSelected());
       }
       if(current==3){
           return(radioButtons[1].isSelected());
       }
       if(current==4){
           return(radioButtons[1].isSelected());
       }
       if(current==5){
           return(radioButtons[1].isSelected());
       }
       if(current==6){
           return(radioButtons[1].isSelected());
       }
       if(current==7){
           return(radioButtons[1].isSelected());
       }
       if(current==8){
           return(radioButtons[1].isSelected());
       }
       if(current==9){
           return(radioButtons[1].isSelected());
       }
       return false;
   
   
   }
    public static void main(String args[]){
        QuizTest quiztest = new QuizTest("simple quiz test");
    }

    
    @Override
    public void actionPerformed(ActionEvent e) {
     if(e.getSource()==btnNext){
         if(checkAns())
             count=count+1;
            current++;
            setData();
            if(current==9){
                btnNext.setEnabled(false);
                btnResult.setVisible(true);
                btnResult.setText("Result");
                
            }
     }
     if(e.getActionCommand().equals("Result")){
         if(checkAns())
             count=count+1;
         current++;
         JOptionPane.showMessageDialog(this,"Correct answers are"+count);
        System.exit(0);
            
             
         
         
     }
    }
     
    
    }