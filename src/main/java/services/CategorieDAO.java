package services;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entities.Categorie;

public class CategorieDAO implements ICategorie {
	private EntityManager entityManager;
	public CategorieDAO() {
		// TODO Auto-generated constructor stub
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("jpahibernate");
		entityManager=entityManagerFactory.createEntityManager();
	}

	@Override
	public void add(Categorie categorie) {
		// TODO Auto-generated method stub
		try {
			entityManager.getTransaction().begin();
			entityManager.persist(categorie);
			entityManager.getTransaction().commit();
			System.out.println("Ajout effectuer");
			
		} catch (Exception e) {
			// TODO: handle exception
			throw e;
		}
		
	}

	@Override
	public void update(Categorie categorie) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Categorie> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Categorie findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
