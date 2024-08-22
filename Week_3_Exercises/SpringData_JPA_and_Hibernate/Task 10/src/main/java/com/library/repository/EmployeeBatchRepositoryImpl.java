package com.library.repository;

import com.library.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeBatchRepositoryImpl {

    @Autowired
    private SessionFactory sessionFactory;

    public void saveEmployeesInBatch(List<Employee> employees) {
        int batchSize = 50;
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();

        try {
            for (int i = 0; i < employees.size(); i++) {
                session.save(employees.get(i));

                if (i % batchSize == 0 && i > 0) {
                    session.flush();
                    session.clear();
                }
            }

            tx.commit();
        } catch (Exception e) {
            if (tx != null) tx.rollback();
            throw e;
        } finally {
            session.close();
        }
    }
}
