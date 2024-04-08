import { Component } from '@angular/core';

@Component({
  selector: 'philips-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  personagem: any = {
    nome: 'Nick Nelson',
    nomeAtor: 'Kit Connor',
    descricao:
      'Ator britânico conhecido pelos seus papéis no cinema como Tom em Get Santa, como o adolescente Nick Nelson em Heartstopper, além do jovem Elton John em Rocketman.',
    imagem: 'https://pbs.twimg.com/media/FRsm_jnXsAIG5HM.jpg:large',
  };
  
  title = 'exercicios';
}
