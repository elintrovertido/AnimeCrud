package com.webclient.demo.models;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

class Statistics{
    public int score;
    public int ranked;
}

class Character{
    public String name;
}

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Anime {
    public String title_ov;
    public Statistics statistics;
    public List<Character> characters;
}
