/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.clinicaveterinaria.controle;

import br.com.clinicaveterinaria.dao.ConexaoDao;
import br.com.clinicaveterinaria.modelo.Diagnostico;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Joanes
 */
public class DiagnosticoControle{
       ConexaoDao conecta = ConexaoDao.getInstance();
      public void salvarDiagnostico(Diagnostico diagnostico){
        conecta.abrirBanco();
            try {
                PreparedStatement stm = conecta.conn.prepareStatement("INSERT INTO diagnostico(nome,prescricao,data,codigo,fk_pet,fk_veterinario)"
                        + " VALUES (?,?,?,?,?,?)");
                stm.setString(1,diagnostico.getNome());
                stm.setString(2,diagnostico.getPrescricao());
                stm.setString(3,diagnostico.getData());
                stm.setString(4,diagnostico.getCodigo());
                stm.setInt(5,diagnostico.getPet().getIdpet());
                stm.setInt(6,diagnostico.getVeterinario().getIdveterinario());
                stm.execute();
                JOptionPane.showMessageDialog(null,"Diagnostico Salvo com sucesso");
            } catch (SQLException ex) {
               JOptionPane.showMessageDialog(null,"erro ao salvar na tabela diagnostico"+ex.getMessage());
            } 
        conecta.fecharBanco();
    }
    
    public void excluirDiagnostico(int id){
        //ArrayList Arayaux = pesquisarDiagnostico(id);
        conecta.abrirBanco();
            //if (Arayaux.size() > 0){ 
            try {
                PreparedStatement stm = conecta.conn.prepareStatement("DELETE FROM diagnostico WHERE iddiagnostico = ?");
                stm.setInt(1,id);
                stm.execute();
                JOptionPane.showMessageDialog(null,"Diagnostico foi excluído");
            } catch (SQLException ex) {
               JOptionPane.showMessageDialog(null,"erro ao excluir dados na tabela diagnostico"+ex.getMessage());
            } 
            //}else {
                //JOptionPane.showMessageDialog(null,"Diagnostico não existe");
            //}            
        conecta.fecharBanco();
        
    }
    // TESTANDO
    public DefaultTableModel pesquisarDiagnosticoComTabela(String nome, DefaultTableModel tabela){
        VeterinarioControle vetControle = new VeterinarioControle();
        PetControle petControle = new PetControle();
        ArrayList array = new ArrayList();
        conecta.abrirBanco();        

            try{
                PreparedStatement stm = conecta.conn.prepareStatement("SELECT * FROM diagnostico WHERE nome LIKE ?");
                stm.setString(1, "%"+nome+"%");
                ResultSet rs = stm.executeQuery();
           
                while(rs.next()){
                //rs.last();
                    array.add(0, rs.getInt("iddiagnostico"));
                    array.add(1, rs.getString("nome"));
                    array.add(2, rs.getString("prescricao"));
                    array.add(3, rs.getString("data"));
                    array.add(4, rs.getString("codigo"));
                    array.add(5, petControle.pesquisarPetId(rs.getInt("fk_pet")));
                    array.add(6,vetControle.pesquisarVeterinarioId(rs.getInt("fk_veterinario")));


                    Object[] diags = {array.get(5),
                         array.get(6),
                         array.get(1),
                         array.get(4),
                         array.get(2),
                         array.get(3),
                         array.get(0)};

                    tabela.addRow(diags);
                }
            }catch(SQLException ex){
                JOptionPane.showMessageDialog(null,"Diagnostico não existe");
            }  
 
        conecta.fecharBanco();
        return tabela;
    }     
    
    public ArrayList pesquisarDiagnostico(String nome){
        ArrayList array = new ArrayList();
        conecta.abrirBanco();
            try{
                PreparedStatement stm = conecta.conn.prepareStatement("SELECT * FROM diagnostico WHERE nome LIKE '"+nome+"'");
                ResultSet rs = stm.executeQuery();
                rs.last();
                do{
                    array.add(rs.getString("nome"));
                    array.add(rs.getString("prescricao"));   
                    array.add(rs.getString("data"));
                    array.add(rs.getString("codigo"));
                    array.add(rs.getInt("fk_pet"));
                    array.add(rs.getInt("fk_veterinario"));
                }while(rs.next());
            }catch(SQLException ex){
                JOptionPane.showMessageDialog(null,"O Diagnostico não existe");
            }    
        conecta.fecharBanco();
        return array;
    } 
        
    public ArrayList pesquisarDiagnostico(){
        ArrayList array = new ArrayList();
        conecta.abrirBanco();
            try{
                PreparedStatement stm = conecta.conn.prepareStatement("SELECT * FROM diagnostico ");
                ResultSet rs = stm.executeQuery();
                rs.last();
                do{
                array.add(1,rs.getString("nome"));
                array.add(2,rs.getString("prescricao"));   
                array.add(3,rs.getString("data"));
                array.add(4,rs.getString("codigo"));
                array.add(5,rs.getInt("fk_pet"));
                array.add(6,rs.getInt("fk_veterinario"));
                }while(rs.next());
            }catch(SQLException ex){
                JOptionPane.showMessageDialog(null,"erro!! ao pesquisar na tabela diagnostico"+ex);
            }    
        conecta.fecharBanco();
        return array;
    } 
     
     
    public void atualizarDiagonostico(int idDiag, String nome,String prescricao, String data,String codigo){
        conecta.abrirBanco();
            try {
                PreparedStatement stm = conecta.conn.prepareStatement("UPDATE diagnostico SET nome = ?, prescricao = ?, data = ?, codigo = ?  WHERE iddiagnostico = '"+idDiag+"'");
                stm.setString(1,nome);
                stm.setString(2,prescricao);
                stm.setString(3,data);
                stm.setString(4, codigo);
                stm.executeUpdate();
                JOptionPane.showMessageDialog(null,"Dados atualizados");
            } catch (SQLException ex) {
               JOptionPane.showMessageDialog(null,"erro ao atualizar dados na tabela diagnostico");
            } 
        conecta.fecharBanco();
    }
}
