package com.theironyard.services;

import com.theironyard.entities.Item;
import com.theironyard.entities.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Dan on 7/19/16.
 */
public interface ItemRepository extends CrudRepository<Item, Integer>
{
    public Iterable<Item> findByUser(User user);
}
