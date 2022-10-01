import java.util.*;

class Video {
     Scanner input = new Scanner(System.in);
     // Member variables
     String videoName;
     boolean checkout;
     int rating;

     // Member Functions
     String getName() {
          System.out.println("Enter the name of the video you want to add: ");

          videoName = input.nextLine();

          return videoName;
     }

     void doCheckout() {
          VideoStore VS = new VideoStore();
          System.out.println("Enter the name of the video you want to checkout ");
          videoName = input.nextLine();
          checkout = false;

          for (int i = 0; i < VS.storelist.length; i++) {

               if (VS.storelist[i][0] == videoName) {
                    checkout = true;
                    VS.storelist[i][1] = "True";
                    break;
               }

          }
          if (checkout = true) {
               System.out.println("Video " + videoName + " checked out successfully.");
          } else {
               System.out.println(videoName + " is not in the list. Can't checkout ");

          }

     }

     void doReturn() {

     }

     void receiveRating(int rating) {
          String rate = Integer.toString(rating);
          VideoStore VS = new VideoStore();
          for (int i = 0; i < (VS.storelist.length); i++) {
               if (VS.storelist[i][2] == null) {

                    VS.storelist[i][2] = rate;
                    break;
               }
          }

     }

     int getRating() {
          VideoStore VS = new VideoStore();
          String rate = Integer.toString(rating);
          for (int i = 0; i < (VS.storelist.length); i++) {
               if (VS.storelist[i][2] == null) {

                    VS.storelist[i][2] = rate;
                    break;
               }
          }
          return rating;

     }

     boolean getCheckout() {
          return false;

     }

     // Constructor
     // Video(String name);
}

class VideoStore {
     // Member Variables
     Video[] store;
     String storelist[][] = new String[10][3]; // Max size allocated is 10 , it can be dynamically allocated

     // Member functions
     void addVideo(String name) {

          for (int i = 0; i < (storelist.length); i++) {
               if (storelist[i][0] == null) {

                    storelist[i][0] = name;
                    break;
               }
          }

          // for (int i = 0; i < (storelist.length); i++) { // to see the video table
          // System.out.println(storelist[i][0]);
          // }

     }

     void doCheckout(String name) {

     }

     void doReturn(String name) {
          System.out.println("Video " + name + " returned successfully.");

     }

     void receiveRating(String name, int rating) {

     }

     void listInventory() {
          System.out.println("-----------------------------------------------------");
          System.out.println("Video name\t\tCheckout Status\t\tRating");

     }

}

public class VideoLauncher extends Video {
     int i;

     public static void open() {
          Scanner in = new Scanner(System.in);
          Video V = new Video();
          VideoStore VS = new VideoStore();
          System.out.println("MAIN MENU\n" + "==========");
          System.out.println(
                    "1.Add Videos:\n" + "2.Check out Video:\n" + "3.Return Video\n" + "4.Receive Rating:\n"
                              + "5.List Inventory:\n" + "6.Exit:\n" + "Enter your choice (1..6):");
          int choice = in.nextInt();

          switch (choice) {
               case 1:
                    // Add Videos:
                    String videoname = V.getName();
                    VS.addVideo(videoname);
                    System.out.println("Video " + videoname + " added successfully");
                    open();
                    break;
               case 2:
                    // Check out video
                    V.doCheckout();
                    open();
                    break;
               case 3:
                    System.out.println("Enter the name of the video you want to return : ");
                    String vide = in.nextLine();
                    VS.doReturn(vide);
                    System.out.println("Video " + vide + " returned successfully.");

                    open();
                    break;
               case 4:
                    // System.out.println("Enter the name of the video you want to rate : ");
                    // String video = in.nextLine();

                    System.out.println("Enter the rating : ");
                    int rating = in.nextInt();
                    // VS.receiveRating(video, rating);
                    V.receiveRating(rating);

                    open();
                    break;
               case 5:
                    VS.listInventory();
                    String vid = V.getName();
                    int ratin = V.getRating();
                    System.out.println(vid + "\t\t" + "True" + "\t\t" + ratin);
                    System.out.println("-----------------------------------------------------");
                    open();
                    break;
               case 6:
                    System.out.println("Exiting!!... Thanks for using the application. ");
                    break;

               default:
                    System.out.println("Enter a valid choice...");
                    break;
          }

     }

     public static void main(String[] args) {

          Video V = new Video();
          VideoStore VS = new VideoStore();
          open();

     }
}

// choices 3 4 5 are not working