package listasCirculares;

/**
 *
 * @author R
 */
public class listasCirulares {

    Nodo inicio;
    int tamanio;

    public listasCirulares() {
        this.inicio = inicio;
        this.tamanio = tamanio;
    }

    public void adicionar(double dato) {
        if (inicio == null) {
            inicio = new Nodo(null, dato);
            inicio.setSiguiente(inicio);
            tamanio++;

        }else{
            Nodo aux=inicio;
            while(aux.getSiguiente()!=inicio){
                aux=aux.getSiguiente();
            
            }
            aux.setSiguiente(new Nodo(inicio, dato));
        
        }

    }
    
    public double datoMenor(listasCirulares lista){
        if(inicio !=null){
            Nodo aux=inicio;
            double menor = aux.getDato();
            
            if(aux.getSiguiente()==inicio){
                return menor;
            
            }else{
                while(aux.getSiguiente()!=inicio){
                    if(aux.getDato()<menor){
                        menor=aux.getDato();
                        aux=aux.getSiguiente();
                    
                    }else{
                        aux=aux.getSiguiente();
                        
                    
                    }
                
                }
                
                if(aux.getSiguiente()==inicio){
                    if(aux.getDato()<menor){
                        menor=aux.getDato();
                    
                    }
                
                }
                return menor;
            }
            
            }
        return Double.MIN_VALUE;
        }
    public double promedio(listasCirulares lista){
        double prom=0;
        if(inicio !=null){
            Nodo aux=inicio;
            
            if(aux.getSiguiente()==inicio){
                return aux.getDato();
            
                
            }else{
                while (aux.getSiguiente()!=inicio){
                    prom +=aux.getDato();
                    aux=aux.getSiguiente();
                
                }
                if(aux.getSiguiente()==inicio){
                    prom+=aux.getDato();
                
                }
                
                prom=prom /tamanio;
                
                return prom;
            
            }
        
        }else{
            return Double.MIN_VALUE;
        
        }
    
    }
    
}
        
        
    

 
    


