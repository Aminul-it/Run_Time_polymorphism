
package startpoint;


public class seipstudent  extends bitmstudent{
    private String seid;
    private  String stippend;

    public seipstudent(String seid, String stippend, String name, String phone, String nid) {
        super(name, phone, nid);
        this.seid = seid;
        this.stippend = stippend;
    }

    public String getSeid() {
        return seid;
    }

    public void setSeid(String seid) {
        this.seid = seid;
    }

    public String getStippend() {
        return stippend;
    }

    public void setStippend(String stippend) {
        this.stippend = stippend;
    }

   public String getInfo(){
       return super.getName()+"\n"+seid;
       
   }    
    
}
