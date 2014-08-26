package Visual;

import DAL.ConectaDB;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class fjfCadastroClientes extends javax.swing.JFrame {

    Connection con = null;
    PreparedStatement pst = null;
    Resultset rs = null;    
    
    
    public fjfCadastroClientes() throws ClassNotFoundException {
        initComponents();
        this.setLocationRelativeTo(null);
        con = ConectaDB.conectadb();
    }


    public void cadastrarClientes(){
        
        String sql = "Insert into clientes(nome,cpf,telefone1,telefone2,endereco,complemento,cep,estado,cidade,carroscliente) values(?,?,?,?,?,?,?,?,?,?)";
        try{
            pst = con.prepareStatement(sql);
            pst.setString(1,jtfNome.getText());
            pst.setString(2,jtfCpf.getText());
            pst.setString(3,jtfTelefone1.getText());
            pst.setString(4,jtfTelefone2.getText());
            pst.setString(5,jtfEndereco.getText());
            pst.setString(6,jtfComplemento.getText());
            pst.setString(7,jtfCep.getText());
            pst.setString(8,jtfEstado.getText());
            pst.setString(9,jtfCidade.getText());
            pst.setString(10,jtfCarroscliente.getText());
            
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

        jlNome = new javax.swing.JLabel();
        jlCpf = new javax.swing.JLabel();
        jlEndereco = new javax.swing.JLabel();
        jlComplemento = new javax.swing.JLabel();
        jlCep = new javax.swing.JLabel();
        jlEstado = new javax.swing.JLabel();
        jlCidade = new javax.swing.JLabel();
        jlCarroscliente = new javax.swing.JLabel();
        jtfNome = new javax.swing.JTextField();
        jtfCpf = new javax.swing.JTextField();
        jtfEndereco = new javax.swing.JTextField();
        jtfComplemento = new javax.swing.JTextField();
        jtfCep = new javax.swing.JTextField();
        jtfEstado = new javax.swing.JTextField();
        jtfCidade = new javax.swing.JTextField();
        jtfCarroscliente = new javax.swing.JTextField();
        jlTitulo = new javax.swing.JLabel();
        jbCadastrar = new javax.swing.JButton();
        jbLimpar = new javax.swing.JButton();
        jtfTelefone2 = new javax.swing.JTextField();
        jlTelefone2 = new javax.swing.JLabel();
        jlTelefone1 = new javax.swing.JLabel();
        jtfTelefone1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Clientes");

        jlNome.setText("Nome:");

        jlCpf.setText("CPF/CNPJ:");

        jlEndereco.setText("Endereço:");

        jlComplemento.setText("Complemento:");

        jlCep.setText("CEP:");

        jlEstado.setText("Estado:");

        jlCidade.setText("Cidade:");

        jlCarroscliente.setText("Carros do Cliente:");

        jlTitulo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlTitulo.setText("Cadastro de Clientes");

        jbCadastrar.setText("Cadastrar Cliente");
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

        jlTelefone2.setText("Telefone 2:");

        jlTelefone1.setText("Telefone 1:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jbLimpar)
                            .addGap(48, 48, 48)
                            .addComponent(jbCadastrar))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jlNome)
                                .addComponent(jlCpf))
                            .addGap(59, 59, 59)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jlTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jtfCpf, javax.swing.GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE)
                                .addComponent(jtfNome))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlComplemento)
                                    .addComponent(jlCep)
                                    .addComponent(jlEstado)
                                    .addComponent(jlCidade)
                                    .addComponent(jlCarroscliente))
                                .addGap(24, 24, 24))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jlEndereco)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtfCarroscliente, javax.swing.GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE)
                            .addComponent(jtfCidade, javax.swing.GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE)
                            .addComponent(jtfEstado, javax.swing.GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE)
                            .addComponent(jtfCep, javax.swing.GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE)
                            .addComponent(jtfEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE)
                            .addComponent(jtfComplemento, javax.swing.GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlTelefone1)
                            .addComponent(jlTelefone2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtfTelefone2)
                            .addComponent(jtfTelefone1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jlTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNome)
                    .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlCpf)
                    .addComponent(jtfCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlTelefone1)
                    .addComponent(jtfTelefone1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlTelefone2)
                    .addComponent(jtfTelefone2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlEndereco))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlComplemento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlCep))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlEstado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlCidade))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfCarroscliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlCarroscliente))
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbCadastrar)
                    .addComponent(jbLimpar))
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimparActionPerformed
        jtfNome.setText("");            //Função do Botão Limpar: Zerar todos os campos de texto vide linha 221 até 230
        jtfCpf.setText("");             //Para inserir + linhas ou váriáveis editar estas também.
        jtfTelefone1.setText("");
        jtfTelefone2.setText("");
        jtfEndereco.setText("");
        jtfComplemento.setText("");
        jtfCep.setText("");
        jtfEstado.setText("");
        jtfCidade.setText("");
        jtfCarroscliente.setText("");
    }//GEN-LAST:event_jbLimparActionPerformed

    private void jbCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCadastrarActionPerformed
        cadastrarClientes();
        
        
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
            java.util.logging.Logger.getLogger(fjfCadastroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fjfCadastroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fjfCadastroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fjfCadastroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new fjfCadastroClientes().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(fjfCadastroClientes.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbCadastrar;
    private javax.swing.JButton jbLimpar;
    private javax.swing.JLabel jlCarroscliente;
    private javax.swing.JLabel jlCep;
    private javax.swing.JLabel jlCidade;
    private javax.swing.JLabel jlComplemento;
    private javax.swing.JLabel jlCpf;
    private javax.swing.JLabel jlEndereco;
    private javax.swing.JLabel jlEstado;
    private javax.swing.JLabel jlNome;
    private javax.swing.JLabel jlTelefone1;
    private javax.swing.JLabel jlTelefone2;
    private javax.swing.JLabel jlTitulo;
    private javax.swing.JTextField jtfCarroscliente;
    private javax.swing.JTextField jtfCep;
    private javax.swing.JTextField jtfCidade;
    private javax.swing.JTextField jtfComplemento;
    private javax.swing.JTextField jtfCpf;
    private javax.swing.JTextField jtfEndereco;
    private javax.swing.JTextField jtfEstado;
    private javax.swing.JTextField jtfNome;
    private javax.swing.JTextField jtfTelefone1;
    private javax.swing.JTextField jtfTelefone2;
    // End of variables declaration//GEN-END:variables

    private static class Resultset {

        public Resultset() {
        }
    }
}
