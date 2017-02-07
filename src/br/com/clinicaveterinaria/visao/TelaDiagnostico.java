/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.clinicaveterinaria.visao;

import br.com.clinicaveterinaria.controle.ClienteControle;
import br.com.clinicaveterinaria.controle.DiagnosticoControle;
import br.com.clinicaveterinaria.controle.PetControle;
import br.com.clinicaveterinaria.controle.VeterinarioControle;
import br.com.clinicaveterinaria.modelo.Cliente;
import br.com.clinicaveterinaria.modelo.Diagnostico;
import br.com.clinicaveterinaria.modelo.Pet;
import br.com.clinicaveterinaria.modelo.Veterinario;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Eleonilia
 */
public class TelaDiagnostico extends javax.swing.JFrame {

    /**
     * Creates new form TelaDiagnostico
     */
    public TelaDiagnostico() {
        initComponents();
        
        VeterinarioControle vetControle = new VeterinarioControle();
       
        int tam = vetControle.pesquisarVeterinarios().size();
        
        CobVeterinario.removeAllItems();
        for(int i = 0; i < tam ; i++){
            CobVeterinario.addItem((String) vetControle.pesquisarVeterinarios().get(i));          
        }  
        
        DiagnosticoControle digControle = new DiagnosticoControle();  
        ClienteControle cliControle = new ClienteControle();        
        PetControle petControle = new PetControle();
        
        //Escrevendo o nome do ultimo pet cadastrado e do cliente no Jpanel
        lblTelefone.setText((String) cliControle.pesquisarClientes().get(2));
        lblNomeCliente.setText((String) cliControle.pesquisarClientes().get(1));        
        lblNomePet.setText((String) petControle.PesquisarPet().get(1));
        
        
    }
    public void limpar(){
        txtNomeDoenca.setText("");
        txtCodigo.setText("");
        txtPrescricao.setText("");
        //txtData.setText("");
     }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNomeVet = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtNomeDoenca = new javax.swing.JTextField();
        txtCodigo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtPrescricao = new javax.swing.JTextField();
        bntSalvar = new javax.swing.JButton();
        CobVeterinario = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLCliente = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblNomePet = new javax.swing.JLabel();
        lblNomeCliente = new javax.swing.JLabel();
        lblTelefone = new javax.swing.JLabel();
        txtData = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        txtNomeVet.setBorder(javax.swing.BorderFactory.createTitledBorder("Diagnostico"));

        jLabel5.setText("Data");

        jLabel6.setText("Veterinario:");

        jLabel8.setText("Codigo: ");

        jLabel9.setText("Doença: ");

        jLabel10.setText("Prescrição:");

        bntSalvar.setText("Salvar");
        bntSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntSalvarActionPerformed(evt);
            }
        });

        CobVeterinario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CobVeterinarioActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel2.setText("Nome do Pet:");

        jLCliente.setText("Nome do Cliente:");

        jLabel3.setText("Telefone:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNomeCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(lblNomePet, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNomeCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLCliente))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblTelefone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblNomePet, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout txtNomeVetLayout = new javax.swing.GroupLayout(txtNomeVet);
        txtNomeVet.setLayout(txtNomeVetLayout);
        txtNomeVetLayout.setHorizontalGroup(
            txtNomeVetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txtNomeVetLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(txtNomeVetLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(txtNomeVetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(txtNomeVetLayout.createSequentialGroup()
                        .addGroup(txtNomeVetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bntSalvar)
                            .addComponent(CobVeterinario, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(txtNomeVetLayout.createSequentialGroup()
                        .addGroup(txtNomeVetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(txtNomeVetLayout.createSequentialGroup()
                                .addGroup(txtNomeVetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(txtNomeVetLayout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(214, 214, 214))
                                    .addGroup(txtNomeVetLayout.createSequentialGroup()
                                        .addComponent(txtNomeDoenca)
                                        .addGap(36, 36, 36)))
                                .addGroup(txtNomeVetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel5)
                                    .addComponent(txtCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                                    .addComponent(txtData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(txtPrescricao))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        txtNomeVetLayout.setVerticalGroup(
            txtNomeVetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txtNomeVetLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(txtNomeVetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(txtNomeVetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(CobVeterinario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(txtNomeVetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(txtNomeVetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomeDoenca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addGap(4, 4, 4)
                .addComponent(txtPrescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bntSalvar)
                .addGap(45, 45, 45))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtNomeVet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtNomeVet, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bntSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntSalvarActionPerformed
      
        DiagnosticoControle diagControle = new DiagnosticoControle();  
        PetControle petC = new PetControle(); 
        Veterinario vet = new Veterinario();         
        Diagnostico diag = new Diagnostico();      
        Pet pet = new Pet ();
        
        if(txtNomeDoenca.getText().equals("") || txtPrescricao.getText().equals("") || txtCodigo.getText().equals("")|| txtData.getDate() == null){
            JOptionPane.showMessageDialog(null, "Campo de texto obrigatorio");
        }else{
            //Pesquisa na tabela pet o ultimo pet cadastrado
            pet.setIdpet((int) petC.PesquisarPet().get(0));        

            VeterinarioControle vetControle = new VeterinarioControle();
            vet.setIdveterinario((int) vetControle.pesquisarVeterinario(CobVeterinario.getSelectedItem().toString()).get(0));

          // Pegar informações da telaDiagnostico e envia para classe diagnostico
            diag.setNome(txtNomeDoenca.getText());
            diag.setPrescricao(txtPrescricao.getText());
            diag.setCodigo(txtCodigo.getText());

            //Codigo para pegar apenas data no formatada
            java.util.Date pega = txtData.getDate();
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            String data = formato.format(pega);
            diag.setData(data);

            diag.setVeterinario(vet);

          //passa o objeto pet com id do pet para a classe Diagnostico   
            diag.setPet(pet);

          //Salva as informações no banco de dados atraves da DiagnosticoControle  
            diagControle.salvarDiagnostico(diag);
        }
        

//     limpar();        
        

    }//GEN-LAST:event_bntSalvarActionPerformed

    private void CobVeterinarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CobVeterinarioActionPerformed
        
    }//GEN-LAST:event_CobVeterinarioActionPerformed

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
            java.util.logging.Logger.getLogger(TelaDiagnostico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaDiagnostico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaDiagnostico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaDiagnostico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaDiagnostico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CobVeterinario;
    private javax.swing.JButton bntSalvar;
    private javax.swing.JLabel jLCliente;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblNomeCliente;
    private javax.swing.JLabel lblNomePet;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JTextField txtCodigo;
    private com.toedter.calendar.JDateChooser txtData;
    private javax.swing.JTextField txtNomeDoenca;
    private javax.swing.JPanel txtNomeVet;
    private javax.swing.JTextField txtPrescricao;
    // End of variables declaration//GEN-END:variables
}
