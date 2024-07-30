public class TestDependencyInjection {
    public static void main(String[] args) {

        CustomerRepo repository = new CustomerRepoImplement();
        CustomerService service = new CustomerService(repository);
        Customer customer = service.getCustomerById("1");
        System.out.println(customer);
    }
}
