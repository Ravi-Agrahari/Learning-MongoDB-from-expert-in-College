
MongoDB
=======


CURD Operation in MongoDB 
-------------------------

- Create Operation 
-------------------
    1. InsertOne() 

    - Insert a single document into a collection.
    - Example 
        db.users.insertOne({
            name : 'Ravi' , 
            age : 25 ,
            email : 'ravi@gmail.com',
        })

    2. InsertMany()

    - Insert multiple documents into a collection.
    - Example
        db.users.insertMany([
            { name : 'Ravi' , age : 25 , email : 'ravi@gmail.com', },
            { name : 'Rahul', age : 26 , email : 'rahul@gmail.com', }
             ]) ; 

    


- Read Operation 
-------------------

    1. find()
        - Retrieve documents from a collection.
        - Example
        db.users.find()
        db.users.find({name : 'Ravi'})
        db.users.find({age : $gte:25})
        db.users.find({age : $lte:25})

    2. findOne()
        - Retrieve a single first document from a collection.
        - Example
        db.users.findOne()
        db.users.findOne({name : 'Ravi'})
        db.users.findOne({age : $gte:30})

    
    3. CountDocuments()
    4. distinct()
    5. aggregate()
    6. find().sort()
    7. find().skip()
    8. find().limit()
    9. find().explain()
    ...


-- Update Operation 

    1. UpdateOne()
        - Update a single document in a collection.
        - Syntax 
        db.collection.updateOne()
        - Example
        db.users.updateOne({name : 'Ravi'},{$set : {age : 30}})

    * upsert : true  , means 
        -> It either updates an existing document if it matches a query or inserts a new document if no match is found by ensuring data is always current without separate update and insert logic.

    Example
        db.users.updateOne({name : 'Ravi'},{$set : {age : 30
        , upsert : true})



    2. UpdateMany()
        - Update multiple documents in a collection.
        - Syntax
        db.collection.updateMany()
        - Example 
        db.users.updateMany({age : $gte:30},{$set : {age : 30}})


    3. findOneandUpdate()


-- Delete Operation

    1. DeleteOne()
    - Delete a single document from a collection.


    * diff betn update and replace 
    -> update will update the document and replace will replace the document with new one.
    



MongoDB JDBC Connectivity
-------------------------

1. Import Libaries 
    - Import the MongoDB JDBC driver library into your project. The library is available on Maven Central Repository

2. Import/ load drivers 
3. Create a connection
4. Create the statements 
5. Execute the statements
6. Close the connection


