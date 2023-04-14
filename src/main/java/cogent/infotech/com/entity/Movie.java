package cogent.infotech.com.entity;

import lombok.*;
import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Movie {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int releaseYear;
    private String genre;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
