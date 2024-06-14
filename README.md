# SimpleTaskManagerAPI

## Introduction
This Simple Task Manager API allows users to manage tasks through various operations that interact with the database.

## Features
- Add a single task with validation to ensure inputs are correct.
- Retrieve tasks:
    - Retrieve all tasks
    - Retrieve tasks by ID
- Update existing task details with validation
- Delete tasks from the database
- Display the homepage with a welcome message

## Setup Instruction
1. Clone the repository: `git clone https://github.com/hyah01/SimpleTaskManagerAPI`
2. Navigate to the project directory `cd SimpleTaskManagerAPI`
3. Open `application.properties` file located in `src/main/resources`
4. Ensure the H2 database configuration is set up
   ```
    spring.datasource.url=jdbc:h2:mem
    spring.datasource.driverClassName=org.h2.Driver
    spring.datasource.username=sa
    spring.datasource.password=password
    spring.h2.console.enabled=true
   ```
5. Build the project `mvn clean install`
6. Run the application `mvn spring-boot:run`
7. Access the application through `http://localhost:9090`
8. Use Postman to utilize HTTP Requests

## Usage
### Homepage
Access `GET` method on `/` to display a welcome message.

### Get All Tasks
Use `GET` method on `/Tasks`

### Get Task By ID
Use `GET` method on `/Tasks/{taskID}` Where taskID is the ID of the task

### Add a New Task
Use `POST` method on `/Tasks`
On Body `{
"ttask": "Task Name",
}`

### Update a Task
Use `PUT` method on `/Tasks`
On Body `{
"id": 1,
"ttask": "Updated Task Name",
}`

### Delete a Task
Use `DELETE` method on `/Tasks/{taskID}` Where taskID is the ID of the task