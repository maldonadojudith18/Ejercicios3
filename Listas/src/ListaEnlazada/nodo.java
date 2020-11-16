package ListaEnlazada;

class nodo
{
  private int dato;
  private nodo enlace;
  
  public nodo(){
      enlace=null;
  }
  
  public nodo(int dato,nodo enlace)
  {
    setDato(dato);
    setEnlance(enlace);
  }
  
  public void setDato(int dato){
      this.dato=dato;
  }
  
  public int getDato(){
      return dato;
  }
  
  public void setEnlance(nodo enlace){
      this.enlace=enlace;
  }
  
  public nodo getEnlace(){
      return enlace;
  }
}