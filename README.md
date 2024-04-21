# Customer Management System

This is a simple Spring Boot application for managing customer data. It provides RESTful APIs to perform CRUD (Create, Read, Update, Delete) operations on customer records stored in a database.

## Features

- **Create:** Add new customers with their name, email, and age.
- **Read:** Retrieve a list of all customers or fetch a specific customer by ID.
- **Update:** Modify existing customer details.
- **Delete:** Remove a customer from the database.

## Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- Jakarta Persistence (formerly known as JPA)
- Maven (for dependency management)
- H2 Database (for local development, can be easily switched to other databases like MySQL, PostgreSQL, etc.)

## Setup

1. Clone the repository:
    ```bash
    git clone https://github.com/your-username/customer-management-system.git
    ```

2. Navigate to the project directory:
    ```bash
    cd customer-management-system
    ```

3. Build the project:
    ```bash
    mvn clean install
    ```

4. Run the application:
    ```bash
    mvn spring-boot:run
    ```

5. Access the API documentation:
    Open your web browser and go to [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html) to view and interact with the API endpoints using Swagger UI.
   
Post
![image](https://user-images.githubusercontent.com/121360095/224208163-e428b3eb-937c-4432-ae64-d2905e1ca1e3.png)

GET
![image](https://user-images.githubusercontent.com/121360095/224209367-72b9369b-bc37-4dd4-8b91-b613da03ed21.png)


DELETE BEFORE:
![image](https://user-images.githubusercontent.com/121360095/224211564-e1569e28-e21a-4c1f-8c98-dc365d712dad.png)

DELETE AFTER : 
![image](https://user-images.githubusercontent.com/121360095/224211870-3714f1b9-aeb5-40db-a6bb-6a4a96ef619c.png)

## API Endpoints

- **GET /api/v1/customers:** Get a list of all customers.
- **GET /api/v1/customers/{customerId}:** Get details of a specific customer by ID.
- **POST /api/v1/customers:** Add a new customer.
- **PUT /api/v1/customers/{customerId}:** Update details of an existing customer.
- **DELETE /api/v1/customers/{customerId}:** Delete a customer by ID.

## Contributing

Contributions are welcome! If you find any issues or want to suggest improvements, feel free to open a pull request.

## License

This project is licensed under the MIT License.



