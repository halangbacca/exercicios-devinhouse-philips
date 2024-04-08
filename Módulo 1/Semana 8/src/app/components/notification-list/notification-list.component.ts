import { Component } from '@angular/core';

@Component({
  selector: 'ntap-notification-list',
  templateUrl: './notification-list.component.html',
  styleUrls: ['./notification-list.component.scss'],
})
export class NotificationListComponent {
  jogos = [
    {
      titulo: 'Resident Evil',
      descricao:
        'Enfrente armas biológicas criadas por corporações farmacêuticas ou grupos terroristas nesse clássico do Survival Horror',
      data: 'há 10 minutos',
      lido: false,
    },
    {
      titulo: 'Silent Hill',
      descricao:
        'Enfrente seus piores pesadelos em Silent Hill, um clássico do terror psicológico',
      data: 'há 20 minutos',
      lido: false,
    },
    {
      titulo: 'Dead Space',
      descricao:
        'O jogador controla o engenheiro chamado Isaac Clarke, que luta contra uma infestação alienígena que transforma humanos em monstros alienígenas chamados Necromorphs, a bordo de uma nave de mineração espacial chamada USG Ishimura',
      data: 'há 30 minutos',
      lido: false,
    },
  ];
}