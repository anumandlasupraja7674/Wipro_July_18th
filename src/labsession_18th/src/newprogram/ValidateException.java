package newprogram;

//Custom Exception
class MyValidationException extends Exception {
 public MyValidationException(String message) {
     super(message);
 }
}

//Book class
class Book {
 int id;
 String title;

 Book(int id, String title) throws MyValidationException {
     if (id <= 0) {
         throw new MyValidationException("Book ID must be positive");
     }
     if (title == null || title.isEmpty()) {
         throw new MyValidationException("Book title cannot be empty");
     }
     this.id = id;
     this.title = title;
 }
}

//User class
class User {
 int id;
 String name;

 User(int id, String name) throws MyValidationException {
     if (id <= 0) {
         throw new MyValidationException("User ID must be positive");
     }
     if (name == null || name.isEmpty()) {
         throw new MyValidationException("User name cannot be empty");
     }
     this.id = id;
     this.name = name;
 }
}

//Student class
class Student {
 int id;
 String name;

 Student(int id, String name) throws MyValidationException {
     if (id <= 0) {
         throw new MyValidationException("Student ID must be positive");
     }
     this.id = id;
     this.name = name;
 }
}

//Customer class
class Customer {
 int id;
 String name;

 Customer(int id, String name) throws MyValidationException {
     if (id <= 0) {
         throw new MyValidationException("Customer ID must be positive");
     }
     this.id = id;
     this.name = name;
 }
}

//Order class
class Order {
 int id;

 Order(int id) throws MyValidationException {
     if (id <= 0) {
         throw new MyValidationException("Order ID must be positive");
     }
     this.id = id;
 }
}

//Test class
public class ValidateException {
 public static void main(String[] args) {
     try {
         Book book = new Book(1, "Java Book");
         User user = new User(2, "Alice");
         Student student = new Student(3, "Bob");
         Customer customer = new Customer(4, "Charlie");
         Order order = new Order(5);

         System.out.println("All objects created successfully!");

     } catch (MyValidationException e) {
         System.out.println("Validation Error: " + e.getMessage());
     }
 }
}
