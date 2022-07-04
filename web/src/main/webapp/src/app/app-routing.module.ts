import {NgModule} from '@angular/core';
import {RouterModule, Routes} from '@angular/router';
import {MoviesComponent} from "./movies/movies.component";
// @ts-ignore
//import {ActorsComponent} from "../actors/actors.component";


const routes: Routes = [
  // { path: '', redirectTo: '/home', pathMatch: 'full' },

  // {path: 'addresses', component: AddressesComponent},
  // {path: 'addressesSorted', component: AddressSortedComponent},
  // {path: 'addresses/detail/:id', component: AddressDetailComponent},
  // {path: 'address-new', component: AddressNewComponent},

  {path: 'movieapp/movies', component: MoviesComponent},
  // {path: 'moviesFiltered', component: MovieFilteredComponent},
  // {path: 'movies/detail/:id', component: MovieDetailComponent},
  // {path: 'movie-new', component: MovieNewComponent},

  //{path: 'actors', component: ActorsComponent},
  // {path: 'clients/detail/:id', component: ClientDetailComponent},
  // {path: 'movie-new', component: MovieNewComponent},

  // {path: 'rentals', component: RentalsComponent},
  // {path: 'rentals/detail/:id', component: RentalDetailComponent},
  // {path: 'movie-new', component: MovieNewComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {
}
