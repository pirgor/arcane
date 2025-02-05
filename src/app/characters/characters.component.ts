import { Component } from '@angular/core';
import { Character } from '../model/character';
import { ActivatedRoute } from '@angular/router';
import { ArcaneService } from '../services/arcane.service';
import { NgFor } from '@angular/common';

@Component({
  selector: 'app-characters',
  standalone: true,
  imports: [NgFor],
  templateUrl: './characters.component.html',
  styleUrl: './characters.component.css',
})
export class CharactersComponent {
  characters: Character[] = [];
  constructor(
    private route: ActivatedRoute,
    private arcService: ArcaneService
  ) {}

   ngOnInit(): void {
    this.arcService.getCharacters().subscribe((data: Character[]) => { this.characters = data })
  }
}
