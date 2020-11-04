public class Grocerylistclient {
    public static void main(String[] args) {
        GroceryList list = new GroceryList();
        list.add("milk");
        System.out.println(list);
        list.add("eggs");
        System.out.println(list);
        list.add("oranges");
        System.out.println(list);
        list.remove("milk");
        System.out.println(list);

    }
}