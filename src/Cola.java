
import javax.swing.JOptionPane;


public class Cola {
    
    private Nodo inicio;
    private Nodo fin;
    
    public Cola (){
        this.inicio = null;
        this.fin = null;
    }
    
    public boolean vacia(){
        if (inicio == null){
            return true;
        } else {
            return false;
        }
    }
    
    public void encolar(){
        Paciente p = new Paciente();
        p.setNombre(JOptionPane.showInputDialog("Digite el nombre del paciente:"));
        p.setTurno(Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de turno:")));
        Nodo nuevo = new Nodo();
        nuevo.setElemento(p);
        if (vacia()){
            inicio = nuevo;
            fin = nuevo;
        } else {
            fin.setSiguiente(nuevo);
            fin = nuevo;
        }
    }
    
    public void desencolar(){
        if (!vacia()){
            Paciente paciente = inicio.getElemento();
            inicio = inicio.getSiguiente();
            JOptionPane.showMessageDialog(null, "Turno de: " + paciente.getNombre());
        } else {
            JOptionPane.showMessageDialog(null, "Errror! No hay pacientes");
        }
    }
    
    public void mostrar(){
        if (!vacia()){
            String s = "";
            Nodo aux = inicio;
            while (aux != null){
               s += aux.getElemento().getNombre() + " Numero: " + aux.getElemento().getTurno() + (" | ");
               aux = aux.getSiguiente();
            }
            JOptionPane.showMessageDialog(null, "Proximos Turnos: \n\n" + s , "Mostrar Fila" , JOptionPane.PLAIN_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "No se puede mostrar" , "Fila Vacia" , JOptionPane.ERROR_MESSAGE);
        }
    }
    
}
