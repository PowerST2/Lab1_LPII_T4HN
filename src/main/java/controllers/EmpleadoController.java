package controllers;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import models.Empleado;

public class EmpleadoController {
	
	public String createEmpleado(String Apellido, String Nombre, int Edad, String Sexo, double Salario) {
	
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Empleado.class).buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		try {
			Empleado emp = new Empleado(Apellido,Nombre,Edad,Sexo,Salario);
			
			session.beginTransaction();
			session.save(emp);
			session.getTransaction().commit();
			sessionFactory.close();
			return "Empleado creado";
			
		} catch(Exception e){
			e.printStackTrace();
		}
		
		return "Error al Registrar empleado";
	}
	public String getEmpleado(int IdEmpleado) {
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Empleado.class).buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		try {
			session.beginTransaction();
			Empleado emp = session.get(Empleado.class,IdEmpleado);
			session.getTransaction().commit();
			sessionFactory.close();
			
			return "Empleado Encontrado";
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return "Error al Buscar Empleado";
	}
	
	public String deleteEmpleado(int IdEmpleado) {
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Empleado.class).buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		try {
			session.beginTransaction();
			Empleado emp = session.get(Empleado.class, IdEmpleado);
			session.delete(emp);
			session.getTransaction().commit();
			sessionFactory.close();
			return "Empleado eliminado satisfactoriamente";
		} 
		catch(Exception e) {
			e.printStackTrace();
		}
		return "Error al eliminar Empleado";
	}
	public String updateEmpleado(int IdEmpleado,String Apellidos,String Nombres, int Edad, String Sexo, double Salario) {
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Empleado.class).buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		try {
			session.beginTransaction();
			Empleado emp= session.get(Empleado.class,IdEmpleado);
			emp.setApellidos(Apellidos);
			emp.setNombres(Nombres);
			emp.setEdad(Edad);
			emp.setSexo(Sexo);
			emp.setSalario(Salario);
			session.update(emp);
			session.getTransaction().commit();
			sessionFactory.close();
			return "Empleado actualizado satisfactoriamente";
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		return "Error al actualizar Empleado";
	}
}
