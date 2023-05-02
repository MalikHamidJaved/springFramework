package com.candle.springframework.repositories;

import com.candle.springframework.entities.Book;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by jt on 12/23/19.
 */
public interface BookRepository extends CrudRepository<Book, Long> {
}
