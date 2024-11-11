package com.employeepackage;

import com.mongodb.client.*;
import org.bson.Document;

public class Main {
    public static void main(String[] args) {
        // Create a MongoDB client
        MongoClient mongoClient = MongoClients.create("mongodb://localhost:27017");
        
        // Get the database
        MongoDatabase database = mongoClient.getDatabase("NewEmployeeDatabase");
        
        // Get the collection
        MongoCollection<Document> collection = database.getCollection("employees");
        
        // Create documents to insert
        // Document student1 = new Document("name", "Harish revanth")
        //     .append("age", 20)
        //     .append("major", "Computer Science")
        //     .append("gpa", 3.8);

        // Document student2 = new Document("name", "Janani")
        //     .append("age", 22)
        //     .append("major", "Engineering")
        //     .append("gpa", 3.9)
        //     .append("gender", "Female");
        
        // // Insert documents
        // collection.insertOne(student1);
        // collection.insertOne(student2);
        
        // System.out.println("Documents inserted successfully!");

        // List the documents
        FindIterable<Document> documents = collection.find();
        for (Document doc : documents) {
            System.out.println(doc.toJson());
        }

        // Close the connection
        mongoClient.close();
    }
}