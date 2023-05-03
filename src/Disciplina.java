/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mauri
 */
public class Disciplina {
    private int codigo;
    private String nome;
    private int numeroVagas;

    public Disciplina() {
    }
   
    public Disciplina(int codigo, String nome, int numeroVagas) {
        this.codigo = codigo;
        this.nome = nome;
        this.numeroVagas = numeroVagas;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroVagas() {
        return numeroVagas;
    }

    public void setNumeroVagas(int numeroVagas) {
        this.numeroVagas = numeroVagas;
    }

    @Override
    public String toString() {
        return "Disciplina{" + "codigo=" + codigo + ", nome=" + nome + ", numeroVagas=" + numeroVagas + '}';
    }
    
}
