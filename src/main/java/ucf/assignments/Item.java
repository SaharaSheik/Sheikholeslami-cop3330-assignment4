package ucf.assignments;

import java.text.DateFormat;
import java.util.Date;

public class Item {

    String itemDescription;
    Date dueDate = new Date();


    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {

        // use keyword this. to set the item Description from text field additemName GUI
         //this.itemDescription == itemDescription ToDoListPage
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {

        // use keyword this. to set the due date from date filed addItemDueDate GUI

       // this.dueDate == dueDate in ToDoListPage
    }
}
