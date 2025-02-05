import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Character } from '../model/character';

@Injectable({
  providedIn: 'root'
})
export class ArcaneService {
  apiUrl: string
  constructor(private http: HttpClient) {
    this.apiUrl = 'http://localhost:18080/api';
  }

  public getCharacter(id: number | string): Observable<Character> {
    return this.http.get<Character>(this.apiUrl + '/' + id.toString());
  }

  public getCharacters(): Observable<Character[]> {
    return this.http.get<Character[]>(this.apiUrl + '/characters');
  }

}
