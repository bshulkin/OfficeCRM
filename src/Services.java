public class Services {
    int id;
    String name;
    int price;

    public Services(int id, String name, int price){
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public void setID(int newID){
        id = newID;
    }

    public void setName(String newName){
        name = newName;
    }

    public void setPrice(int newPrice){
        price = newPrice;
    }

    public int getId() {
        return id;
    }

    public String getFullService(){
        String fullService;
        fullService = id + " " + name + " " + price;
        return fullService;
    }

    public String toString(){
        return String.format(id + "\t\t" + name + "\t\t$" + price);
    }
}
