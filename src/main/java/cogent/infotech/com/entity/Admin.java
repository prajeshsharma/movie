package cogent.infotech.com.entity;

import lombok.*;
import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Admin {
    @Id
    private int id;
    private String username;
    private String password;
    private String email;
}
