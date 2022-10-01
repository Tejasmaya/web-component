// import java.util.*;

class Project1 {
     public static void main(String args[]) {

          String Employee[][] = new String[8][8]; // Declaring the table
          Employee[0][0] = "Emp no"; // Initializing the table
          Employee[0][1] = "Emp Name ";
          Employee[0][2] = "Join Date ";
          Employee[0][3] = "Designation Code ";
          Employee[0][4] = "Department ";
          Employee[0][5] = "Basic ";
          Employee[0][6] = "HRA ";
          Employee[0][7] = "IT ";
          // Employee[0][8]=" ";

          Employee[1][0] = "1001";
          Employee[1][1] = "Ashish ";
          Employee[1][2] = "01/04/2009 ";
          Employee[1][3] = "e";
          Employee[1][4] = "R&D ";
          Employee[1][5] = "20000";
          Employee[1][6] = "8000";
          Employee[1][7] = "3000";
          // Employee[1][8]=" ";

          Employee[2][0] = "1002";
          Employee[2][1] = "Sushma ";
          Employee[2][2] = "23/08/2012 ";
          Employee[2][3] = "c";
          Employee[2][4] = "PM ";
          Employee[2][5] = "30000";
          Employee[2][6] = "12000";
          Employee[2][7] = "9000";
          // Employee[2][8]=" ";

          Employee[3][0] = "1003";
          Employee[3][1] = "Rahul ";
          Employee[3][2] = "12/11/2008 ";
          Employee[3][3] = "k";
          Employee[3][4] = "Acct ";
          Employee[3][5] = "10000";
          Employee[3][6] = "8000";
          Employee[3][7] = "1000";
          // Employee[3][8]=" ";

          Employee[4][0] = "1004";
          Employee[4][1] = "Chahat ";
          Employee[4][2] = "29/01/2013 ";
          Employee[4][3] = "r";
          Employee[4][4] = "Front Desk ";
          Employee[4][5] = "12000";
          Employee[4][6] = "6000";
          Employee[4][7] = "2000";
          // Employee[4][8]=" ";

          Employee[5][0] = "1005";
          Employee[5][1] = "Ranjan ";
          Employee[5][2] = "16/07/2005 ";
          Employee[5][3] = "m";
          Employee[5][4] = "Engg ";
          Employee[5][5] = "50000";
          Employee[5][6] = "20000";
          Employee[5][7] = "20000";
          // Employee[5][8]=" ";

          Employee[6][0] = "1006";
          Employee[6][1] = "Suman ";
          Employee[6][2] = "1/1/2000 ";
          Employee[6][3] = "e";
          Employee[6][4] = "Manufacturing ";
          Employee[6][5] = "23000";
          Employee[6][6] = "9000";
          Employee[6][7] = "4400";
          // Employee[6][8]=" ";

          Employee[7][0] = "1007";
          Employee[7][1] = "Tanmay ";
          Employee[7][2] = "12/06/2006 ";
          Employee[7][3] = "c";
          Employee[7][4] = "PM ";
          Employee[7][5] = "29000";
          Employee[7][6] = "12000";
          Employee[7][7] = "10000";
          // Employee[7][8]=" ";

          // To see the table created
          // for (int i = 0; i < 8; i++) {
          // for (int j = 0; j < 8; j++) {
          // System.out.print(Employee[i][j]);
          // System.out.print(" ");

          // }
          // System.out.println("\n");

          // }

          String Dearness[][] = new String[6][3];

          Dearness[0][0] = "Designation code";
          Dearness[0][1] = "Designation";
          Dearness[0][2] = "DA";

          Dearness[1][0] = "e";
          Dearness[1][1] = "Engineer";
          Dearness[1][2] = "20000";

          Dearness[2][0] = "c";
          Dearness[2][1] = "Consultant";
          Dearness[2][2] = "32000";

          Dearness[3][0] = "k";
          Dearness[3][1] = "Clerk";
          Dearness[3][2] = "12000";

          Dearness[4][0] = "r";
          Dearness[4][1] = "Receptionist";
          Dearness[4][2] = "15000";

          Dearness[5][0] = "m";
          Dearness[5][1] = "Manager";
          Dearness[5][2] = "40000";

          int Salary, i;
          int DA;
          String input = args[0];
          // String input = "1003"; //Test case
          String Designation;

          for (i = 0; i < 8; i++) {
               if (input == Employee[i][0]) {
                    int Basic = Integer.parseInt(Employee[i][5]);
                    int HRA = Integer.parseInt(Employee[i][6]);
                    int IT = Integer.parseInt(Employee[i][7]);

                    switch (Employee[i][3]) {
                         case "e":
                              Designation = "Engineer";
                              DA = Integer.parseInt(Dearness[1][2]);
                              Salary = Basic + HRA + DA - IT;
                              System.out.println("Emp No. \t Emp Name \t Department   Designation   Salary");
                              System.out.println(input + " \t \t " + Employee[i][1] + "  \t " + Employee[i][4]
                                        + " \t\t" + Designation + "\t \t " + Salary);
                              break;
                         case "c":
                              Designation = "Consultant";
                              DA = Integer.parseInt(Dearness[2][2]);
                              Salary = Basic + HRA + DA - IT;
                              System.out.println("Emp No. \t Emp Name \t Department   Designation   Salary");
                              System.out.println(input + " \t \t " + Employee[i][1] + "  \t " + Employee[i][4]
                                        + " \t\t" + Designation + "\t \t " + Salary);
                              break;
                         case "k":
                              Designation = "Clerk";
                              DA = Integer.parseInt(Dearness[3][2]);
                              Salary = Basic + HRA + DA - IT;
                              System.out.println("Emp No. \t Emp Name \t Department   Designation   Salary");
                              System.out.println(input + " \t \t " + Employee[i][1] + "  \t " + Employee[i][4]
                                        + "\t \t" + Designation + "\t \t " + Salary);
                              break;
                         case "r":
                              Designation = "Receptionist";
                              DA = Integer.parseInt(Dearness[4][2]);
                              Salary = Basic + HRA + DA - IT;
                              System.out.println("Emp No. \t Emp Name \t Department   Designation   Salary");
                              System.out.println(input + " \t \t " + Employee[i][1] + "  \t " + Employee[i][4]
                                        + "\t \t" + Designation + "\t \t " + Salary);
                              break;
                         case "m":
                              Designation = "Manager";
                              DA = Integer.parseInt(Dearness[5][2]);
                              Salary = Basic + HRA + DA - IT;
                              System.out.println("Emp No. \t Emp Name \t Department   Designation   Salary");
                              System.out.println(input + " \t \t " + Employee[i][1] + "  \t " + Employee[i][4]
                                        + "\t \t" + Designation + " \t\t " + Salary);
                              break;

                    }

               }

          }

     }
}
