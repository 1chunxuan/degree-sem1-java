package fraction;

/**
 * FractionCalculator.java A client class that simulates a simple calculator.
 * @author Kat Tan
 * @version 1.0
 */
public class FractionCalculator extends javax.swing.JFrame {

  public FractionCalculator() {
    initComponents();
  }

  @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jbtAdd = new javax.swing.JButton();
        jbtSubtract = new javax.swing.JButton();
        jbtMultiply = new javax.swing.JButton();
        jbtDivide = new javax.swing.JButton();
        jtfNumerator1 = new javax.swing.JTextField();
        jtfNumerator2 = new javax.swing.JTextField();
        jtfDenominator1 = new javax.swing.JTextField();
        jtfDenominator2 = new javax.swing.JTextField();
        jtfResult = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Fraction Calculator");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Enter first fraction");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Enter second fraction");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("/");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("/");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Result:");

        jbtAdd.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jbtAdd.setText("+");
        jbtAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtAddActionPerformed(evt);
            }
        });

        jbtSubtract.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jbtSubtract.setText("-");
        jbtSubtract.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtSubtractActionPerformed(evt);
            }
        });

        jbtMultiply.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jbtMultiply.setText("*");
        jbtMultiply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtMultiplyActionPerformed(evt);
            }
        });

        jbtDivide.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jbtDivide.setText("/");
        jbtDivide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtDivideActionPerformed(evt);
            }
        });

        jtfNumerator1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtfNumerator1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfNumerator1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfNumerator1ActionPerformed(evt);
            }
        });

        jtfNumerator2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtfNumerator2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfNumerator2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfNumerator2ActionPerformed(evt);
            }
        });

        jtfDenominator1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtfDenominator1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jtfDenominator2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtfDenominator2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfDenominator2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfDenominator2ActionPerformed(evt);
            }
        });

        jtfResult.setEditable(false);
        jtfResult.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jtfResult.setForeground(new java.awt.Color(0, 0, 153));
        jtfResult.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jbtAdd)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jbtSubtract, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jbtMultiply)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jbtDivide, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jtfNumerator1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jtfNumerator2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jtfDenominator2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jtfDenominator1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(14, 14, 14))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jtfResult))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfNumerator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfDenominator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfNumerator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfDenominator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtAdd)
                    .addComponent(jbtDivide)
                    .addComponent(jbtMultiply)
                    .addComponent(jbtSubtract))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfResult, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 90, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
  
  private void jbtAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtAddActionPerformed
//    double num1=Integer.parseInt(jtfNumerator1.getText());    
//    double num2=Integer.parseInt(jtfDenominator1.getText());    
//    
//    double number1=num1/num2;
//    String string1=Double.toString(number1);
//    
//    double num3=Integer.parseInt(jtfNumerator2.getText());    
//    double num4=Integer.parseInt(jtfDenominator2.getText()); 
//    
//    double number2=(double)num3/num4;
//    
//    double number3=number1+number2;
//    String string2=Double.toString(number3);
//    
//    jtfResult.setText(string2);
    int a=Integer.parseInt(jtfNumerator1.getText());
    int b=Integer.parseInt(jtfDenominator1.getText());
    FractionInterface f1=new Fraction(a,b);
    
    int c=Integer.parseInt(jtfNumerator2.getText());
    int d=Integer.parseInt(jtfDenominator2.getText());
    FractionInterface f2=new Fraction(c,d);
    FractionInterface f3=f1.add(f2);
    jtfResult.setText(f1+"+"+f2+"="+f3);
    
  }//GEN-LAST:event_jbtAddActionPerformed

  private void jbtSubtractActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtSubtractActionPerformed
    
  }//GEN-LAST:event_jbtSubtractActionPerformed

  private void jbtMultiplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtMultiplyActionPerformed
    
  }//GEN-LAST:event_jbtMultiplyActionPerformed

  private void jbtDivideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtDivideActionPerformed
    
  }//GEN-LAST:event_jbtDivideActionPerformed

    private void jtfNumerator1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNumerator1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfNumerator1ActionPerformed

    private void jtfNumerator2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNumerator2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfNumerator2ActionPerformed

    private void jtfDenominator2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfDenominator2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfDenominator2ActionPerformed

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
      java.util.logging.Logger.getLogger(FractionCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(FractionCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(FractionCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(FractionCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new FractionCalculator().setVisible(true);
      }
    });
  }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton jbtAdd;
    private javax.swing.JButton jbtDivide;
    private javax.swing.JButton jbtMultiply;
    private javax.swing.JButton jbtSubtract;
    private javax.swing.JTextField jtfDenominator1;
    private javax.swing.JTextField jtfDenominator2;
    private javax.swing.JTextField jtfNumerator1;
    private javax.swing.JTextField jtfNumerator2;
    private javax.swing.JTextField jtfResult;
    // End of variables declaration//GEN-END:variables
}