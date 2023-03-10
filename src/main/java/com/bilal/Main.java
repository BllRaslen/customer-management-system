package com.bilal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@SpringBootApplication
/*@ComponentScan(basePackages = "com.amigoscode")
@EnableAutoConfiguration
@Configuration*/
@RestController
@RequestMapping("api/v1/customers")
public class Main {
    private final CustomerRepository customerRepository;

    public Main(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }



    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);


    }


    @GetMapping
    public List<Customer> getCustomers(){
        return customerRepository.findAll();
    }


    record NewCustomerRequest(
            String name,
            String email,
            Integer age
    ){

    }

        Customer customer= new Customer();
    @PostMapping
    public void addCustomer(@RequestBody NewCustomerRequest newCustomerRequest){

        customer.setName(newCustomerRequest.name());
        customer.setEmail(newCustomerRequest.email());
        customer.setAge(newCustomerRequest.age());
        customerRepository.save(customer);
    }

    @DeleteMapping("{customerId}")
    public void eleteCustomer(@PathVariable("customerId") Integer id){
        customerRepository.deleteById(id);
    }

    @PutMapping("{customerId}")
    Customer replaceEmployee(@RequestBody Customer customer, @PathVariable Integer id) {

        return customerRepository.findById(id)
                .map(employee -> {
                    employee.setName(customer.getName());
                    employee.setEmail(customer.getEmail());
                    return customerRepository.save(employee);
                })
                .orElseGet(() -> {
                    customer.setId(id);
                    return customerRepository.save(customer);
                });
    }
}

  /*  record GreetResponse(
            String greet,
            List<String> favOrogrammingLanguages,
            Person person

    ){}

    @GetMapping("/greet")
    public GreetResponse greet() {
        final GreetResponse greetResponse = new GreetResponse(
                "Hello",
                List.of("Java", "JS", "C++", "C#", "Python"),
                new Person("Bilal", 21, 300_00D)
        );
        return greetResponse;
    }

    record Person(String person, int age, Double savings) {


    }



class GreetResponse{
        private  String greet;

    public GreetResponse(String greet) {
        this.greet = greet;
    }

    public GreetResponse() {
    }

    public String getGreet() {
        return greet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GreetResponse that = (GreetResponse) o;
        return Objects.equals(greet, that.greet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(greet);
    }

    @Override
    public String toString() {
        return "GreetResponse{" +
                "greet='" + greet + '\'' +
                '}';
    }
}

*/