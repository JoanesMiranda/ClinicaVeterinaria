package br.com.clinicaveterinaria.modelo;

public class Diagnostico {
    
    private String nome;
    private String prescricao;
    private String data;
    private String codigo;
    private Pet pet;
    private Veterinario veterinario;

    public Diagnostico() {
    }

    public Diagnostico(String nome, String prescricao, Pet pet, Veterinario veterinario) {
        this.nome = nome;
        this.prescricao = prescricao;
        this.pet = pet;
        this.veterinario = veterinario;
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
     * @return the prescricao
     */
    public String getPrescricao() {
        return prescricao;
    }

    /**
     * @param prescricao the prescricao to set
     */
    public void setPrescricao(String prescricao) {
        this.prescricao = prescricao;
    }

    /**
     * @return the pet
     */
    public Pet getPet() {
        return pet;
    }

    /**
     * @param pet the pet to set
     */
    public void setPet(Pet pet) {
        this.pet = pet;
    }

    /**
     * @return the veterinario
     */
    public Veterinario getVeterinario() {
        return veterinario;
    }

    /**
     * @param veterinario the veterinario to set
     */
    public void setVeterinario(Veterinario veterinario) {
        this.veterinario = veterinario;
    }

    public String getData() {
        return data;
    }
    
    public void setData(String data) {
        this.data = data;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
 
       
}
