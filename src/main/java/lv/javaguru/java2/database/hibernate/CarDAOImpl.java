package lv.javaguru.java2.database.hibernate;

import lv.javaguru.java2.database.CarDAO;
import lv.javaguru.java2.database.DBException;
import lv.javaguru.java2.database.jdbc.DAOImpl;
import lv.javaguru.java2.domain.Car;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by VK on 2015.07.22..
 */

@Component("CarDAO_HIBERNATE")
public class CarDAOImpl extends DAOImpl implements CarDAO {

    @Autowired
    private SessionFactory sessionFactory;

    public void create(Car car) throws DBException {
        sessionFactory.getCurrentSession().save(car);
    }

    public Car getByMake(String make) throws DBException {
        //Car car =(Car) sessionFactory.getCurrentSession().get(Car.class, make);
        Car car;
        Criteria criteria = sessionFactory.getCurrentSession().createCriteria(Car.class);
        criteria.add(Restrictions.eq("make", make));
        return car = (Car) criteria.uniqueResult();
    }

    public List<Car> getAll() throws DBException {
        List<Car> cars = new ArrayList<Car>();
        return cars;
    }

    public void delete(Long id) throws DBException {

    }

    public void update(Car car) throws DBException {

    }

}