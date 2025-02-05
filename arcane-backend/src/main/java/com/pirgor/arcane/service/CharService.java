package com.pirgor.arcane.service;

import com.pirgor.arcane.model.Character;
import com.pirgor.arcane.respository.ArcaneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CharService implements ICharacter {

  @Autowired
  private ArcaneRepository repository;

  @Override
  public List<Character> getChars() {
    return (List<Character>) repository.findAll();
  }

  @Override
  public Character getChar(long id){
    Optional<Character> optional =repository.findById(id);
    return (Character) optional.orElse(null);
  }

  @Override
  public Character addChar(Character character){
    return repository.save(character);
  }

}
