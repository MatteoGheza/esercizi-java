/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package artistajava;

/**
 *
 * @author utente 2023-24
 */
public class Artista {

    String nome;
    String cognome;
    int secolo;
    String operaPrincipale;

    public Artista(String nome, String cognome, int secolo, String operaPrincipale) {
        this.nome = nome;
        this.cognome = cognome;
        this.secolo = secolo;
        this.operaPrincipale = operaPrincipale;
    }

    public Artista() {
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public int getSecolo() {
        return secolo;
    }
    public void setSecolo(int secolo) {
        this.secolo = secolo;
    }
    public void setSecolo(String secoloRomano) {
        this.secolo = ConvertitoreRomano.romanoADecimale(secoloRomano);
    }

    public String getOperaPrincipale() {
        return operaPrincipale;
    }
    public void setOperaPrincipale(String operaPrincipale) {
        this.operaPrincipale = operaPrincipale;
    }

    @Override
    public String toString() {
        String secoloRomano = ConvertitoreRomano.decimaleARomano(secolo);
        return "Artista " + nome + " " + cognome + " (" + secoloRomano + " secolo), con opera principale \"" + operaPrincipale + '\"';
    }

}
