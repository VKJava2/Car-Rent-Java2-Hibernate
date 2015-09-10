package lv.javaguru.java2.database.jdbc;

import lv.javaguru.java2.database.DBException;
import lv.javaguru.java2.database.VehicleDAO;
import lv.javaguru.java2.domain.MiniBus;
import lv.javaguru.java2.domain.Motorcycle;
import lv.javaguru.java2.domain.PersonalCar;
import lv.javaguru.java2.domain.Vehicle;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.hibernate.type.EntityType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Join;
import javax.persistence.criteria.Root;
import javax.persistence.metamodel.Metamodel;
import java.util.List;

/**
 * Created by Kano on 2015.09.10..
 */

@Component
public class VehicleDAOImpl<VehicleType, FilterParameter> implements VehicleDAO<VehicleType, FilterParameter> {

    @Autowired
    private SessionFactory sessionFactory;

    @Autowired
    private EntityManager em;

    public void create(VehicleType  currentVehicle) throws DBException {
        sessionFactory.getCurrentSession().save(currentVehicle);
    }

    public void delete(String id) throws DBException {

    }

    public void update(String id) throws DBException {

    }

    public List<Vehicle> getAll(VehicleType currentVehicle) throws DBException {
//        Metamodel metamodel = em.getMetamodel();
//        EntityType<Vehicle> = metamodel.entity(Vehicle.class);
        CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
        CriteriaQuery<Vehicle> criteriaQuery = criteriaBuilder.createQuery(Vehicle.class);
        Root<Vehicle> from = criteriaQuery.from(Vehicle.class);
        CriteriaQuery<Vehicle> select  = criteriaQuery.select(from);
        TypedQuery<Vehicle> typedQuery = em.createQuery(select);
        List<Vehicle> resultList = typedQuery.getResultList();
//        Join<Vehicle, Motorcycle> motorcycle = vehicleRoot.join(vehicleRoot_.);
//        Join<Vehicle, PersonalCar> personaCar = vehicleRoot.join();
//        Join<Vehicle, MiniBus> miniBus = vehicleRoot.join();
        return resultList;
    }

    public Vehicle getById(String id) throws DBException {
        return null;
    }

    public List<Vehicle> filterByParameter (String vehicleType, String parameter, String parameterValue) throws DBException {
        return null;
    }

}
