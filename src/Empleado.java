
public class Empleado {
    private int id;
    private final String nombre;
    private final String apellido;
    private final int comision;
    private final int horasExtra;
    private final int salario;
    
    
    public Empleado(String nombre, String apellido, int comision, int horasExtra, int salario){
        this.nombre=nombre;
        this.apellido=apellido;
        this.comision=comision;
        this.horasExtra=horasExtra;
        this.salario=salario;
    }
    
    public static double calcularMiNomina(Empleado empleado){
         double nomina= (empleado.salario)+(empleado.comision);
         double porcentaje= (nomina*4)/100;
         double nominaTotal= nomina-porcentaje-porcentaje;
         return nominaTotal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;   
    }
    

    
    
    
}
