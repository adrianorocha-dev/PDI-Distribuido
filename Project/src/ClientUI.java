/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Patrick
 */
public class ClientUI extends javax.swing.JFrame {

        /**
         *
         */
        private static final long serialVersionUID = -8655163302487449966L;

        private File selectetFile = null;
        static AppInterface appServer = null;

        /**
         * Creates new form Telinha
         */
        public ClientUI() {
                initComponents();
        }

        /**
         * This method is called from within the constructor to initialize the form.
         * WARNING: Do NOT modify this code. The content of this method is always
         * regenerated by the Form Editor.
         */
        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated
        // Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                botaoAplicar = new javax.swing.JButton();
                botaoSelecionarArquivo = new javax.swing.JButton();
                original = new javax.swing.JPanel();
                filtro = new javax.swing.JPanel();
                jLabel1 = new javax.swing.JLabel();
                jLabel2 = new javax.swing.JLabel();
                jScrollPane1 = new javax.swing.JScrollPane();
                log = new javax.swing.JTextArea();
                jLabel3 = new javax.swing.JLabel();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                botaoAplicar.setText("Aplicar");
                botaoAplicar.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                botaoAplicarActionPerformed(evt);
                        }
                });

                botaoSelecionarArquivo.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                botaoSelecionarArquivoActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout originalLayout = new javax.swing.GroupLayout(original);
                original.setLayout(originalLayout);
                originalLayout.setHorizontalGroup(
                                originalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGap(0,
                                                209, Short.MAX_VALUE));
                originalLayout.setVerticalGroup(
                                originalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGap(0,
                                                203, Short.MAX_VALUE));

                javax.swing.GroupLayout filtroLayout = new javax.swing.GroupLayout(filtro);
                filtro.setLayout(filtroLayout);
                filtroLayout.setHorizontalGroup(
                                filtroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGap(0,
                                                189, Short.MAX_VALUE));
                filtroLayout.setVerticalGroup(
                                filtroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGap(0,
                                                208, Short.MAX_VALUE));

                jLabel1.setText("Original: ");

                jLabel2.setText("Filtro:");

                log.setColumns(20);
                log.setRows(5);
                jScrollPane1.setViewportView(log);

                jLabel3.setText("Status:");

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup().addGap(61, 61, 61).addGroup(layout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addComponent(original,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(filtro,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE))
                                                .addGroup(layout.createSequentialGroup().addGap(72, 72, 72)
                                                                .addComponent(jLabel1)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addComponent(jLabel2).addGap(195, 195, 195))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout
                                                                .createSequentialGroup()
                                                                .addComponent(botaoSelecionarArquivo,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                253,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addComponent(botaoAplicar).addGap(101, 101, 101))
                                                .addGroup(layout.createSequentialGroup().addGroup(layout
                                                                .createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(jLabel3).addComponent(jScrollPane1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                479,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(0, 68, Short.MAX_VALUE)))));
                layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup().addGap(52, 52, 52).addGroup(layout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(botaoSelecionarArquivo,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 23,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(botaoAplicar)).addGap(40, 40, 40)
                                                .addGroup(layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(jLabel1).addComponent(jLabel2))
                                                .addGap(14, 14, 14)
                                                .addGroup(layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(original,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(filtro,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel3).addGap(13, 13, 13)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 69,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(17, Short.MAX_VALUE)));

                pack();
        }// </editor-fold>//GEN-END:initComponents

        private void botaoAplicarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_botaoAplicarActionPerformed
                if (selectetFile != null) {
                        try {
                                BufferedImage bufferedImage = ImageIO.read(selectetFile);

                                Graphics g = original.getGraphics();
                                g.drawImage(bufferedImage, 0, 0, null);

                                ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
                                ImageIO.write(bufferedImage, "jpg", byteOut);
                                
                                byte[] img = byteOut.toByteArray();
                                byte[] fImg = appServer.applyFilter(img);
                                BufferedImage filterImage = ImageIO.read(new ByteArrayInputStream(fImg));

                                filtro.getGraphics().drawImage(filterImage, 0, 0, null);

                        } catch (IOException e) {
                                e.printStackTrace();
                        }

                } else {
                        JOptionPane.showMessageDialog(this, "Nenhum arquivo selecionado!", "Erro", JOptionPane.ERROR_MESSAGE);
                }
        }// GEN-LAST:event_botaoAplicarActionPerformed

        private void botaoSelecionarArquivoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_botaoSelecionarArquivoActionPerformed
                // TODO add your handling code here:
                JFileChooser jfc = new JFileChooser();

                int returnVal = jfc.showOpenDialog(ClientUI.this);

                if (returnVal == JFileChooser.APPROVE_OPTION) {
                        selectetFile = jfc.getSelectedFile();
                } else {
                        selectetFile = null;
                }

        }// GEN-LAST:event_botaoSelecionarArquivoActionPerformed

        /**
         * @param args the command line arguments
         */
        public static void main(String args[]) {
                /* Set the Nimbus look and feel */
                // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
                // (optional) ">
                /*
                 * If Nimbus (introduced in Java SE 6) is not available, stay with the default
                 * look and feel. For details see
                 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
                 */

                try {
                        if (appServer == null) appServer = (AppInterface) Naming.lookup("rmi://192.168.43.125/AppServer");
                } catch (MalformedURLException | RemoteException | NotBoundException e) {
                        e.printStackTrace();
                }

                try {
                        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager
                                        .getInstalledLookAndFeels()) {
                                if ("Nimbus".equals(info.getName())) {
                                        javax.swing.UIManager.setLookAndFeel(info.getClassName());
                                        break;
                                }
                        }
                } catch (ClassNotFoundException ex) {
                        java.util.logging.Logger.getLogger(ClientUI.class.getName()).log(java.util.logging.Level.SEVERE,
                                        null, ex);
                } catch (InstantiationException ex) {
                        java.util.logging.Logger.getLogger(ClientUI.class.getName()).log(java.util.logging.Level.SEVERE,
                                        null, ex);
                } catch (IllegalAccessException ex) {
                        java.util.logging.Logger.getLogger(ClientUI.class.getName()).log(java.util.logging.Level.SEVERE,
                                        null, ex);
                } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                        java.util.logging.Logger.getLogger(ClientUI.class.getName()).log(java.util.logging.Level.SEVERE,
                                        null, ex);
                }
                // </editor-fold>

                /* Create and display the form */
                java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                                new ClientUI().setVisible(true);
                        }
                });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoAplicar;
    private javax.swing.JButton botaoSelecionarArquivo;
    private javax.swing.JPanel filtro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea log;
    private javax.swing.JPanel original;
    // End of variables declaration//GEN-END:variables
}
