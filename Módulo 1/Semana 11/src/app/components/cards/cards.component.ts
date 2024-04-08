import { Component } from '@angular/core';

@Component({
  selector: 'app-cards',
  templateUrl: './cards.component.html',
  styleUrls: ['./cards.component.css'],
})
export class CardsComponent {
  arrayFotos: any = [
    {
      url: 'https://avatarfiles.alphacoders.com/211/211897.jpg',
      description: 'Leon Scott Kennedy',
    },
    {
      url: 'https://avatarfiles.alphacoders.com/270/270211.jpg',
      description: 'Ada Wong',
    },
    {
      url: 'https://asset.vg247.com/albert-wesker-dead-by-daylight.jpg/BROK/thumbnail/1200x1200/quality/100/albert-wesker-dead-by-daylight.jpg',
      description: 'Albert Wesker',
    },
    {
      url: 'https://avatarfiles.alphacoders.com/169/169902.jpg',
      description: 'Claire Redfield',
    },
    {
      url: 'https://avatarfiles.alphacoders.com/207/207143.jpg',
      description: 'Jill Valentine',
    },
  ];
}
