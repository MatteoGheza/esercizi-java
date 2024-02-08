/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animali;

/**
 *
 * @author utente 2023-24
 */
public class Panda {
    private String nome;
    private String razza;
    private int anno;
    private String sesso;
    private String provenienza;
    
    public Panda() { }

    public Panda(String nome, String razza, int anno, String sesso, String provenienza) {
        this.nome = nome;
        this.razza = razza;
        this.anno = anno;
        this.sesso = sesso;
        this.provenienza = provenienza;
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

    public String getSesso() {
        return sesso;
    }

    public void setSesso(String sesso) {
        this.sesso = sesso;
    }

    public String getProvenienza() {
        return provenienza;
    }

    public void setProvenienza(String provenienza) {
        this.provenienza = provenienza;
    }
    
    public float calcolaPrezzo() {
        float prezzo;
        
        if(anno<=2) {
            prezzo = 70;
        } else if(anno<=4) {
            prezzo = 120;
        } else {
            prezzo = 200;
        }
        
        return prezzo;
    }
}
