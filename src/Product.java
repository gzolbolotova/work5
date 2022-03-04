public class Product {
    /*создать класс Product:

поля: cost, shelfNumber, name, idCode, shelfCount - выбрать для них параметры доступ
методы: изменить местоположение(те полку), изменить цену, вывести информацию о товаре
 с помощью вывода строки в sout. — проверками некорректных значений.

*/

    private int cost;
    private int shelNumber;
    public String name;
    public int shelCount;
    private int idCode;

    Product(){
        cost = 50;
        shelNumber = 4;
        name = "hat";
        shelCount = 10;
        idCode = 7;

    }
    public int getIdCode(){
        return idCode;
    }

    public void setShelNumber(int shelNumber){
      this.shelNumber = shelNumber;
    }
    public void setCost(int cost){
        this.cost = cost;
    }

    public void result(){
        System.out.print("Информация о товаре: \n цена:" + cost + "\n номер полки: "
                + shelNumber + "\n наименование товара:" + name + "\n номер шкафа: " + shelCount + "\n ID код: " + idCode);
    }


//    static int factorial(int x){
//
//        if (x == 1){
//
//        return 1;
//        }
//        return x + factorial(x - 1);
//    }

}
