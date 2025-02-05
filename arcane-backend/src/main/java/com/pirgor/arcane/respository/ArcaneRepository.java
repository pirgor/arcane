package com.pirgor.arcane.respository;

import com.pirgor.arcane.model.Character;
import org.springframework.data.repository.CrudRepository;

public interface ArcaneRepository extends CrudRepository<Character, Long> {
}
