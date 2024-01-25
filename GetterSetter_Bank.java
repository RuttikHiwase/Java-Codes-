 class Account{
    public String name;
    protected String email;
   
     private String Password;
     public void setPassword(String pass){
         this.Password=pass;
     }
    public String getPassword(){
        return this.Password;
    }

}

public class GetterSetter_Bank {
    public static void main(String[] args) {
        Account ac=new Account();
        ac.name="Ruttik Hiwase";
        ac.email="Ruttikhiwase@gmail.com";
        System.out.println(ac.name);
        System.out.println(ac.email);
        ac.setPassword("hihihi1234");
        System.out.println(ac.getPassword());
    }

}
