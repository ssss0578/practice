package code11_ex01;

public class Book extends TangibleAsset{       //継承したら差分だけ書けばいい
	
	
	 String isbn;                       //継承したら差分だけ書け　だからこれだけ
	
	 public Book(String name, int price, String color) {
		 super(name, price, color);
		 this.isbn = isbn;             //初期化
	 }
	 public String getIsbn() {return this.isbn; }
	 

}

