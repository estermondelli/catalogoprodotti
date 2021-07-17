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
  prodotti: Prodotto[] = [];
  ricerca: string="";

  constructor(private http: HttpClient) {}

  public aggiungi() {
    let oss: Observable<Prodotto[]>
      = this.http.post<Prodotto[]>("http://localhost:8080/aggiungi", this.prodotto);
    oss.subscribe(risp => {
      this.prodotti = risp;
    })
  }

  public rimuovi() {
    let oss: Observable<Prodotto[]>
      = this.http.post<Prodotto[]>("http://localhost:8080/rimuovi", this.prodotto);
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
public cerca (){

}
}