package controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import model.Cars;


public class ListCarsHelper {
	static	EntityManagerFactory emfactory	= Persistence.createEntityManagerFactory("CarLists");
	public void insertCars(Cars li) {
		EntityManager	em	=	emfactory.createEntityManager();
		em.getTransaction().begin();
		em.persist(li);
		em.getTransaction().commit();
		em.close();		
	}
	public	List<Cars>	showAllItems(){
		EntityManager	em	=	emfactory.createEntityManager();
		List<Cars>	allItems	=	em.createQuery("SELECT i FROM Cars i").getResultList();
		return	allItems;
		}
	public void deleteCars(Cars toDelete) {
		EntityManager	em	=	emfactory.createEntityManager();
		em.getTransaction().begin();
		TypedQuery<Cars> typedQuery	= em.createQuery("select li from Cars li where li.model = :selectedItem",Cars.class);
		//Substitute	parameter	with	actual	data	from	the	toDelete	item
		//typedQuery.setParameter("selectedQuantity",	toDelete.getQuantity());
		typedQuery.setParameter("selectedItem",	toDelete.getModel());
		//we	only	want	one	result
		typedQuery.setMaxResults(1);
		//get	the	result	and	save	it	into	a	new	list	item
		Cars	result	=	typedQuery.getSingleResult();
		//remove	it
		em.remove(result);
		em.getTransaction().commit();
		em.close();
	}
	public void updateCars(Cars toEdit) {
		// TODO Auto-generated method stub
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		em.merge(toEdit);
		em.getTransaction().commit();
		em.close();
	}
	public Cars searchForCarsById(int idToEdit) {
		// TODO Auto-generated method stub
		EntityManager	em	=	emfactory.createEntityManager();
		em.getTransaction().begin();
		Cars found = em.find(Cars.class, idToEdit);
		em.close();
		return	found;
	}
	public List<Cars> searchForCarsByCars(String itemName) {
		// TODO Auto-generated method stub
		EntityManager em	=	emfactory.createEntityManager();
		em.getTransaction().begin();
		TypedQuery<Cars> typedQuery	= em.createQuery("select li	from Cars li where li.Make = :selectedItem",	Cars.class);
		typedQuery.setParameter("selectedItem",	itemName);
		List<Cars>	foundItems	=	typedQuery.getResultList();
		em.close();
		return	foundItems;
	}
	public void	cleanUp(){
		emfactory.close();
		}
}
