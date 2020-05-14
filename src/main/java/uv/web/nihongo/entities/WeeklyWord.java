package uv.web.nihongo.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class WeeklyWord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private String word;
    private String kanji;
    private String type;
    private String meaning;
    private String ex;
    private LocalDate date = LocalDate.now();
}