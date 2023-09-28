package Views;

import controllers.EmpleadoController;

public class EmpleadoView {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//AGREGAR EMPLEADO
		
		//String Empleado = new EmpleadoController().createEmpleado("Davila","Diego",18,"Masculino",3999.99);
		//System.out.println(Empleado);
		//String Empleado = new EmpleadoController().createEmpleado("Davila","Edgar",52,"Masculino",2500);
		//System.out.println(Empleado);
		
		//BUSCAR EMPLEADO
		
		//String getEmpleado = new EmpleadoController().getEmpleado(1);
		//System.out.println(getEmpleado);
		
		//ELIMINAR EMPLEADO
		
		//String empleado= new EmpleadoController().deleteEmpleado(2);
		//System.out.println(empleado);
	
		//ACTUALIZAR EMPLEADO
		String empleado= new EmpleadoController().updateEmpleado(1, "Diaz","Stefano", 19, "Masculino", 4500);
		System.out.println(empleado);
		
	}
}