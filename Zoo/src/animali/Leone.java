/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animali;

/**
 *
 * @author utente 2023-24
 */
public class Leone {
    private String nome;
    private String razza;
    private int anno;
    private boolean criniera; //true --> maschio    false --> femmina
    
    public Leone() { }
    
    public Leone(String nome, String razza, int anno, boolean criniera) {
        this.nome = nome;
        this.razza =razza;
        this.anno = anno;
        this.criniera = criniera;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRazza() {
        return razza;
    }
    public void setRazza(String razza) {
        this.razza = razza;
    }

    public int getAnno() {
        return anno;
    }
    public void setAnno(int anno) {
        this.anno = anno;
    }

    public boolean isCriniera() {
        return criniera;
    }
    public void setCriniera(boolean criniera) {
        this.criniera = criniera;
    }
}
