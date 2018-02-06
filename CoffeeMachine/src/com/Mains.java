package com;

public class Mains 
{

		public static void main(String[] args) 
		{
			   Book b1=new TextBook(1,"Java",250);
			   Book b2=new LabBook(2,"python",300,"Ankit","OIST");
			   b1.printBook();
			   b2.printBook();
		}

}
