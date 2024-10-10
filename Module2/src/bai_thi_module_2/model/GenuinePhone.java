package bai_thi_module_2.model;

public class GenuinePhone extends Phone {
    private int time;
    private String scope;

   public GenuinePhone(int id, String name, double price, int quantity, String manufacturer, int time, String scope) {
        super(id, name, price, quantity, manufacturer);
        this.time = time;
        this.scope = scope;
   }



    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public String toString() {
        return super.toString() + "," + time + "," + scope;
    }
}
