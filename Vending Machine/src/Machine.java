import java.util.Arrays;

public class Machine {

    private Item[][] items = new Item[3][3];

    public Machine(Item[][] item){
        this.items = item;
    }

    public String toString(){
        return Arrays.toString(this.items[0]) + "\n" + Arrays.toString(this.items[1]) + "\n" + Arrays.toString(this.items[2]);
    }

}
