package com.dio.br.estrutura.de.dados.application.pilha;

public class Pilha {

    private  No referenciaNoEntradaPilha;

    public Pilha() {
        this.referenciaNoEntradaPilha = null;
    }

    /**
     * empilha um novo elemento na pilha
     * @param novoNo recebe o novo elemento(Nó)
     */
    public void push(No novoNo) {
        No referenciaAuxiliar = referenciaNoEntradaPilha;
        referenciaNoEntradaPilha = novoNo;
        referenciaNoEntradaPilha.setReferenciaNo(referenciaAuxiliar);
    }

    /**
     * @return exclui o último elemento colocado no topo da pilha
     */
    public No pop() {
        if (!this.isEmpty()) {
            No noPoped = referenciaNoEntradaPilha;
            referenciaNoEntradaPilha = referenciaNoEntradaPilha.getReferenciaNo();
            return noPoped;
        }
        return null;
    }

    /**
     * @return retorna o primeiro elemento do Nó, sem excluir da pilha
     */
    public No top() {
        return referenciaNoEntradaPilha;
    }

    /**
     * @return verifica se a pilha está vazia ou não
     */
    public boolean isEmpty() {
        return referenciaNoEntradaPilha == null ? true : false;
    }

}
