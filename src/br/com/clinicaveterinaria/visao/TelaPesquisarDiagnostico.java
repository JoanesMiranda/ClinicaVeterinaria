package br.com.clinicaveterinaria.visao;

import br.com.clinicaveterinaria.controle.DiagnosticoControle;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class TelaPesquisarDiagnostico extends javax.swing.JFrame {

    public TelaPesquisarDiagnostico() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtDoenca = new javax.swing.JTextField();
        bntPesquisar = new javax.swing.JButton();
        bntAtualizar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisar Diagnostico"));

        jLabel2.setText("Nome Doença:");

        txtDoenca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDoencaActionPerformed(evt);
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

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
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
                    .addComponent(txtDoenca, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(bntPesquisar)
                        .addGap(18, 18, 18)
                        .addComponent(bntAtualizar)
                        .addGap(18, 18, 18)
                        .addComponent(btnExcluir)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDoenca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bntPesquisar)
                    .addComponent(bntAtualizar)
                    .addComponent(btnExcluir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Pet", "Veterinario", "Doenças", "Codigo Doença", "Prescrição", "Data", "ID Diagnostico"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tabela);
        tabela.getColumnModel().getColumn(6).setMinWidth(0);
        tabela.getColumnModel().getColumn(6).setMaxWidth(0);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 579, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 445, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtDoencaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDoencaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDoencaActionPerformed

    private void bntAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntAtualizarActionPerformed
        DiagnosticoControle DiagControle = new DiagnosticoControle();
        
        DefaultTableModel tabelaDiagnostico = (DefaultTableModel) tabela.getModel();
        
        //Atualizando dados do diagnostico no banco  
        int id = (int) tabela.getValueAt(tabela.getSelectedRow(), 6);
        
        String nome = (String) tabelaDiagnostico.getValueAt(tabela.getSelectedRow(),2);
        String prescricao = (String) tabelaDiagnostico.getValueAt(tabela.getSelectedRow(),4);
        String data = (String) tabelaDiagnostico.getValueAt(tabela.getSelectedRow(),5);
        String codigo = (String) tabelaDiagnostico.getValueAt(tabela.getSelectedRow(),3);

        
        DiagControle.atualizarDiagonostico(id,nome, prescricao, data, codigo);
    }//GEN-LAST:event_bntAtualizarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        DiagnosticoControle DiagControle = new DiagnosticoControle();

        if(tabela.getSelectedRow()== -1){
            JOptionPane.showMessageDialog(null, "Selecione um Diagnostico na Tabela ");
        }else{
            int id = (int)tabela.getValueAt(tabela.getSelectedRow(), 6);
            DiagControle.excluirDiagnostico(id);
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void bntPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntPesquisarActionPerformed
        DiagnosticoControle DiagControle = new DiagnosticoControle();        
        DefaultTableModel tabelaDiagnostico = (DefaultTableModel) tabela.getModel();
 
        int n = tabelaDiagnostico.getRowCount();
        for (int i = 0 ;i < n; i++){
            tabelaDiagnostico.removeRow(0);
        }
             
        /*if (txtDoenca.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Campo de texto Obrigatório");            
        }else{
            Object[] nomes = {DiagControle.pesquisarDiagnostico(txtDoenca.getText()).get(4),
            DiagControle.pesquisarDiagnostico(txtDoenca.getText()).get(5),
            DiagControle.pesquisarDiagnostico(txtDoenca.getText()).get(0),
            DiagControle.pesquisarDiagnostico(txtDoenca.getText()).get(3),
            DiagControle.pesquisarDiagnostico(txtDoenca.getText()).get(1),
            DiagControle.pesquisarDiagnostico(txtDoenca.getText()).get(2)};
            // tabelaDiagnostico.removeRow(ERROR);
             tabelaDiagnostico.addRow(nomes);
        } */
         tabela.setModel(DiagControle.pesquisarDiagnosticoComTabela(txtDoenca.getText(), tabelaDiagnostico));

    }//GEN-LAST:event_bntPesquisarActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPesquisarDiagnostico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPesquisarDiagnostico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPesquisarDiagnostico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPesquisarDiagnostico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPesquisarDiagnostico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntAtualizar;
    private javax.swing.JButton bntPesquisar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable tabela;
    private javax.swing.JTextField txtDoenca;
    // End of variables declaration//GEN-END:variables
}
