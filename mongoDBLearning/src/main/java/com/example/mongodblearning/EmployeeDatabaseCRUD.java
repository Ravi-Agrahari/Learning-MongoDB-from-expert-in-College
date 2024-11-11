package com.example.mongodblearning ;

import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.result.DeleteResult;
import com.mongodb.client.result.UpdateResult;
import org.bson.Document;

public class EmployeeDatabaseCRUD {

    private static final String URI = "mongodb://localhost:27017"; // Update as needed
    private static final String DATABASE_NAME = "EmployeeDatabase";
    private static final String COLLECTION_NAME = "employees";

    private final MongoCollection<Document> collection;

    public EmployeeDatabaseCRUD() {
        // Connect to MongoDB and initialize the collection
        MongoClient mongoClient = MongoClients.create(URI);
        MongoDatabase database = mongoClient.getDatabase(DATABASE_NAME);
        this.collection = database.getCollection(COLLECTION_NAME);
    }

    // Create (Insert) a new employee
    public void insertEmployee(String name, int age, String department) {
        Document employee = new Document("name", name)
                .append("age", age)
                .append("department", department);
        collection.insertOne(employee);
        System.out.println("Inserted employee: " + employee.toJson());
    }

    // Read (Find) a specific employee by name
    public void findEmployee(String name) {
        Document query = new Document("name", name);
        Document employee = collection.find(query).first();

        if (employee != null) {
            System.out.println("Found employee: " + employee.toJson());
        } else {
            System.out.println("No employee found with name: " + name);
        }
    }

    // Read all employees in the collection
    public void findAllEmployees() {
        for (Document doc : collection.find()) {
            System.out.println(doc.toJson());
        }
    }

    // Update an employee's department by name
    public void updateEmployee(String name, String newDepartment) {
        Document query = new Document("name", name);
        Document update = new Document("$set", new Document("department", newDepartment));

        UpdateResult result = collection.updateOne(query, update);
        if (result.getModifiedCount() > 0) {
            System.out.println("Updated employee's department for " + name + " to " + newDepartment);
        } else {
            System.out.println("No employee found with name: " + name);
        }
    }

    // Delete an employee by name
    public void deleteEmployee(String name) {
        Document query = new Document("name", name);
        DeleteResult result = collection.deleteOne(query);

        if (result.getDeletedCount() > 0) {
            System.out.println("Deleted employee with name: " + name);
        } else {
            System.out.println("No employee found with name: " + name);
        }
    }

    // Main method to demonstrate CRUD operations
    public static void main(String[] args) {
        EmployeeDatabaseCRUD dbCRUD = new EmployeeDatabaseCRUD();

        // Insert a new employee
        dbCRUD.insertEmployee("Alice", 30, "HR");

        // Find an employee by name
        dbCRUD.findEmployee("Alice");

        // Update the employee's department
        dbCRUD.updateEmployee("Alice", "Finance");

        // Find all employees
        System.out.println("Listing all employees:");
        dbCRUD.findAllEmployees();

        // Delete the employee
        dbCRUD.deleteEmployee("Alice");

        // List all employees after deletion
        System.out.println("Listing all employees after deletion:");
        dbCRUD.findAllEmployees();
    }
}
