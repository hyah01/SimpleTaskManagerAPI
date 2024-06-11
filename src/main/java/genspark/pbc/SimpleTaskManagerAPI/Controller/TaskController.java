package genspark.pbc.SimpleTaskManagerAPI.Controller;

import genspark.pbc.SimpleTaskManagerAPI.Entity.Task;
import genspark.pbc.SimpleTaskManagerAPI.Services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TaskController {
    // automatically wire up beans (components) defined in application context and inject them into ts
    @Autowired
    public TaskService ts;

    // Home page
    @GetMapping("/")
    public String home(){
        return "<h1>Welcome to your task manager</h1>";
    }

    // return all the task in db
    @GetMapping("/Tasks")
    public List<Task> getTasks(){
        return this.ts.getAllTask();
    }

    // return a single task by id
    @GetMapping("/Tasks/{taskID}")
    public Task getSingleTask(@PathVariable Long taskID){
        return this.ts.getTaskById(taskID);
    }

    // add task to the db
    @PostMapping("/Tasks")
    public Task addTask(@RequestBody Task task){
        return this.ts.addTask(task);
    }

    // update task in db
    @PutMapping("/Tasks")
    public Task updateTask(@RequestBody Task task){
        return this.ts.updateTask(task);
    }

    // delete task in db
    @DeleteMapping("/Tasks/{taskID}")
    public String deleteTask(@PathVariable Long taskID){
        return this.ts.deleteTaskById(taskID);
    }
}
