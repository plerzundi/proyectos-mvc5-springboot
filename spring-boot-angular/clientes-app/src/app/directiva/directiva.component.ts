import {Component, OnInit} from '@angular/core';

@Component({
  selector: 'app-directiva',
  templateUrl: './directiva.component.html'

})
export class DirectivaComponent {


  listaCurso: string[] = ['Typescript', 'Javascript', 'C#', 'PHP'];


  constructor() {
  }

}
