public class GroceryList {
    private String[] arr;

    public GroceryList() {
        // our grocery list will have a max size of 10
        this.arr = new String[10]; 
    }

    public void add(String item) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                arr[i] = item;
                break;
            }
        }
    }

    public void remove(String item){
        for (int k = 0; k < arr.length; k++){
            if (arr[k] == item) {
                for (int i = 0; i < arr.length - 1; i ++){
                    arr[k] = arr[i + 1];
                }
            }
        }
    }

    public String toString(){
        String str = "list : ";
        for(int i = 0; i < arr.length - 1; i++){
            if (this.arr[i] != null){
                str += this.arr[i] + " , ";
            }

            else if (this.arr[i+1] == null){
                break;

            }
        }
        return str;
    }
    
}

