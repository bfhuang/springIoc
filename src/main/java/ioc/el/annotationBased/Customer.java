package ioc.el.annotationBased;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Service
//@Controller("customerBean")
@Component("customerBean")
public class Customer {

   @Autowired
    private Item item;

    @Value("#{itemBean.name}")
    private String itemName;

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
}