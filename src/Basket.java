public class Basket {
    private Item[] kor;

    public void setKor(Item[] kor) {
        this.kor = kor;
    }
    public Item[] getKor() {
        return kor;
    }
    public void addItemToKor(Item item){
        Item[] temp = new Item[kor.length + 1];
        for (int i = 0; i < kor.length; i++) {
            temp[i] = kor[i];
        }
        temp[kor.length-1] = item;
    }
}
