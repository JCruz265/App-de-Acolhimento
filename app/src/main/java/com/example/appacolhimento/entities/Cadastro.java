package com.example.appacolhimento.entities;

public class Cadastro {

    private String matricula;
    private String senhaAcesso;

    private  String [] Funcionarios = new String[] {"1111", "2222", "3333", "4444"};
    private String [] senhasCad = new String[] {"EstouAqui", "FuiAli", "FiqueiFora", "NemParticipei"};

    public Cadastro(String matricula, String senhaAcesso) {
        this.matricula = matricula;
        this.senhaAcesso = senhaAcesso;
    }
    public boolean Acesso(){
        int j=0;
        for(int i =0; i < Funcionarios.length;i++){
            if(Funcionarios[i].equals(this.matricula)){
                j = i;
            }
        }
        return senhasCad[j].equals(this.senhaAcesso);
    }
}
