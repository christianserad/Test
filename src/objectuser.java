
/**
 *
 * @author christian
 */
public class objectuser implements Cloneable{
    private number number = new number();

    public int getNumber() {
        return number.getNumber();
    }

    public void setNumber(int number) {
        this.number.setNumber(number);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
