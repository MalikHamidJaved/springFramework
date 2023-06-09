package com.candle.springframework.repositories;

import com.candle.springframework.entities.Author;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by jt on 12/23/19.
 */
public interface AuthorRepository extends CrudRepository<Author, Long> {
}
