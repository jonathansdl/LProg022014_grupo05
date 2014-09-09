package Principal;

import Produtos.ProdutoGui;
import Clientes.ClienteGui;

/**
 *
 * @author TheYazanagi
 */
public class Principal extends javax.swing.JFrame {
    private ClienteGui ClienteGui;
    


    public Principal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLlogo = new javax.swing.JLabel();
        jbClientes = new javax.swing.JButton();
        jbProdutos = new javax.swing.JButton();
        jbPedidos = new javax.swing.JButton();
        jbSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Home - Projeto AutoPeças Grupo05");

        jLlogo.setIcon(new javax.swing.ImageIcon("D:\\Arquivos Trabalho\\icones\\logo.png")); // NOI18N

        jbClientes.setIcon(new javax.swing.ImageIcon("D:\\Arquivos Trabalho\\icones\\Icones\\user_edit.png")); // NOI18N
        jbClientes.setText("Clientes");
        jbClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbClientesActionPerformed(evt);
            }
        });

        jbProdutos.setIcon(new javax.swing.ImageIcon("D:\\Arquivos Trabalho\\icones\\Icones\\image_edit.png")); // NOI18N
        jbProdutos.setText("Produtos");
        jbProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbProdutosActionPerformed(evt);
            }
        });

        jbPedidos.setIcon(new javax.swing.ImageIcon("D:\\Arquivos Trabalho\\icones\\Icones\\page_edit.png")); // NOI18N
        jbPedidos.setText("Pedidos");
        jbPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPedidosActionPerformed(evt);
            }
        });

        jbSair.setIcon(new javax.swing.ImageIcon("D:\\Arquivos Trabalho\\icones\\Icones\\cancel.png")); // NOI18N
        jbSair.setText("Sair");
        jbSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jbClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbSair, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(jLlogo)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbSair, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(jLlogo)
                .addGap(86, 86, 86))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbClientesActionPerformed
        ClienteGui form = new ClienteGui();
        form.setVisible(true);
    }//GEN-LAST:event_jbClientesActionPerformed

    private void jbProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbProdutosActionPerformed
        ProdutoGui form = new ProdutoGui();
        form.setVisible(true);
    }//GEN-LAST:event_jbProdutosActionPerformed

    private void jbPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPedidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbPedidosActionPerformed

    private void jbSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jbSairActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLlogo;
    private javax.swing.JButton jbClientes;
    private javax.swing.JButton jbPedidos;
    private javax.swing.JButton jbProdutos;
    private javax.swing.JButton jbSair;
    // End of variables declaration//GEN-END:variables
}
