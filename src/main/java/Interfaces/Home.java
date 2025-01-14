/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
C:\Users\Mandelli\Documents\NetBeansProjects\yay\src\main\java\Dados\msgs.csv
 */
package Interfaces;


import Dados.Csv;
import java.awt.Color;
import java.util.List;
import msg.mensagemauto.AdminForever;


/**
 *
 * @author Mandelli
 */
public class Home extends javax.swing.JFrame {

    private static final long serialVersionUID = 1L;
    boolean firstTime = true;
    public int posMensagem = 0;
    public static String caminho = "";
    boolean onOff = false;
    Thread thread = new Thread(adm);
    public List<String[]> dados;
    /**
     * Creates new form Hoome
     */
    public Home() {
        initComponents();
        demonstraStatus.setBackground(Color.red);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        editarMensagem2 = new javax.swing.JButton();
        ligaDesliga2 = new javax.swing.JButton();
        status = new javax.swing.JLabel();
        demonstraStatus = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        reconectar = new javax.swing.JCheckBox();
        csv = new javax.swing.JButton();
        csvCaminho = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        editarMensagem2.setBackground(new java.awt.Color(51, 51, 51));
        editarMensagem2.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        editarMensagem2.setForeground(new java.awt.Color(255, 255, 255));
        editarMensagem2.setText("Editar msg");
        editarMensagem2.setBorder(null);
        editarMensagem2.setBorderPainted(false);
        editarMensagem2.setContentAreaFilled(false);
        editarMensagem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarMensagem2ActionPerformed(evt);
            }
        });

        ligaDesliga2.setBackground(new java.awt.Color(51, 51, 51));
        ligaDesliga2.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        ligaDesliga2.setForeground(new java.awt.Color(255, 255, 255));
        ligaDesliga2.setText("ON/OFF");
        ligaDesliga2.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.lightGray));
        ligaDesliga2.setBorderPainted(false);
        ligaDesliga2.setContentAreaFilled(false);
        ligaDesliga2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ligaDesliga2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ligaDesliga2ActionPerformed(evt);
            }
        });

        status.setFont(new java.awt.Font("SimSun", 0, 24)); // NOI18N
        status.setForeground(new java.awt.Color(255, 255, 255));
        status.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        status.setText("DESLIGADO");
        status.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                statuswtd(evt);
            }
        });

        demonstraStatus.setBackground(new java.awt.Color(255, 51, 0));
        demonstraStatus.setForeground(new java.awt.Color(102, 255, 0));

        javax.swing.GroupLayout demonstraStatusLayout = new javax.swing.GroupLayout(demonstraStatus);
        demonstraStatus.setLayout(demonstraStatusLayout);
        demonstraStatusLayout.setHorizontalGroup(
            demonstraStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 36, Short.MAX_VALUE)
        );
        demonstraStatusLayout.setVerticalGroup(
            demonstraStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("l");

        reconectar.setFont(new java.awt.Font("Sitka Banner", 0, 10)); // NOI18N
        reconectar.setForeground(new java.awt.Color(255, 255, 255));
        reconectar.setText("Reconectar?");
        reconectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reconectarActionPerformed(evt);
            }
        });

        csv.setBackground(new java.awt.Color(51, 51, 51));
        csv.setFont(new java.awt.Font("Sitka Banner", 0, 12)); // NOI18N
        csv.setForeground(new java.awt.Color(255, 255, 255));
        csv.setText("CSV");
        csv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                csvActionPerformed(evt);
            }
        });

        csvCaminho.setBackground(new java.awt.Color(51, 51, 51));
        csvCaminho.setForeground(new java.awt.Color(255, 255, 255));
        csvCaminho.setText("Digite aqui o Caminho para o CSV");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(reconectar))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(csv))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(ligaDesliga2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(editarMensagem2))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(demonstraStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(36, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(csvCaminho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(demonstraStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(status, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(editarMensagem2)
                    .addComponent(ligaDesliga2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(csvCaminho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(csv)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(reconectar))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void statuswtd(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_statuswtd
        // TODO add your handling code here:
    }//GEN-LAST:event_statuswtd

    private void ligaDesliga2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ligaDesliga2ActionPerformed
        // TODO add your handling code here:
        if(Csv.sreaderCsvIsPossible(caminho)){
            if(firstTime){
                thread.start();
                firstTime = false;
            }
            Telas.monitoria.setVisible(true);
            onOFF();
        }else{
            Telas.falha.setVisible(true);
        }
    }//GEN-LAST:event_ligaDesliga2ActionPerformed
    
    private void onOFF(){
        if(!onOff){
            status.setText("LIGADO");
            onOff = true;
            adm.ligado = true;
            demonstraStatus.setBackground(Color.green);
            
        }else{
            status.setText("DESLIGADO");
            onOff = false;
            adm.ligado = false;
            demonstraStatus.setBackground(Color.red);
        }
    }
    
    public void sleep() throws InterruptedException{
        thread.wait(30000);
        
    }

    private void editarMensagem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarMensagem2ActionPerformed
        // TODO add your handling code here:
        if(onOff)onOFF();
        Telas.select.setVisible(true);
        Telas.select.fillBox();
        
    }//GEN-LAST:event_editarMensagem2ActionPerformed

    private void csvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_csvActionPerformed
        // TODO add your handling code here:
        caminho = csvCaminho.getText();
        Csv.sPureWriterCSV(caminho);
        adm.refresh = true;
    }//GEN-LAST:event_csvActionPerformed

    private void reconectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reconectarActionPerformed
        // TODO add your handling code here:
        adm.reconnect();
    }//GEN-LAST:event_reconectarActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton csv;
    private javax.swing.JTextField csvCaminho;
    private javax.swing.JPanel demonstraStatus;
    private static javax.swing.JButton editarMensagem2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton ligaDesliga2;
    private static javax.swing.JCheckBox reconectar;
    private javax.swing.JLabel status;
    // End of variables declaration//GEN-END:variables
}
