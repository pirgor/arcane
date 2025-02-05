package com.pirgor.arcane.model;
import jakarta.persistence.*;
import java.util.Objects;

@Entity
@Table(name="Characters")
public class Character {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  private String name;
  private int age;
  private String imgPath;

  @Lob
  private String description;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getImgPath() {
    return imgPath;
  }

  public void setImgPath(String imgPath) {
    this.imgPath = imgPath;
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) return false;
    Character character = (Character) o;
    return getId() == character.getId() && getAge() == character.getAge() && Objects.equals(getName(), character.getName()) && Objects.equals(getImgPath(), character.getImgPath()) && Objects.equals(getDescription(), character.getDescription());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getId(), getName(), getAge(), getImgPath(), getDescription());
  }

  @Override
  public String toString() {
    return "Character{" +
      "id=" + id +
      ", name='" + name + '\'' +
      ", age=" + age +
      ", imgPath='" + imgPath + '\'' +
      ", description='" + description + '\'' +
      '}';
  }
}
