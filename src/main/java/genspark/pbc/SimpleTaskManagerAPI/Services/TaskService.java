package genspark.pbc.SimpleTaskManagerAPI.Services;

import genspark.pbc.SimpleTaskManagerAPI.Entity.Task;

import java.util.List;

public interface TaskService {

    List<Task> getAllTask();
    Task getTaskById(long taskId);
    Task addTask(Task task);
    Task updateTask(Task task);
    String deleteTaskById(long taskId);

}
