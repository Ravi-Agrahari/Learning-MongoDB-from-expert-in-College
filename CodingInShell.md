show collections 
students
show dbs 
SECE    112.00 KiB
admin    40.00 KiB
config  108.00 KiB
local    40.00 KiB
test     56.00 KiB
use EmployeeDatabase
switched to db EmployeeDatabase
db.employees.insertOne({empid : 101 , empname : 'Ravi Agrahari' , dob : '2004-07-20' , empDept : 'Development' , age : 20 })
{
  acknowledged: true,
  insertedId: ObjectId('673198e2d49493e8441ff709')
}
db.employees.insertMany([
{empid : 102 , empname : 'Bishal Agrahari' , dob : '2006-07-20' , empDept : 'Designing' , age : 18 },
{empid : 103 , empname : 'Hukkum Dhami' , dob : '2004-07-04' , empDept : 'Testing' , age : 20 },
{empid : 104 , empname : 'Rikesh Ahir' , dob : '2002-02-32' , empDept : 'Cleaning dept' , age : 22 },
{empid : 105 , empname : 'Awadesh Thakur' , dob : '2003-06-20' , empDept : 'Finance' , age : 21 },
])
{
  acknowledged: true,
  insertedIds: {
    '0': ObjectId('67319a2ed49493e8441ff70a'),
    '1': ObjectId('67319a2ed49493e8441ff70b'),
    '2': ObjectId('67319a2ed49493e8441ff70c'),
    '3': ObjectId('67319a2ed49493e8441ff70d')
  }
}
db.employees.find()
{
  _id: ObjectId('673198e2d49493e8441ff709'),
  empid: 101,
  empname: 'Ravi Agrahari',
  dob: '2004-07-20',
  empDept: 'Development',
  age: 20
}
{
  _id: ObjectId('67319a2ed49493e8441ff70a'),
  empid: 102,
  empname: 'Bishal Agrahari',
  dob: '2006-07-20',
  empDept: 'Designing',
  age: 18
}
{
  _id: ObjectId('67319a2ed49493e8441ff70b'),
  empid: 103,
  empname: 'Hukkum Dhami',
  dob: '2004-07-04',
  empDept: 'Testing',
  age: 20
}
{
  _id: ObjectId('67319a2ed49493e8441ff70c'),
  empid: 104,
  empname: 'Rikesh Ahir',
  dob: '2002-02-32',
  empDept: 'Cleaning dept',
  age: 22
}
{
  _id: ObjectId('67319a2ed49493e8441ff70d'),
  empid: 105,
  empname: 'Awadesh Thakur',
  dob: '2003-06-20',
  empDept: 'Finance',
  age: 21
}
db.employees.update({name : 'Hukkum Dhami' , {$set : {name : 'Suran Singh Dhami' }}})
SyntaxError: Unexpected token (1:45)

> 1 | db.employees.update({name : 'Hukkum Dhami' , {$set : {name : 'Suran Singh Dhami' }}})
    |                                              ^
db.employees.update({name : 'Hukkum Dhami'} , {$set : {name : 'Suran Singh Dhami' }})
DeprecationWarning: Collection.update() is deprecated. Use updateOne, updateMany, or bulkWrite.
{
  acknowledged: true,
  insertedId: null,
  matchedCount: 0,
  modifiedCount: 0,
  upsertedCount: 0
}
db.employees.find({name : 'Hukkum Dhami'})
db.employees.find({name : 'Suran Singh Dhami'})
db.employees.find()
{
  _id: ObjectId('673198e2d49493e8441ff709'),
  empid: 101,
  empname: 'Ravi Agrahari',
  dob: '2004-07-20',
  empDept: 'Development',
  age: 20
}
{
  _id: ObjectId('67319a2ed49493e8441ff70a'),
  empid: 102,
  empname: 'Bishal Agrahari',
  dob: '2006-07-20',
  empDept: 'Designing',
  age: 18
}
{
  _id: ObjectId('67319a2ed49493e8441ff70b'),
  empid: 103,
  empname: 'Hukkum Dhami',
  dob: '2004-07-04',
  empDept: 'Testing',
  age: 20
}
{
  _id: ObjectId('67319a2ed49493e8441ff70c'),
  empid: 104,
  empname: 'Rikesh Ahir',
  dob: '2002-02-32',
  empDept: 'Cleaning dept',
  age: 22
}
{
  _id: ObjectId('67319a2ed49493e8441ff70d'),
  empid: 105,
  empname: 'Awadesh Thakur',
  dob: '2003-06-20',
  empDept: 'Finance',
  age: 21
}
db.employees.updateOne({name : 'Hukkum Dhami'} , {$set : {name : 'Suran Singh Dhami' }})
{
  acknowledged: true,
  insertedId: null,
  matchedCount: 0,
  modifiedCount: 0,
  upsertedCount: 0
}
db.employees.find({name : 'Suran Singh Dhami'})
db.employees.find()
{
  _id: ObjectId('673198e2d49493e8441ff709'),
  empid: 101,
  empname: 'Ravi Agrahari',
  dob: '2004-07-20',
  empDept: 'Development',
  age: 20
}
{
  _id: ObjectId('67319a2ed49493e8441ff70a'),
  empid: 102,
  empname: 'Bishal Agrahari',
  dob: '2006-07-20',
  empDept: 'Designing',
  age: 18
}
{
  _id: ObjectId('67319a2ed49493e8441ff70b'),
  empid: 103,
  empname: 'Hukkum Dhami',
  dob: '2004-07-04',
  empDept: 'Testing',
  age: 20
}
{
  _id: ObjectId('67319a2ed49493e8441ff70c'),
  empid: 104,
  empname: 'Rikesh Ahir',
  dob: '2002-02-32',
  empDept: 'Cleaning dept',
  age: 22
}
{
  _id: ObjectId('67319a2ed49493e8441ff70d'),
  empid: 105,
  empname: 'Awadesh Thakur',
  dob: '2003-06-20',
  empDept: 'Finance',
  age: 21
}
db.employees.updateOne({empname : 'Hukkum Dhami'} , {$set : {empname : 'Suran Singh Dhami' }})
{
  acknowledged: true,
  insertedId: null,
  matchedCount: 1,
  modifiedCount: 1,
  upsertedCount: 0
}
db.employees.find()
{
  _id: ObjectId('673198e2d49493e8441ff709'),
  empid: 101,
  empname: 'Ravi Agrahari',
  dob: '2004-07-20',
  empDept: 'Development',
  age: 20
}
{
  _id: ObjectId('67319a2ed49493e8441ff70a'),
  empid: 102,
  empname: 'Bishal Agrahari',
  dob: '2006-07-20',
  empDept: 'Designing',
  age: 18
}
{
  _id: ObjectId('67319a2ed49493e8441ff70b'),
  empid: 103,
  empname: 'Suran Singh Dhami',
  dob: '2004-07-04',
  empDept: 'Testing',
  age: 20
}
{
  _id: ObjectId('67319a2ed49493e8441ff70c'),
  empid: 104,
  empname: 'Rikesh Ahir',
  dob: '2002-02-32',
  empDept: 'Cleaning dept',
  age: 22
}
{
  _id: ObjectId('67319a2ed49493e8441ff70d'),
  empid: 105,
  empname: 'Awadesh Thakur',
  dob: '2003-06-20',
  empDept: 'Finance',
  age: 21
}
EmployeeDatabase

