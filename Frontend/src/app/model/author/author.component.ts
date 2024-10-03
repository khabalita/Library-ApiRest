import { Component, inject, OnInit } from '@angular/core';
import { AuthorService } from '../../service/author.service';

@Component({
  selector: 'app-author',
  standalone: true,
  imports: [],
  templateUrl: './author.component.html',
  styleUrl: './author.component.css'
})
export class AuthorComponent implements OnInit{
  private authorService = inject(AuthorService);

  ngOnInit(): void {
    this.authorService.list()
      .subscribe(author => {
        console.log(author);
      });
  }
}
