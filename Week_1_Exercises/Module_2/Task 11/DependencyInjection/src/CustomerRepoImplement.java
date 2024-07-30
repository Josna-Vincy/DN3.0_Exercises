public class CustomerRepoImplement implements CustomerRepo {

    @Override
    public Customer findCustomerById(String id) {
        return new Customer(id, "Josna Vincy");
    }
}
