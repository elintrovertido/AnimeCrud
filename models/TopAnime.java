package com.webclient.demo.models;

// import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@NoArgsConstructor
@AllArgsConstructor
public class TopAnime {
    public String title;
    public int myanimelist_i;
    public int rank;
    public int score;
    public int members;
}

