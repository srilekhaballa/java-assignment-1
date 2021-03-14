package com.example.demo;

import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import java.util.List;

@Repository
public class EmployeeDaoJpaImplement implements Dao<Employee> {

    @PersistenceUnit
    private EntityManagerFactory emf;

    @Override
    public void save(Employee employee) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(employee);
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public Employee load(int empid) {
        EntityManager em = emf.createEntityManager();
        Employee employee = em.find(Employee.class, empid);
        em.close();
        return employee;
    }

    @Override
    public void delete(int empid) {
        EntityManager em = emf.createEntityManager();
        Employee employee = em.find(Employee.class, empid);

        em.getTransaction().begin();
        em.remove(employee);
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public void update(Employee employee) {

        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.merge(employee);
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public List<Employee> loadAll() {
        EntityManager em = emf.createEntityManager();
        List<Employee> employees = em.createQuery("Select e from Employee e")
                                 .getResultList();
        em.close();
        return employees;
    }
}
