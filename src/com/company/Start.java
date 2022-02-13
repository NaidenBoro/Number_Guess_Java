package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Start {
    JFrame frame = new JFrame("Number Guess");
    CardLayout cardLayout = new CardLayout();
    JPanel Pane = new JPanel(cardLayout);
    Font shanoFont = new Font("Stencil",Font.PLAIN,0);
    public void Run(){
        frame.setSize(600,400);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(Pane);

        JPanel startP = new JPanel();
        startP.setLayout(null);
        JLabel startText = new JLabel("Number Guess");
        startText.setBounds(0,0,600,200);
        startText.setFont(shanoFont.deriveFont(40f));
        startText.setHorizontalAlignment(SwingConstants.CENTER);
        startText.setAlignmentY(JFrame.CENTER_ALIGNMENT);
        startP.add(startText);

        JButton startButton = new JButton("Start");
        startButton.setFont(shanoFont.deriveFont(15f));
        startButton.setBounds(250,175,100,50);
        startP.add(startButton);
        startButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Choose();
            }
        });
        
        Pane.add("a",startP);
        cardLayout.next(Pane);
    }
    public void Choose(){
        JPanel a = new JPanel();
        a.setLayout(null);
        JLabel difficulty = new JLabel("Choose Difficulty");
        difficulty.setBounds(0,50,600,200);
        difficulty.setFont(shanoFont.deriveFont(30f));
        difficulty.setHorizontalAlignment(SwingConstants.CENTER);
        difficulty.setAlignmentY(JFrame.CENTER_ALIGNMENT);
        a.add(difficulty);

        JButton easy = new JButton("Easy");
        easy.setBounds(195,175,100,50);
        easy.setFont(shanoFont.deriveFont(15f));
        a.add(easy);
        easy.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                easy();
            }
        });

        JButton hard = new JButton("Hard");
        hard.setBounds(305,175,100,50);
        hard.setFont(shanoFont.deriveFont(15f));
        a.add(hard);
        hard.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                hard();
            }
        });
        Pane.add("b",a);
        cardLayout.next(Pane);
    }
    public void easy(){
        double n = Math.floor(Math.random()*10+1);
        int number = (int) n;
        JPanel a = new JPanel();
        a.setLayout(null);

        a.setLayout(null);
        JLabel difficulty = new JLabel("Guess a number from 1 to 10");
        difficulty.setBounds(0,50,600,200);
        difficulty.setFont(shanoFont.deriveFont(30f));
        difficulty.setHorizontalAlignment(SwingConstants.CENTER);
        difficulty.setAlignmentY(JFrame.CENTER_ALIGNMENT);
        a.add(difficulty);
        
        JTextField num = new JTextField("");
        num.setBounds(195,175,100,50);
        num.setHorizontalAlignment(SwingConstants.CENTER);
        num.setFont(shanoFont.deriveFont(15f));
        a.add(num);

        JButton hard = new JButton("Guess");
        hard.setBounds(305,175,100,50);
        hard.setFont(shanoFont.deriveFont(15f));
        a.add(hard);

        hard.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                try{
                int guess = Integer.parseInt(num.getText());
                    if(guess<=0||guess>10){
                        difficulty.setText("It must be from 1 to 10");
                        difficulty.setForeground(Color.red);
                    }
                    else if(guess<number){
                        if(difficulty.getText()=="Go higher") {
                            difficulty.setText("Even higher");
                        }else{
                            difficulty.setText("Go higher");
                        }
                        difficulty.setForeground(Color.red);
                    }else if(guess>number){
                        if(difficulty.getText()=="Go lower") {
                            difficulty.setText("Even lower");
                        }else{
                            difficulty.setText("Go lower");
                        }
                        difficulty.setForeground(Color.red);
                    }else {
                        difficulty.setText("You guessed right");
                        difficulty.setForeground(Color.green);
                        hard.setText("Exit");
                        hard.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                System.exit(0);
                            }
                        });
                    }
                }
                catch (Exception ex){
                    difficulty.setText("Not a valid number");
                    difficulty.setForeground(Color.red);
                }
            }
        });

        Pane.add("b",a);
        cardLayout.next(Pane);
    }

    public void hard(){
        double n = Math.floor(Math.random()*100+1);
        int number = (int) n;
        JPanel a = new JPanel();
        a.setLayout(null);

        a.setLayout(null);
        JLabel difficulty = new JLabel("Guess a number from 1 to 100");
        difficulty.setBounds(0,50,600,200);
        difficulty.setFont(shanoFont.deriveFont(30f));
        difficulty.setHorizontalAlignment(SwingConstants.CENTER);
        difficulty.setAlignmentY(JFrame.CENTER_ALIGNMENT);
        a.add(difficulty);

        JTextField num = new JTextField("");
        num.setBounds(195,175,100,50);
        num.setHorizontalAlignment(SwingConstants.CENTER);
        num.setFont(shanoFont.deriveFont(15f));
        a.add(num);

        JButton hard = new JButton("Guess");
        hard.setBounds(305,175,100,50);
        hard.setFont(shanoFont.deriveFont(15f));
        a.add(hard);

        hard.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                try{
                    int guess = Integer.parseInt(num.getText());
                    if(guess<=0||guess>100){
                        difficulty.setText("It must be from 1 to 100");
                        difficulty.setForeground(Color.red);
                    }
                    else if(guess<number){
                        if(difficulty.getText()=="Go higher") {
                            difficulty.setText("Even higher");
                        }else{
                            difficulty.setText("Go higher");
                        }
                        difficulty.setForeground(Color.red);
                    }else if(guess>number){
                        if(difficulty.getText()=="Go lower") {
                            difficulty.setText("Even lower");
                        }else{
                            difficulty.setText("Go lower");
                        }
                        difficulty.setForeground(Color.red);
                    }else {
                        difficulty.setText("You guessed right");
                        difficulty.setForeground(Color.green);
                        hard.setText("Exit");
                        hard.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                System.exit(0);
                            }
                        });
                    }
                }
                catch (Exception ex){
                    difficulty.setText("Not a valid number");
                    difficulty.setForeground(Color.red);
                }
            }
        });

        Pane.add("b",a);
        cardLayout.next(Pane);
    }
}