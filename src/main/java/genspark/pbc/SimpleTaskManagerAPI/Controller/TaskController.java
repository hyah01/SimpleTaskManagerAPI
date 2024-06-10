package genspark.pbc.SimpleTaskManagerAPI.Controller;

import genspark.pbc.SimpleTaskManagerAPI.Entity.Task;
import genspark.pbc.SimpleTaskManagerAPI.Services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TaskController {
    @Autowired
    public TaskService ts;
    @GetMapping("/")
    public String home(){
        return "<h1>Welcome to your task manager</h1>";
    }

    @GetMapping("/Tasks")
    public List<Task> getTasks(){
        return this.ts.getAllTask();
    }

    @GetMapping("/Tasks/{taskID}")
    public Task getSingleTask(@PathVariable Long taskID){
        return this.ts.getTaskById(taskID);
    }

    @PostMapping("/Tasks")
    public Task addTask(@RequestBody Task task){
        return this.ts.addTask(task);
    }
    @PutMapping("/Tasks")
    public Task updateTask(@RequestBody Task task){
        return this.ts.updateTask(task);
    }

    @DeleteMapping("/Tasks/{taskID}")
    public String deleteTask(@PathVariable Long taskID){
        return this.ts.deleteTaskById(taskID);
    }
}
