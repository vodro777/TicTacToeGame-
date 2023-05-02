
package tic.tac.toe;

import javafx.scene.paint.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class TicTacToe extends javax.swing.JFrame {
    private String startGame = "X";
    private int xCount = 0;
    private int oCount = 0;
            
    /**
     * Creates new form TicTacToe
     */
    public TicTacToe() {
        initComponents();
    }
    private void gameScore ()
    {
       playerx.setText(String.valueOf(xCount));
        player0.setText(String.valueOf(oCount));
     }
    private void choose_a_Player()
            
    {
           if(startGame.equalsIgnoreCase("X"))
                   {
                       startGame="o";
                   }
                   else
                   { 
                     startGame ="X";      
                   }               
    }
                private void WinningGame()
                {
                    String b1 = txtbtn1.getText();
                    String b2 = txtbtn2.getText();
                    String b3 = txtbtn3.getText();
                    
                    String b4 = txtbtn4.getText();
                    String b5 = txtbtn5.getText();
                    String b6 = txtbtn6.getText();
                    
                    String b7 = txtbtn7.getText();
                    String b8 = txtbtn8.getText();
                    String b9 = txtbtn9.getText();
                   //player x code
                    
                    if(b1 == ("X") && b2 == ("X") && b3 == ("X"))
                    {
                        JOptionPane.showMessageDialog(this, "Player X win", "Tic Tac Toc",
                                JOptionPane.INFORMATION_MESSAGE);
                         xCount++;
                         gameScore();
                         
                         txtbtn1.setBackground(java.awt.Color.ORANGE);
                         txtbtn2.setBackground(java.awt.Color.ORANGE);
                         txtbtn3.setBackground(java.awt.Color.ORANGE);
                         
                       
                    }
                     if(b4 == ("X") && b5 == ("X") && b6 == ("X"))
                    {
                        JOptionPane.showMessageDialog(this, "Player X win", "Tic Tac Toc",
                                JOptionPane.INFORMATION_MESSAGE);
                         xCount++;
                         gameScore();
                         
                         txtbtn4.setBackground(java.awt.Color.ORANGE);
                         txtbtn5.setBackground(java.awt.Color.ORANGE);
                         txtbtn6.setBackground(java.awt.Color.ORANGE);
                         
                       
                    }
                      if(b7 == ("X") && b8 == ("X") && b9 == ("X"))
                    {
                        JOptionPane.showMessageDialog(this, "Player X win", "Tic Tac Toc",
                                JOptionPane.INFORMATION_MESSAGE);
                         xCount++;
                         gameScore();
                         
                         txtbtn7.setBackground(java.awt.Color.ORANGE);
                         txtbtn8.setBackground(java.awt.Color.ORANGE);
                         txtbtn9.setBackground(java.awt.Color.ORANGE);
                         
                       
                    }
                       if(b1 == ("X") && b4 == ("X") && b7 == ("X"))
                    {
                        JOptionPane.showMessageDialog(this, "Player X win", "Tic Tac Toc",
                                JOptionPane.INFORMATION_MESSAGE);
                         xCount++;
                         gameScore();
                         
                         txtbtn1.setBackground(java.awt.Color.ORANGE);
                         txtbtn4.setBackground(java.awt.Color.ORANGE);
                         txtbtn7.setBackground(java.awt.Color.ORANGE);
                         
                       
                    }
                     if(b2 == ("X") && b5 == ("X") && b8 == ("X"))
                    {
                        JOptionPane.showMessageDialog(this, "Player X win", "Tic Tac Toc",
                                JOptionPane.INFORMATION_MESSAGE);
                         xCount++;
                         gameScore();
                         
                         txtbtn2.setBackground(java.awt.Color.ORANGE);
                         txtbtn5.setBackground(java.awt.Color.ORANGE);
                         txtbtn8.setBackground(java.awt.Color.ORANGE);
                         
                       
                    }
                     if(b3 == ("X") && b6 == ("X") && b9 == ("X"))
                    {
                        JOptionPane.showMessageDialog(this, "Player X win", "Tic Tac Toc",
                                JOptionPane.INFORMATION_MESSAGE);
                         xCount++;
                         gameScore();
                         
                         txtbtn3.setBackground(java.awt.Color.ORANGE);
                         txtbtn6.setBackground(java.awt.Color.ORANGE);
                         txtbtn9.setBackground(java.awt.Color.ORANGE);
                         
                       
                    }
                      if(b1 == ("X") && b5 == ("X") && b9 == ("X"))
                    {
                        JOptionPane.showMessageDialog(this, "Player X win", "Tic Tac Toc",
                                JOptionPane.INFORMATION_MESSAGE);
                         xCount++;
                         gameScore();
                         
                         txtbtn1.setBackground(java.awt.Color.ORANGE);
                         txtbtn5.setBackground(java.awt.Color.ORANGE);
                         txtbtn9.setBackground(java.awt.Color.ORANGE);
                         
                       
                    }
                        if(b3 == ("X") && b5 == ("X") && b7 == ("X"))
                    {
                        JOptionPane.showMessageDialog(this, "Player X win", "Tic Tac Toc",
                                JOptionPane.INFORMATION_MESSAGE);
                         xCount++;
                         gameScore();
                         
                         txtbtn3.setBackground(java.awt.Color.ORANGE);
                         txtbtn5.setBackground(java.awt.Color.ORANGE);
                         txtbtn7.setBackground(java.awt.Color.ORANGE);
                         
                       
                    }
                     
                     //player 0 code
                     
                      if(b1 == ("o") && b2 == ("o") && b3 == ("o"))
                    {
                        JOptionPane.showMessageDialog(this, "Player O win", "Tic Tac Toc",
                                JOptionPane.INFORMATION_MESSAGE);
                         oCount++;
                         gameScore();
                         
                         txtbtn1.setBackground(java.awt.Color.BLUE);
                         txtbtn2.setBackground(java.awt.Color.BLUE);
                         txtbtn3.setBackground(java.awt.Color.BLUE);
                         
                       
                    }
                         if(b4 == ("o") && b5 == ("o") && b6 == ("o"))
                    {
                        JOptionPane.showMessageDialog(this, "Player O win", "Tic Tac Toc",
                                JOptionPane.INFORMATION_MESSAGE);
                         oCount++;
                         gameScore();
                         
                         txtbtn4.setBackground(java.awt.Color.BLUE);
                         txtbtn5.setBackground(java.awt.Color.BLUE);
                         txtbtn6 .setBackground(java.awt.Color.BLUE);
                         
                       
                    }
                                if(b7 == ("o") && b8 == ("o") && b9 == ("o"))
                    {
                        JOptionPane.showMessageDialog(this, "Player O win", "Tic Tac Toc",
                                JOptionPane.INFORMATION_MESSAGE);
                         oCount++;
                         gameScore();
                         
                         txtbtn7.setBackground(java.awt.Color.BLUE);
                         txtbtn8.setBackground(java.awt.Color.BLUE);
                         txtbtn9.setBackground(java.awt.Color.BLUE);
                         
                       
                    }
                            if(b1 == ("o") && b4 == ("o") && b7 == ("o"))
                    {
                        JOptionPane.showMessageDialog(this, "Player O win", "Tic Tac Toc",
                                JOptionPane.INFORMATION_MESSAGE);
                         oCount++;
                         gameScore();
                         
                         txtbtn1.setBackground(java.awt.Color.BLUE);
                         txtbtn4.setBackground(java.awt.Color.BLUE);
                         txtbtn7.setBackground(java.awt.Color.BLUE);
                         
                       
                    }
                     
                            if(b2 == ("o") && b5 == ("o") && b8 == ("o"))
                    {
                        JOptionPane.showMessageDialog(this, "Player O win", "Tic Tac Toc",
                                JOptionPane.INFORMATION_MESSAGE);
                         oCount++;
                         gameScore();
                         
                         txtbtn2.setBackground(java.awt.Color.BLUE);
                         txtbtn5.setBackground(java.awt.Color.BLUE);
                         txtbtn8.setBackground(java.awt.Color.BLUE);
                         
                       
                    }
                     
                            if(b3 == ("o") && b6 == ("o") && b9 == ("o"))
                    {
                        JOptionPane.showMessageDialog(this, "Player o win", "Tic Tac Toc",
                                JOptionPane.INFORMATION_MESSAGE);
                         oCount++;
                         gameScore();
                         
                         txtbtn3.setBackground(java.awt.Color.BLUE);
                         txtbtn6.setBackground(java.awt.Color.BLUE);
                         txtbtn9.setBackground(java.awt.Color.BLUE);
                         
                       
                    }
                            if(b1 == ("o") && b5 == ("o") && b9 == ("o"))
                    {
                        JOptionPane.showMessageDialog(this, "Player o win", "Tic Tac Toc",
                                JOptionPane.INFORMATION_MESSAGE);
                         oCount++;
                         gameScore();
                         
                         txtbtn1.setBackground(java.awt.Color.BLUE);
                         txtbtn5.setBackground(java.awt.Color.BLUE);
                         txtbtn9.setBackground(java.awt.Color.BLUE);
                         
                       
                    }
                            if(b3 == ("o") && b5 == ("o") && b7 == ("o"))
                    {
                        JOptionPane.showMessageDialog(this, "Player o win", "Tic Tac Toc",
                                JOptionPane.INFORMATION_MESSAGE);
                         oCount++;
                         gameScore();
                         
                         txtbtn3.setBackground(java.awt.Color.BLUE);
                         txtbtn5.setBackground(java.awt.Color.BLUE);
                         txtbtn7.setBackground(java.awt.Color.BLUE);
                         
                       
                    }
                    
                }
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtbtn7 = new javax.swing.JButton();
        txtbtn4 = new javax.swing.JButton();
        txtbtn8 = new javax.swing.JButton();
        txtbtn3 = new javax.swing.JButton();
        txtbtn1 = new javax.swing.JButton();
        txtbtn5 = new javax.swing.JButton();
        txtbtn9 = new javax.swing.JButton();
        txtbtn2 = new javax.swing.JButton();
        txtbtn6 = new javax.swing.JButton();
        txtreset = new javax.swing.JButton();
        txtexit = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        playerx = new javax.swing.JLabel();
        player0 = new javax.swing.JLabel();
        playerx3 = new javax.swing.JLabel();
        playerx4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 0, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel1.setText("Tic Tac Toe");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(90, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(21, 21, 21))
        );

        txtbtn7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtbtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn7ActionPerformed(evt);
            }
        });

        txtbtn4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtbtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn4ActionPerformed(evt);
            }
        });

        txtbtn8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtbtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn8ActionPerformed(evt);
            }
        });

        txtbtn3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtbtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn3ActionPerformed(evt);
            }
        });

        txtbtn1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn1ActionPerformed(evt);
            }
        });

        txtbtn5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtbtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn5ActionPerformed(evt);
            }
        });

        txtbtn9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtbtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn9ActionPerformed(evt);
            }
        });

        txtbtn2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn2ActionPerformed(evt);
            }
        });

        txtbtn6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtbtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn6ActionPerformed(evt);
            }
        });

        txtreset.setBackground(new java.awt.Color(0, 153, 153));
        txtreset.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtreset.setText("RESET");
        txtreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtresetActionPerformed(evt);
            }
        });

        txtexit.setBackground(new java.awt.Color(255, 0, 0));
        txtexit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtexit.setText("EXIT");
        txtexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtexitActionPerformed(evt);
            }
        });

        playerx.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        playerx.setForeground(new java.awt.Color(255, 255, 0));
        playerx.setText("xxxxxx");

        player0.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        player0.setForeground(new java.awt.Color(51, 51, 255));
        player0.setText("xxxxxx");

        playerx3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        playerx3.setText("Player X");

        playerx4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        playerx4.setText("Player 0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(playerx, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(player0, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(playerx3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(playerx4, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(playerx, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(playerx3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(player0, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(playerx4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtbtn1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                        .addComponent(txtbtn4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(txtbtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtbtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtbtn8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(txtbtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtreset, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtexit, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
            .addGroup(layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtbtn3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtbtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtbtn8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbtn9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtreset, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtexit, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtexitActionPerformed
        // TODO add your handling code here:
        JFrame frame = new JFrame("EXIT");
        if(JOptionPane.showConfirmDialog(frame, "Confirm if you want EXIT",
                "TicTacToe", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION)
        {
            System.exit(0);
        }
        
        
        
        
        
    }//GEN-LAST:event_txtexitActionPerformed

    private void txtbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn1ActionPerformed
        // TODO add your handling code here:
       txtbtn1.setText(startGame);
                
          if(startGame.equalsIgnoreCase("X"))
                   {
                       txtbtn1.setForeground(java.awt.Color.RED);
                   }
                   else
                   { 
                    txtbtn1.setForeground(java.awt.Color.BLACK);
                   }
          choose_a_Player();        
          WinningGame();
        
    }//GEN-LAST:event_txtbtn1ActionPerformed

    private void txtbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn2ActionPerformed
        // TODO add your handling code here:
           txtbtn2.setText(startGame);
                
          if(startGame.equalsIgnoreCase("X"))
                   {
                       txtbtn2.setForeground(java.awt.Color.RED);
                   }
                   else
                   { 
                    txtbtn2.setForeground(java.awt.Color.BLACK);
                   }
          choose_a_Player();         
        WinningGame();
        
        
        
    }//GEN-LAST:event_txtbtn2ActionPerformed

    private void txtbtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn3ActionPerformed
        // TODO add your handling code here:
         txtbtn3.setText(startGame);
                
          if(startGame.equalsIgnoreCase("X"))
                   {
                       txtbtn3.setForeground(java.awt.Color.RED);
                   }
                   else
                   { 
                    txtbtn3.setForeground(java.awt.Color.BLACK);
                   }
          choose_a_Player();  
WinningGame();          
    }//GEN-LAST:event_txtbtn3ActionPerformed

    private void txtbtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn4ActionPerformed
        // TODO add your handling code here:
         txtbtn4.setText(startGame);
                
          if(startGame.equalsIgnoreCase("X"))
                   {
                       txtbtn4.setForeground(java.awt.Color.RED);
                   }
                   else
                   { 
                    txtbtn4.setForeground(java.awt.Color.BLACK);
                   }
          choose_a_Player();    
          WinningGame();
        
    }//GEN-LAST:event_txtbtn4ActionPerformed

    private void txtbtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn5ActionPerformed
                        // TODO add your handling code here:
                          txtbtn5.setText(startGame);
                
          if(startGame.equalsIgnoreCase("X"))
                   {
                       txtbtn5.setForeground(java.awt.Color.RED);
                   }
                   else
                   { 
                    txtbtn5.setForeground(java.awt.Color.BLACK);
                   }
          choose_a_Player();  
           WinningGame();
    }//GEN-LAST:event_txtbtn5ActionPerformed

    private void txtbtn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn6ActionPerformed
        // TODO add your handling code here:
          txtbtn6.setText(startGame);
                
          if(startGame.equalsIgnoreCase("X"))
                   {
                       txtbtn6.setForeground(java.awt.Color.RED);
                   }
                   else
                   { 
                    txtbtn6.setForeground(java.awt.Color.BLACK);
                   }
          choose_a_Player(); 
           WinningGame();
    }//GEN-LAST:event_txtbtn6ActionPerformed

    private void txtbtn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn7ActionPerformed
        // TODO add your handling code here:
          txtbtn7.setText(startGame);
                
          if(startGame.equalsIgnoreCase("X"))
                   {
                       txtbtn7.setForeground(java.awt.Color.RED);
                   }
                   else
                   { 
                    txtbtn7.setForeground(java.awt.Color.BLACK);
                   }
          choose_a_Player();   
           WinningGame();
    }//GEN-LAST:event_txtbtn7ActionPerformed

    private void txtbtn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn8ActionPerformed
        // TODO add your handling code here:
          txtbtn8.setText(startGame);
                
          if(startGame.equalsIgnoreCase("X"))
                   {
                       txtbtn8.setForeground(java.awt.Color.RED);
                   }
                   else
                   { 
                    txtbtn8.setForeground(java.awt.Color.BLACK);
                   }
          choose_a_Player();   
           WinningGame();
    }//GEN-LAST:event_txtbtn8ActionPerformed

    private void txtbtn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn9ActionPerformed
        // TODO add your handling code here:
          txtbtn9.setText(startGame);
                
          if(startGame.equalsIgnoreCase("X"))
                   {
                       txtbtn9.setForeground(java.awt.Color.RED);
                   }
                   else
                   { 
                    txtbtn9.setForeground(java.awt.Color.BLACK);
                   }
          choose_a_Player();   
           WinningGame();
    }//GEN-LAST:event_txtbtn9ActionPerformed

    private void txtresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtresetActionPerformed
        // TODO add your handling code here:
        txtbtn1.setText(null);
        txtbtn2.setText(null);
        txtbtn3.setText(null);
        
        txtbtn4.setText(null);
        txtbtn5.setText(null);
        txtbtn6.setText(null);
        
        txtbtn7.setText(null);
        txtbtn8.setText(null);
        txtbtn9.setText(null);
        
        txtbtn1.setBackground(java.awt.Color.LIGHT_GRAY);
        txtbtn2.setBackground(java.awt.Color.LIGHT_GRAY);
        txtbtn3.setBackground(java.awt.Color.LIGHT_GRAY);
        
        txtbtn4.setBackground(java.awt.Color.LIGHT_GRAY);
        txtbtn5.setBackground(java.awt.Color.LIGHT_GRAY);
        txtbtn6.setBackground(java.awt.Color.LIGHT_GRAY);
        
        txtbtn7.setBackground(java.awt.Color.LIGHT_GRAY);
        txtbtn8.setBackground(java.awt.Color.LIGHT_GRAY);
        txtbtn9.setBackground(java.awt.Color.LIGHT_GRAY);
        
        
    }//GEN-LAST:event_txtresetActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicTacToe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel player0;
    private javax.swing.JLabel playerx;
    private javax.swing.JLabel playerx3;
    private javax.swing.JLabel playerx4;
    private javax.swing.JButton txtbtn1;
    private javax.swing.JButton txtbtn2;
    private javax.swing.JButton txtbtn3;
    private javax.swing.JButton txtbtn4;
    private javax.swing.JButton txtbtn5;
    private javax.swing.JButton txtbtn6;
    private javax.swing.JButton txtbtn7;
    private javax.swing.JButton txtbtn8;
    private javax.swing.JButton txtbtn9;
    private javax.swing.JButton txtexit;
    private javax.swing.JButton txtreset;
    // End of variables declaration//GEN-END:variables
}
