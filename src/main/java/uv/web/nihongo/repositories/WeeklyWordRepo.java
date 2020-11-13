package uv.web.nihongo.repositories;

import org.springframework.data.repository.CrudRepository;

import uv.web.nihongo.entities.WeeklyWord;

public interface WeeklyWordRepo extends CrudRepository <WeeklyWord, Integer>{}