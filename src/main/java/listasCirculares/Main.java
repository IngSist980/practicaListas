package listasCirculares;

/**
 *
 * @author R
 */
public class Main {

    public static void main(String[] args) {

        listasCirulares lista = new listasCirulares();

        lista.adicionar(9);
        lista.adicionar(7);
        lista.adicionar(5);
        lista.adicionar(3);
        lista.adicionar(2);
        lista.adicionar(1);
        
        System.out.println("El dato menor que se encuentra en la lista es: "
                +lista.datoMenor(lista));
        System.out.println("El promedio de la lista circular es: "+
                lista.promedio(lista));
        
    }
}
