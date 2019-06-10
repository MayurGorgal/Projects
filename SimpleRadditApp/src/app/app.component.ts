import { Component } from '@angular/core';
import { ThrowStmt } from '@angular/compiler';
import { Article } from './article/article.model';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Articledemo';
  public ntitle;
  
  public nlink;

  public ArticleArr=[];
  public addArticle(title:HTMLInputElement,link:HTMLInputElement):boolean
  {
      this.ntitle=title.value;
      this.nlink=link.value;
      this.ArticleArr.push(new Article(this.ntitle,this.nlink));

      title.value='';
      link.value='';

      return false;
  }
  public sortedArticle():Article[]
  {

    return this.ArticleArr.sort((a,b)=>b.votes-a.votes);
  }
}
