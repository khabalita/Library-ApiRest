import { HttpClient } from '@angular/common/http';
import { inject, Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class AuthorService{

  private apiUrl = inject(HttpClient);

  list() {
    return this.apiUrl.get('http://localhost:8081/api-library/authors/listAuthors');
  }

  create(author: any) {
    return this.apiUrl.post('http://localhost:8081/api-library/authors/createAuthor', author);
  }

  getOne(id: number) {
    return this.apiUrl.get('http://localhost:8081/api-library/authors/getOne/${id}');
  }

  update(id: number, author: any) {
    return this.apiUrl.put('http://localhost:8081/api-library/authors/update/${is}', author);
  }

  delete(id: number) {
    return this.apiUrl.delete('http://localhost:8081/api-library/authors/delete/${id}');
  }

  constructor() { }
}
