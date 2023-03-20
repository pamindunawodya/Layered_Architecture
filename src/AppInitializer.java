import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import lk.ijse.pos.entity.Item;
import lk.ijse.pos.entity.Orders;
import lk.ijse.pos.util.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;



public class AppInitializer extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException, IOException {
       Parent root = FXMLLoader.load(this.getClass().getResource("/lk/ijse/pos/view/main-form.fxml"));
        Scene mainScene = new Scene(root);
        primaryStage.setScene(mainScene);
        primaryStage.setTitle("Java FX POS");
        primaryStage.centerOnScreen();
        primaryStage.show();
    }
/*public static void main(String[]args){
    Item item1=new Item();
    item1.setCode("I003");
    item1.setDescription("Dhal");
    item1.setQtyOnHand(25);
    item1.setUnitPrice(500.00);

    Item item2=new Item();
    item2.setCode("I005");
    item2.setDescription("Oil");
    item2.setQtyOnHand(25);
    item2.setUnitPrice(500.00);


    Orders orders=new Orders();
    orders.setOid("OID-006");
    orders.setDate(LocalDate.now());
    orders.setCustomerID("C005");

    Orders orders1=new Orders();
    orders1.setOid("I008");
    orders1.setDate(LocalDate.now());
    orders1.setCustomerID("C005");



    ArrayList<Orders>ordersArrayList=new ArrayList<>();
    ordersArrayList.add(orders);
    ordersArrayList.add(orders1);

    ArrayList<Item>itemArrayList=new ArrayList<>();
    itemArrayList.add(item1);
    itemArrayList.add(item2);

    orders.setItemList(itemArrayList);
    orders1.setItemList(itemArrayList);

    item1.setOrdersList(ordersArrayList);
    item2.setOrdersList(ordersArrayList);

    Session session= FactoryConfiguration.getInstance().getSession();
    Transaction transaction= session.beginTransaction();

    session.save(item1);
    session.save(item2);
    session.save(orders);
    session.save(orders1);

    transaction.commit();
    session.close();*/

}

