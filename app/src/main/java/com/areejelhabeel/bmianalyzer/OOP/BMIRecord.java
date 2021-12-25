package com.areejelhabeel.bmianalyzer.OOP;


public class BMIRecord {
    final static String Underweight = "Underweight";
    final static String Overweight = "Overweight";
    final static String Healthy = "Healthy";
    final static String LC = "little change";
    final static String SG = "Still  final ";
    final static String GA = "Go Ahead";
    final static String BC = "be Careful";
    final static String SB = "So Bad";
    final static String Ob = "Obesity";
    private String date;
    private String massege;
    private int weight;
    private int length;
    private String id;

    public BMIRecord(int weight, int length, String date, String massege) {
        this.weight = weight;
        this.length = length;
        this.date = date;
        this.massege = massege;
    }

    private void setAgePercent(double s) {
    }
    public double getBmi() {
        double bmi;
       bmi= (weight / Math.pow((length / 100.0), 2) * getAgePercent());
        return bmi;
    }
    private double getAgePercent() {
        return 1;
    }
        public void setBIM(double g) {
        }
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getMassege() {
        return massege;
    }

    public void setMassege(String massege) {
        this.massege = massege;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

//    public String getBMIMessage() {
//       double bmi = this.getBmi();
//      if (bmi < 18.5) {
//           return Constants.Underwieght;
//
//        } else if (18.5 <= bmi && bmi < 25) {
//           return Constants.Healthy;
//       } else if (25 <= bmi && bmi < 30) {
//           return Constants.Overweight;
//        }
//        return Constants.Obesity;
//   }
}




