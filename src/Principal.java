
public class Principal {


    public static void main(String[] args) {
        
        Empleado empl=new Empleado("Jorge","Ruiz",500000,0,1875000);
               
        System.out.println(Empleado.calcularMiNomina(empl));
    }
    
}
