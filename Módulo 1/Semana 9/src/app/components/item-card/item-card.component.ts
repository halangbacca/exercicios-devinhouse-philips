import { Component, Input } from '@angular/core';

@Component({
  selector: 'philips-item-card',
  templateUrl: './item-card.component.html',
  styleUrls: ['./item-card.component.css'],
})
export class ItemCardComponent {
  @Input() serie: any;
}
