class ArbolBinario {
    Nodo raiz;

    public ArbolBinario() {
        raiz = null;
    }

    void agregarNodo(int valor) {
        raiz = insertarNodoRecursivo(raiz, valor);
    }

    Nodo insertarNodoRecursivo(Nodo nodo, int valor) {
        if (nodo == null) {
            nodo = new Nodo(valor);
            return nodo;
        }

        if (valor < nodo.valor)
            nodo.izquierdo = insertarNodoRecursivo(nodo.izquierdo, valor);
        else if (valor > nodo.valor)
            nodo.derecho = insertarNodoRecursivo(nodo.derecho, valor);

        return nodo;
    }

    void preorden(Nodo nodo) {
        if (nodo != null) {
            System.out.print(nodo.valor + " ");
            preorden(nodo.izquierdo);
            preorden(nodo.derecho);
        }
    }

    void inorden(Nodo nodo) {
        if (nodo != null) {
            inorden(nodo.izquierdo);
            System.out.print(nodo.valor + " ");
            inorden(nodo.derecho);
        }
    }

    void postorden(Nodo nodo) {
        if (nodo != null) {
            postorden(nodo.izquierdo);
            postorden(nodo.derecho);
            System.out.print(nodo.valor + " ");
        }
    }
}
