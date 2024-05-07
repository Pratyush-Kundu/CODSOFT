
package atminterface;

import atminterface.BankAccount;


public class NewJFrame extends javax.swing.JFrame {

    private BankAccount userAccount;
    public NewJFrame() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        balancetf = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        nametf = new javax.swing.JTextField();
        cardno = new javax.swing.JTextField();
        cardpin = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(735, 450));

        jButton1.setBackground(new java.awt.Color(204, 204, 255));
        jButton1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 255));
        jButton1.setText("ENTER");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/atm.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("WELCOME TO ATM!!");

        jLabel3.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("ENTER YOUR NAME:");

        jLabel6.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("BALANCE:");

        jLabel4.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("ATM CARD NUMBER:");

        balancetf.setEditable(false);
        balancetf.setFont(new java.awt.Font("Palatino Linotype", 1, 18)); // NOI18N
        balancetf.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jButton2.setBackground(new java.awt.Color(204, 204, 255));
        jButton2.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 255));
        jButton2.setText("NEXT");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("ATM CARD PIN:");

        nametf.setFont(new java.awt.Font("Perpetua Titling MT", 1, 14)); // NOI18N
        nametf.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cardno.setFont(new java.awt.Font("Perpetua Titling MT", 1, 14)); // NOI18N
        cardno.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cardpin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cardpin.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(balancetf)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(jLabel6)))
                        .addGap(60, 60, 60))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 194, Short.MAX_VALUE)
                                .addComponent(jButton1)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2)
                                .addGap(20, 20, 20))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cardpin)
                                    .addComponent(cardno, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                                    .addComponent(nametf))))
                        .addGap(52, 52, 52))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel2)
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(nametf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(cardno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(cardpin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(balancetf, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2))))
                .addGap(10, 10, 10))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
          // Code to handle the "ENTER" button click
        String name = nametf.getText();
        String cardNumber = cardno.getText();
        String pin = cardpin.getText();

        // Validate inputs
        if (name.isEmpty() || cardNumber.isEmpty() || pin.isEmpty()) {
            System.out.println("Please enter all fields.");
            return;
        }

        // Assume a method to validate the card number and PIN
        if (!validateCard(cardNumber, pin)) {
            System.out.println("Invalid card number or PIN.");
            return;
        }

        // Create the user's bank account
        userAccount = new BankAccount(name, cardNumber);

        // Display balance
        balancetf.setText(String.valueOf(userAccount.getBalance()));
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
       // Code to handle the "NEXT" button click
        if (userAccount == null) {
            System.out.println("Please enter your details first.");
            return;
        }

        // Open the next JFrame (Transaction)
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TRANSACTIONS(userAccount).setVisible(true);
            }
        });
        this.dispose(); 

    }//GEN-LAST:event_jButton2MouseClicked

  
    private boolean validateCard(String cardNumber, String pin) {
        // Method to validate the card number and PIN
        
        return true; 
    }


   public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField balancetf;
    private javax.swing.JTextField cardno;
    private javax.swing.JPasswordField cardpin;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField nametf;
    // End of variables declaration//GEN-END:variables
}
