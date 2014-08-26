package Visual;

import DAL.ConectaDB;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class fjfCadastroProdutos extends javax.swing.JFrame {

    Connection con = null;
    PreparedStatement pst = null;
    

    public fjfCadastroProdutos() throws ClassNotFoundException {
        initComponents();
        this.setLocationRelativeTo(null);
        con = ConectaDB.conectadb();
    }

    /**
     *
     */
    public void cadastrarProdutos(){
        
        String sql = "Insert into produtos(produto,anomodelo,descricao,precocusto,precovenda) values(?,?,?,?,?)";
        try{
            pst = con.prepareStatement(sql);
            pst.setString(1,jtfProduto.getText());
            pst.setString(2,jtfAnomodelo.getText());
            pst.setString(3,jtfDescricao.getText());
            pst.setString(4,jtfPrecocusto.getText());
            pst.setString(5,jtfPrecovenda.getText());

            
            pst.execute();
            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!","Cadastrado com sucesso",JOptionPane.INFORMATION_MESSAGE);
        }
        catch(SQLException error){
            JOptionPane.showMessageDialog(null,error);
        }
            
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlTitulo = new javax.swing.JLabel();
        jlProduto = new javax.swing.JLabel();
        jlAnomodelo = new javax.swing.JLabel();
        jlDescricao = new javax.swing.JLabel();
        jlPrecocusto = new javax.swing.JLabel();
        jlPrecovenda = new javax.swing.JLabel();
        jtfProduto = new javax.swing.JTextField();
        jtfAnomodelo = new javax.swing.JTextField();
        jtfDescricao = new javax.swing.JTextField();
        jtfPrecocusto = new javax.swing.JTextField();
        jtfPrecovenda = new javax.swing.JTextField();
        jbCadastrar = new javax.swing.JButton();
        jbLimpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Peças");

        jlTitulo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlTitulo.setText("Cadastro de Produtos");

        jlProduto.setText("Produto:");

        jlAnomodelo.setText("Ano/Modelo de carros compátiveis:");

        jlDescricao.setText("Descrição:");

        jlPrecocusto.setText("Preço de custo:");
        jlPrecocusto.setToolTipText("");

        jlPrecovenda.setText("Preço de venda:");

        jbCadastrar.setText("Cadastrar Produto");
        jbCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCadastrarActionPerformed(evt);
            }
        });

        jbLimpar.setText("Limpar Campos");
        jbLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79)
                        .addComponent(jbCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlProduto)
                            .addComponent(jlAnomodelo)
                            .addComponent(jlDescricao)
                            .addComponent(jlPrecocusto)
                            .addComponent(jlPrecovenda))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlTitulo)
                            .addComponent(jtfProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfAnomodelo, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfPrecocusto, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfPrecovenda, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jlTitulo)
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlProduto)
                    .addComponent(jtfProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlAnomodelo)
                    .addComponent(jtfAnomodelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlDescricao)
                    .addComponent(jtfDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlPrecocusto)
                    .addComponent(jtfPrecocusto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlPrecovenda)
                    .addComponent(jtfPrecovenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbCadastrar)
                    .addComponent(jbLimpar))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimparActionPerformed
        jtfProduto.setText("");                 //Função do Botão Limpar: Zerar todos os campos de texto vide linha 120 até 124
        jtfAnomodelo.setText("");                //Para inserir + linhas ou váriáveis editar estas também.
        jtfDescricao.setText("");
        jtfPrecocusto.setText("");
        jtfPrecovenda.setText("");
    }//GEN-LAST:event_jbLimparActionPerformed

    private void jbCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCadastrarActionPerformed
        cadastrarProdutos();
    }//GEN-LAST:event_jbCadastrarActionPerformed


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
            java.util.logging.Logger.getLogger(fjfCadastroProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fjfCadastroProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fjfCadastroProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fjfCadastroProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new fjfCadastroProdutos().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(fjfCadastroProdutos.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbCadastrar;
    private javax.swing.JButton jbLimpar;
    private javax.swing.JLabel jlAnomodelo;
    private javax.swing.JLabel jlDescricao;
    private javax.swing.JLabel jlPrecocusto;
    private javax.swing.JLabel jlPrecovenda;
    private javax.swing.JLabel jlProduto;
    private javax.swing.JLabel jlTitulo;
    private javax.swing.JTextField jtfAnomodelo;
    private javax.swing.JTextField jtfDescricao;
    private javax.swing.JTextField jtfPrecocusto;
    private javax.swing.JTextField jtfPrecovenda;
    private javax.swing.JTextField jtfProduto;
    // End of variables declaration//GEN-END:variables
}
