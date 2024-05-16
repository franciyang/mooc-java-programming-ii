public class ProductWarehouseWithHistory extends ProductWarehouse{
    private ChangeHistory list;

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance){
        super(productName, capacity);
        super.addToWarehouse(initialBalance);
        this.list = new ChangeHistory();
        this.list.add(initialBalance);
    }

    public String history(){
        return this.list.toString();
    }

    @Override
    public void addToWarehouse(double amount){
        double result = 0;
        result = (double) super.getBalance() + amount;
        this.list.add(result);
        super.addToWarehouse(amount);
    }
    
    @Override
    public double takeFromWarehouse(double amount){
        double result = 0;
        result = (double) super.getBalance() - amount;
        this.list.add(result);
        return super.takeFromWarehouse(amount);
    }

    public void printAnalysis(){
        System.out.println("Product: " + this.getName());
        System.out.println("History: " + list);
        System.out.println("Largest amount of product: " + list.maxValue());
        System.out.println("Smallest amount of product: " + list.minValue());
        System.out.println("Average: " + list.average());
    }
}
