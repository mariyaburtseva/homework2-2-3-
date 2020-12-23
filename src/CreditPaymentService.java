public class CreditPaymentService { // автоматически прописалось название соответствующее названию при создании

    public long calculate(double summa, int year, double percentage) {
    /*
    метод calculate;
    возвращает значение типа double;
    принимает параметры: summa(сумма займа) типа long,
    year(срок кредита) типа int,
    percentage(процентная ставка) типа float.
   */
    double bid = percentage / 12 / 100; // ставка по кредиту в месяц
    double annuityRate = bid * Math.pow(1 + bid, year * 12) / (Math.pow(1+bid, year * 12)- 1);
    //коэффициент аннуитета
    double monthlyAnnuityPayment = annuityRate * summa;
    //ежемесячный аннуитентный платеж
    return Math.round(monthlyAnnuityPayment);
    //размер рассчитанного аннуитетного взноса
    }
}
