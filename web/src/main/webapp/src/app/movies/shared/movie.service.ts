import {Injectable} from '@angular/core';

import {HttpClient} from "@angular/common/http";

import {Movie} from "./movie.model";

import {Observable} from "rxjs";
import {map} from "rxjs/operators";


@Injectable()
export class MovieService {
  private moviesUrl = 'http://localhost:8080/api/movies';

  constructor(private httpClient: HttpClient) {
  }

  getMovies(): Observable<Movie[]> {
    return this.httpClient
      .get<Array<Movie>>(this.moviesUrl);
  }

  getMovie(id: number): Observable<Movie> {
    return this.getMovies()
      .pipe(
        map(movies => movies.find(movie => movie.id === id))
      );
  }

  update(movie): Observable<Movie> {
    const url = `${this.moviesUrl}/${movie.id}`;
    return this.httpClient
      .put<Movie>(url, movie);
  }

  // save(stock: number, title: string, year: number, genre: string): Observable<Movie> {
  //   const url = `${this.moviesUrl}`;
  //   return this.httpClient
  //     .post<Movie>(url, new Movie(stock, title, year, genre));
  // }

  // remove(movie): Observable<Movie> {
  //   const url = `${this.moviesUrl}/${movie.id}`;
  //   return this.httpClient
  //     .delete<Movie>(url);
  // }
  //
  // getMoviesFiltered(title: string) {
  //   const url = `${this.moviesUrl}/${title}`;
  //   return this.httpClient
  //     .get<Array<Movie>>(url);
  // }
}
