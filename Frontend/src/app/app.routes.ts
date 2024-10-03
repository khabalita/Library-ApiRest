import { Routes } from '@angular/router';

export const routes: Routes = [
    {
        path: '',
        loadComponent: () => import('./model/author/author.component').then(a => a.AuthorComponent)
    }
];
