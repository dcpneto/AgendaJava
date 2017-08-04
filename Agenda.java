package tela;

import tela.Contato;
import tela.ContatoNaoEncontrado;
import java.util.ArrayList;
import java.util.List;

public class Agenda {

    private List<Contato> contatos;

    public Agenda() {
        contatos = new ArrayList<Contato>();
    }

    public void inserirContato(Contato c) {
        contatos.add(c);
    }

    public boolean removerContato(Contato c) {
        return contatos.remove(c);
    }

    public Contato removerContatoPorIndice(int id) {
        return contatos.remove(id);
    }

    public Contato buscarContatoPorCPF(String CPF) throws ContatoNaoEncontrado {
        for (int i = 0; i < contatos.size(); i++) {
            if (contatos.get(i).getCPF().equalsIgnoreCase(CPF)) {
                return contatos.get(i);
            }
        }
        throw new ContatoNaoEncontrado();
    }

    public Contato buscarContatoPorEmail(String email) throws ContatoNaoEncontrado {
        for (int i = 0; i < contatos.size(); i++) {
            if (contatos.get(i).getEmail().equalsIgnoreCase(email)) {
                return contatos.get(i);
            }
        }
        throw new ContatoNaoEncontrado();
    }

    public List<Contato> buscarContatoPorNome(String nome) throws ContatoNaoEncontrado {
        List<Contato> lista = new ArrayList<Contato>();
        for (int i = 0; i < contatos.size(); i++) {
            if (contatos.get(i).getNome().contains(nome)) { //contains
                lista.add(contatos.get(i));
            } 
        }
        if(lista.size() == 0){
            throw new ContatoNaoEncontrado();
        }
        return lista;
    }

    public List<Contato> getContatos() {
        return contatos;
    }

    //outras coisas e testes
    public List<Contato> returncontatos() {
    return contatos;
}
}
