package genspark.pbc.SimpleTaskManagerAPI.Repository;

import genspark.pbc.SimpleTaskManagerAPI.Entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskDAO extends JpaRepository<Task,Long> {

}
