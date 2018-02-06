package com;

interface Book 
{
	public void printBook();
   
}
class TextBook implements Book
{
	int id;
	String name;
	int price;
	TextBook(int id, String name,int price)
	{
		   this.id=id;
		   this.name=name;
		   this.price=price;
	}

	@Override
	public void printBook() 
	{
		   System.out.println(id);
		   System.out.println(name);
		   System.out.println(price);
		
	}

}
class LabBook implements Book
{
	int id;
	String name;
	int price;
	String faculty;
	String College;
	LabBook(int id, String name,int price,String faculty,String college)
	{
		   this.id=id;
		   this.name=name;
		   this.price=price;
		   this.faculty=faculty;
		   this.College=college;
	}

	@Override
	public void printBook() 
	{
		   System.out.println(id);
		   System.out.println(name);
		   System.out.println(price);
		   System.out.println(faculty);
		   System.out.println(College);
		
	}
}









