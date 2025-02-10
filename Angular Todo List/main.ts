import { Component } from '@angular/core';

@Component({
  selector: 'app-area',
  template: `
    <div>
      <h1>Lista de Tarefas</h1>
      <input [(ngModel)]="newTask" (input)="checkLength()" placeholder="Digite uma tarefa" maxlength="10" />
      <button (click)="addTask()" [disabled]="newTask.length > 10">Enviar</button>
      <div *ngIf="errorMessage" class="error">{{ errorMessage }}</div>
      <ul>
        <li *ngFor="let task of tasks; let i = index">
          {{ task }}
          <button (click)="removeTask(i)">Remover</button>
        </li>
      </ul>
    </div>
  `,
  styles: [`
    div {
      text-align: center;
    }
    input {
      margin-right: 10px;
    }
    button {
      background-color: #007bff;
      color: white;
      border: none;
      padding: 10px 20px;
      cursor: pointer;
      border-radius: 5px;
    }
    button:disabled {
      background-color: #cccccc;
      cursor: not-allowed;
    }
    ul {
      list-style-type: none;
      padding: 0;
    }
    li {
      margin: 5px 0;
    }
    .error {
      color: red;
      margin-top: 10px;
    }
  `]
})
export class MainAppComponent {
  newTask: string = '';
  tasks: string[] = [];
  errorMessage: string = '';

  addTask() {
    if (this.newTask.trim() && this.newTask.length <= 10) {
      this.tasks.push(this.newTask);
      this.newTask = '';
      this.errorMessage = '';
    }
  }

  removeTask(index: number) {
    this.tasks.splice(index, 1);
  }

  checkLength() {
    if (this.newTask.length > 10) {
      this.errorMessage = 'A tarefa não pode ter mais de 10 caracteres.';
    } else {
      this.errorMessage = '';
    }
  }
}