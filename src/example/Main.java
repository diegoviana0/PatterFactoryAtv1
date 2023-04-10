package example;

import Patter_Factory.IcmsFactory;
import modelo.Orcamento;

import java.math.BigDecimal;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Orcamento orcamento = new Orcamento(new BigDecimal("5000.00"), "ICMS_MG");
        IcmsFactory icmsFactory = new IcmsFactory();
        BigDecimal resultado = icmsFactory.getIcmsPorEstado("ICMS_MG")
                .calculoPorRegiao(orcamento);
        System.out.println(resultado);
    }
}