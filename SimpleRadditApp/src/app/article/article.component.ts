import { Component, OnInit, Input } from '@angular/core';
import { Article } from './article.model';

@Component({
  selector: 'app-article',
  templateUrl: './article.component.html',
  styleUrls: ['./article.component.css']
})

export class ArticleComponent implements OnInit {

  votes: number;
title: string;
link: string;
public count;


// @Input() public ptitle;
// @Input() public plink;

@Input() public parentvalue:Article;
  constructor() 
  {
    // console.log(this.ptitle);
    // console.log(this.plink);
    // this.title = 'Angular 2';
    // this.link = 'http://angular.io';

    this.votes=0;
   }

   ngOnInit() {
  }
  
  public myvoteUp(){
    // this.votes += 1;
    console.log('voteUp');
    this.parentvalue.voteUp();
   
  }

  public myvoteDown()
  {
    if(this.parentvalue.votes>0)
    {
      // this.votes -= 1;
      this.parentvalue.voteDown();
    }
   

    console.log('voteDown');
  }

}
