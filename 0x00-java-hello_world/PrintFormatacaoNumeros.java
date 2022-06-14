public class PrintFormatacaoNumeros {
    public static void main(String[] args) {
        float taxa = 0.2456f;
        float valor = 7654.321f;
        java.util.Locale BR = new java.util.Locale("pt", "BR");
        java.text.NumberFormat valorEmReal = java.text.NumberFormat.getCurrencyInstance(BR);
        System.out.println("Valor: " + valorEmReal.format(valor));
        System.out.printf("Taxa: %.2f%%", taxa);
    }
}
