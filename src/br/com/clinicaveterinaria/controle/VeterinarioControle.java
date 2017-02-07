/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.clinicaveterinaria.controle;

import br.com.clinicaveterinaria.dao.ConexaoDao;
import br.com.clinicaveterinaria.modelo.Veterinario;
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
public class VeterinarioControle {

    ConexaoDao conecta = ConexaoDao.getInstance();

    public void salvarVeterinario(Veterinario veterinario) {
        conecta.abrirBanco();
        try {
            PreparedStatement stm = conecta.conn.prepareStatement("INSERT INTO veterinario(nome,crmv,cpf,telefone) VALUES (?,?,?,?)");
            stm.setString(1, veterinario.getNome());
            stm.setString(2, veterinario.getCrmv());
            stm.setString(3, veterinario.getCpf());
            stm.setString(4, veterinario.getTelefone());
            stm.execute();
            JOptionPane.showMessageDialog(null, "Veterinario salvo com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro ao salvar na tabela veterinario" + ex.getMessage());
        }
        conecta.fecharBanco();
    }

    public void apagarVeterinario(int id) {
        // ArrayList Arayaux = pesquisarVeterinario(nome);
        conecta.abrirBanco();
        //if (Arayaux.size() > 0){
        try {
            PreparedStatement stm = conecta.conn.prepareStatement("DELETE FROM veterinario WHERE idveterinario = ?");
            stm.setInt(1, id);
            stm.execute();
            JOptionPane.showMessageDialog(null, "O Veterinario foi excluído");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro ao excluir dados na tabela veterinario");
        }
        // }    
        conecta.fecharBanco();
    }

    public String pesquisarVeterinarioId(int id) {
        String nomeC = null;
        conecta.abrirBanco();
        try {
            PreparedStatement stm = conecta.conn.prepareStatement("SELECT * FROM veterinario WHERE idveterinario = " + id);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                nomeC = (rs.getString("nome"));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Veterinario não existe");
        }

        conecta.fecharBanco();
        return nomeC;
    }

    public DefaultTableModel pesquisarVeterinarioTabela(String nome, DefaultTableModel tabela) {
        ArrayList array = new ArrayList();
        conecta.abrirBanco();

        try {
            PreparedStatement stm = conecta.conn.prepareStatement("SELECT * FROM veterinario WHERE nome  LIKE ? ");
            stm.setString(1, "%" + nome + "%");
            ResultSet rs = stm.executeQuery();

            while (rs.next()) {
                //rs.last();
                array.add(0, rs.getInt("idveterinario"));
                array.add(1, rs.getString("nome"));
                array.add(2, rs.getString("crmv"));
                array.add(3, rs.getString("cpf"));
                array.add(4, rs.getString("telefone"));

                Object[] objeto = {array.get(0),
                    array.get(2),
                    array.get(1),
                    array.get(4),
                    array.get(3)};

                tabela.addRow(objeto);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Veterinario não existe");
        }

        conecta.fecharBanco();
        return tabela;
    }

    public ArrayList pesquisarVeterinario(String nome) {
        ArrayList array = new ArrayList();
        conecta.abrirBanco();
        try {
            PreparedStatement stm = conecta.conn.prepareStatement("SELECT * FROM veterinario WHERE nome LIKE '" + nome + "'");
            ResultSet rs = stm.executeQuery();
            rs.first();
            do {
                array.add(0, rs.getInt("idveterinario"));
                array.add(1, rs.getString("nome"));
                array.add(2, rs.getString("crmv"));
                array.add(3, rs.getString("cpf"));
                array.add(4, rs.getString("telefone"));
            } while (rs.next());

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não exixte um veterinario com este nome ");
        }
        conecta.fecharBanco();
        return array;
    }

    public ArrayList pesquisarVeterinarios() {
        ArrayList array = new ArrayList();
        conecta.abrirBanco();
        try {
            PreparedStatement stm = conecta.conn.prepareStatement("SELECT nome FROM veterinario");
            ResultSet rs = stm.executeQuery();
            rs.first();
            do {
                array.add(rs.getString("nome"));
            } while (rs.next());

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro!! ao pesquisar na tabela veterinario" + ex);
        }
        conecta.fecharBanco();
        return array;
    }

    //falta terminar
    public void atualizarVeterinario(int id, String nome, String crmv, String cpf, String telefone) {
        conecta.abrirBanco();
        try {
            PreparedStatement stm = conecta.conn.prepareStatement("UPDATE veterinario SET nome =?,"
                    + " crmv = ?, cpf = ?, telefone = ? WHERE idveterinario = '" + id + "'");

            stm.setString(1, nome);
            stm.setString(2, crmv);
            stm.setString(3, cpf);
            stm.setString(4, telefone);
            stm.executeUpdate();

            JOptionPane.showMessageDialog(null, "Dados atualizados");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro ao atualizar dados na tabela veterinario");
        }
        conecta.fecharBanco();
    }
}
