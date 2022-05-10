package services;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entities.Produit;

public class ProduitDAO implements IProduit {
	private EntityManager entityManager;
	public ProduitDAO() {
		// TODO Auto-generated constructor stub
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("jpahibernate");
		entityManager=entityManagerFactory.createEntityManager();
	}
	@Override
	public void add(Produit produit) {
		// TODO Auto-generated method stub
		try {
			entityManager.getTransaction().begin();
			entityManager.persist(produit);
			entityManager.getTransaction().commit();
			
		} catch (Exception e) {
			// TODO: handle exception
			throw e;
		}
		
	}

	@Override
	public void update(Produit produit) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Produit> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Produit findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
