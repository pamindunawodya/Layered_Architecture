package lk.ijse.pos.util;



import lk.ijse.pos.entity.Customer;
import lk.ijse.pos.entity.Item;
//import lk.ijse.pos.entity.OrderDetails;
import lk.ijse.pos.entity.OrderDetail;
import lk.ijse.pos.entity.Orders;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FactoryConfiguration {
    public  static  FactoryConfiguration factoryConfiguration;

    private SessionFactory sessionFactory;

    private FactoryConfiguration() throws HibernateException {
        Configuration configuration= new Configuration().configure().addAnnotatedClass(Customer.class).addAnnotatedClass(Item.class).addAnnotatedClass(Orders.class).addAnnotatedClass(OrderDetail.class);
        sessionFactory=configuration.  buildSessionFactory();
        }

    public static FactoryConfiguration getInstance() {
        return factoryConfiguration == null ?
                factoryConfiguration = new FactoryConfiguration() : factoryConfiguration;

    }
    public Session getSession() throws HibernateException {
        return sessionFactory.openSession();
    }
}
