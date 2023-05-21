public class Main
{
    public static void main(String[] args)
    {

        ProductService service = new ProductService();
        
        System.out.println("Products on the table:");

        List<Product> products = service.getAllProducts();
        for (Product p : products)
        {
            if (p.getPlace().equalsIgnoreCase("table"))
            {
                System.out.println(p);
            }
        }
    }
}
