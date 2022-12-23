package model;

public class Center {
     private String name;
     private String location;
     private String coursec;

     public Center(String name, String location, String coursec) {
          this.name = name;
          this.location = location;
          this.coursec = coursec;
     }

     public String getName() {
          return name;
     }

     public void setName(String name) {
          this.name = name;
     }

     public String getLocation() {
          return location;
     }

     public void setLocation(String location) {
          this.location = location;
     }

     public String getCoursec() {
          return coursec;
     }

     public void setCoursec(String coursec) {
          this.coursec = coursec;
     }

     @Override
     public String toString() {
          return "Center{" +
                  "name='" + name + '\'' +
                  ", location='" + location + '\'' +
                  ", coursec='" + coursec + '\'' +
                  '}';
     }
}
