package br.com.clinicaveterinaria.modelo;

public class Veterinario {
    
    private int idveterinario;
    private String nome;
    private String crmv;
    private String cpf;
    private String telefone;
    
    
    public Veterinario(){        
    }
    
    public Veterinario(int idveterinario, String nome,String crmv,String cpf,String telefone){
        this.nome = nome;
        this.crmv = crmv;
        this.cpf = cpf;
        this.telefone = telefone;
        
    }

    public void setCrmv(String crmv) {
        this.crmv = crmv;
    }
    
    public String getCrmv() {
        return crmv;
    }

    

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getCpf() {
        return cpf;
    }

    /**
     * @return o nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome o nome para set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return o idveterinario
     */
    public int getIdveterinario() {
        return idveterinario;
    }

    /**
     * @param idveterinario o idveterinario para set
     */
    public void setIdveterinario(int idveterinario) {
        this.idveterinario = idveterinario;
    }
      
}
