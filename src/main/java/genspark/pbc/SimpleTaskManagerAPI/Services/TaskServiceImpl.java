package genspark.pbc.SimpleTaskManagerAPI.Services;

import genspark.pbc.SimpleTaskManagerAPI.Entity.Task;
import genspark.pbc.SimpleTaskManagerAPI.Repository.TaskDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Service
public class TaskServiceImpl implements TaskService{

    @Autowired
    public TaskDAO taskDAO;
    @Override
    public List<Task> getAllTask() {
        return this.taskDAO.findAll();
    }

    @Override
    public Task getTaskById(long taskId) {
        Optional<Task> t = this.taskDAO.findById(taskId); // find task
        Task task = null;
        if (t.isPresent()){ // if exist get it and return
            task=t.get();
        } else {
            throw new RuntimeException(STR."Task Not Found :\{taskId}");
        }
        return task;
    }

    @Override
    public Task addTask(Task task) {
        return this.taskDAO.save(task);
    }

    @Override
    public Task updateTask(Task task) {
        return this.taskDAO.save(task);
    }

    @Override
    public String deleteTaskById(long taskId) {
        this.taskDAO.deleteById(taskId);
        return "Task Deleted Successfully";
    }
}
