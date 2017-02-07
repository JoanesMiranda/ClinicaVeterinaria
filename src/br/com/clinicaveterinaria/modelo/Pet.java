
package br.com.clinicaveterinaria.modelo;

public class Pet {
    
    private int idpet;
    private String nome;
    private String nascimento;
    private String especie;
    private Float  peso;
    private String sexo;
    private String raca;
    private String cor;
    private Cliente cliente;

    public Pet() {
    }

    public Pet(String nome, String nascimento, String especie, Float peso, String raca, String cor, Cliente cliente, String sexo) {
        
        this.nome = nome;
        this.nascimento = nascimento;
        this.especie = especie;
        this.sexo = sexo;
        this.peso = peso;
        this.raca = raca;
        this.cor = cor;
        this.cliente = cliente;
    }

    
    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the nascimento
     */
    public String getNascimento() {
        return nascimento;
    }

    /**
     * @param nascimento the nascimento to set
     */
    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    /**
     * @return the especie
     */
    public String getEspecie() {
        return especie;
    }

    /**
     * @param especie the especie to set
     */
    public void setEspecie(String especie) {
        this.especie = especie;
    }

    /**
     * @return the peso
     */
    public Float getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(Float peso) {
        this.peso = peso;
    }

    /**
     * @return the raca
     */
    public String getRaca() {
        return raca;
    }

    /**
     * @param raca the raca to set
     */
    public void setRaca(String raca) {
        this.raca = raca;
    }

    /**
     * @return the cor
     */
    public String getCor() {
        return cor;
    }

    /**
     * @param cor the cor to set
     */
    public void setCor(String cor) {
        this.cor = cor;
    }

    /**
     * @return the cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * @return the idpet
     */
    public int getIdpet() {
        return idpet;
    }

    /**
     * @param idpet the idpet to set
     */
    public void setIdpet(int idpet) {
        this.idpet = idpet;
    }
    
    public String getSexo() {
        return sexo;
    }
    
    public void setSexo(String sexo){
        this.sexo = sexo;
    }
    
    
}
