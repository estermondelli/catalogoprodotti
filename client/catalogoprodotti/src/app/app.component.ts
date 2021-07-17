import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { Observable } from 'rxjs';
import { Prodotto } from './prodotto';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  prodotto: Prodotto = new Prodotto();
  ricerca: Prodotto = new Prodotto();
  prodotti: Prodotto[] = [];

  constructor(private http: HttpClient) {
    this.mostra();
  }

  public aggiungi() {
    let oss: Observable<Prodotto[]>
      = this.http.post<Prodotto[]>("http://localhost:8080/aggiungi", this.prodotto);
    oss.subscribe(risp => {
      this.prodotti = risp;
    })
  }

  public rimuovi(prodotto: Prodotto) {
    let oss: Observable<Prodotto[]>
      = this.http.post<Prodotto[]>("http://localhost:8080/rimuovi", prodotto);

    oss.subscribe(risp => {
      this.prodotti = risp;
    })
  }

  public mostra() {
    let oss: Observable<Prodotto[]>
      = this.http.get<Prodotto[]>("http://localhost:8080/mostra");
    oss.subscribe(risp => {
      this.prodotti = risp;
    })
  }

  public cerca() {
    let oss: Observable<Prodotto[]>
      = this.http.post<Prodotto[]>("http://localhost:8080/cerca", this.ricerca);
    oss.subscribe(risp => {
      this.prodotti = risp;
    })
  }
}