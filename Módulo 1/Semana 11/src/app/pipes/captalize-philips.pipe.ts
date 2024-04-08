import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'captalizePhilips',
})
export class CaptalizePhilipsPipe implements PipeTransform {
  transform(value: any, ...args: any[]): unknown {
    let values = value.split(' ');
    let result = '';

    for (let value of values) {
      result += this.captalize(value) + ' ';
    }
    return result;
  }
  captalize(value: string) {
    return (
      value.substring(0, 1).toLocaleUpperCase() +
      value.substring(1).toLocaleLowerCase()
    );
  }
}
