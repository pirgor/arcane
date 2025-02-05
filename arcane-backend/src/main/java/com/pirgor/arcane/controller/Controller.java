package com.pirgor.arcane.controller;

import com.pirgor.arcane.model.Character;
import com.pirgor.arcane.service.ICharacter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class Controller {
  @Autowired
  private ICharacter service;

  @GetMapping("/characters")
  public List<Character> findChars(){ return service.getChars(); }

  @GetMapping("/{id}")
  public Character showChar(@PathVariable long id) { return service.getChar(id);}
}
