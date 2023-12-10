package ru.schung.taco.repository;

import org.springframework.data.repository.CrudRepository;
import ru.schung.taco.model.TacoOrder;


public interface OrderRepository extends CrudRepository<TacoOrder, Long> {
    TacoOrder save(TacoOrder order);
}
