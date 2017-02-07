/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.clinicaveterinaria.controle;

import br.com.clinicaveterinaria.dao.ConexaoDao;
import br.com.clinicaveterinaria.modelo.Cliente;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author suporte
 */
public class ClienteControle {

    ConexaoDao conecta = ConexaoDao.getInstance();

    public void salvarCliente(Cliente cliente) {
        conecta.abrirBanco();
        try {
            PreparedStatement stm = conecta.conn.prepareStatement("INSERT INTO cliente(nome,telefone,cpf) VALUES (?,?,?)");
            stm.setString(1, cliente.getNome());
            stm.setString(2, cliente.getTelefone());
            stm.setString(3, cliente.getCpf());
            stm.execute();
            JOptionPane.showMessageDialog(null, "Cliente salvo com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro ao salvar na tabela cliente" + ex.getMessage());
        }
        conecta.fecharBanco();
    }

    public void excluirCliente(int id) {
        //ArrayList Arayaux = pesquisarCliente(id);
        conecta.abrirBanco();

        //if (Arayaux.size() > 0){
        try {
            PreparedStatement stm = conecta.conn.prepareStatement("DELETE FROM cliente WHERE idcliente = ?");
            stm.setInt(1, id);
            stm.executeUpdate();
            JOptionPane.showMessageDialog(null, "O Cliente foi excluido");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro ao excluir dados na tabela cliente" + ex.getMessage());

        }

        //}    
        conecta.fecharBanco();
    }

    // Pesquisando cliente com a tabela
    public DefaultTableModel pesquisarClienteComTabela(String nome, DefaultTableModel tabela) {
        ArrayList array = new ArrayList();
        conecta.abrirBanco();

        try {
            PreparedStatement stm = conecta.conn.prepareStatement("SELECT * FROM cliente WHERE nome LIKE ?");
            stm.setString(1, "%" + nome + "%");
            ResultSet rs = stm.executeQuery();

            while (rs.next()) {
                array.add(0, rs.getInt("idcliente"));
                array.add(1, rs.getString("nome"));
                array.add(2, rs.getString("telefone"));
                array.add(3, rs.getString("cpf"));

                Object[] objeto = {array.get(0),
                    array.get(1),
                    array.get(2),
                    array.get(3)};

                tabela.addRow(objeto);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Cliente não existe");
        }

        conecta.fecharBanco();

        return tabela;
    }
    // TESTANDO

    public String pesquisarClienteId(int id) {
        String nomeC = null;
        conecta.abrirBanco();
        try {
            PreparedStatement stm = conecta.conn.prepareStatement("SELECT * FROM cliente WHERE idCliente = " + id);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                nomeC = (rs.getString("nome"));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Cliente não existe");
        }

        conecta.fecharBanco();
        return nomeC;
    }

    public ArrayList pesquisarCliente(String nome) {
        ArrayList array = new ArrayList();
        conecta.abrirBanco();

        try {
            PreparedStatement stm = conecta.conn.prepareStatement("SELECT * FROM cliente WHERE nome LIKE ?");
            stm.setString(1, "%" + nome + "%");
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                //rs.last();
                array.add(rs.getInt("idcliente"));
                array.add(rs.getString("nome"));
                array.add(rs.getString("telefone"));
                array.add(rs.getString("cpf"));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Cliente não existe");
        }

        conecta.fecharBanco();
        return array;
    }

    public ArrayList pesquisarClientes() {
        ArrayList array = new ArrayList();
        conecta.abrirBanco();
        try {
            PreparedStatement stm = conecta.conn.prepareStatement("SELECT * FROM cliente");
            ResultSet rs = stm.executeQuery();
            rs.last();
            array.add(rs.getInt("idcliente"));
            array.add(rs.getString("nome"));
            array.add(rs.getString("telefone"));
            array.add(rs.getString("cpf"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro!! ao pesquisar na tabela cliente" + ex);
        }
        conecta.fecharBanco();

        return array;
    }

    public void atualizarCliente(int id, String nome, String telefone, String cpf) {
        conecta.abrirBanco();
        try {
            PreparedStatement stm = conecta.conn.prepareStatement("UPDATE cliente SET nome = ?,telefone = ?, cpf = ?  WHERE idcliente = ?");
            stm.setString(1, nome);
            stm.setString(2, telefone);
            stm.setString(3, cpf);
            stm.setInt(4, id);

            stm.executeUpdate();
            JOptionPane.showMessageDialog(null, "Cliente atualizado ");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro ao atualizar dados na tabela cliente");
        }
        conecta.fecharBanco();
    }

}
