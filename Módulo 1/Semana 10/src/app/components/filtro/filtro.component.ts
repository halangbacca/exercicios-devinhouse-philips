import { Component, EventEmitter, Output } from '@angular/core';

@Component({
  selector: 'ntap-filtro',
  templateUrl: './filtro.component.html',
  styleUrls: ['./filtro.component.scss'],
})
export class FiltroComponent {
  lista: string[] = ['Todos', 'Não lidos', 'Lidos'];

  @Output() eventClick: EventEmitter<any> = new EventEmitter();

  onClick() {
    this.eventClick.emit();
  }
}
