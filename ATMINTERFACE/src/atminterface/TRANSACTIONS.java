
package atminterface;


import atminterface.BankAccount;

public class TRANSACTIONS extends javax.swing.JFrame {

    private final BankAccount  userAccount;
    public TRANSACTIONS(BankAccount userAccount) {
        this.userAccount = userAccount;
        initComponents();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        withdamt = new javax.swing.JTextField();
        chkbal = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        result = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        depamt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        withdamt.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        withdamt.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        chkbal.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        chkbal.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jButton1.setBackground(new java.awt.Color(255, 255, 204));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 102, 0));
        jButton1.setText("Deposit");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/atmcard.png"))); // NOI18N

        jButton2.setBackground(new java.awt.Color(255, 255, 204));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 102, 0));
        jButton2.setText("Withdrawl");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Serif", 1, 26)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("PLEASE SELECT YOUR TRANSACTIONS");

        jButton3.setBackground(new java.awt.Color(255, 255, 204));
        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 102, 0));
        jButton3.setText("Check");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        result.setEditable(false);
        result.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        result.setForeground(new java.awt.Color(255, 0, 51));
        result.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel3.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("DEPOSIT  AMOUNT:");

        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton4.setForeground(java.awt.Color.red);
        jButton4.setText("EXIT");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("WITHRAWL AMOUNT:");

        jLabel5.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("CHECK BALANCE:");

        depamt.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        depamt.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(26, 26, 26)
                                .addComponent(jLabel2))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))
                                .addGap(50, 50, 50)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(withdamt, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(chkbal, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(depamt, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(100, 100, 100)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(89, 89, 89)
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(50, 50, 50))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addGap(76, 76, 76))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(result, javax.swing.GroupLayout.PREFERRED_SIZE, 643, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel2)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(depamt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jButton1))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(withdamt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(chkbal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(result, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton4)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
         
              depositActionPerformed(evt);
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
       
                withdrawActionPerformed(evt);
            
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
          
                checkBalanceActionPerformed(evt);
            
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        
                exitActionPerformed(evt);
            
    }//GEN-LAST:event_jButton4MouseClicked

    

 private void depositActionPerformed(java.awt.event.MouseEvent evt) {
    try {
        double amount = Double.parseDouble(depamt.getText());
        // Perform deposit logic here
        userAccount.deposit(amount);
        result.setText("Your amount Rs." + amount + " has been deposited. Your new balance is Rs." + userAccount.getBalance());
        chkbal.setText(String.valueOf(userAccount.getBalance()));
    } catch (NumberFormatException e) {
        result.setText("Please enter a valid amount.");
    }
} 

private void withdrawActionPerformed(java.awt.event.MouseEvent evt) {
    try {
        double amount = Double.parseDouble(withdamt.getText());
        // Perform withdrawal logic here
        boolean success = userAccount.withdraw(amount);
        if (success) {
            result.setText("Your amount Rs." + amount + " has been withdrawn. Your new balance is Rs." + userAccount.getBalance());
            chkbal.setText(String.valueOf(userAccount.getBalance()));
        } else {
            result.setText("Insufficient balance.");
        }
    } catch (NumberFormatException e) {
        result.setText("Please enter a valid amount.");
    }
} 

private void checkBalanceActionPerformed(java.awt.event.MouseEvent evt) {
    // Perform check balance logic here
    double balance = userAccount.getBalance();
    chkbal.setText(String.valueOf(balance));
    result.setText("Your balance is: Rs." + balance);
} 


   private void exitActionPerformed(java.awt.event.MouseEvent evt) {                                      
        // Code to exit the current JFrame
        dispose(); // Close the JFrame
        java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            NewJFrame atmInterface = new NewJFrame(); // Create a new instance of the ATM interface
            atmInterface.setVisible(true); // Set it to visible
        }
    });

    }  
    public static void main(String args[]) {
        
        BankAccount  userAccountInstance = new BankAccount("John Doe", "1234567890"); // Example values
        TRANSACTIONS transactionsFrame = new TRANSACTIONS(userAccountInstance);
        transactionsFrame.setVisible(true);

          try {
        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
            if ("Nimbus".equals(info.getName())) {
                javax.swing.UIManager.setLookAndFeel(info.getClassName());
                break;
            }
        }
    } catch (ClassNotFoundException ex) {
        java.util.logging.Logger.getLogger(TRANSACTIONS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
        java.util.logging.Logger.getLogger(TRANSACTIONS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
        java.util.logging.Logger.getLogger(TRANSACTIONS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
        java.util.logging.Logger.getLogger(TRANSACTIONS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TRANSACTIONS(userAccountInstance).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField chkbal;
    private javax.swing.JTextField depamt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField result;
    private javax.swing.JTextField withdamt;
    // End of variables declaration//GEN-END:variables
}
