package Principal;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Entidades.Pessoa;

public class Principal {

	public static void main(String[] args) {
		
		
		
		/*Pessoa p1 = new Pessoa(null, "Carlos", "carlos@gmail.com");
		Pessoa p2 = new Pessoa(null, "Henrique", "henrique@gmail.com");
		Pessoa p3 = new Pessoa(null, "Arthur", "arthur@gmail.com");*/

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		
		Pessoa p = em.find(Pessoa.class, 3);
		
		em.getTransaction().begin();
		em.remove(p);
		em.getTransaction().commit();
		
		System.out.println(p);
		/*em.getTransaction().begin();
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		em.getTransaction().commit();*/
		em.close();
		emf.close();
		System.out.println("Tudo ok");
	}

}
