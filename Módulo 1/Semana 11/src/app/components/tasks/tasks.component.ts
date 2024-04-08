import { Component } from '@angular/core';

@Component({
  selector: 'app-tasks',
  templateUrl: './tasks.component.html',
  styleUrls: ['./tasks.component.css'],
})
export class TasksComponent {
  tasks: Array<string> = [];

  onSubmit(input: any) {
    this.tasks.push(input.value.task);
    console.log(this.tasks);
  }
}
