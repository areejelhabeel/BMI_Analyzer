package com.areejelhabeel.bmianalyzer.OOP;

public class BMIRecord {
String date;
String massege;
int weight;
int length;
public BMIRecord(int weight,int length,String date,String massege){
  this.weight=weight;
   this.length=length;
    this.date=date;
    this.massege=massege;
}

public String getDate(){return  date;}
public void setDate(String date){ this.date=date;}

    public String getMassege(){return massege;}
    public void setMassege(String massege){ this.massege=massege;}

    public int getWeight(){return  weight;}
    public void setWeight(int weight){ this.weight=weight;}

    public int getLength(){return length;}
    public void setLength(int length){ this.length=length;}

}
