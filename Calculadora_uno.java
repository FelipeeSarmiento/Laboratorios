
package calculadora;
/**
 *
 * @author soloj
 */
public class Calculadora_uno extends javax.swing.JFrame {
    
 Metodos metodox=new Metodos();

    /**
     * Creates new form Calculadora_uno
     */
    public Calculadora_uno() {
        initComponents();
        
        this.setLocationRelativeTo(null);
   
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt = new javax.swing.JTextField();
        btn_1 = new javax.swing.JButton();
        btn_2 = new javax.swing.JButton();
        btn_3 = new javax.swing.JButton();
        btn_4 = new javax.swing.JButton();
        btn_5 = new javax.swing.JButton();
        btn_6 = new javax.swing.JButton();
        btn_7 = new javax.swing.JButton();
        btn_8 = new javax.swing.JButton();
        btn_9 = new javax.swing.JButton();
        btn_0 = new javax.swing.JButton();
        btn_punto = new javax.swing.JButton();
        btn_igual = new javax.swing.JButton();
        btn_mas = new javax.swing.JButton();
        btn_menos = new javax.swing.JButton();
        btn_multiplicacion = new javax.swing.JButton();
        btn_division = new javax.swing.JButton();
        btn_seno = new javax.swing.JButton();
        btn_coseno = new javax.swing.JButton();
        btn_tangente = new javax.swing.JButton();
        btn_raiz = new javax.swing.JButton();
        btn_alapotencia = new javax.swing.JButton();
        botoniva = new javax.swing.JButton();
        botonreset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txt.setBackground(new java.awt.Color(153, 153, 153));

        btn_1.setText("1");
        btn_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_1MouseClicked(evt);
            }
        });

        btn_2.setText("2");
        btn_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_2MouseClicked(evt);
            }
        });

        btn_3.setText("3");
        btn_3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_3MouseClicked(evt);
            }
        });

        btn_4.setText("4");
        btn_4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_4MouseClicked(evt);
            }
        });
        btn_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_4ActionPerformed(evt);
            }
        });

        btn_5.setText("5");
        btn_5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_5MouseClicked(evt);
            }
        });

        btn_6.setText("6");
        btn_6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_6MouseClicked(evt);
            }
        });

        btn_7.setText("7");
        btn_7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_7MouseClicked(evt);
            }
        });
        btn_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_7ActionPerformed(evt);
            }
        });

        btn_8.setText("8");
        btn_8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_8MouseClicked(evt);
            }
        });

        btn_9.setText("9");
        btn_9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_9MouseClicked(evt);
            }
        });
        btn_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_9ActionPerformed(evt);
            }
        });

        btn_0.setText("0");
        btn_0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_0MouseClicked(evt);
            }
        });

        btn_punto.setText(".");
        btn_punto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_puntoMouseClicked(evt);
            }
        });

        btn_igual.setText("=");
        btn_igual.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_igualMouseClicked(evt);
            }
        });

        btn_mas.setText("+");
        btn_mas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_masMouseClicked(evt);
            }
        });

        btn_menos.setText("-");
        btn_menos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_menosMouseClicked(evt);
            }
        });

        btn_multiplicacion.setText("*");
        btn_multiplicacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_multiplicacionMouseClicked(evt);
            }
        });

        btn_division.setText("/");
        btn_division.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_divisionMouseClicked(evt);
            }
        });

        btn_seno.setBackground(new java.awt.Color(255, 255, 153));
        btn_seno.setText("sin");
        btn_seno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_senoMouseClicked(evt);
            }
        });

        btn_coseno.setBackground(new java.awt.Color(255, 255, 153));
        btn_coseno.setText("cos");
        btn_coseno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_cosenoMouseClicked(evt);
            }
        });

        btn_tangente.setBackground(new java.awt.Color(255, 255, 153));
        btn_tangente.setText("tan");
        btn_tangente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_tangenteMouseClicked(evt);
            }
        });

        btn_raiz.setBackground(new java.awt.Color(255, 255, 153));
        btn_raiz.setText("raiz");
        btn_raiz.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_raizMouseClicked(evt);
            }
        });

        btn_alapotencia.setBackground(new java.awt.Color(255, 255, 153));
        btn_alapotencia.setText("x^y");
        btn_alapotencia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_alapotenciaMouseClicked(evt);
            }
        });

        botoniva.setBackground(new java.awt.Color(255, 255, 153));
        botoniva.setText("iva");
        botoniva.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonivaMouseClicked(evt);
            }
        });

        botonreset.setBackground(new java.awt.Color(255, 255, 153));
        botonreset.setText("C");
        botonreset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonresetMouseClicked(evt);
            }
        });
        botonreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonresetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_division)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_seno, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(btn_0)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_punto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_igual)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_mas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botonreset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn_4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_multiplicacion))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn_7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_menos)))
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_coseno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn_tangente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_alapotencia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btn_raiz))
                            .addComponent(botoniva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(16, 16, 16))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(txt, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_1)
                    .addComponent(btn_2)
                    .addComponent(btn_3)
                    .addComponent(btn_seno)
                    .addComponent(btn_alapotencia)
                    .addComponent(btn_division))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_4)
                    .addComponent(btn_5)
                    .addComponent(btn_6)
                    .addComponent(btn_coseno)
                    .addComponent(btn_multiplicacion)
                    .addComponent(btn_raiz))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_7)
                    .addComponent(btn_8)
                    .addComponent(btn_9)
                    .addComponent(btn_tangente)
                    .addComponent(btn_menos)
                    .addComponent(botoniva))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_0)
                    .addComponent(btn_punto)
                    .addComponent(btn_igual)
                    .addComponent(btn_mas)
                    .addComponent(botonreset))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_1MouseClicked

        txt.setText(metodox.unir("1"));
    }//GEN-LAST:event_btn_1MouseClicked

    private void btn_2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_2MouseClicked
 txt.setText(metodox.unir("2"));          
    }//GEN-LAST:event_btn_2MouseClicked

    private void btn_3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_3MouseClicked
        txt.setText(metodox.unir("3"));
    }//GEN-LAST:event_btn_3MouseClicked

    private void btn_4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_4MouseClicked
 txt.setText(metodox.concatenamiento("4"));    }//GEN-LAST:event_btn_4MouseClicked

    private void btn_5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_5MouseClicked
        txt.setText(metodox.unir("5"));
    }//GEN-LAST:event_btn_5MouseClicked

    private void btn_6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_6MouseClicked
        txt.setText(metodox.unir("6"));// TODO add your handling code here:
    }//GEN-LAST:event_btn_6MouseClicked

    private void btn_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_7ActionPerformed

    private void btn_7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_7MouseClicked
      txt.setText(metodox.unir("7")); // TODO add your handling code here:
    }//GEN-LAST:event_btn_7MouseClicked

    private void btn_8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_8MouseClicked
        txt.setText(metodox.unir("8")); // TODO add your handling code here:
    }//GEN-LAST:event_btn_8MouseClicked

    private void btn_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_9ActionPerformed

    private void btn_9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_9MouseClicked
       txt.setText(metodox.unir("9")); // TODO add your handling code here:
    }//GEN-LAST:event_btn_9MouseClicked

    private void btn_0MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_0MouseClicked
     txt.setText(metodox.unir("0"));  // TODO add your handling code here:
    }//GEN-LAST:event_btn_0MouseClicked

    private void btn_puntoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_puntoMouseClicked
     txt.setText(metodox.unir(".")); // TODO add your handling code here:
    }//GEN-LAST:event_btn_puntoMouseClicked

    private void btn_igualMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_igualMouseClicked
          txt.setText(""+metodox.resultado(txt.getText()));      
    }//GEN-LAST:event_btn_igualMouseClicked

    private void btn_masMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_masMouseClicked
       metodox.suma(txt.getText());
    }//GEN-LAST:event_btn_masMouseClicked

    private void btn_menosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_menosMouseClicked
    metodox.resta(txt.getText());
    }//GEN-LAST:event_btn_menosMouseClicked

    private void btn_multiplicacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_multiplicacionMouseClicked
     metodox.multiplicacion(txt.getText()); // TODO add your handling code here:
    }//GEN-LAST:event_btn_multiplicacionMouseClicked

    private void btn_divisionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_divisionMouseClicked
     metodox.division(txt.getText()); // TODO add your handling code here:
    }//GEN-LAST:event_btn_divisionMouseClicked

    private void btn_senoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_senoMouseClicked
     metodox.seno(txt.getText());
    }//GEN-LAST:event_btn_senoMouseClicked

    private void btn_cosenoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cosenoMouseClicked
     metodox.coseno(txt.getText());  // TODO add your handling code here:
    }//GEN-LAST:event_btn_cosenoMouseClicked

    private void btn_tangenteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_tangenteMouseClicked
      metodox.tangente(txt.getText()); // TODO add your handling code here:
    }//GEN-LAST:event_btn_tangenteMouseClicked

    private void btn_raizMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_raizMouseClicked
       metodox.raiz(txt.getText()); // TODO add your handling code here:
    }//GEN-LAST:event_btn_raizMouseClicked

    private void btn_alapotenciaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_alapotenciaMouseClicked
metodox.alapotencia(txt.getText());
       
    }//GEN-LAST:event_btn_alapotenciaMouseClicked

    private void botonivaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonivaMouseClicked
metodox.iva(txt.getText());        // TODO add your handling code here:
    }//GEN-LAST:event_botonivaMouseClicked

    private void botonresetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonresetMouseClicked
metodox.reset(txt.getText());        // TODO add your handling code here:
    }//GEN-LAST:event_botonresetMouseClicked

    private void botonresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonresetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonresetActionPerformed

    private void btn_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_4ActionPerformed

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
            java.util.logging.Logger.getLogger(Calculadora_uno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora_uno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora_uno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora_uno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora_uno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botoniva;
    private javax.swing.JButton botonreset;
    private javax.swing.JButton btn_0;
    private javax.swing.JButton btn_1;
    private javax.swing.JButton btn_2;
    private javax.swing.JButton btn_3;
    private javax.swing.JButton btn_4;
    private javax.swing.JButton btn_5;
    private javax.swing.JButton btn_6;
    private javax.swing.JButton btn_7;
    private javax.swing.JButton btn_8;
    private javax.swing.JButton btn_9;
    private javax.swing.JButton btn_alapotencia;
    private javax.swing.JButton btn_coseno;
    private javax.swing.JButton btn_division;
    private javax.swing.JButton btn_igual;
    private javax.swing.JButton btn_mas;
    private javax.swing.JButton btn_menos;
    private javax.swing.JButton btn_multiplicacion;
    private javax.swing.JButton btn_punto;
    private javax.swing.JButton btn_raiz;
    private javax.swing.JButton btn_seno;
    private javax.swing.JButton btn_tangente;
    private javax.swing.JTextField txt;
    // End of variables declaration//GEN-END:variables
}