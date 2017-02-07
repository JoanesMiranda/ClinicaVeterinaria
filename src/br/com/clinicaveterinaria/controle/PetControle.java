/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.clinicaveterinaria.controle;

import br.com.clinicaveterinaria.dao.ConexaoDao;
import br.com.clinicaveterinaria.modelo.Pet;
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
public class PetControle {

    ConexaoDao conecta = ConexaoDao.getInstance();

    public void salvarPet(Pet pet) {
        conecta.abrirBanco();
        try {
            PreparedStatement stm = conecta.conn.prepareStatement("INSERT INTO pet(nome,nascimento,especie,peso,raca,cor,sexo,fk_cliente)"
                    + " VALUES (?,?,?,?,?,?,?,?)");
            stm.setString(1, pet.getNome());
            stm.setString(2, pet.getNascimento());
            stm.setString(3, pet.getEspecie());
            stm.setFloat(4, pet.getPeso());
            stm.setString(5, pet.getRaca());
            stm.setString(6, pet.getCor());
            stm.setString(7, pet.getSexo());
            stm.setInt(8, pet.getCliente().getIdcliente());
            stm.execute();
            JOptionPane.showMessageDialog(null, "Pet salvo com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro ao salvar na pet" + ex.getMessage());
        }
        conecta.fecharBanco();
    }

    public void apagarPet(int id) {
        // ArrayList Arayaux = PesquisarPet(nome);

        conecta.abrirBanco();
        //if (Arayaux.size() > 0){ 
        try {
            PreparedStatement stm = conecta.conn.prepareStatement("DELETE FROM pet WHERE idpet = ?");
            stm.setInt(1, id);
            stm.execute();
            JOptionPane.showMessageDialog(null, "O Pet foi excluído");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro ao apagar dados da tabela pet");
        }
        //}else {
        //JOptionPane.showMessageDialog(null,"Pet não existe ");
        // }
        conecta.fecharBanco();
    }

    // TESTANDO
    public DefaultTableModel pesquisarPetComTabela(String nome, DefaultTableModel tabela) {
        ArrayList array = new ArrayList();
        ClienteControle cliControle = new ClienteControle();
        conecta.abrirBanco();

        try {
            PreparedStatement stm = conecta.conn.prepareStatement("SELECT * FROM pet WHERE nome LIKE ?");
            stm.setString(1, "%" + nome + "%");
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                //rs.last();
                array.add(0, rs.getInt("idpet"));
                array.add(1, rs.getString("nome"));
                array.add(2, rs.getString("nascimento"));
                array.add(3, rs.getString("especie"));
                array.add(4, rs.getFloat("peso"));
                array.add(5, rs.getString("raca"));
                array.add(6, rs.getString("cor"));
                array.add(7, rs.getString("sexo"));
                array.add(8, cliControle.pesquisarClienteId(rs.getInt("fk_cliente")));

                // array.add(8,rs.getString("fk_cliente"));
                Object[] pets = {array.get(0),
                    array.get(1),
                    array.get(3),
                    array.get(7),
                    (float) array.get(4),
                    array.get(5),
                    array.get(6),
                    array.get(2),
                    array.get(8)};
                tabela.addRow(pets);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Pet não existe");
        }

        conecta.fecharBanco();
        return tabela;
    }

    public String pesquisarPetId(int id) {
        String nomeC = null;
        conecta.abrirBanco();
        try {
            PreparedStatement stm = conecta.conn.prepareStatement("SELECT * FROM pet WHERE idpet = " + id);
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

    public ArrayList PesquisarPet(String nome) {
        ArrayList array = new ArrayList();
        conecta.abrirBanco();
        try {
            PreparedStatement stm = conecta.conn.prepareStatement("SELECT * FROM pet WHERE nome  '" + nome + "'");
            ResultSet rs = stm.executeQuery();
            rs.first();
            do {
                array.add(0, rs.getInt("idpet"));
                array.add(1, rs.getString("nome"));
                array.add(2, rs.getString("nascimento"));
                array.add(3, rs.getString("especie"));
                array.add(4, rs.getFloat("peso"));
                array.add(5, rs.getString("raca"));
                array.add(6, rs.getString("cor"));
                array.add(7, rs.getString("sexo"));
                array.add(8, rs.getInt("fk_cliente"));
            } while (rs.next());
            //JOptionPane.showMessageDialog(null, "");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro ao pesquisar dados da tabela pet" + ex.getMessage());
        }
        conecta.fecharBanco();
        return array;
    }

    public ArrayList PesquisarPet() {
        ArrayList array = new ArrayList();
        conecta.abrirBanco();
        try {
            PreparedStatement stm = conecta.conn.prepareStatement("SELECT * FROM pet ");
            ResultSet rs = stm.executeQuery();
            rs.last();
            do {
                array.add(0, rs.getInt("idpet"));
                array.add(1, rs.getString("nome"));
                array.add(2, rs.getString("nascimento"));
                array.add(3, rs.getString("especie"));
                array.add(4, rs.getFloat("peso"));
                array.add(5, rs.getString("raca"));
                array.add(6, rs.getString("cor"));
                array.add(7, rs.getString("sexo"));
                array.add(8, rs.getInt("fk_cliente"));
            } while (rs.next());
            //JOptionPane.showMessageDialog(null, "");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro ao pesquisar dados da tabela pet" + ex.getMessage());
        }
        conecta.fecharBanco();
        return array;
    }

    public void atualizarPet(int idPet, String nome, String nascimento, String especie, Float peso, String raca, String cor, String sexo) {
        conecta.abrirBanco();
        try {
            PreparedStatement stm = conecta.conn.prepareStatement("UPDATE pet SET nome = ?, nascimento = ?,"
                    + "especie = ?, peso = ?, raca = ?, cor = ?, sexo = ? WHERE idpet = '" + idPet + "'");
            stm.setString(1, nome);
            stm.setString(2, nascimento);
            stm.setString(3, especie);
            stm.setFloat(4, peso);
            stm.setString(5, raca);
            stm.setString(6, cor);
            stm.setString(7, sexo);
            stm.executeUpdate();
            JOptionPane.showMessageDialog(null, "dados atualizado");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro ao  atualizar na tabela pet");
        }
        conecta.fecharBanco();

    }

}
