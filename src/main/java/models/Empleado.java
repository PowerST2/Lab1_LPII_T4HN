package models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="empleado")
public class Empleado {
	
	//Declaración de propiedades
	@Id
	@Column(name="IdEmpleado")
	private int IdEmpleado;
	
	@Column(name="Apellidos")
	private String Apellidos;
	
	@Column(name="Nombres")
	private String Nombres;
	
	@Column(name="Edad")
	private int Edad;
	
	@Column(name="Sexo")
	private String Sexo;
	
	@Column(name="Salario")
	private double Salario;
	
	
	
	
	public Empleado() {
	}
	
	//Declaración del metodo constructor con propiedades
	public Empleado(String apellidos, String nombres, int edad, String sexo, double salario) {
		Apellidos = apellidos;
		Nombres = nombres;
		Edad = edad;
		Sexo = sexo;
		Salario = salario;
	}
	//Declaracion de los metodos set y get
	public int getIdEmpleado() {
		return IdEmpleado;
	}
	
	public void setIdEmpleado(int idEmpleado) {
		IdEmpleado = idEmpleado;
	}
	
	public String getApellidos() {
		return Apellidos;
	}
	
	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}
	
	public String getNombres() {
		return Nombres;
	}
	
	public void setNombres(String nombres) {
		Nombres = nombres;
	}
	
	public int getEdad() {
		return Edad;
	}
	
	public void setEdad(int edad) {
		Edad = edad;
	}
	
	public String getSexo() {
		return Sexo;
	}
	public void setSexo(String sexo) {
		Sexo = sexo;
	}
	
	public double getSalario() {
		return Salario;
	}
	
	public void setSalario(double salario) {
		Salario = salario;
	}

	@Override
	public String toString() {
		return "Empleados [IdEmpleado=" + IdEmpleado + ", Apellidos=" + Apellidos + ", Nombres=" + Nombres + ", Edad="
				+ Edad + ", Sexo=" + Sexo + ", Salario=" + Salario + "]";
	}

	
}
