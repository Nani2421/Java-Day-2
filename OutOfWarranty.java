import java.util.List;

public class Main 
{
    public static void main(String[] args)
    {

        ProductService service = new ProductService();

        System.out.println("Products out of warranty:");

        List<Product> products = service.getAllProducts();
        for (Product p : products)
        {
            if (p.getWarranty() < 2023)
            { 
                System.out.println(p);
            }
        }
    }
}