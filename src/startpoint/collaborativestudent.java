
package startpoint;


public class collaborativestudent extends bitmstudent {
    
  private   double courseFee;
  private  String company;

    public collaborativestudent(double courseFee, String company, String name, String phone, String nid) {
        super(name, phone, nid);
        this.courseFee = courseFee;
        this.company = company;
    }

    public double getCourseFee() {
        return courseFee;
    }

    public void setCourseFee(double courseFee) {
        this.courseFee = courseFee;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

   public  String getInfo(){
       return super.getName()+"\n"+courseFee;
   }
  
  
    
}
