package genspark.pbc.SimpleTaskManagerAPI.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Setter
//@AllArgsConstructor
//@NoArgsConstructor
//@ToString
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long tid;
    public String ttask;
}
