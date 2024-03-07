import java.util.Formatter;

public class Category {
    private String name;

    private Item[] array;

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setArray(Item[] array) {
        this.array = array;
    }
    public Item[] getArray() {
        return array;
    }
    public String itemList(){
        String str = "";
        for (int i = 0; i < array.length; i++) {
            str += (i+1 + ")" +array[i].getName() + "(" + array[i].getRate() + ") - " + array[i].getCost() + " руб\n");
        }
        return str;
    }
}
