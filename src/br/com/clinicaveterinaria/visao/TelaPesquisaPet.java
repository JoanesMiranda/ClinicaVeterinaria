package br.com.clinicaveterinaria.visao;

import br.com.clinicaveterinaria.controle.ClienteControle;
import br.com.clinicaveterinaria.controle.PetControle;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TelaPesquisaPet extends javax.swing.JFrame {

    public TelaPesquisaPet() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtNomePet = new javax.swing.JTextField();
        bntPesquisar = new javax.swing.JButton();
        bntAtualizar = new javax.swing.JButton();
        bntExcluir = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisar"));

        jLabel2.setText("Nome Pet:");

        txtNomePet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomePetActionPerformed(evt);
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

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Pet", "Nome", "Espécie", "Sexo", "Peso", "Raça", "Cor", "Nascimento", "Cliente"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Float.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tabela);
        tabela.getColumnModel().getColumn(0).setMinWidth(0);
        tabela.getColumnModel().getColumn(0).setMaxWidth(0);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(bntPesquisar)
                        .addGap(18, 18, 18)
                        .addComponent(bntAtualizar)
                        .addGap(18, 18, 18)
                        .addComponent(bntExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtNomePet, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 776, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNomePet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bntPesquisar)
                    .addComponent(bntAtualizar)
                    .addComponent(bntExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(364, 364, 364))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {bntAtualizar, bntExcluir, bntPesquisar});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(675, 675, 675))
        );

        setSize(new java.awt.Dimension(814, 496));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomePetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomePetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomePetActionPerformed

    private void bntAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntAtualizarActionPerformed
        PetControle petControle = new PetControle();
        
        //DefaultTableModel tabelaPet = (DefaultTableModel) tabela.getModel();
        //Atualizando dados da tabela pet pelo id do pet
        int id = (int) tabela.getValueAt(tabela.getSelectedRow(),0);
        
        String nome = (String) tabela.getValueAt(tabela.getSelectedRow(),1);
        String nascimento = (String) tabela.getValueAt(tabela.getSelectedRow(),7);
        String especie = (String) tabela.getValueAt(tabela.getSelectedRow(),2);
        Float peso =  (Float) tabela.getValueAt(tabela.getSelectedRow(),4);
        String raca = (String) tabela.getValueAt(tabela.getSelectedRow(),5);
        String cor = (String) tabela.getValueAt(tabela.getSelectedRow(),6);     
        String sexo = (String) tabela.getValueAt(tabela.getSelectedRow(),3);
      
        
        petControle.atualizarPet(id,nome,nascimento,especie,peso,raca,cor,sexo);
    }//GEN-LAST:event_bntAtualizarActionPerformed

    private void bntExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntExcluirActionPerformed
        PetControle petControle = new PetControle();

        if(tabela.getSelectedRow()== -1){
           JOptionPane.showMessageDialog(null, "Campo de texto obrigatorio ");
        }else{
            int idPet = (int) tabela.getValueAt(tabela.getSelectedRow(),0);
            petControle.apagarPet(idPet);
        }
    }//GEN-LAST:event_bntExcluirActionPerformed

    private void bntPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntPesquisarActionPerformed
        PetControle petControle = new PetControle();
        
        
        DefaultTableModel tabelaPet = (DefaultTableModel) tabela.getModel();
        int n =tabelaPet.getRowCount();
        for (int i = 0 ;i< n;i++){
            tabelaPet.removeRow(0);
       }
        
       //if(txtNomePet.getText().equals("")){
           //JOptionPane.showMessageDialog(null,"Campo de texto obrigatorio " );           
      // }else{
      /*
             Object[] nomes = {petControle.PesquisarPet(txtNomePet.getText()).get(0),
             petControle.PesquisarPet(txtNomePet.getText()).get(1),
             petControle.PesquisarPet(txtNomePet.getText()).get(3),
             petControle.PesquisarPet(txtNomePet.getText()).get(7),             
             petControle.PesquisarPet(txtNomePet.getText()).get(4),
             petControle.PesquisarPet(txtNomePet.getText()).get(5),
             petControle.PesquisarPet(txtNomePet.getText()).get(6),
             petControle.PesquisarPet(txtNomePet.getText()).get(2),
             
             petControle.PesquisarPet(txtNomePet.getText()).get(8)};
             tabelaPet.addRow(nomes);*/
      // }
      tabela.setModel(petControle.pesquisarPetComTabela(txtNomePet.getText(), tabelaPet));
    }//GEN-LAST:event_bntPesquisarActionPerformed

    /**
     * @param args the command line arguments
     */
//    
   public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPesquisaPet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPesquisaPet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPesquisaPet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPesquisaPet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {              new TelaPesquisaPet().setVisible(true);
          }
        });
   }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntAtualizar;
    private javax.swing.JButton bntExcluir;
    private javax.swing.JButton bntPesquisar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabela;
    private javax.swing.JTextField txtNomePet;
    // End of variables declaration//GEN-END:variables
}
