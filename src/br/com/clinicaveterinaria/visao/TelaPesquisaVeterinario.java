package br.com.clinicaveterinaria.visao;

import br.com.clinicaveterinaria.controle.VeterinarioControle;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TelaPesquisaVeterinario extends javax.swing.JFrame {

    public TelaPesquisaVeterinario() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtNomeVet = new javax.swing.JTextField();
        bntPesquisar = new javax.swing.JButton();
        bntAtualizar = new javax.swing.JButton();
        bntExcluir = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisar"));

        jLabel2.setText("Veterinario:");

        txtNomeVet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeVetActionPerformed(evt);
            }
        });

        bntPesquisar.setText("Pesquisar");
        bntPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntPesquisarActionPerformed(evt);
            }
        });

        bntAtualizar.setText("Atualizar");
        bntAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntAtualizarActionPerformed(evt);
            }
        });

        bntExcluir.setText("Excluir");
        bntExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNomeVet, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(bntPesquisar)
                        .addGap(18, 18, 18)
                        .addComponent(bntAtualizar)
                        .addGap(20, 20, 20)
                        .addComponent(bntExcluir)))
                .addContainerGap(198, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {bntAtualizar, bntExcluir, bntPesquisar});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNomeVet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bntPesquisar)
                    .addComponent(bntAtualizar)
                    .addComponent(bntExcluir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {bntAtualizar, bntExcluir, bntPesquisar});

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID ", "CRMV", "Nome", "Telefone", "CPF"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tabela);
        tabela.getColumnModel().getColumn(0).setMinWidth(0);
        tabela.getColumnModel().getColumn(0).setMaxWidth(0);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 589, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeVetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeVetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeVetActionPerformed

    private void bntAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntAtualizarActionPerformed
        VeterinarioControle vetControle = new VeterinarioControle();
        
        //Atualizando dados do veterinario pelo id do mesmo que foi selecionado 
        DefaultTableModel tabelaVet = (DefaultTableModel) tabela.getModel();
        
        String nome = (String) tabelaVet.getValueAt(tabela.getSelectedRow(),2);
        String crmv = (String) tabelaVet.getValueAt(tabela.getSelectedRow(),1);
        String cpf = (String) tabelaVet.getValueAt(tabela.getSelectedRow(),4);
        String telefone = (String) tabelaVet.getValueAt(tabela.getSelectedRow(),3);
        
        int id = (int)tabela.getValueAt(tabela.getSelectedRow(),0);
        
        vetControle.atualizarVeterinario(id,nome,crmv, cpf, telefone);
        tabela.getColumnModel().getColumn(0).setMinWidth(0);
        
        
    }//GEN-LAST:event_bntAtualizarActionPerformed

    private void bntExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntExcluirActionPerformed

        VeterinarioControle vetC = new VeterinarioControle();
        
        //Excluido dado do veterinario pelo id do mesmo, que foi selecionando na tabela
        
        if (tabela.getSelectedRow() == -1){
            JOptionPane.showMessageDialog(null,"Selecione um veterinario na tabela ");            
        }else{
            int id = (int) tabela.getValueAt(tabela.getSelectedRow(), 0);
            vetC.apagarVeterinario(id);     
        }
    }//GEN-LAST:event_bntExcluirActionPerformed

    private void bntPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntPesquisarActionPerformed
        VeterinarioControle vetControle = new VeterinarioControle();
        
        //Pesquisa realizado usando o nome do veterinariio
        DefaultTableModel tabelaVet = (DefaultTableModel) tabela.getModel();
        int n =tabelaVet.getRowCount();
        for (int i = 0 ;i< n;i++){
            tabelaVet.removeRow(0);
        }
        

    /*    
    if (txtNomeVet.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Campo de texto Obrigatório");
        }else{       
        
             Object[] nomes = {vetControle.pesquisarVeterinario(txtNomeVet.getText()).get(0),
                vetControle.pesquisarVeterinario(txtNomeVet.getText()).get(2),
                vetControle.pesquisarVeterinario(txtNomeVet.getText()).get(1),
                vetControle.pesquisarVeterinario(txtNomeVet.getText()).get(4),
                vetControle.pesquisarVeterinario(txtNomeVet.getText()).get(3)};
             tabelaVet.addRow(nomes);    }//GEN-LAST:event_bntPesquisarActionPerformed
    */
     tabela.setModel(vetControle.pesquisarVeterinarioTabela(txtNomeVet.getText(), tabelaVet));
     }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPesquisaVeterinario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPesquisaVeterinario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPesquisaVeterinario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPesquisaVeterinario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPesquisaVeterinario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntAtualizar;
    private javax.swing.JButton bntExcluir;
    private javax.swing.JButton bntPesquisar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabela;
    private javax.swing.JTextField txtNomeVet;
    // End of variables declaration//GEN-END:variables
}
