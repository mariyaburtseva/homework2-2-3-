public class Main { // автоматически прописалось название соответствующее названию при создании
    public static void main(String[] args){
        // создание объекта из класса
        CreditPaymentService service = new CreditPaymentService();
        // инициализация экземпляра класса

        long qwe = service.calculate(1000000, 1, 9.99); // вызов функции класса, которую инициализировали ранее
        long qwe1 = service.calculate(1000000, 2, 9.99);
        long qwe2 = service.calculate(1000000, 3, 9.99);
        System.out.println(qwe);
        System.out.println(qwe1);
        System.out.println(qwe2);
    }
}




