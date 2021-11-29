package domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Movie {
    private long id;
    private String movieName;
    private String genre;
    private String image;
    // private boolean String premiereTomorrow;
}