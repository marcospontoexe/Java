import java.util.ArrayList;

public class ListaCores {
    public static void main(String[] args) {
        int i;
        // Declara a instancia o ArrayList cores
        ArrayList<String> cores = new ArrayList<String>();
        cores.add("Azul");     // Inclui elemento no ArrayList
        cores.add("Verde");    // Inclui elemento no ArrayList
        cores.add("Vermelho"); // Inclui elemento no ArrayList
        cores.add("Amarelo");  // Inclui elemento no ArrayList

        // Loop para percorrer a lista, elemento por elemento
        for (i = 0; i < cores.size(); i++) // imprime cada elemento
            System.out.println((i + 1) + "º) " + cores.get(i));

        // ALTERA elemento da lista:
        cores.set(1, "Pink"); // altera elemento na posição 1 para "Pink"

        i = 0;
        System.out.println("----");
        // Loop for-each para percorrer a lista, elemento por elemento
        for (String c : cores) { // imprime cada elemento
            System.out.println((i + 1) + "º) " + c);
            i++;
        }

        // REMOVE elemento da lista da posição 3: “Vermelho”
        cores.remove(3);

        i = 0;
        System.out.println("----");
        // Loop for-each para percorrer a lista, elemento por elemento
        for (String c : cores) { // imprime elemento por elemento
            System.out.println((i + 1) + "º) " + c);
            i++;
        }

        // LIMPA a lista: exclui todos os objetos de String
        cores.clear();

        System.out.println("----");
        System.out.println("Tamanho da lista = " + cores.size());
        /*
        add(Object obj)                    // insere um objeto no fim da lista
        add(int index, Object obj)         // insere um objeto na posição especificada
        remove(Object obj)                 // remove da lista o objeto especificado
        remove(int index)                  // remove da lista o objeto na posição especificada
        set(int index, Object obj)         // atualiza o objeto na posição especificada
        int indexOf(Object obj)            // retorna à posição do objeto especificado
        Object get(int index)              // retorna o objeto na posição especificada
        int size( )                        // retorna o tamanho da lista
        boolean contains(Object obj)       // verifica se o objeto passado está na lista
        clear( )                           // remove todos os objetos da lista
        */
    }
}
