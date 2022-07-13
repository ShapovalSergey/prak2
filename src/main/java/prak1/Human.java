
package prak1;


public class Human 
{
    private boolean contagious;
    private boolean alive;
    private boolean can_get_infected;
    private boolean masked;
    private int age;
    private String name;
    private String surname;
    
    public Human(){};
    public Human(boolean cont,boolean aliv,boolean inf,boolean mask,int age1,String name1,String surn)
    {
    contagious=cont;
    alive=aliv;
    can_get_infected=inf;
    masked=mask;
    age=age1;
    name=name1;
    surname=surn;
    };
    public void SetContagious(boolean cont) {contagious=cont;}
    public void SetAlive(boolean aliv) {alive=aliv;}
    public void SetCanGetInfected(boolean inf) { can_get_infected=inf;}
    public void SetMasked(boolean mask) {masked=mask;}
    public void SetAge(int age1) { age=age1; }
    public void SetName(String name1) { name=name1; }
    public void SetSurname(String surn) {  surname=surn; }
    public boolean ReturnContagious() {return contagious;}
    public boolean ReturnAlive() {return alive;}
    public boolean ReturnCanGetInfected() {return can_get_infected;}
    public boolean ReturnMasked() {return masked;}
    public int ReturnAge() { return age; }
    public String ReturnName() { return name; }
    public String ReturnSurname() { return surname; }
    
}
