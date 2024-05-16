package br.com.dio.desafio.dominio;

import java.util.ArrayList;
import java.util.List;

public class Certificado {
    private String titulo;
    private String nomeDev;
    private String data;
    private String code;
    private List<String> certificados = new ArrayList<>();

    public void gerarCertificado(String titulo, String nomeDev, String data, String code){
        this.titulo = titulo;
        this.nomeDev = nomeDev;
        this.data = data;
        this.code = code;
        certificados.add(titulo+ " - " +code);
    }

    public void exebirCertficados(){
        System.out.println(certificados);
    }

    public void removerCertificado(String code){
        String codigoParaRemover = null;
        if (!certificados.isEmpty()) {
            for(String c : certificados){
                if(c.equalsIgnoreCase(code)){
                    codigoParaRemover = c;
                    break;
                }
            }
            certificados.remove(codigoParaRemover);
        }else{
            throw new RuntimeException("Lista vazia!");
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getNomeDev() {
        return nomeDev;
    }

    public void setNomeDev(String nomeDev) {
        this.nomeDev = nomeDev;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
