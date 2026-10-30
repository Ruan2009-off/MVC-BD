package br.com.sistema.controller;

import br.com.sistema.model.UsuarioModel;
import br.com.sistema.view.CadastroView;
import java.awt.Color;

public class CadastroController {
    public CadastroController(UsuarioModel model, CadastroView view){
        view.addCadastrarListener(e -> {
            String nome = view.getNomeDigitado();
            if(nome == null || nome.trim().isEmpty()) { 
                view.exibirMensagem("Aviso: Digite um nome!", Color.RED);
                return;
            }
        })
    }    
}
