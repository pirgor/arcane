package com.pirgor.arcane.service;

import com.pirgor.arcane.model.Character;

import java.util.List;

public interface ICharacter {
  List<Character> getChars();

  Character getChar(long id);

  Character addChar(Character character);
}
